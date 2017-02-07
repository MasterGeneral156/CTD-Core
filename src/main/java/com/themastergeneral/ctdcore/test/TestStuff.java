package com.themastergeneral.ctdcore.test;

import com.themastergeneral.ctdcore.functions.ItemFunctions;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class TestStuff
{
	@SubscribeEvent
	public void onRightClickEvent(PlayerInteractEvent event)
	{
		EntityPlayer player = event.getEntityPlayer();
		if (player.getHeldItem(EnumHand.MAIN_HAND) != null)
		{
			Item item = player.getHeldItem(EnumHand.MAIN_HAND).getItem();
			if (item == Items.ARROW)
			{
				ItemFunctions.addItemToPlayer(new ItemStack(Items.APPLE));
				ItemFunctions.removeItemFromPlayer(new ItemStack(Items.ARROW));
			}
		}
	}
}
