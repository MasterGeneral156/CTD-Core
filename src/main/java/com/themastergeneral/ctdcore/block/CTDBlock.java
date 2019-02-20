/*
 * Extend this class to add a basic block to the game.
 */

package com.themastergeneral.ctdcore.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.themastergeneral.ctdcore.CTDCore;
import com.themastergeneral.ctdcore.client.BlockRenderRegister;
import com.themastergeneral.ctdcore.client.ItemModelProvider;

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
