package net.mcreator.tnunlimited.entity.model;

public class FrostAntQueenModel extends AnimatedGeoModel<FrostAntQueenEntity> {
	@Override
	public ResourceLocation getAnimationResource(FrostAntQueenEntity entity) {
		return new ResourceLocation("tnunlimited", "animations/frost_ant_queen.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FrostAntQueenEntity entity) {
		return new ResourceLocation("tnunlimited", "geo/frost_ant_queen.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FrostAntQueenEntity entity) {
		return new ResourceLocation("tnunlimited", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(FrostAntQueenEntity animatable, int instanceId, AnimationEvent animationEvent) {
		super.setCustomAnimations(animatable, instanceId, animationEvent);
		IBone head = this.getAnimationProcessor().getBone("Head");
		EntityModelData extraData = (EntityModelData) animationEvent.getExtraDataOfType(EntityModelData.class).get(0);
		AnimationData manager = animatable.getFactory().getOrCreateAnimationData(instanceId);
		int unpausedMultiplier = !Minecraft.getInstance().isPaused() || manager.shouldPlayWhilePaused ? 1 : 0;
		head.setRotationX(head.getRotationX() + extraData.headPitch * ((float) Math.PI / 180F) * unpausedMultiplier);
		head.setRotationY(head.getRotationY() + extraData.netHeadYaw * ((float) Math.PI / 180F) * unpausedMultiplier);
	}
}