
package net.ldm.mopotions.init;

import net.ldm.mopotions.MoPotionsMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MoPotionsModSounds {
	//public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MoPotionsMod.MODID);

	static {
		REGISTRY.register("potions.roll_it_back.activate", () ->
				new SoundEvent(new ResourceLocation("mo_potions", "potions.roll_it_back.activate")));
	}
}
