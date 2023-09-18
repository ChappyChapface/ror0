
package net.mcreator.tnunlimited.client.renderer;

public class PirateDeadeyeRenderer extends HumanoidMobRenderer<PirateDeadeyeEntity, HumanoidModel<PirateDeadeyeEntity>> {

	public PirateDeadeyeRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(PirateDeadeyeEntity entity) {
		return new ResourceLocation("tnunlimited:textures/entities/pirate.png");
	}

}
