package mod.oefenmod.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.oefenmod.blocks.ModBlocks;
import com.oefenmod.items.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public final class ModCrafting {

	public static final void init() 
	{
		GameRegistry.addRecipe(new ItemStack(ModBlocks.oefenBlock), new Object[] {"##", "##", '#', ModItems.oefenItem});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.oefenItem), new Object[] {Items.redstone, new ItemStack(Items.dye, 1, 4)});
		GameRegistry.addSmelting(Items.diamond, new ItemStack(ModItems.oefenItem), 1.0F);
	}
}