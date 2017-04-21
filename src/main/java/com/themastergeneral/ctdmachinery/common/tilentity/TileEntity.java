package com.themastergeneral.ctdmachinery.common.tilentity;

import com.themastergeneral.ctdmachinery.CTDMachinery;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntity {
	public static void registerTileEntity()
	{
		GameRegistry.registerTileEntity(TileEntityIlluminationChamber.class, CTDMachinery.MODID+"_illumination_chamber");
	}
}
