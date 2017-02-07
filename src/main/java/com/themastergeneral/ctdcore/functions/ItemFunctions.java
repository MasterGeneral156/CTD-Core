package com.themastergeneral.ctdcore.functions;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

public class ItemFunctions 
{
	public static void addItemToPlayer(ItemStack itemStack)
	{
		EntityPlayer player = Minecraft.getMinecraft().thePlayer;
		player.inventory.addItemStackToInventory(itemStack);
	}
	public static void removeItemFromPlayer(ItemStack itemStack) 
	{
		EntityPlayer ep = Minecraft.getMinecraft().thePlayer;
		IInventory inv = ep.inventory;
		for(int i=0; i < inv.getSizeInventory(); i++)
		{
			if(inv.getStackInSlot(i) != null)
			{
				ItemStack j = inv.getStackInSlot(i);
				if(j.getItem() != null && j.getItem() == itemStack.getItem())
				{
					inv.setInventorySlotContents(i, null);
				}
			}
		}
	}
}
