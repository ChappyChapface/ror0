package net.mcreator.tnunlimited.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.tnunlimited.init.TnunlimitedModMobEffects;

public class DrowsyEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof Player)) {
			entity.setDeltaMovement(
					new Vec3((entity.getDeltaMovement().x() * (1 - (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(TnunlimitedModMobEffects.DROWSY.get()) ? _livEnt.getEffect(TnunlimitedModMobEffects.DROWSY.get()).getAmplifier() : 0))),
							(entity.getDeltaMovement().y()),
							(entity.getDeltaMovement().z() * (1 - (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(TnunlimitedModMobEffects.DROWSY.get()) ? _livEnt.getEffect(TnunlimitedModMobEffects.DROWSY.get()).getAmplifier() : 0)))));
		}
	}
}
