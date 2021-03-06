/*
 * Extend this class to create your own arrow item which can be used by any bow that extends the ItemBow class
 */

package com.themastergeneral.ctdcore.item;

import net.minecraft.item.ArrowItem;

public class CTDArrow extends ArrowItem {
	
	protected String name; // Name of the item.
	protected String modid; // Mod ID domain to look for textures/models.
	
	public CTDArrow(Properties builder, String name, String modid) {
		super(builder);
		this.name = name;
		this.modid = modid;
		this.setRegistryName(modid, name);
	}

}
