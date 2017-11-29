package com.themastergeneral.ctdcore.proxy;

import java.io.File;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.themastergeneral.ctdcore.block.RegisterBlock;
import com.themastergeneral.ctdcore.config.CTDCoreConfig;
import com.themastergeneral.ctdcore.events.CTDCoreEventHandler;
import com.themastergeneral.ctdcore.fluid.RegisterFluid;
import com.themastergeneral.ctdcore.item.RegisterItem;
import com.themastergeneral.ctdcore.tests.TestModule;

public class CommonProxy {
	public static Configuration config;

	public void preInit(FMLPreInitializationEvent e) {
		File directory = e.getModConfigurationDirectory();
		config = new Configuration(new File(directory.getPath(),
				"ctd/ctdcore.cfg"));
		CTDCoreConfig.readConfig();
		CTDCoreEventHandler.loadEvents();
		if (CTDCoreConfig.enableTestMod)
			TestModule.loadTests();
	}

	public void init(FMLInitializationEvent e) {

	}

	public void postInit(FMLPostInitializationEvent e) {

	}

	public void registerItemRenderer(String mod, Item item, int meta, String id) {

	}
}
