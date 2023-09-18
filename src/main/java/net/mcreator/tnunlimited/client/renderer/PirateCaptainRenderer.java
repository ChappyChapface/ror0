
package net.mcreator.tnunlimited.client.renderer;

public class PirateCaptainRenderer extends HumanoidMobRenderer<PirateCaptainEntity, HumanoidModel<PirateCaptainEntity>> {

	public PirateCaptainRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(PirateCaptainEntity entity) {
		return new ResourceLocation("tnunlimited:textures/entities/piratecaptain.png");
	}

}
