package com.themastergeneral.ctdcore.item;

import net.minecraft.item.Item;

import com.themastergeneral.ctdcore.CTDCore;
import com.themastergeneral.ctdcore.client.ItemModelProvider;

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
		CTDCore.proxy.registerItemRenderer(modid, this, 0, name);
	}

}
