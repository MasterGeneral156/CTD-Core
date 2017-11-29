/*
 * Implement this class in your item class if the basic CTDItem does not
 * do what you want it to do.
 * 
 * Be sure to implement this in your block class as well for similar reasons.
 */
package com.themastergeneral.ctdcore.client;

import net.minecraft.item.Item;

public interface ItemModelProvider {
	void registerItemModel(Item item);
}
