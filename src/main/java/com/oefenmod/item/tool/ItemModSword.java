package com.oefenmod.item.tool;

import com.oefenmod.Main;

import net.minecraft.item.ItemSword;

public class ItemModSword extends ItemSword{
	
	public ItemModSword(String unlocalizedName, ToolMaterial material)
	{
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
	}
}
