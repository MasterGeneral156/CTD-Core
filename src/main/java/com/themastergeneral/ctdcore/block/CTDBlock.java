package com.themastergeneral.ctdcore.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.themastergeneral.ctdcore.Main;
import com.themastergeneral.ctdcore.client.BlockRenderRegister;
import com.themastergeneral.ctdcore.client.ItemModelProvider;

public class CTDBlock extends Block implements ItemModelProvider,
		BlockRenderRegister {
	protected String name;
	protected String modid;

	public CTDBlock(Material materialIn, String name, String modid) {
		super(materialIn);
		this.name = name;
		this.modid = modid;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);

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
