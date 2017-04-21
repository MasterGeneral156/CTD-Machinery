package com.themastergeneral.ctdmachinery.common.items;

import com.themastergeneral.ctdcore.item.RegisterItem;
import com.themastergeneral.ctdmachinery.CTDMachinery;

public class ModItems extends RegisterItem 
{
	public static SpawnTelepadItem spawntelepad;
	public static void init()
	{
		spawntelepad = register(new SpawnTelepadItem("spawntelepad", CTDMachinery.MODID));
	}
}
