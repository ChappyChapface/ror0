
package net.mcreator.tnunlimited.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.tnunlimited.procedures.StickyOnEffectActiveTickProcedure;

public class StickyMobEffect extends MobEffect {
	public StickyMobEffect() {
		super(MobEffectCategory.HARMFUL, -6749953);
	}

	@Override
	public String getDescriptionId() {
		return "effect.tnunlimited.sticky";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		StickyOnEffectActiveTickProcedure.execute(

		);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
