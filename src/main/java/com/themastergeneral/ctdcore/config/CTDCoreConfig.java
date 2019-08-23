/*
 * This isn't for mod devs. This is for TMG. Fuck off, yo!
 */

package com.themastergeneral.ctdcore.config;
/*
import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

import java.io.File;
import java.nio.file.Path;

@Mod.EventBusSubscriber
public class CTDCoreConfig {
	private static final ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();

    public static final ForgeConfigSpec COMMON_CONFIG;

    static {

        COMMON_CONFIG = COMMON_BUILDER.build();
    }
    public static final String CATEGORY_GENERAL = "general";
    private static File modConfigDir;
    
    public static void init(ForgeConfigSpec.Builder COMMON_BUILDER) {
        COMMON_BUILDER.comment("General settings for all CTD Core based mods.").push(CATEGORY_GENERAL);

        COMMON_BUILDER.pop();
    }
    //Load the config file.
    public static void loadConfig(ForgeConfigSpec spec, Path path) {
        final CommentedFileConfig configData = CommentedFileConfig.builder(path)
                .sync()
                .autosave()
                .writingMode(WritingMode.REPLACE)
                .build();

        configData.load();
        spec.setConfig(configData);
    }

}
*/