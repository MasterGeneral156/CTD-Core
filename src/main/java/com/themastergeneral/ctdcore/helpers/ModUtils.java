package com.themastergeneral.ctdcore.helpers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModUtils {
	public static Item getOtherModItem(String fqrn) {
		return Item.getByNameOrId(fqrn);
	}

	public static Block getOtherModBlock(String fqrn) {
		return Block.getBlockFromName(fqrn);
	}
	
	public static void removeSmeltRecipe(ItemStack smelt)
	{
		FurnaceRecipes.instance().getSmeltingList().remove(smelt);
	}
	
	public static void addSmeltRecipe(ItemStack input, ItemStack output, float xp)
	{
		GameRegistry.addSmelting(input, output, xp);
	}
}
