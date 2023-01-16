
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ldm.mopotions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.ldm.mopotions.item.FermentedSugarItem;
import net.ldm.mopotions.item.AngelTotemItem;
import net.ldm.mopotions.MoPotionsMod;

public class MoPotionsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MoPotionsMod.MODID);
	public static final RegistryObject<Item> FERMENTED_SUGAR = REGISTRY.register("fermented_sugar", FermentedSugarItem::new);
	public static final RegistryObject<Item> ANGEL_TOTEM = REGISTRY.register("angel_totem", AngelTotemItem::new);
	//public static final RegistryObject<Item> POTION_INFUSER = block(MoPotionsModBlocks.POTION_INFUSER, CreativeModeTab.TAB_BREWING);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
