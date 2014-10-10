package com.oefenmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.oefenmod.oefenmod.OefenMod;

import cpw.mods.fml.common.registry.GameRegistry;

public final class ModItems {

	public static Item oefenItem;

	public static final void init() 
	{
		GameRegistry.registerItem(
				oefenItem = new Item().setUnlocalizedName("oefenItem")
						.setCreativeTab(CreativeTabs.tabMisc)
						.setTextureName(OefenMod.MODID + ":oefenItem"),
				"oefenItem");
	}
}
