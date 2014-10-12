package com.oefenmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.oefenmod.Main;

public class OefenBlock extends Block {

	protected OefenBlock(String unlocalizedName ,Material material) {
		super(material);
		this.setBlockName(unlocalizedName);
		this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(2.0F);
		this.setResistance(6.0F);
		this.setLightLevel(0.0F);
		this.setHarvestLevel("pickaxe", 3);
		this.setStepSound(soundTypeMetal);
	}
	
	@Override
	public void onFallenUpon(World p_149746_1_, int p_149746_2_, int p_149746_3_, int p_149746_4_, Entity entity, float p_149746_6_)
	{
		if(entity instanceof EntityPlayer)
		{
			((EntityPlayer) entity).addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 300, 1));
		}
	}
}
