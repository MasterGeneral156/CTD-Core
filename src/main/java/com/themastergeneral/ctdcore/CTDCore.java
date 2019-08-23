package com.themastergeneral.ctdcore;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.fml.config.ModConfig;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import com.themastergeneral.ctdcore.config.CTDCoreConfig;

@Mod("ctdcore")
public class CTDCore {
	public static CTDCore instance;
	private static final Logger LOGGER = LogManager.getLogger();

	public CTDCore() {
		instance = this;
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        // Register ourselves for server, registry and other game events we are interested in
        //ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CTDCoreConfig.COMMON_CONFIG);
        //CTDCoreConfig.loadConfig(CTDCoreConfig.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve("ctd/ctd-core.toml"));
        MinecraftForge.EVENT_BUS.register(this);
    }
	
	private void setup(final FMLCommonSetupEvent event)
    {
		LOGGER.info("CTD Core is launching.");
		LOGGER.warn("Please note that CTD Core is NOT feature complete. This is a VERY ALPHA BUILD.");
    }

}
