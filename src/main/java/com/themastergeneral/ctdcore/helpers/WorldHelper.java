/*
 * Helper class to help with world based stuff.
 */

package com.themastergeneral.ctdcore.helpers;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.server.SPacketBlockChange;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.event.ForgeEventFactory;

public class WorldHelper {
	public static boolean playerHarvestBlock(ItemStack stack, World world,
			EntityPlayer player, BlockPos pos) {
		if (world.isAirBlock(pos)) {
			return false;
		}
		IBlockState state = world.getBlockState(pos);
		Block block = state.getBlock();

		if (!world.isRemote) {
			world.playEvent(player, 2001, pos, Block.getStateId(state));
		} else {
			world.playEvent(2001, pos, Block.getStateId(state));
		}

		if (player.capabilities.isCreativeMode) {
			block.onBlockHarvested(world, pos, state, player);
			if (block.removedByPlayer(state, world, pos, player, false)) {
				block.onBlockDestroyedByPlayer(world, pos, state);
			}

			if (!world.isRemote) {
				if (player instanceof EntityPlayerMP) {
					((EntityPlayerMP) player).connection
							.sendPacket(new SPacketBlockChange(world, pos));
				}
			}
			return true;
		}
		stack.onBlockDestroyed(world, state, pos, player);
		if (!world.isRemote) {
			if (player instanceof EntityPlayerMP) {
				EntityPlayerMP playerMp = (EntityPlayerMP) player;
				int xp = ForgeHooks.onBlockBreakEvent(world,
						playerMp.interactionManager.getGameType(), playerMp,
						pos);
				if (xp == -1) {
					return false;
				}
				TileEntity tileEntity = world.getTileEntity(pos);
				if (block.removedByPlayer(state, world, pos, player, true)) {
					block.onBlockDestroyedByPlayer(world, pos, state);
					block.harvestBlock(world, player, pos, state, tileEntity,
							stack);
					block.dropXpOnBlockBreak(world, pos, xp);
				}
				playerMp.connection.sendPacket(new SPacketBlockChange(world,
						pos));
				return true;
			}
		} else {
			if (block.removedByPlayer(state, world, pos, player, true)) {
				block.onBlockDestroyedByPlayer(world, pos, state);
			}

			if (StackHelper.getStackSize(stack) <= 0
					&& stack == player.getHeldItemMainhand()) {
				ForgeEventFactory.onPlayerDestroyItem(player, stack,
						EnumHand.MAIN_HAND);
				player.setHeldItem(EnumHand.MAIN_HAND, null);
			}
			Minecraft mc = Minecraft.getMinecraft();
			mc.getConnection().sendPacket(
					new CPacketPlayerDigging(
							CPacketPlayerDigging.Action.STOP_DESTROY_BLOCK,
							pos, mc.objectMouseOver.sideHit));
			return true;
		}
		return false;
	}

	private static RayTraceResult getMovingObjectPosWithReachDistance(
			World world, EntityPlayer player, double distance, boolean p1,
			boolean p2, boolean p3) {
		float f = player.rotationPitch;
		float f1 = player.rotationYaw;
		double d0 = player.posX;
		double d1 = player.posY + (double) player.getEyeHeight();
		double d2 = player.posZ;
		Vec3d vec3 = new Vec3d(d0, d1, d2);
		float f2 = MathHelper.cos(-f1 * 0.017453292F - (float) Math.PI);
		float f3 = MathHelper.sin(-f1 * 0.017453292F - (float) Math.PI);
		float f4 = -MathHelper.cos(-f * 0.017453292F);
		float f5 = MathHelper.sin(-f * 0.017453292F);
		float f6 = f3 * f4;
		float f7 = f2 * f4;
		Vec3d vec31 = vec3.addVector((double) f6 * distance, (double) f5
				* distance, (double) f7 * distance);
		return world.rayTraceBlocks(vec3, vec31, p1, p2, p3);
	}

	public static RayTraceResult getNearestBlockWithDefaultReachDistance(
			World world, EntityPlayer player) {
		return getNearestBlockWithDefaultReachDistance(world, player, false,
				true, false);
	}

	public static RayTraceResult getNearestBlockWithDefaultReachDistance(
			World world, EntityPlayer player, boolean stopOnLiquids,
			boolean ignoreBlockWithoutBoundingBox,
			boolean returnLastUncollidableBlock) {
		return getMovingObjectPosWithReachDistance(
				world,
				player,
				player instanceof EntityPlayerMP ? ((EntityPlayerMP) player).interactionManager
						.getBlockReachDistance() : 5.0D, stopOnLiquids,
				ignoreBlockWithoutBoundingBox, returnLastUncollidableBlock);
	}
}