package com.themastergeneral.ctdcore.client;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.themastergeneral.ctdcore.Main;

public interface BlockRenderRegister {
	void reg(Block block);
}
