package com.themastergeneral.ctdcore.events;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagString;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class TMGHeadDrop {
	@SubscribeEvent
	public void onLivingDrop(LivingDropsEvent event) {
		NBTTagCompound nbt;
		if (event.getEntity() instanceof EntityPlayer) {
			if (event.getEntity().getName() == "TheMasterGeneral") {
				ItemStack itemdrop = new ItemStack(Items.SKULL, 1, 3);
				itemdrop.setTagCompound(new NBTTagCompound());
				itemdrop.getTagCompound().setTag("SkullOwner",
						new NBTTagString("TheMasterGeneral"));
				event.getDrops().add(
						new EntityItem(event.getEntity().world, event
								.getEntity().posX, event.getEntity().posY,
								event.getEntity().posZ, itemdrop));
			}
		}
	}
}
