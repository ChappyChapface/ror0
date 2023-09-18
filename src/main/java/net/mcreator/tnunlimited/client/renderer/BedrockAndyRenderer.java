
package net.mcreator.tnunlimited.client.renderer;

public class BedrockAndyRenderer extends MobRenderer<BedrockAndyEntity, ModelBedrockAndy<BedrockAndyEntity>> {

	public BedrockAndyRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBedrockAndy(context.bakeLayer(ModelBedrockAndy.LAYER_LOCATION)), 0.6f);

	}

	@Override
	public ResourceLocation getTextureLocation(BedrockAndyEntity entity) {
		return new ResourceLocation("tnunlimited:textures/entities/bedrockandy.png");
	}

}
