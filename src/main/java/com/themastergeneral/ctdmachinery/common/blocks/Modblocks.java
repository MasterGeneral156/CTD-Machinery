package com.themastergeneral.ctdmachinery.common.blocks;

import net.minecraft.block.material.Material;

import com.themastergeneral.ctdcore.Main;
import com.themastergeneral.ctdcore.block.CTDBlock;
import com.themastergeneral.ctdcore.block.RegisterBlock;
import com.themastergeneral.ctdmachinery.CTDMachinery;

public class Modblocks extends RegisterBlock 
{
	public static BasicBlock machinery_test;
	public static IlluminationChamberBlock illumination_chamber;
	public static void init()
	{
		machinery_test = register(new BasicBlock(Material.ROCK, "machinery_test", CTDMachinery.MODID));
		illumination_chamber = register(new IlluminationChamberBlock("illumination_chamber", false));
	}
}
