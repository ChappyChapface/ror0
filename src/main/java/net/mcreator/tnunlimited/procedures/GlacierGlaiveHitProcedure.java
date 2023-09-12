package net.mcreator.tnunlimited.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.tnunlimited.init.TnunlimitedModMobEffects;

public class GlacierGlaiveHitProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(TnunlimitedModMobEffects.FROSTBURN.get(), 80, 0));
	}
}
