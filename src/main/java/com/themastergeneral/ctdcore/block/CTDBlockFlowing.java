/*
 * Do not use this class. I don't remember how this works exactly lol.
 */

package com.themastergeneral.ctdcore.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

import com.themastergeneral.ctdcore.Main;
import com.themastergeneral.ctdcore.client.BlockRenderRegister;
import com.themastergeneral.ctdcore.client.ItemModelProvider;

public class CTDBlockFlowing extends BlockFluidClassic implements
		ItemModelProvider, BlockRenderRegister {
	protected String name;
	protected String modid;

	public CTDBlockFlowing(Fluid fluid, Material material, String name,
			String modid) {
		super(fluid, material);
		this.name = name;
		this.modid = modid;
		this.setRegistryName(name);
		RegisterBlock.register(this);
	}

	@Override
	public void registerItemModel(Item itemBlock) {
		Main.proxy.registerItemRenderer(modid, itemBlock, 0, name);
	}

	@Override
	public void reg(Block block) {
		Minecraft
				.getMinecraft()
				.getRenderItem()
				.getItemModelMesher()
				.register(
						Item.getItemFromBlock(block),
						0,
						new ModelResourceLocation(modid + ":"
								+ block.getUnlocalizedName().substring(5),
								"inventory"));
	}
}
