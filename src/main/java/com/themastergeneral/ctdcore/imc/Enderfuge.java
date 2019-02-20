/*
 * Most IMC isn't working yet. Will fix later.
 */
package com.themastergeneral.ctdcore.imc;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class Enderfuge {
	/*public static final void addSmelt(ItemStack input, ItemStack output,
			float xp) {
		if (input == null || output == null) {
			return;
		}
		NBTTagCompound toSend = new NBTTagCompound();
		toSend.setTag("input", new NBTTagCompound());
		toSend.setTag("output", new NBTTagCompound());
		input.writeToNBT(toSend.getCompoundTag("input"));
		output.writeToNBT(toSend.getCompoundTag("output"));
		FMLInterModComms.sendMessage("enderfuge", "addenderfugerecipe", toSend);
	}

	public static final void addFuel(ItemStack input, int burntime) {
		if (input == null || burntime == 0) {
			return;
		}
		String burntime1 = String.valueOf(burntime);
		NBTTagCompound toSend = new NBTTagCompound();
		toSend.setTag("input", input.writeToNBT(new NBTTagCompound()));
		toSend.setInteger("burn", burntime);

		FMLInterModComms.sendMessage("enderfuge", "addenderfugefuel", toSend);
	}

	public static final void removeSmelt(ItemStack input, ItemStack output) {
		if (input == null || output == null) {
			return;
		}
		NBTTagCompound toSend = new NBTTagCompound();
		toSend.setTag("input", new NBTTagCompound());
		toSend.setTag("output", new NBTTagCompound());
		input.writeToNBT(toSend.getCompoundTag("input"));
		output.writeToNBT(toSend.getCompoundTag("output"));
		FMLInterModComms.sendMessage("enderfuge", "removeenderfugerecipe",
				toSend);
	}

	public static final void removeFuel(ItemStack input) {
		if (input == null) {
			return;
		}
		NBTTagCompound toSend = new NBTTagCompound();
		toSend.setTag("input", input.writeToNBT(new NBTTagCompound()));

		FMLInterModComms
				.sendMessage("enderfuge", "removeenderfugefuel", toSend);
	}*/
}
