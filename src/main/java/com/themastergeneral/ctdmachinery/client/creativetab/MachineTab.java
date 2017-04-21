package com.themastergeneral.ctdmachinery.client.creativetab;

import com.themastergeneral.ctdmachinery.CTDMachinery;
import com.themastergeneral.ctdmachinery.common.items.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MachineTab extends CreativeTabs
{
	public MachineTab() 
	{
		super(CTDMachinery.MODID);
	}
	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ModItems.ctdtest);
	}
	 @Override
	 public boolean hasSearchBar() 
	 {
		 return false;
	 }

}
