/*
 * Extend this class to add a bow to the game, that uses arrows that extend ItemArrow.
 */

package com.themastergeneral.ctdcore.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

import com.themastergeneral.ctdcore.CTDCore;
import com.themastergeneral.ctdcore.client.ItemModelProvider;

public class CTDBow extends ItemBow {
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
