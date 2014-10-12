package com.oefenmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.oefenmod.block.itemblock.ItemBlockMetaBlock;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static Block oefenBlock;
	public static Block multitexture;
	public static Block metablock;
	
	public static final void init()
	{
		GameRegistry.registerBlock(oefenBlock = new OefenBlock("oefenBlock", Material.iron), "oefenBlock");
		//GameRegistry.registerBlock(multitexture = new MultitextureBlock("multitexture", Material.cloth), "multitexture");
		//GameRegistry.registerBlock(metablock = new MetaBlock("metablock", Material.cloth), ItemBlockMetaBlock.class, "metablock");
	}
}
