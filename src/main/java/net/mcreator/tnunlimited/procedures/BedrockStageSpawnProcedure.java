package net.mcreator.tnunlimited.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.tnunlimited.network.TnunlimitedModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BedrockStageSpawnProcedure {
	@SubscribeEvent
	public static void onWorldLoad(net.minecraftforge.event.level.LevelEvent.Load event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		double y = 0;
		if (!TnunlimitedModVariables.MapVariables.get(world).stageSpawn) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("tnunlimited", "bedrock_stage"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(-8, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0) - 7, -8), new BlockPos(-8, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0) - 7, -8),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
			TnunlimitedModVariables.MapVariables.get(world).stageSpawn = true;
			TnunlimitedModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
