/*
 * You will want to extend this class to create a basic item.
 * This class calls the item registerer.
 */

package com.themastergeneral.ctdcore.item;

import net.minecraft.item.Item;

import com.themastergeneral.ctdcore.CTDCore;
import com.themastergeneral.ctdcore.client.ItemModelProvider;

public class CTDItem extends Item implements ItemModelProvider {
	protected String name;	//Name of the item.
	protected String modid;	//Mod ID domain to look for textures/models.
	
	public CTDItem(String name, String modid) {
		this.name = name;
		this.modid = modid;
		this.setRegistryName(name);
	}

	public void registerItemModel(Item item) {
		CTDCore.proxy.registerItemRenderer(modid, this, 0, name);
	}

}
