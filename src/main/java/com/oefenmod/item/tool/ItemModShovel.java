package com.oefenmod.item.tool;

import com.oefenmod.Main;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ItemModShovel extends ItemSpade{

	public ItemModShovel(String unlocalizedName, ToolMaterial material)
	{
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
	}
}
