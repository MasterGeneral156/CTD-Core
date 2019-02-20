/*
 * You will want to extend this class to create a basic item.
 * This class calls the item registerer.
 */

package com.themastergeneral.ctdcore.item;

import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;

import com.themastergeneral.ctdcore.CTDCore;

public class CTDItem extends Item {
	protected String name;	//Name of the item.
	protected String modid;	//Mod ID domain to look for textures/models.
	
	public CTDItem(Properties properties, String name, String modid) {
		super(properties);
		this.setRegistryName(modid, name);
		this.name=name;
		this.modid=modid;
	}

}
