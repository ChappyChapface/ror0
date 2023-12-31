package net.mcreator.tnunlimited.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import net.mcreator.tnunlimited.init.TnunlimitedModBlocks;

public class BlueShroomThronsMobplayerCollidesWithPlantProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plr ? _plr.getAbilities().instabuild : false) == false) {
			if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("tnunlimited:purple_beetle"))) == false) {
				if (entity instanceof LivingEntity _entity)
					_entity.hurt(new DamageSource("Thought Blue Shroom Thorns was a scoccer ball and died").bypassArmor(), 3);
				world.destroyBlock(new BlockPos(x, y, z), false);
				world.levelEvent(2001, new BlockPos(x, y, z), Block.getId(TnunlimitedModBlocks.BLUE_SHROOM_THRONS.get().defaultBlockState()));
			}
		}
	}
}
