
package net.element.elementiummod.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.element.elementiummod.procedures.ElementlighningSwordLivingEntityIsHitWithToolProcedure;
import net.element.elementiummod.init.ElementiumModModTabs;
import net.element.elementiummod.init.ElementiumModModItems;

import java.util.List;

public class ElementiumlightningSwordItem extends SwordItem {
	public ElementiumlightningSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 2525;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 17.6f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 16;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ElementiumModModItems.LIGHTNING_ESSENCE.get()));
			}
		}, 3, -1.6999999999999997f, new Item.Properties().tab(ElementiumModModTabs.TAB_ELEMENTIUM_TAB).fireResistant());
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ElementlighningSwordLivingEntityIsHitWithToolProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, ar.getObject());
		return ar;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Strikes the target with lightning..."));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
