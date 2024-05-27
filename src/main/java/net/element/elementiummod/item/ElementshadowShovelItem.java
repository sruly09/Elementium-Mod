
package net.element.elementiummod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.element.elementiummod.init.ElementiummodModItems;

public class ElementshadowShovelItem extends ShovelItem {
	public ElementshadowShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 9110;
			}

			public float getSpeed() {
				return 17.5f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ElementiummodModItems.VOID_ESSENCE.get()));
			}
		}, 1, -2f, new Item.Properties().fireResistant());
	}
}
