package com.themastergeneral.ctdmachinery.proxy;

import java.io.File;

import com.themastergeneral.ctdmachinery.common.blocks.Modblocks;
import com.themastergeneral.ctdmachinery.common.config.Config;
import com.themastergeneral.ctdmachinery.common.handlers.ShapedRecipes;
import com.themastergeneral.ctdmachinery.common.items.ModItems;
import com.themastergeneral.ctdmachinery.common.tilentity.TileEntity;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class Common 
{
	public static Configuration config;
	public void preInit(FMLPreInitializationEvent e) 
	{
		TileEntity.registerTileEntity();
		File directory = e.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "CTD/CTDMachinery.cfg"));
        Config.readConfig();
		ModItems.init();
		Modblocks.init();
	}

	public void init(FMLInitializationEvent e) 
	{
		ShapedRecipes.addRecipes();
	}
	public void postInit(FMLPostInitializationEvent e) 
	{
		
	}
}
