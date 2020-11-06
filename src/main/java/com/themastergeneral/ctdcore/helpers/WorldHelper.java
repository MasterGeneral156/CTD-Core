/*
 * Helper class to help with world based stuff.
 */

package com.themastergeneral.ctdcore.helpers;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class WorldHelper 
{
	// Function used to find the block under an entity.
	public static Block findBlockUnderEntity(Entity e) 
	{
		int blockX = MathHelper.floor(e.getPosX());
		int blockY = MathHelper.floor(e.getPosY()-0.2D - e.getYOffset());
		int blockZ = MathHelper.floor(e.getPosZ());
		BlockPos blockpos = new BlockPos(blockX, blockY, blockZ);
		return e.world.getBlockState(blockpos).getBlock();
	}
}