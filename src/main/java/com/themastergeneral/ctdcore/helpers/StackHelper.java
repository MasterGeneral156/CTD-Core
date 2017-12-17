/*
 * Helper class for dealing with item stacks.
 */
package com.themastergeneral.ctdcore.helpers;

import net.minecraft.item.ItemStack;

public class StackHelper {
	public static boolean isValid(ItemStack stack) {
		return stack != null && !stack.isEmpty();
	}

	public static int getStackSize(ItemStack stack) {
		if (!isValid(stack))
			return 0;
		else
			return stack.getCount();
	}
}
