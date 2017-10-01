package com.themastergeneral.ctdcore;

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

import com.themastergeneral.ctdcore.proxy.CommonProxy;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION, certificateFingerprint = Main.Fingerprint, acceptedMinecraftVersions = Main.acceptedMinecraftVersions, updateJSON = Main.updateJSON)
public class Main {
	public static final String MODID = "ctdcore";
	public static final String MODNAME = "CTD Core";
	public static final String VERSION = "1.0.4";
	public static final String updateJSON = "https://raw.githubusercontent.com/MasterGeneral156/Version/master/CTD-Core.json";
	public static final String acceptedMinecraftVersions = "1.11.2";
	public static final String Fingerprint = "441b509a0f58a0ef41aca8daf1be20d96287635e";

	@SidedProxy(clientSide = "com.themastergeneral.ctdcore.proxy.ClientProxy", serverSide = "com.themastergeneral.ctdcore.proxy.ServerProxy")
	public static CommonProxy proxy;

	@Instance
	public static Main instance = new Main();
	static {
		FluidRegistry.enableUniversalBucket();
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}

	@EventHandler
	public void onFingerprintViolation(FMLFingerprintViolationEvent e) {
		FMLLog.warning("Invalid fingerprint detected for CTD Core! TheMasterGeneral will not support this version!");
	}
}
