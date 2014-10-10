package com.oefenmod.blocks;

import com.oefenmod.oefenmod.OefenMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class OefenBlock extends Block {

	protected OefenBlock(String unlocalizedName ,Material material) {
		super(material);
		this.setBlockName(unlocalizedName);
		this.setBlockTextureName(OefenMod.MODID + ":" + unlocalizedName);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(2.0F);
		this.setResistance(6.0F);
		this.setLightLevel(1.0F);
		this.setHarvestLevel("pickaxe", 3);
		this.setStepSound(soundTypeMetal);
	}
}
