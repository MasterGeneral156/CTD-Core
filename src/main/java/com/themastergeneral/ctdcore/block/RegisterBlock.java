package com.themastergeneral.ctdcore.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.themastergeneral.ctdcore.Main;
import com.themastergeneral.ctdcore.client.ItemModelProvider;

public class RegisterBlock {
	public static <T extends Block> T register(T block, ItemBlock itemBlock) {
		ForgeRegistries.BLOCKS.register(block);
		if (itemBlock != null) {
			ForgeRegistries.ITEMS.register(itemBlock);
		}
		if (block instanceof ItemModelProvider) {
			((ItemModelProvider) block).registerItemModel(itemBlock);
		}
		return block;
	}

	public static <T extends Block> T register(T block) {
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}
}
