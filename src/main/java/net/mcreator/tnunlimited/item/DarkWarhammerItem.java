
package net.mcreator.tnunlimited.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class DarkWarhammerItem extends PickaxeItem {
	public DarkWarhammerItem() {
		super(new Tier() {
			public int getUses() {
				return 666;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 19f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TnunlimitedModItems.RITHIUM.get()));
			}
		}, 1, -3.6f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		DarkWarhammerRecoilProcedure.execute(sourceentity);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A72Charging Speed: \u00A771"));
		list.add(Component.literal("\u00A72Max Charges: \u00A773"));
		list.add(Component.literal("\u00A7cDebuff: \u00A77Has 4 Recoil Damage"));
		list.add(Component.literal("\u00A79Melee/Blunt"));
	}
}
