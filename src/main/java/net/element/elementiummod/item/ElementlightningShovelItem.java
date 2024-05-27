
package net.element.elementiummod.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

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

public class ElementlightningShovelItem extends ShovelItem {
	public ElementlightningShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 2525;
			}

			public float getSpeed() {
				return 9.9f;
			}

			public float getAttackDamageBonus() {
				return 10.3f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ElementiummodModItems.LIGHTNING_ESSENCE.get()));
			}
		}, 1, -2f, new Item.Properties().fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("W.I.P."));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
