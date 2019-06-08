package com.themastergeneral.ctdcore.fluid;

import java.util.Locale;

import net.minecraft.block.material.Material;
import net.minecraft.item.Rarity;
import net.minecraftforge.fluids.Fluid;

public class RegisterFluid {
	private static void registerFluid(String fluidName,
			String fluidTextureName, Rarity rarity, String modid) {
		Fluid fluid = new CTDFluid(fluidName.toLowerCase(Locale.ROOT),
				fluidTextureName, modid).setRarity(rarity);
		//FluidRegistry.registerFluid(fluid);
		//FluidRegistry.class.
		//FluidRegistry.addBucketForFluid(fluid);

		//return FluidRegistry.getFluid(fluid.getName());
	}

	public static void registerFluidBlock(Fluid fluid, Material material,
			String name, String modid) {
		//return new CTDBlockFlowing(fluid, material, name, modid);
		return;
	}
}
