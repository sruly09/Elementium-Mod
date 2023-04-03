
package net.element.elementiummod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.element.elementiummod.init.ElementiumModModTabs;
import net.element.elementiummod.init.ElementiumModModItems;

public class ElementearthAxeItem extends AxeItem {
	public ElementearthAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 3355;
			}

			public float getSpeed() {
				return 9.5f;
			}

			public float getAttackDamageBonus() {
				return 47f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ElementiumModModItems.EARTH_ESSENCE.get()));
			}
		}, 1, -3.1f, new Item.Properties().tab(ElementiumModModTabs.TAB_ELEMENTIUM_TAB));
	}
}
