package net.mcreator.tnunlimited.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.tnunlimited.entity.CoronerEntity;

public class CoronerSkinProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() <= 1 / 3 && !((entity.getPersistentData().getString("variant")).equals("pumpkin") || (entity.getPersistentData().getString("variant")).equals("normal"))) {
			entity.getPersistentData().putString("variant", "pumpkin");
			if (entity instanceof CoronerEntity animatable)
				animatable.setTexture("pumpkin_coroner");
		} else {
			entity.getPersistentData().putString("variant", "normal");
			if (entity instanceof CoronerEntity animatable)
				animatable.setTexture("coroner");
		}
	}
}
