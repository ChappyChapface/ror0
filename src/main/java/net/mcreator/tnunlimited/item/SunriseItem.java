
package net.mcreator.tnunlimited.item;

import net.minecraft.network.chat.Component;

public class SunriseItem extends RecordItem {

	public SunriseItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("tnunlimited:sunrise2")), new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE), 0);
	}

}
