package com.oefenmod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.oefenmod.Main;

import cpw.mods.fml.common.registry.GameRegistry;

public final class ModItems {

	public static Item oefenItem;
	public static Item metaItem;

	public static final void init() 
	{
		GameRegistry.registerItem(
				oefenItem = new Item().setUnlocalizedName("oefenItem")
						.setCreativeTab(CreativeTabs.tabMisc)
						.setTextureName(Main.MODID + ":oefenItem"),
				"oefenItem");
		
		GameRegistry.registerItem(metaItem = new MetaItem("metaItem"), "metaItem");
	}
}
