package com.themastergeneral.ctdcore.helpers;

import net.minecraft.world.World;

public class CTDRegisters {
	public static boolean isClientWorld(World world) {
		return world.isRemote;
	}
	public static boolean isServerWorld(World world) {
		return !world.isRemote;
	}
	public static boolean isRaining(World world) {
		return world.isRaining();
	}
}
