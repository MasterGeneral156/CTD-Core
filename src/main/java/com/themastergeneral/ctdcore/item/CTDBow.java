/*
 * Extend this class to add a bow to the game, that uses arrows that extend ItemArrow.
 */

package com.themastergeneral.ctdcore.item;

import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;

public class CTDBow extends BowItem {
	protected String name; // Name of the item.
	protected String modid; // Mod ID domain to look for textures/models.
	protected int drawspeed; // How long it should take to draw the bow
								// completely.
	public CTDBow(Properties builder,String name, String modid, int drawspeed, int maxdurability) {
		super(builder.defaultMaxDamage(maxdurability));
		this.name = name;
		this.modid = modid;
		this.drawspeed = drawspeed;
		this.setRegistryName(modid, name);
	}

	public int getMaxItemUseDuration(ItemStack stack) {
		return drawspeed;
	}

}
