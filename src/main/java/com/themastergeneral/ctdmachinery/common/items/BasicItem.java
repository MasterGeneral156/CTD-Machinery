package com.themastergeneral.ctdmachinery.common.items;

import com.themastergeneral.ctdcore.item.CTDItem;
import com.themastergeneral.ctdmachinery.CTDMachinery;
import com.themastergeneral.ctdmachinery.client.creativetab.MachineTab;

public class BasicItem extends CTDItem {

	public BasicItem(String name, String modid) 
	{
		super(name, modid);
		this.setCreativeTab(CTDMachinery.creativeTab);
	}

}
