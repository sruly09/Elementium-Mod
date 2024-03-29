
package net.element.elementiummodpartone_theelements.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.element.elementiummodpartone_theelements.procedures.ElementfirePickaxeBlockDestroyedWithToolProcedure;
import net.element.elementiummodpartone_theelements.init.Elementiummodpart1TheelementsModTabs;
import net.element.elementiummodpartone_theelements.init.Elementiummodpart1TheelementsModItems;

import java.util.List;

public class ElementfirePickaxeItem extends PickaxeItem {
	public ElementfirePickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2500;
			}

			public float getSpeed() {
				return 8.4f;
			}

			public float getAttackDamageBonus() {
				return 17.200000000000003f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Elementiummodpart1TheelementsModItems.FIRE_ESSENCE.get()));
			}
		}, 1, -2.2000000000000002f, new Item.Properties().tab(Elementiummodpart1TheelementsModTabs.TAB_ELEMENTIUM_TAB).fireResistant());
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		ElementfirePickaxeBlockDestroyedWithToolProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Autosmelts ores and blocks..."));
	}
}
