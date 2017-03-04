package com.themastergeneral.ctdcore.proxy;

import com.themastergeneral.ctdcore.block.RegisterBlock;
import com.themastergeneral.ctdcore.item.RegisterItem;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy 
{
	public void preInit(FMLPreInitializationEvent e) 
    {
		RegisterItem.init();
		RegisterBlock.init();
    }
    public void init(FMLInitializationEvent e) 
    {
    	
    }
    public void postInit(FMLPostInitializationEvent e) 
    {

    }
    public void registerItemRenderer(String mod,Item item, int meta, String id)
    {
    	 
    }
}
