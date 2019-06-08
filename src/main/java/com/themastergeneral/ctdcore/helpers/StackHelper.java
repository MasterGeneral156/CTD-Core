/*
 * Helper class for dealing with item stacks.
 */
package com.themastergeneral.ctdcore.helpers;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class StackHelper {
	
	//Valid stack?
	public static boolean isValid(ItemStack stack) {
		return stack != null && !stack.isEmpty();
	}

	//Returns stack size... duh?
	public static int getStackSize(ItemStack stack) {
		if (!isValid(stack))
			return 0;
		else
			return stack.getCount();
	}
	
	//Example: minecraft:air
	public static Item itemFromRegistryName(String name) {
		return Items.AIR;
	}
}
