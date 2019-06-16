/*
 * Extend this class to add a basic block to the game.
 */

package com.themastergeneral.ctdcore.block;

import net.minecraft.block.Block;

public class CTDBlock extends Block {
	protected String name; // Block's registry name
	protected String modid; // Mod ID to look for the model.

	public CTDBlock(Properties materialIn, String name, String modid) {
		super(materialIn);
		this.name = name;
		this.modid = modid;
		this.setRegistryName(modid, name);

	}
}
