package com.themastergeneral.ctdcore;

import com.themastergeneral.ctdcore.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION, acceptedMinecraftVersions = Main.acceptedMinecraftVersions, updateJSON = Main.updateJSON)
public class Main 
{
	public static final String MODID = "ctdcore";
    public static final String MODNAME = "CTD Core";
    public static final String VERSION = "1.0.3";
    public static final String updateJSON = "https://dl.dropboxusercontent.com/u/72961306/TMG%20Assets/Update%20JSONs/CTD-Core.json";
    public static final String acceptedMinecraftVersions = "1.10.2";
    
    @SidedProxy(clientSide="com.themastergeneral.ctdcore.proxy.ClientProxy", serverSide="com.themastergeneral.ctdcore.proxy.ServerProxy")
    public static CommonProxy proxy;
    
    @Instance
    public static Main instance = new Main();
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) 
    {
    	proxy.preInit(e);
    }
    @EventHandler
    public void init(FMLInitializationEvent e) 
    {
    	proxy.init(e);
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) 
    {
    	proxy.postInit(e);
    }
}
