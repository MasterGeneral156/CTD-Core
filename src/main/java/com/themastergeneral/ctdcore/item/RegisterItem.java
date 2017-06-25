package com.themastergeneral.ctdcore.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.themastergeneral.ctdcore.Main;
import com.themastergeneral.ctdcore.client.ItemModelProvider;

public class RegisterItem 
{
	public static void init()
	{
		
	}
	public static <T extends Item> T register(T item) 
	{
		ForgeRegistries.ITEMS.register(item);
		if(item instanceof ItemModelProvider) 
		{
			((ItemModelProvider)item).registerItemModel(item);
		}
		return item;
	}
}
