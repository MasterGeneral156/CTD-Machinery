package com.themastergeneral.ctdmachinery.common.blocks;

import net.minecraft.block.material.Material;

import com.themastergeneral.ctdcore.block.CTDBlock;
import com.themastergeneral.ctdmachinery.CTDMachinery;

public class BasicBlock extends CTDBlock 
{
	public BasicBlock(Material materialIn, String name, String modid) 
	{
		super(materialIn, name, modid);
		this.setCreativeTab(CTDMachinery.creativeTab);
	}
}
