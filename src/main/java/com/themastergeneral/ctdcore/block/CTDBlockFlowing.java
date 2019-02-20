/*
 * Do not use this class. I don't remember how this works exactly lol.
 */

package com.themastergeneral.ctdcore.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.Fluid;

import com.themastergeneral.ctdcore.CTDCore;

public class CTDBlockFlowing /*extends BlockFluidClassic*/ {
	protected String name;
	protected String modid;

	public CTDBlockFlowing(Fluid fluid, Material material, String name,
			String modid) {
		super();
		this.name = name;
		this.modid = modid;
		//this.setRegistryName(name);
		//RegisterBlock.register(this);
	}
}
