package com.themastergeneral.ctdcore.helpers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModUtils {
	public static Item getOtherModItem(String fqrn) {
		return Item.getByNameOrId(fqrn);
	}

	public static Block getOtherModBlock(String fqrn) {
		return Block.getBlockFromName(fqrn);
	}
}
