/*
 * Extend this class to create your own arrow item which can be used by any bow that extends the ItemBow class
 */

package com.themastergeneral.ctdcore.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArrow;

import com.themastergeneral.ctdcore.CTDCore;
import com.themastergeneral.ctdcore.client.ItemModelProvider;

public class CTDArrow extends ItemArrow implements ItemModelProvider {
	protected String name; // Name of the item.
	protected String modid; // Mod ID domain to look for textures/models.

	public CTDArrow(String name, String modid) {
		this.name = name;
		this.modid = modid;
		this.setRegistryName(name);
	}

	@Override
	public void registerItemModel(Item item) {
		CTDCore.proxy.registerItemRenderer(modid, this, 0, name);

	}

}
