
package net.element.elementiummod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.element.elementiummod.init.ElementiumModModTabs;
import net.element.elementiummod.init.ElementiumModModItems;

import java.util.List;

public class ElementairAxeItem extends AxeItem {
	public ElementairAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1122;
			}

			public float getSpeed() {
				return 14.4f;
			}

			public float getAttackDamageBonus() {
				return 7.6f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ElementiumModModItems.AIR_ESSENCE.get()));
			}
		}, 1, -2.8f, new Item.Properties().tab(ElementiumModModTabs.TAB_ELEMENTIUM_TAB).fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("w.i.p."));
	}
}
