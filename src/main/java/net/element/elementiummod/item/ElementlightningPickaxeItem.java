
package net.element.elementiummod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.element.elementiummod.init.ElementiummodModItems;

import java.util.List;

public class ElementlightningPickaxeItem extends PickaxeItem {
	public ElementlightningPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2750;
			}

			public float getSpeed() {
				return 10.5f;
			}

			public float getAttackDamageBonus() {
				return 17.6f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ElementiummodModItems.LIGHTNING_ESSENCE.get()));
			}
		}, 1, -2.1f, new Item.Properties().fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("w.i.p."));
	}
}
