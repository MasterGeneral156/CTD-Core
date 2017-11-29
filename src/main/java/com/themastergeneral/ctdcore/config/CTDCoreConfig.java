/*
 * This isn't for mod devs. This is for TMG. Fuck off, yo!
 */

package com.themastergeneral.ctdcore.config;

import net.minecraftforge.common.config.Configuration;

import org.apache.logging.log4j.Level;

import com.themastergeneral.ctdcore.CTDCore;
import com.themastergeneral.ctdcore.proxy.CommonProxy;

public class CTDCoreConfig {
	private static final String CATEGORY_GENERAL = "General";
	public static boolean disableTMGDrop = false;
	public static boolean enableTestMod = false;

	public static void readConfig() {
		Configuration cfg = CommonProxy.config;
		try {
			cfg.load();
			initGeneralConfig(cfg);
		} catch (Exception e1) {
			CTDCore.logger.log(Level.ERROR, "Problem loading config file!", e1);
		} finally {
			if (cfg.hasChanged()) {
				cfg.save();
			}
		}
	}

	private static void initGeneralConfig(Configuration cfg) {
		disableTMGDrop = cfg
				.getBoolean(
						"Disable TheMasterGeneral's Drop",
						CATEGORY_GENERAL,
						disableTMGDrop,
						"Everytime you kill TheMasterGeneral, he will drop his head when this is enabled.");
		enableTestMod = cfg
				.getBoolean(
						"Enable Test Mod",
						CATEGORY_GENERAL,
						enableTestMod,
						"This will load/register test classes. Recommended to keep this off unless you're a developer.");
	}
}
