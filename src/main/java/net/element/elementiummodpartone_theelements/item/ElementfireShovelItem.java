
package net.element.elementiummodpartone_theelements.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.element.elementiummodpartone_theelements.init.Elementiummodpart1TheelementsModTabs;
import net.element.elementiummodpartone_theelements.init.Elementiummodpart1TheelementsModItems;

import java.util.List;

public class ElementfireShovelItem extends ShovelItem {
	public ElementfireShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 2500;
			}

			public float getSpeed() {
				return 9.4f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Elementiummodpart1TheelementsModItems.FIRE_ESSENCE.get()));
			}
		}, 1, -2.2f, new Item.Properties().tab(Elementiummodpart1TheelementsModTabs.TAB_ELEMENTIUM_TAB).fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("W.I.P."));
	}
}
