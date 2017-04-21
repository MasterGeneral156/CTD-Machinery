package com.themastergeneral.ctdmachinery;

import org.apache.logging.log4j.Logger;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.themastergeneral.ctdmachinery.client.creativetab.MachineTab;
import com.themastergeneral.ctdmachinery.proxy.Common;

@Mod(modid = CTDMachinery.MODID, name = CTDMachinery.MODNAME, version = CTDMachinery.VERSION, acceptedMinecraftVersions = CTDMachinery.acceptedMinecraftVersions, updateJSON = CTDMachinery.updateJSON, dependencies = CTDMachinery.DEPENDENCIES)
public class CTDMachinery 
{
	public static final String MODID = "ctdmachinery";
    public static final String MODNAME = "CTD Machinery";
    public static final String VERSION = "1.0.0";
    public static final String acceptedMinecraftVersions = "1.11.2";
	public static final String updateJSON = "https://github.com/MasterGeneral156/Version/blob/master/CTD-Machinery.json";
	public static final String DEPENDENCIES = "required-after:ctdcore@[1.0.2,];";
	public static final MachineTab creativeTab = new MachineTab();
	
	@Instance
    public static CTDMachinery instance = new CTDMachinery();
	public static Logger logger;
	
	@SidedProxy(clientSide="com.themastergeneral.ctdmachinery.proxy.Client", serverSide="com.themastergeneral.ctdmachinery.proxy.Server")
    public static Common proxy;
	
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
