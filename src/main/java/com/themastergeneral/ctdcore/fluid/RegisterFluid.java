package com.themastergeneral.ctdcore.fluid;

import java.util.Locale;

import org.apache.logging.log4j.Level;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.themastergeneral.ctdcore.Main;
import com.themastergeneral.ctdcore.block.CTDBlockFlowing;
import com.themastergeneral.ctdcore.block.RegisterBlock;
import com.themastergeneral.ctdcore.client.ItemModelProvider;

public class RegisterFluid {
	public static void init() {
	}

	private static Fluid registerFluid(String fluidName,
			String fluidTextureName, EnumRarity rarity, String modid) {
		Fluid fluid = new CTDFluid(fluidName.toLowerCase(Locale.ROOT),
				fluidTextureName, modid).setRarity(rarity);
		FluidRegistry.registerFluid(fluid);
		FluidRegistry.addBucketForFluid(fluid);

		return FluidRegistry.getFluid(fluid.getName());
	}

	public static Block registerFluidBlock(Fluid fluid, Material material,
			String name, String modid) {
		return new CTDBlockFlowing(fluid, material, name, modid);
	}
}
