package com.themastergeneral.ctdcore;

import org.apache.logging.log4j.Logger;

import com.themastergeneral.ctdcore.proxy.CommonProxy;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CTDCore.MODID, name = CTDCore.MODNAME, version = CTDCore.VERSION, acceptedMinecraftVersions = CTDCore.acceptedMinecraftVersions, updateJSON = CTDCore.updateJSON, certificateFingerprint = CTDCore.certificateFingerprint)
public class CTDCore {
	public static final String MODID = "ctdcore";
	public static final String MODNAME = "CTD Core";
	public static final String VERSION = "1.2.2";
	public static final String updateJSON = "https://raw.githubusercontent.com/MasterGeneral156/Version/master/CTD-Core.json";
	public static final String acceptedMinecraftVersions = "1.12.2";
	public static final String certificateFingerprint = "441b509a0f58a0ef41aca8daf1be20d96287635e";

	@SidedProxy(clientSide = "com.themastergeneral.ctdcore.proxy.ClientProxy", serverSide = "com.themastergeneral.ctdcore.proxy.ServerProxy")
	public static CommonProxy proxy;

	@Instance
	public static CTDCore instance = new CTDCore();
	public static Logger logger;
	static {
		FluidRegistry.enableUniversalBucket();
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		logger = e.getModLog();
		logger.info("Starting CTD Core.");
		proxy.preInit(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
		logger.warn("Hey Mojang, fuck you! I'm removing your Java Edition thing! -TMG");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
		logger.info("Loaded CTD Core.");
	}

	@EventHandler
	public void onFingerprintViolation(FMLFingerprintViolationEvent e) {
		FMLLog.warning("Invalid fingerprint detected for CTD Core! TheMasterGeneral will not support this version!");
	}
}
