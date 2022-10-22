package net.ldm.mopotions.procedures;

import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import java.util.function.Supplier;
import java.util.Map;
import java.util.List;

public class PotionInfuseButtonProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		ItemStack potion = ItemStack.EMPTY;
		potion = (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
				&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY);
		List toPrint = PotionUtils.getMobEffects(potion);
		System.out.println(toPrint);
	}
}
