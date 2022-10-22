package net.ldm.mopotions.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class SatisfacationEffectTickHelperProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) == 20)) {
			if (entity instanceof Player _player)
				_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + 1));
		}
		if (!((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) == 20)) {
			if (entity instanceof Player _player)
				_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + 1));
		}
	}
}
