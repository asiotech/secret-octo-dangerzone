package com.oefenmod.item.tool;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

import com.oefenmod.Main;

public class ItemModAxe extends ItemAxe{

	
	public ItemModAxe(String unlocalizedName, ToolMaterial material)
	{
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
	}
}
