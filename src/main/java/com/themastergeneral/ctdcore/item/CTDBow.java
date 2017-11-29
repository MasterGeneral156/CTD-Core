/*
 * Extend this class to add a bow to the game, that uses arrows that extend ItemArrow.
 */

package com.themastergeneral.ctdcore.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

import com.themastergeneral.ctdcore.CTDCore;
import com.themastergeneral.ctdcore.client.ItemModelProvider;

public class CTDBow extends ItemBow implements ItemModelProvider {
	protected String name; // Name of the item.
	protected String modid; // Mod ID domain to look for textures/models.
	protected int drawspeed; // How long it should take to draw the bow
								// completely.

	public CTDBow(String name, String modid, int drawspeed, int maxdurability) {
		this.name = name;
		this.modid = modid;
		this.drawspeed = drawspeed;
		this.setUnlocalizedName(name);
		this.setMaxDamage(maxdurability);
		this.setRegistryName(name);
	}

	@Override
	public void registerItemModel(Item item) {
		CTDCore.proxy.registerItemRenderer(modid, this, 0, name);

	}

	@Override
	public int getMaxItemUseDuration(ItemStack stack) {
		return drawspeed;
	}

}
