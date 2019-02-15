package com.themastergeneral.ctdcore.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemShield;
import net.minecraft.item.ItemStack;

import com.themastergeneral.ctdcore.CTDCore;
import com.themastergeneral.ctdcore.client.ItemModelProvider;

public class CTDShield extends ItemShield implements ItemModelProvider {

	protected String name; // Name of the item.
	protected String modid; // Mod ID domain to look for textures/models.

	public CTDShield(String name, String modid, int maxdurability) {
		this.name = name;
		this.modid = modid;
		this.setRegistryName(name);
	}

	@Override
	public void registerItemModel(Item item) {
		CTDCore.proxy.registerItemRenderer(modid, this, 0, name);
	}
	
	public String getItemStackDisplayName(ItemStack stack)
    {
		return "item." + name + ".name";
    }

}
