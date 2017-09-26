package com.themastergeneral.ctdcore.events;

import net.minecraftforge.common.MinecraftForge;

import com.themastergeneral.ctdcore.Main;
import com.themastergeneral.ctdcore.config.CTDCoreConfig;

public class CTDCoreEventHandler {
	public static void loadEvents()
	{
		if (CTDCoreConfig.disableTMGDrop == false)
		{
			Main.logger.info("Loading TMG's head drop");
			MinecraftForge.EVENT_BUS.register(new TMGHeadDrop());
		}
	}
}
