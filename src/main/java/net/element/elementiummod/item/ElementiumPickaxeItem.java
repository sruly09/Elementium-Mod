
package net.element.elementiummod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class ElementiumPickaxeItem extends PickaxeItem {
	public ElementiumPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1750;
			}

			public float getSpeed() {
				return 8.4f;
			}

			public float getAttackDamageBonus() {
				return 9.6f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 1, -2.5f, new Item.Properties().fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("Just a normal pickaxe..."));
	}
}
