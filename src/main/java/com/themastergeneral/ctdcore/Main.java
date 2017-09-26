package com.themastergeneral.ctdcore;

import org.apache.logging.log4j.Logger;

import com.themastergeneral.ctdcore.proxy.CommonProxy;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION, acceptedMinecraftVersions = Main.acceptedMinecraftVersions, updateJSON = Main.updateJSON)
public class Main {
	public static final String MODID = "ctdcore";
	public static final String MODNAME = "CTD Core";
	public static final String VERSION = "1.1.9";
	public static final String updateJSON = "https://raw.githubusercontent.com/MasterGeneral156/Version/master/CTD-Core.json";
	public static final String acceptedMinecraftVersions = "1.12.2";

	@SidedProxy(clientSide = "com.themastergeneral.ctdcore.proxy.ClientProxy", serverSide = "com.themastergeneral.ctdcore.proxy.ServerProxy")
	public static CommonProxy proxy;

	@Instance
	public static Main instance = new Main();
	public static Logger logger;
	static {
		FluidRegistry.enableUniversalBucket();
	}

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		logger = e.getModLog();
		logger.info("Starting CTD Core.");
		proxy.preInit(e);
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
		logger.warn("Hey Mojang, fuck you! I'm removing your Java Edition thing! -TMG");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
		logger.info("Loaded CTD Core.");
	}
}
