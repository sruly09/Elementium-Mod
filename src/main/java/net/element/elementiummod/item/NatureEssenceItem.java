
package net.element.elementiummod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.element.elementiummod.init.ElementiumModModTabs;

import java.util.List;

public class NatureEssenceItem extends Item {
	public NatureEssenceItem() {
		super(new Item.Properties().tab(ElementiumModModTabs.TAB_ELEMENTIUM_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Warning: Flameable"));
	}
}
