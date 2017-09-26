package com.themastergeneral.ctdcore.fluid;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class CTDFluid extends Fluid {
	protected String name;	//Fluid's registry name
	protected String modid;	//Mod ID to look for its texture.

	public CTDFluid(String fluidName, String textureName, String modid) {
		super(fluidName, new ResourceLocation(modid, "blocks/" + textureName
				+ "_still"), new ResourceLocation(modid, "blocks/"
				+ textureName + "_flowing"));
		this.name = fluidName;
		this.modid = modid;
		this.setUnlocalizedName(fluidName);
	}

	@Override
	public String getUnlocalizedName() {
		return "fluid." + modid + "." + this.unlocalizedName;
	}
}
