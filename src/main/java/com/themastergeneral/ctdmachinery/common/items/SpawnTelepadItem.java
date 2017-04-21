package com.themastergeneral.ctdmachinery.common.items;

import com.themastergeneral.ctdmachinery.common.config.Config;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SpawnTelepadItem extends BasicItem 
{
	private double x;
    private double y;
    private double z;
	public SpawnTelepadItem(String name, String modid)
	{
		super(name, modid);
		this.setNoRepair();
		this.maxStackSize = 1;
		this.setMaxDamage(Config.SpawnTelewarpDurability);
	}
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		if (!worldIn.isRemote)
        {
            itemstack.damageItem(1, playerIn);
        }
		BlockPos blockpos = worldIn.provider.getRandomizedSpawnPoint();
		playerIn.setPositionAndUpdate(blockpos.getX(), blockpos.getY(), blockpos.getZ());
		return new ActionResult(EnumActionResult.PASS, itemstack);
    }
	public int getMaxItemUseDuration(ItemStack stack)
    {
        return 72000;
    }
}
