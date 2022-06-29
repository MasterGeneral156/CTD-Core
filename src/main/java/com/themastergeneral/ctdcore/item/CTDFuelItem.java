package com.themastergeneral.ctdcore.item;

import javax.annotation.Nullable;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

public class CTDFuelItem extends CTDItem {

	private final int burnTicks;
	
	public CTDFuelItem(Properties properties, int burnTicks) 
	{
		super(properties);
		this.burnTicks = burnTicks;
	}
	
	@Override
	public int getBurnTime(ItemStack stack, @Nullable RecipeType<?> recipeType)
	{
		return this.burnTicks;
	}

}
