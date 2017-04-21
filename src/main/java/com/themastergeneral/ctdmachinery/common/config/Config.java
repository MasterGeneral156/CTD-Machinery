package com.themastergeneral.ctdmachinery.common.config;

import org.apache.logging.log4j.Level;

import net.minecraftforge.common.config.Configuration;

import com.themastergeneral.ctdmachinery.CTDMachinery;
import com.themastergeneral.ctdmachinery.proxy.Common;

public class Config {

    private static final String CATEGORY_GENERAL = "General";
    public static int SpawnTelewarpDurability = 32;
    public static int InitialIlluminationTime = 500;
    public static void readConfig() 
    {
        Configuration cfg = Common.config;
        try 
        {
            cfg.load();
            initGeneralConfig(cfg);
        } 
        catch (Exception e1) 
        {
            CTDMachinery.logger.log(Level.ERROR, "Problem loading config file!", e1);
        }
        finally 
        {
            if (cfg.hasChanged()) 
            {
                cfg.save();
            }
        }
    }
    private static void initGeneralConfig(Configuration cfg) 
    {
        SpawnTelewarpDurability = cfg.getInt("Spawn Telepad Durability", CATEGORY_GENERAL, SpawnTelewarpDurability, 1, 65655, "How many times can you use the Spawn Telewarp pad before it breaks.");
        InitialIlluminationTime = cfg.getInt("Illumination Chamber Process Time", CATEGORY_GENERAL, InitialIlluminationTime, 1, 65655, "How long (in ticks) for the illumination chamber to succesfully finish a process.");
    }
}
