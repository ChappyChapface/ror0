
package net.mcreator.tnunlimited.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.InteractionResult;

import net.mcreator.tnunlimited.procedures.StickyPurpleSlimeRightclickedOnBlockProcedure;

public class StickyPurpleSlimeItem extends Item {
	public StickyPurpleSlimeItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		StickyPurpleSlimeRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getClickedFace());
		return InteractionResult.SUCCESS;
	}
}
