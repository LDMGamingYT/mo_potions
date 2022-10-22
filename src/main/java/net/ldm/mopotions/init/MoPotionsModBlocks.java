
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ldm.mopotions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

//import net.ldm.mopotions.block.PotionInfuserBlock;
import net.ldm.mopotions.MoPotionsMod;

public class MoPotionsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MoPotionsMod.MODID);
	/*public static final RegistryObject<Block> POTION_INFUSER = REGISTRY.register("potion_infuser", () -> new PotionInfuserBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			PotionInfuserBlock.registerRenderLayer();
		}
	}*/
}
