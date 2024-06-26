
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

public class ElementicePickaxeItem extends PickaxeItem {
	public ElementicePickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1111;
			}

			public float getSpeed() {
				return 9.4f;
			}

			public float getAttackDamageBonus() {
				return 16.4f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 19;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ElementiummodModItems.ICE_ESSENCE.get()));
			}
		}, 1, -2f, new Item.Properties());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("freezes the block you mined....w.i.p."));
	}
}
