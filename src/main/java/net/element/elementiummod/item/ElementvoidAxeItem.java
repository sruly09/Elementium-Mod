
package net.element.elementiummod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.element.elementiummod.init.ElementiummodModItems;

public class ElementvoidAxeItem extends AxeItem {
	public ElementvoidAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 9110;
			}

			public float getSpeed() {
				return 18f;
			}

			public float getAttackDamageBonus() {
				return 10f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 23;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ElementiummodModItems.VOID_ESSENCE.get()));
			}
		}, 1, -1.4f, new Item.Properties().fireResistant());
	}
}
