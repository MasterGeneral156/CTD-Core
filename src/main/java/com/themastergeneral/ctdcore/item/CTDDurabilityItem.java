package com.themastergeneral.ctdcore.item;

import net.minecraft.world.item.ItemStack;

public class CTDDurabilityItem extends CTDItem {

	public CTDDurabilityItem(Properties properties, int durability) {
		super(properties.defaultDurability(durability).stacksTo(1));
	}
	
	@Override
	public ItemStack getContainerItem(ItemStack itemStack)
    {
		ItemStack newStack = itemStack.copy();
		newStack.setDamageValue(newStack.getDamageValue() + 1);
		return newStack;
        
    }
	
	@Override 
	public boolean hasContainerItem(ItemStack stack)
    {
        return true;
    }
}
