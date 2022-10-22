
package net.ldm.mopotions.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.ldm.mopotions.procedures.SatisfacationEffectTickHelperProcedure;

public class SatisfacationMobEffect extends MobEffect {
	public SatisfacationMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -5287392);
	}

	@Override
	public String getDescriptionId() {
		return "effect.mo_potions.satisfaction";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SatisfacationEffectTickHelperProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
