
package net.element.elementiummod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.element.elementiummod.init.ElementiummodModItems;

import java.util.List;

public class ElementearthShovelItem extends ShovelItem {
	public ElementearthShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 3355;
			}

			public float getSpeed() {
				return 1.8f;
			}

			public float getAttackDamageBonus() {
				return 36.2f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ElementiummodModItems.EARTH_ESSENCE.get()));
			}
		}, 1, -3.3f, new Item.Properties());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("dig in a 3 by 3 area w.i.p."));
	}
}
