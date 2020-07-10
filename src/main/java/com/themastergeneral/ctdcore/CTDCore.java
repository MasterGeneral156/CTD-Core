package com.themastergeneral.ctdcore;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

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

        MinecraftForge.EVENT_BUS.register(this);
    }
	
	private void setup(final FMLCommonSetupEvent event)
    {
		LOGGER.info("CTD Core is launching.");
    }

}
