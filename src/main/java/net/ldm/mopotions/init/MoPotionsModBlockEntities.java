
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ldm.mopotions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

//import net.ldm.mopotions.block.entity.PotionInfuserBlockEntity;
import net.ldm.mopotions.MoPotionsMod;

public class MoPotionsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MoPotionsMod.MODID);
	//public static final RegistryObject<BlockEntityType<?>> POTION_INFUSER = register("potion_infuser", MoPotionsModBlocks.POTION_INFUSER, PotionInfuserBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
