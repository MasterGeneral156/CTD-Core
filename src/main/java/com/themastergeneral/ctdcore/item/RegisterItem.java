/*
 * Extend this class, and use register() to register your items
 * Example: basicitem = register(new CTDItem("basicitem", Main.MODID));
 */

package com.themastergeneral.ctdcore.item;

import com.themastergeneral.ctdcore.client.ItemModelProvider;

import net.minecraft.item.Item;
import net.minecraftforge.registries.ForgeRegistries;

public class RegisterItem {
	public static <T extends Item> T register(T item) {
		ForgeRegistries.ITEMS.register(item);
		if (item instanceof ItemModelProvider) {
			((ItemModelProvider) item).registerItemModel(item);
		}
		return item;
	}
}
