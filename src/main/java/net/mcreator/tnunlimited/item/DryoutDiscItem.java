
package net.mcreator.tnunlimited.item;

import net.minecraft.network.chat.Component;

public class DryoutDiscItem extends RecordItem {

	public DryoutDiscItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tnunlimited:dryout")), new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE), 100);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

}
