
package net.mcreator.tnunlimited.entity;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class DivineCodexPEntity extends AbstractArrow implements ItemSupplier {
	public DivineCodexPEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(TnunlimitedModEntities.DIVINE_CODEX_P.get(), world);
	}

	public DivineCodexPEntity(EntityType<? extends DivineCodexPEntity> type, Level world) {
		super(type, world);
	}

	public DivineCodexPEntity(EntityType<? extends DivineCodexPEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public DivineCodexPEntity(EntityType<? extends DivineCodexPEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Blocks.AIR);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(TnunlimitedModItems.BAG_OF_TWO_HUNDRED_KIDNEYS.get());
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		DivineCodexPProjectileHitsBlockProcedure.execute();
	}

	@Override
	public void tick() {
		super.tick();
		DivineCodexFlyProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
		if (this.inGround)
			this.discard();
	}

	public static DivineCodexPEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		DivineCodexPEntity entityarrow = new DivineCodexPEntity(TnunlimitedModEntities.DIVINE_CODEX_P.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("")), SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static DivineCodexPEntity shoot(LivingEntity entity, LivingEntity target) {
		DivineCodexPEntity entityarrow = new DivineCodexPEntity(TnunlimitedModEntities.DIVINE_CODEX_P.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(5);
		entityarrow.setKnockback(5);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("")), SoundSource.PLAYERS, 1, 1f / (RandomSource.create().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
