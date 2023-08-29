
package net.element.elementiummodpartone_theelements.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.element.elementiummodpartone_theelements.procedures.ElementvoidArmorLeggingsTickEventProcedure;
import net.element.elementiummodpartone_theelements.procedures.ElementvoidArmorHelmetTickEventProcedure;
import net.element.elementiummodpartone_theelements.procedures.ElementvoidArmorBootsTickEventProcedure;
import net.element.elementiummodpartone_theelements.procedures.ElementvoidArmorBodyTickEventProcedure;
import net.element.elementiummodpartone_theelements.init.Elementiummodpart1TheelementsModTabs;
import net.element.elementiummodpartone_theelements.init.Elementiummodpart1TheelementsModItems;

import java.util.List;

public abstract class ElementvoidArmorItem extends ArmorItem {
	public ElementvoidArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 47;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{9, 7, 8, 11}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 12;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.endermite.hurt"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Elementiummodpart1TheelementsModItems.VOID_ESSENCE.get()));
			}

			@Override
			public String getName() {
				return "elementvoid_armor";
			}

			@Override
			public float getToughness() {
				return 0.8f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.30000000000000004f;
			}
		}, slot, properties);
	}

	public static class Helmet extends ElementvoidArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(Elementiummodpart1TheelementsModTabs.TAB_ELEMENTIUM_TAB));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("you hear a eerie sound..where does it  come from."));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementiummodpart1_theelements:textures/models/armor/elementshadow__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			ElementvoidArmorHelmetTickEventProcedure.execute(entity);
		}
	}

	public static class Chestplate extends ElementvoidArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(Elementiummodpart1TheelementsModTabs.TAB_ELEMENTIUM_TAB));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("you hear a eerie sound..where does it  come from?"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementiummodpart1_theelements:textures/models/armor/elementshadow__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			ElementvoidArmorBodyTickEventProcedure.execute(entity);
		}
	}

	public static class Leggings extends ElementvoidArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(Elementiummodpart1TheelementsModTabs.TAB_ELEMENTIUM_TAB));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("you hear a eerie sound..where does it  come from?"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementiummodpart1_theelements:textures/models/armor/elementshadow__layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			ElementvoidArmorLeggingsTickEventProcedure.execute(entity);
		}
	}

	public static class Boots extends ElementvoidArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(Elementiummodpart1TheelementsModTabs.TAB_ELEMENTIUM_TAB));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("you hear a eerie sound..where does it  come from?"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementiummodpart1_theelements:textures/models/armor/elementshadow__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			ElementvoidArmorBootsTickEventProcedure.execute(entity);
		}
	}
}
