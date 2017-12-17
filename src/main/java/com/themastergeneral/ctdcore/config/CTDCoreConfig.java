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
	}
}
