package com.oefenmod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.oefenmod.Main;
import com.oefenmod.item.armor.ItemModArmor;
import com.oefenmod.item.tool.ItemModAxe;
import com.oefenmod.item.tool.ItemModHoe;
import com.oefenmod.item.tool.ItemModPickaxe;
import com.oefenmod.item.tool.ItemModShovel;
import com.oefenmod.item.tool.ItemModSword;

import cpw.mods.fml.common.registry.GameRegistry;

public final class ModItems {

	public static Item oefenItem;
	public static Item metaItem;
	
	public static Item oefenPickaxe;
	public static Item oefenAxe;
	public static Item oefenShovel;
	public static Item oefenHoe;
	public static Item oefenSword;
	
	public static Item oefenHelmet;
	public static Item oefenChestplate;
	public static Item oefenLeggings;
	public static Item oefenBoots;
	
	//addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability)
	//harvestLevel: wood/gold = 0, diamond = 3
	//maxUses: wood = 59, iron = 250, diamond = 1561
	//efficiency: wood = 2.0F, diamond = 8.0F, gold = 12.0F
	//damage: wood = 0.0F, diamond = 3.0F. Sword is always 4 higher
	//enchantability: wood = 15, gold = 22, diamond = 10
	public static ToolMaterial OEFEN = EnumHelper.addToolMaterial("OEFEN", 1, 2, 20.0F, 27.0F, 40);

	
	//addArmorMaterial(name, durability, damageReduction[], enchantability
	//durability: leather = 5, iron = 15, diamond = 33
	//damagereduction[]: > 25 = invulnerable!
	//new int[]{1, 3, 2, 1} = leather. diamond = 3, 8, 6, 3! DO NOT CROSS.
	//enchantability: leather = 15, gold = 25, diamond = 10, iron = 9
	public static ArmorMaterial ARMOR = EnumHelper.addArmorMaterial("ARMOR", 18, new int[]{2, 9, 4, 1}, 25);
	
	
	public static final void init() 
	{
		//GameRegistry.registerItem(ITEM TO REGISTER, NAME)
		registerItemsWithoutClass();
		registerMetaItems();
		registerTools();
		registerArmor();
	}
	
	
	private static void registerTools()
	{
		//OEFEN Tools
		GameRegistry.registerItem(oefenPickaxe = new ItemModPickaxe("oefen_pickaxe", OEFEN), "oefen_pickaxe");
		GameRegistry.registerItem(oefenAxe = new ItemModAxe("oefen_axe", OEFEN), "oefen_axe");
		GameRegistry.registerItem(oefenShovel = new ItemModShovel("oefen_shovel", OEFEN), "oefen_shovel");
		GameRegistry.registerItem(oefenHoe = new ItemModHoe("oefen_hoe", OEFEN), "oefen_hoe");
		GameRegistry.registerItem(oefenSword = new ItemModSword("oefen_sword", OEFEN), "oefen_sword");
	}
	
	private static void registerMetaItems()
	{
		//metaItem
		GameRegistry.registerItem(metaItem = new MetaItem("metaItem"), "metaItem");
	}
	
	private static void registerItemsWithoutClass()
	{
		//OefenItem
		GameRegistry.registerItem(
				oefenItem = new Item().setUnlocalizedName("oefenItem")
						.setCreativeTab(CreativeTabs.tabMisc)
						.setTextureName(Main.MODID + ":oefenItem"),
				"oefenItem");
	}
	
	private static void registerArmor()
	{
		GameRegistry.registerItem(oefenHelmet = new ItemModArmor("oefen_helmet", ARMOR, "oefen", 0), "oefen_helmet"); //0 for helmet
		GameRegistry.registerItem(oefenHelmet = new ItemModArmor("oefen_chestplate", ARMOR, "oefen", 1), "oefen_chestplate"); // 1 for chestplate
		GameRegistry.registerItem(oefenLeggings = new ItemModArmor("oefen_leggings", ARMOR, "oefen", 2), "oefen_leggings"); // 2 for leggings
		GameRegistry.registerItem(oefenBoots = new ItemModArmor("oefen_boots", ARMOR, "oefen", 3), "oefen_boots"); // 3 for boots
	}
}
