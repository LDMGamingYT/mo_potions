
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ldm.mopotions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.ldm.mopotions.MoPotionsMod;

public class MoPotionsModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, MoPotionsMod.MODID);
	public static final RegistryObject<Potion> HASTE_POTION = REGISTRY.register("haste_potion",
			() -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 0, false, true)));
	public static final RegistryObject<Potion> STRONG_HASTE_POTION = REGISTRY.register("strong_haste_potion",
			() -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 1800, 1, false, true)));
	public static final RegistryObject<Potion> LONG_HASTE_POTION = REGISTRY.register("long_haste_potion",
			() -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 9600, 0, false, true)));
	public static final RegistryObject<Potion> MINING_FATIGUE_POTION = REGISTRY.register("mining_fatigue_potion",
			() -> new Potion(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 1800, 0, false, true)));
	public static final RegistryObject<Potion> STRONG_MINING_FATIGUE_POTION = REGISTRY.register("strong_mining_fatigue_potion",
			() -> new Potion(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 900, 1, false, true)));
	public static final RegistryObject<Potion> LONG_MINING_FATIGUE_POTION = REGISTRY.register("long_mining_fatigue_potion",
			() -> new Potion(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 4800, 0, false, true)));
	public static final RegistryObject<Potion> NAUSEA = REGISTRY.register("nausea",
			() -> new Potion(new MobEffectInstance(MobEffects.CONFUSION, 1800, 0, false, true)));
	public static final RegistryObject<Potion> LONG_NAUSEA = REGISTRY.register("long_nausea",
			() -> new Potion(new MobEffectInstance(MobEffects.CONFUSION, 4800, 0, false, true)));
	public static final RegistryObject<Potion> BLINDNESS = REGISTRY.register("blindness",
			() -> new Potion(new MobEffectInstance(MobEffects.BLINDNESS, 1800, 0, false, true)));
	public static final RegistryObject<Potion> STRONG_BLINDNESS = REGISTRY.register("strong_blindness",
			() -> new Potion(new MobEffectInstance(MobEffects.BLINDNESS, 500, 2, false, true)));
	public static final RegistryObject<Potion> LONG_BLINDNESS = REGISTRY.register("long_blindness",
			() -> new Potion(new MobEffectInstance(MobEffects.BLINDNESS, 4800, 0, false, true)));
	public static final RegistryObject<Potion> DECAY = REGISTRY.register("decay",
			() -> new Potion(new MobEffectInstance(MobEffects.WITHER, 1800, 0, false, true)));
	public static final RegistryObject<Potion> STRONG_DECAY = REGISTRY.register("strong_decay",
			() -> new Potion(new MobEffectInstance(MobEffects.WITHER, 900, 1, false, true)));
	public static final RegistryObject<Potion> LONG_DECAY = REGISTRY.register("long_decay",
			() -> new Potion(new MobEffectInstance(MobEffects.WITHER, 4800, 0, false, true)));
	public static final RegistryObject<Potion> RESISTANCE = REGISTRY.register("resistance",
			() -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 0, false, true)));
	public static final RegistryObject<Potion> LONG_RESISTANCE = REGISTRY.register("long_resistance",
			() -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 9600, 0, false, true)));
	public static final RegistryObject<Potion> STRONG_RESISTANCE = REGISTRY.register("strong_resistance",
			() -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1800, 1, false, true)));
	public static final RegistryObject<Potion> GLOWING = REGISTRY.register("glowing",
			() -> new Potion(new MobEffectInstance(MobEffects.GLOWING, 3600, 0, false, true)));
	public static final RegistryObject<Potion> LONG_GLOWING = REGISTRY.register("long_glowing",
			() -> new Potion(new MobEffectInstance(MobEffects.GLOWING, 9600, 0, false, true)));
	public static final RegistryObject<Potion> LEVITATION = REGISTRY.register("levitation",
			() -> new Potion(new MobEffectInstance(MobEffects.LEVITATION, 600, 0, false, true)));
	public static final RegistryObject<Potion> STRONG_LEVITATION = REGISTRY.register("strong_levitation",
			() -> new Potion(new MobEffectInstance(MobEffects.LEVITATION, 400, 1, false, true)));
	public static final RegistryObject<Potion> LONG_LEVITATION = REGISTRY.register("long_levitation",
			() -> new Potion(new MobEffectInstance(MobEffects.LEVITATION, 900, 0, false, true)));
	public static final RegistryObject<Potion> SATISFACATION_POTION = REGISTRY.register("satisfacation_potion",
			() -> new Potion(new MobEffectInstance(MoPotionsModMobEffects.SATISFACTION.get(), 600, 0, false, true)));
	public static final RegistryObject<Potion> LONG_SATISFACATION = REGISTRY.register("long_satisfacation",
			() -> new Potion(new MobEffectInstance(MoPotionsModMobEffects.SATISFACTION.get(), 1000, 0, false, true)));
	public static final RegistryObject<Potion> HUNGER = REGISTRY.register("hunger",
			() -> new Potion(new MobEffectInstance(MobEffects.HUNGER, 1800, 0, false, true)));
	public static final RegistryObject<Potion> LONG_HUNGER = REGISTRY.register("long_hunger",
			() -> new Potion(new MobEffectInstance(MobEffects.HUNGER, 4800, 0, false, true)));
	public static final RegistryObject<Potion> STRONG_HUNGER = REGISTRY.register("strong_hunger",
			() -> new Potion(new MobEffectInstance(MobEffects.HUNGER, 900, 1, false, true)));
	public static final RegistryObject<Potion> ABSORPTION = REGISTRY.register("absorption",
			() -> new Potion(new MobEffectInstance(MobEffects.ABSORPTION, 3600, 0, false, true)));
	public static final RegistryObject<Potion> LONG_ABSORPTION = REGISTRY.register("long_absorption",
			() -> new Potion(new MobEffectInstance(MobEffects.ABSORPTION, 9600, 0, false, true)));
	public static final RegistryObject<Potion> STRONG_ABSORPTION = REGISTRY.register("strong_absorption",
			() -> new Potion(new MobEffectInstance(MobEffects.ABSORPTION, 1800, 1, false, true)));
	public static final RegistryObject<Potion> LUCK = REGISTRY.register("luck",
			() -> new Potion(new MobEffectInstance(MobEffects.LUCK, 6000, 0, false, true)));
	public static final RegistryObject<Potion> LONG_LUCK = REGISTRY.register("long_luck",
			() -> new Potion(new MobEffectInstance(MobEffects.LUCK, 9000, 0, false, true)));
	public static final RegistryObject<Potion> BAD_LUCK = REGISTRY.register("bad_luck",
			() -> new Potion(new MobEffectInstance(MobEffects.UNLUCK, 3000, 0, false, true)));
	public static final RegistryObject<Potion> LONG_BAD_LUCK = REGISTRY.register("long_bad_luck",
			() -> new Potion(new MobEffectInstance(MobEffects.UNLUCK, 4500, 0, false, true)));
	public static final RegistryObject<Potion> CONDUIT_POWER = REGISTRY.register("conduit_power",
			() -> new Potion(new MobEffectInstance(MobEffects.CONDUIT_POWER, 9600, 0, false, true)));
	public static final RegistryObject<Potion> LONG_CONDUIT_POWER = REGISTRY.register("long_conduit_power",
			() -> new Potion(new MobEffectInstance(MobEffects.CONDUIT_POWER, 14400, 0, false, true)));
}
