
package net.element.elementiummod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.network.chat.Component;

import net.element.elementiummod.init.ElementiummodModItems;

import java.util.List;

public class ElementiumAxeItem extends AxeItem {
	public ElementiumAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1750;
			}

			public float getSpeed() {
				return 8.3f;
			}

			public float getAttackDamageBonus() {
				return 17f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ElementiummodModItems.ELEMONDIUM.get()));
			}
		}, 1, -2.3f, new Item.Properties().fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("just a normal axe..."));
	}
}
