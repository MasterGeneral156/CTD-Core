/*
 * Most IMC isn't working yet. Will fix later.
 */

package com.themastergeneral.ctdcore.imc;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.InterModComms;

public class CTDMythos {

	/*public static final void addFlightItem(ItemStack input, int flighttime,
			int flightmultiplier, int resistance) {
		if (input == null || flighttime < 0 || flightmultiplier < 0
				|| resistance < 0) {
			return;
		}
		NBTTagCompound toSend = new NBTTagCompound();
		toSend.setTag("input", new NBTTagCompound());
		toSend.setTag("flighttime", new NBTTagCompound());
		toSend.setTag("resistance", new NBTTagCompound());
		toSend.setTag("flightmod", new NBTTagCompound());
		input.write(toSend.getCompound("input"));
		toSend.setInt("flighttime", flighttime);
		toSend.setInt("resistance", resistance);
		toSend.setInt("flightmod", flightmultiplier);
		FMLInterModComms.sendMessage("ctdmythos", "add_flight_wand_item",
				toSend);
	}

	public static final void removeFlightItem(ItemStack input) {
		if (input == null) {
			return;
		}
		NBTTagCompound toSend = new NBTTagCompound();
		toSend.setTag("input", new NBTTagCompound());
		input.write(toSend.getCompound("input"));
		InterModComms.sendTo("ctdmythos", "remove_flight_wand_item",
				toSend);
	}

	public static final void addPedestalCraft(ItemStack input, ItemStack output) {
		if (input == null || output == null) {
			return;
		}
		NBTTagCompound toSend = new NBTTagCompound();
		toSend.setTag("input", new NBTTagCompound());
		toSend.setTag("output", new NBTTagCompound());
		input.write(toSend.getCompound("input"));
		output.write(toSend.getCompound("output"));
		FMLInterModComms.sendMessage("ctdmythos", "add_mb_craft", toSend);
	}

	public static final void removePedestalCraft(ItemStack input,
			ItemStack output) {
		if (input == null || output == null) {
			return;
		}
		NBTTagCompound toSend = new NBTTagCompound();
		toSend.setTag("input", new NBTTagCompound());
		toSend.setTag("output", new NBTTagCompound());
		input.write(toSend.getCompound("input"));
		output.write(toSend.getCompound("output"));
		FMLInterModComms.sendMessage("ctdmythos", "remove_mb_craft", toSend);
	}*/
}
