
package net.element.elementiummod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.element.elementiummod.init.ElementiummodModItems;

public class ElementearthSwordItem extends SwordItem {
	public ElementearthSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 3355;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 41f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ElementiummodModItems.EARTH_ESSENCE.get()));
			}
		}, 3, -3.6f, new Item.Properties());
	}
}
