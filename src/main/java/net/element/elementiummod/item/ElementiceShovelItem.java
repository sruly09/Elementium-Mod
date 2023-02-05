
package net.element.elementiummod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.element.elementiummod.init.ElementiumModModTabs;
import net.element.elementiummod.init.ElementiumModModItems;

import java.util.List;

public class ElementiceShovelItem extends ShovelItem {
	public ElementiceShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 1111;
			}

			public float getSpeed() {
				return 11f;
			}

			public float getAttackDamageBonus() {
				return 14.2f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 19;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ElementiumModModItems.ICE_ESSENCE.get()));
			}
		}, 1, -2f, new Item.Properties().tab(ElementiumModModTabs.TAB_ELEMENTIUM_TAB));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("freezes the block you mined....w.i.p."));
	}
}