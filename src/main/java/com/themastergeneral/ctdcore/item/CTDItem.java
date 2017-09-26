/*
 * You will want to extend this class to create a basic item.
 * This class calls the item registerer.
 */

package com.themastergeneral.ctdcore.item;

import com.themastergeneral.ctdcore.Main;
import com.themastergeneral.ctdcore.client.ItemModelProvider;

import net.minecraft.item.Item;

public class CTDItem extends Item implements ItemModelProvider {
	protected String name;	//Name of the item.
	protected String modid;	//Mod ID domain to look for textures/models.
	
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
