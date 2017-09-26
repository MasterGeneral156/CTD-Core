/*
 * Implement this class in your block class if you wish for your blocks to have models!
 */

package com.themastergeneral.ctdcore.client;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public interface BlockRenderRegister {
	void reg(Block block);
}
