package com.themastergeneral.ctdcore.fluid;

import java.util.Locale;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumRarity;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

import com.themastergeneral.ctdcore.Main;
import com.themastergeneral.ctdcore.block.CTDBlockFlowing;

public class RegisterFluid 
{
	public static void init()
	{
		registerFluid("meme", "meme", EnumRarity.COMMON, Main.MODID);
	}
	private static Fluid registerFluid(String fluidName, String fluidTextureName, EnumRarity rarity, String modid)
	{
        Fluid fluid = new CTDFluid(fluidName.toLowerCase(Locale.ROOT), fluidTextureName, modid).setRarity(rarity);
        FluidRegistry.registerFluid(fluid);
        FluidRegistry.addBucketForFluid(fluid);

        return FluidRegistry.getFluid(fluid.getName());
    }
	public static Block registerFluidBlock(Fluid fluid, Material material, String name, String modid)
	{
		return new CTDBlockFlowing(fluid, material, name, modid);
	}
}
