
package net.element.elementiummod.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.element.elementiummod.init.ElementiumModModTabs;

public class ElementiumDiamondItem extends Item {
	public ElementiumDiamondItem() {
		super(new Item.Properties().tab(ElementiumModModTabs.TAB_ELEMENTIUM_TAB).stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return -1;
	}
}
