package com.themastergeneral.ctdcore.loot;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class RegisterLoot {
	public static void register(String modid, String lootTableName) {
		LootTableList.register(new ResourceLocation(modid, lootTableName));
	}
}
