package com.themastergeneral.ctdcore.item;

import com.themastergeneral.ctdcore.Main;
import com.themastergeneral.ctdcore.client.ItemModelProvider;

import net.minecraft.item.Item;

public class CTDItem extends Item implements ItemModelProvider {
	protected String name;
	protected String modid;

	public CTDItem(String name, String modid) {
		this.name = name;
		this.modid = modid;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}

	public void registerItemModel(Item item) {
		Main.proxy.registerItemRenderer(modid, this, 0, name);
	}

}
