package com.oefenmod.item.tool;

import com.oefenmod.Main;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class ItemModHoe extends ItemHoe{

	public ItemModHoe(String unlocalizedName, ToolMaterial material)
	{
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
	}
}
