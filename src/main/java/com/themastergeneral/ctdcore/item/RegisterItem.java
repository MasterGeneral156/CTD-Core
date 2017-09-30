/*
 * Extend this class, and use register() to register your items
 * Example: basicitem = register(new CTDItem("basicitem", Main.MODID));
 */

package com.themastergeneral.ctdcore.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import com.themastergeneral.ctdcore.client.ItemModelProvider;

public class RegisterItem {
	public static <T extends Item> T register(T item) {
		ForgeRegistries.ITEMS.register(item);
		if (item instanceof ItemModelProvider) {
			((ItemModelProvider) item).registerItemModel(item);
		}
		return item;
	}
}
