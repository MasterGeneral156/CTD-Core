package com.themastergeneral.ctdcore.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.themastergeneral.ctdcore.Main;
import com.themastergeneral.ctdcore.client.ItemModelProvider;

public class RegisterItem 
{
	public static CTDItem ctdtest;
	public static void init()
	{
		ctdtest = register(new CTDItem ("ctdtest",Main.MODID));
	}
	public static <T extends Item> T register(T item) 
	{
		GameRegistry.register(item);
		if(item instanceof ItemModelProvider) 
		{
			((ItemModelProvider)item).registerItemModel(item);
		}
		return item;
	}
}
