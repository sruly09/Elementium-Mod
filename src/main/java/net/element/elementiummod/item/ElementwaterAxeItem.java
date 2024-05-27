
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

public class ElementwaterAxeItem extends AxeItem {
	public ElementwaterAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1566;
			}

			public float getSpeed() {
				return 16f;
			}

			public float getAttackDamageBonus() {
				return 17.1f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 21;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ElementiummodModItems.WATER_ESSENCE.get()));
			}
		}, 1, 1.1f, new Item.Properties());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("w.i.p."));
	}
}
