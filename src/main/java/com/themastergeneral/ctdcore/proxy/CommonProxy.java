package com.themastergeneral.ctdcore.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.themastergeneral.ctdcore.block.RegisterBlock;
import com.themastergeneral.ctdcore.item.RegisterItem;
import com.themastergeneral.ctdcore.test.TestStuff;

public class CommonProxy 
{
	public void preInit(FMLPreInitializationEvent e) 
    {
		RegisterItem.init();
		RegisterBlock.init();
    }
    public void init(FMLInitializationEvent e) 
    {
    	MinecraftForge.EVENT_BUS.register(new TestStuff());
    }
    public void postInit(FMLPostInitializationEvent e) 
    {

    }
    public void registerItemRenderer(String mod,Item item, int meta, String id)
    {
    	 
    }
}
