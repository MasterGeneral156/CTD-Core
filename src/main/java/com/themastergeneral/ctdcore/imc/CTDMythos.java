package com.themastergeneral.ctdcore.imc;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.event.FMLInterModComms;

public class CTDMythos {

	public static final void addFlightItem(ItemStack input, int flighttime,
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
		input.writeToNBT(toSend.getCompoundTag("input"));
		toSend.setInteger("flighttime", flighttime);
		toSend.setInteger("resistance", resistance);
		toSend.setInteger("flightmod", flightmultiplier);
		FMLInterModComms.sendMessage("ctdmythos", "add_flight_wand_item",
				toSend);
	}

	public static final void removeFlightItem(ItemStack input) {
		if (input == null) {
			return;
		}
		NBTTagCompound toSend = new NBTTagCompound();
		toSend.setTag("input", new NBTTagCompound());
		input.writeToNBT(toSend.getCompoundTag("input"));
		FMLInterModComms.sendMessage("ctdmythos", "remove_flight_wand_item",
				toSend);
	}

	public static final void addPedestalCraft(ItemStack input, ItemStack output) {
		if (input == null || output == null) {
			return;
		}
		NBTTagCompound toSend = new NBTTagCompound();
		toSend.setTag("input", new NBTTagCompound());
		toSend.setTag("output", new NBTTagCompound());
		input.writeToNBT(toSend.getCompoundTag("input"));
		output.writeToNBT(toSend.getCompoundTag("output"));
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
		input.writeToNBT(toSend.getCompoundTag("input"));
		output.writeToNBT(toSend.getCompoundTag("output"));
		FMLInterModComms.sendMessage("ctdmythos", "remove_mb_craft", toSend);
	}
}
