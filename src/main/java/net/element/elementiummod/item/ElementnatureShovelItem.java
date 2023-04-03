
package net.element.elementiummod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.element.elementiummod.init.ElementiumModModTabs;
import net.element.elementiummod.init.ElementiumModModItems;

public class ElementnatureShovelItem extends ShovelItem {
	public ElementnatureShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 1212;
			}

			public float getSpeed() {
				return 14f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ElementiumModModItems.NATURE_ESSENCE.get()));
			}
		}, 1, -0.5f, new Item.Properties().tab(ElementiumModModTabs.TAB_ELEMENTIUM_TAB));
	}
}
