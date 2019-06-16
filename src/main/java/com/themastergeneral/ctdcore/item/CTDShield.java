package com.themastergeneral.ctdcore.item;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ShieldItem;

public class CTDShield extends ShieldItem {

	protected String name; // Name of the item.
	protected String modid; // Mod ID domain to look for textures/models.
	
	public CTDShield(Properties builder, String name, String modid, int maxdurability) {
		super(builder.defaultMaxDamage(maxdurability));
		this.name = name;
		this.modid = modid;
		this.setRegistryName(modid, name);
	}
	
	public String getItemStackDisplayName(ItemStack stack)
    {
		return "item." + name + ".name";
    }

}
