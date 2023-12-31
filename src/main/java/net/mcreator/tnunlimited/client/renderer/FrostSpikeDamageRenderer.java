
package net.mcreator.tnunlimited.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.tnunlimited.procedures.FrostSpikeEnityBoundingBoxScaleProcedure;
import net.mcreator.tnunlimited.entity.model.FrostSpikeDamageModel;
import net.mcreator.tnunlimited.entity.FrostSpikeDamageEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class FrostSpikeDamageRenderer extends GeoEntityRenderer<FrostSpikeDamageEntity> {
	public FrostSpikeDamageRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new FrostSpikeDamageModel());
		this.shadowRadius = 0f;
	}

	@Override
	public RenderType getRenderType(FrostSpikeDamageEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float) FrostSpikeEnityBoundingBoxScaleProcedure.execute(entity);
		stack.scale(scale, scale, scale);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
