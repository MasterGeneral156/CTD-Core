package com.themastergeneral.ctdcore.item;

import com.themastergeneral.ctdcore.Main;
import com.themastergeneral.ctdcore.client.ItemModelProvider;

import net.minecraft.item.Item;

public class CTDItem extends Item implements ItemModelProvider
{
	protected String name;
	public CTDItem(String name) 
	{
		this.name = name;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}
	public void registerItemModel(Item item) 
	{
		Main.proxy.registerItemRenderer(this, 0, name);
	}

}
