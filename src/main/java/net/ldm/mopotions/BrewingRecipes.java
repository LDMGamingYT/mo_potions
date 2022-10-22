package net.ldm.mopotions;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;

import net.ldm.mopotions.init.MoPotionsModPotions;
import net.ldm.mopotions.init.MoPotionsModItems;

//import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraft.world.item.alchemy.PotionBrewing;

import java.lang.reflect.Method;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BrewingRecipes {
	public BrewingRecipes() {
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		//Haste
		PotionBrewing.addMix(Potions.THICK, MoPotionsModItems.FERMENTED_SUGAR.get(), MoPotionsModPotions.HASTE_POTION.get());
		PotionBrewing.addMix(MoPotionsModPotions.HASTE_POTION.get(), Items.GLOWSTONE_DUST, MoPotionsModPotions.STRONG_HASTE_POTION.get());
		PotionBrewing.addMix(MoPotionsModPotions.HASTE_POTION.get(), Items.REDSTONE, MoPotionsModPotions.LONG_HASTE_POTION.get());

		//Mining Fatigue
		PotionBrewing.addMix(MoPotionsModPotions.HASTE_POTION.get(), Items.FERMENTED_SPIDER_EYE, MoPotionsModPotions.MINING_FATIGUE_POTION.get());
		PotionBrewing.addMix(MoPotionsModPotions.STRONG_HASTE_POTION.get(), Items.GLOWSTONE_DUST, MoPotionsModPotions.STRONG_MINING_FATIGUE_POTION.get());
		PotionBrewing.addMix(MoPotionsModPotions.LONG_HASTE_POTION.get(), Items.REDSTONE, MoPotionsModPotions.LONG_MINING_FATIGUE_POTION.get());
		PotionBrewing.addMix(MoPotionsModPotions.MINING_FATIGUE_POTION.get(), Items.GLOWSTONE_DUST, MoPotionsModPotions.STRONG_MINING_FATIGUE_POTION.get());
		PotionBrewing.addMix(MoPotionsModPotions.MINING_FATIGUE_POTION.get(), Items.REDSTONE, MoPotionsModPotions.LONG_MINING_FATIGUE_POTION.get());

		//Nausea
		PotionBrewing.addMix(Potions.MUNDANE, Items.PUFFERFISH, MoPotionsModPotions.NAUSEA.get());
		PotionBrewing.addMix(MoPotionsModPotions.NAUSEA.get(), Items.REDSTONE, MoPotionsModPotions.LONG_NAUSEA.get());

		//Blindness
		PotionBrewing.addMix(Potions.THICK, Items.INK_SAC, MoPotionsModPotions.BLINDNESS.get());
		PotionBrewing.addMix(MoPotionsModPotions.BLINDNESS.get(), Items.GLOWSTONE_DUST, MoPotionsModPotions.STRONG_BLINDNESS.get());
		PotionBrewing.addMix(MoPotionsModPotions.BLINDNESS.get(), Items.REDSTONE, MoPotionsModPotions.LONG_BLINDNESS.get());

		//Decay
		PotionBrewing.addMix(Potions.POISON, Items.WITHER_ROSE, MoPotionsModPotions.DECAY.get());
		PotionBrewing.addMix(MoPotionsModPotions.DECAY.get(), Items.GLOWSTONE_DUST, MoPotionsModPotions.STRONG_DECAY.get());
		PotionBrewing.addMix(MoPotionsModPotions.DECAY.get(), Items.REDSTONE, MoPotionsModPotions.LONG_DECAY.get());

		//Resistance
		PotionBrewing.addMix(Potions.FIRE_RESISTANCE, Items.FERMENTED_SPIDER_EYE, MoPotionsModPotions.RESISTANCE.get());
		PotionBrewing.addMix(MoPotionsModPotions.RESISTANCE.get(), Items.GLOWSTONE_DUST, MoPotionsModPotions.STRONG_RESISTANCE.get());
		PotionBrewing.addMix(MoPotionsModPotions.RESISTANCE.get(), Items.REDSTONE, MoPotionsModPotions.LONG_RESISTANCE.get());

		//Glowing
		PotionBrewing.addMix(Potions.THICK, Items.GLOWSTONE_DUST, MoPotionsModPotions.GLOWING.get());
		PotionBrewing.addMix(MoPotionsModPotions.GLOWING.get(), Items.REDSTONE, MoPotionsModPotions.LONG_GLOWING.get());

		//Levitation
		PotionBrewing.addMix(Potions.SLOW_FALLING, Items.FERMENTED_SPIDER_EYE, MoPotionsModPotions.LEVITATION.get());
		PotionBrewing.addMix(MoPotionsModPotions.LEVITATION.get(), Items.GLOWSTONE_DUST, MoPotionsModPotions.STRONG_LEVITATION.get());
		PotionBrewing.addMix(MoPotionsModPotions.LEVITATION.get(), Items.REDSTONE, MoPotionsModPotions.LONG_LEVITATION.get());

		//Satisfaction (int. name "Satisfacation")
		PotionBrewing.addMix(Potions.MUNDANE, Items.GOLDEN_CARROT, MoPotionsModPotions.SATISFACATION_POTION.get());
		PotionBrewing.addMix(MoPotionsModPotions.SATISFACATION_POTION.get(), Items.REDSTONE, MoPotionsModPotions.LONG_SATISFACATION.get());

		//Hunger
		PotionBrewing.addMix(Potions.MUNDANE, Items.ROTTEN_FLESH, MoPotionsModPotions.HUNGER.get());
		PotionBrewing.addMix(MoPotionsModPotions.HUNGER.get(), Items.GLOWSTONE_DUST, MoPotionsModPotions.STRONG_HUNGER.get());
		PotionBrewing.addMix(MoPotionsModPotions.HUNGER.get(), Items.REDSTONE, MoPotionsModPotions.LONG_HUNGER.get());

		//Absorption
		PotionBrewing.addMix(Potions.HEALING, Items.GOLDEN_CARROT, MoPotionsModPotions.ABSORPTION.get());
		PotionBrewing.addMix(MoPotionsModPotions.ABSORPTION.get(), Items.GLOWSTONE_DUST, MoPotionsModPotions.STRONG_ABSORPTION.get());
		PotionBrewing.addMix(MoPotionsModPotions.ABSORPTION.get(), Items.REDSTONE, MoPotionsModPotions.LONG_ABSORPTION.get());

		//Luck
		PotionBrewing.addMix(Potions.LEAPING, Items.GLISTERING_MELON_SLICE, MoPotionsModPotions.LUCK.get());
		PotionBrewing.addMix(MoPotionsModPotions.LUCK.get(), Items.REDSTONE, MoPotionsModPotions.LONG_LUCK.get());

		//Bad Luck (minecraft:unluck)
		PotionBrewing.addMix(MoPotionsModPotions.LUCK.get(), Items.HEART_OF_THE_SEA, MoPotionsModPotions.CONDUIT_POWER.get());
		PotionBrewing.addMix(MoPotionsModPotions.CONDUIT_POWER.get(), Items.REDSTONE, MoPotionsModPotions.LONG_CONDUIT_POWER.get());

		//Conduit Power
		PotionBrewing.addMix(Potions.WATER_BREATHING, Items.FERMENTED_SPIDER_EYE, MoPotionsModPotions.LEVITATION.get());
		PotionBrewing.addMix(MoPotionsModPotions.LEVITATION.get(), Items.GLOWSTONE_DUST, MoPotionsModPotions.STRONG_LEVITATION.get());
		PotionBrewing.addMix(MoPotionsModPotions.LEVITATION.get(), Items.REDSTONE, MoPotionsModPotions.LONG_LEVITATION.get());
	}
}
