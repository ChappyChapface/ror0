
package net.mcreator.tnunlimited.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class HeartcoreItem extends Item {

	public HeartcoreItem() {
		super(new Item.Properties().tab(TnunlimitedModTabs.TAB_ACCESSORIES_TAB).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A7aWhen Equipped:"));
		list.add(Component.literal("\u00A77Will protect you from any lethal damage"));
		list.add(Component.literal("\u00A77It will also instantly heal you, and grant Absorption"));
		list.add(Component.literal("\u00A7cDebuff: \u00A77Only works in Hard mode"));
		list.add(Component.literal("\u00A7cCooldown: \u00A7730 Minutes"));
	}

}
