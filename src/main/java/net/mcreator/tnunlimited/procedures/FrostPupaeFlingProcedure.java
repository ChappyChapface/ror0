package net.mcreator.tnunlimited.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class FrostPupaeFlingProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(new Vec3((Math.random() * 2 - 1), Math.random(), (Math.random() * 2 - 1)));
	}
}
