package net.mcreator.tnunlimited.procedures;

import net.minecraft.world.entity.Entity;

public class HeatwaveSetFireProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(8);
	}
}
