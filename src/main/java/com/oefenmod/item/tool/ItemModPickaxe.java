package com.oefenmod.item.tool;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

import com.oefenmod.Main;

public class ItemModPickaxe extends ItemPickaxe{

	public ItemModPickaxe(String unlocalizedName, ToolMaterial material)
	{
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
	}
}
