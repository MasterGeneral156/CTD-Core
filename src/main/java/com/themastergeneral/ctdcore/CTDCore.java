package com.themastergeneral.ctdcore;

import com.themastergeneral.ctdcore.proxy.CommonProxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("ctdcore")
public class CTDCore {
	public static CommonProxy proxy;
	private static final Logger LOGGER = LogManager.getLogger();

	public static Logger logger;
	static {
		FluidRegistry.enableUniversalBucket();
	}
	public CTDCore() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        // Register ourselves for server, registry and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
	
	private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
		LOGGER.info("CTD Core is launching.");
    }

}
