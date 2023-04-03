
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.element.elementiummod.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ElementiumModModTabs {
	public static CreativeModeTab TAB_ELEMENTIUM_TAB;

	public static void load() {
		TAB_ELEMENTIUM_TAB = new CreativeModeTab("tabelementium_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ElementiumModModItems.ELEMENTIUM_DIAMOND.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
