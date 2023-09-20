package net.mcreator.tnunlimited.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.tnunlimited.init.TnunlimitedModItems;

public class NightVisionHelmetHelmetTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == TnunlimitedModItems.NIGHT_VISION_HELMET_HELMET.get()) == true) {
			if (((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == TnunlimitedModItems.NIGHT_VISION_HELMET_HELMET.get()) == false) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.NIGHT_VISION);
			}
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 999999, 0, true, false));
		}
	}
}
