package com.themastergeneral.ctdmachinery.common.handlers;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import com.themastergeneral.ctdmachinery.common.items.ModItems;

public class ShapedRecipes {
	public static void addRecipes()
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.spawntelepad), "LDL", "DED", "LDL", 'L', "dyeBlue", 'D', Items.ENDER_EYE, 'E', Items.COMPASS));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.spawntelepad), "LDL", "DED", "LDL", 'D', "dyeBlue", 'L', Items.ENDER_EYE, 'E', Items.COMPASS));
	}
}
