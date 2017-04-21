package com.themastergeneral.ctdmachinery.client.gui;

import org.apache.logging.log4j.Level;

import com.themastergeneral.ctdmachinery.CTDMachinery;
import com.themastergeneral.ctdmachinery.common.tilentity.TileEntityIlluminationChamber;
import com.themastergeneral.ctdmachinery.server.container.ContainerIlluminationChamber;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GUIHandler implements IGuiHandler 
{
	public static final int ILLUMINATION_CHAMBER = 0;

	@Override
	public Container getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == ILLUMINATION_CHAMBER) 
		{
			System.out.print("Opening container.");
			return new ContainerIlluminationChamber(player.inventory, (TileEntityIlluminationChamber) world.getTileEntity(new BlockPos(x, y, z)));
			
		}
		return null;
	}

	@Override
	public GuiScreen getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == ILLUMINATION_CHAMBER) 
		{
			System.out.print("Opening GUI.");
			return new GUIIlluminationChamber(player.inventory, (TileEntityIlluminationChamber) world.getTileEntity(new BlockPos(x, y, z)));
		}
		return null;
	}
}
