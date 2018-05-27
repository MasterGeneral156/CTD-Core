package com.themastergeneral.ctdcore.imc;

import net.minecraft.item.ItemStack;

public class IMCHelper {

	public static final void addFlightItem(ItemStack input, int flighttime,
			int flightmultiplier, int resistance) {
		CTDMythos
				.addFlightItem(input, flighttime, flightmultiplier, resistance);
	}

	public static final void removeFlightItem(ItemStack input) {
		CTDMythos.removeFlightItem(input);
	}

	public static final void addPedestalCraft(ItemStack input, ItemStack output) {
		CTDMythos.addPedestalCraft(input, output);
	}

	public static final void removePedestalCraft(ItemStack input,
			ItemStack output) {
		CTDMythos.removePedestalCraft(input, output);
	}

	public static final void addEnderfugeSmelt(ItemStack input,
			ItemStack output, float xp) {
		Enderfuge.addSmelt(input, output, xp);
	}

	public static final void removeEnderfugeSmelt(ItemStack input,
			ItemStack output) {
		Enderfuge.removeSmelt(input, output);
	}

	public static final void addEnderfugeFuel(ItemStack input, int burntime) {
		Enderfuge.addFuel(input, burntime);
	}

	public static final void removeEnderfugeFuel(ItemStack input) {
		Enderfuge.removeFuel(input);
	}
}
