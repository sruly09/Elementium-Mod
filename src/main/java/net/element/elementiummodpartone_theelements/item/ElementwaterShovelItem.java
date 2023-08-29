
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

public class ElementwaterShovelItem extends ShovelItem {
	public ElementwaterShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 1566;
			}

			public float getSpeed() {
				return 14.5f;
			}

			public float getAttackDamageBonus() {
				return 6.2f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 21;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Elementiummodpart1TheelementsModItems.WATER_ESSENCE.get()));
			}
		}, 1, 1f, new Item.Properties().tab(Elementiummodpart1TheelementsModTabs.TAB_ELEMENTIUM_TAB));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("digs sand"));
		list.add(Component.literal("dirt"));
		list.add(Component.literal("snow"));
		list.add(Component.literal("gravel 10% faster... w.i.p."));
	}
}
