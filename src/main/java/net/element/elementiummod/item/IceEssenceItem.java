
package net.element.elementiummod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.element.elementiummod.init.ElementiumModModTabs;

public class IceEssenceItem extends Item {
	public IceEssenceItem() {
		super(new Item.Properties().tab(ElementiumModModTabs.TAB_ELEMENTIUM_TAB).stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
