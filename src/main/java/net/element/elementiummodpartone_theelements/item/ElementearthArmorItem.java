
package net.element.elementiummodpartone_theelements.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.element.elementiummodpartone_theelements.procedures.ElementearthArmorLeggingsTickEventProcedure;
import net.element.elementiummodpartone_theelements.procedures.ElementearthArmorHelmetTickEventProcedure;
import net.element.elementiummodpartone_theelements.procedures.ElementearthArmorBootsTickEventProcedure;
import net.element.elementiummodpartone_theelements.procedures.ElementearthArmorBodyTickEventProcedure;
import net.element.elementiummodpartone_theelements.init.Elementiummodpart1TheelementsModTabs;
import net.element.elementiummodpartone_theelements.init.Elementiummodpart1TheelementsModItems;

public abstract class ElementearthArmorItem extends ArmorItem {
	public ElementearthArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 48;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{10, 10, 10, 10}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 18;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.moss.break"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Elementiummodpart1TheelementsModItems.EARTH_ESSENCE.get()));
			}

			@Override
			public String getName() {
				return "elementearth_armor";
			}

			@Override
			public float getToughness() {
				return 3.8000000000000003f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.4f;
			}
		}, slot, properties);
	}

	public static class Helmet extends ElementearthArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(Elementiummodpart1TheelementsModTabs.TAB_ELEMENTIUM_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementiummodpart1_theelements:textures/models/armor/elementearth__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			ElementearthArmorHelmetTickEventProcedure.execute(entity);
		}
	}

	public static class Chestplate extends ElementearthArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(Elementiummodpart1TheelementsModTabs.TAB_ELEMENTIUM_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementiummodpart1_theelements:textures/models/armor/elementearth__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			ElementearthArmorBodyTickEventProcedure.execute(entity);
		}
	}

	public static class Leggings extends ElementearthArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(Elementiummodpart1TheelementsModTabs.TAB_ELEMENTIUM_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementiummodpart1_theelements:textures/models/armor/elementearth__layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			ElementearthArmorLeggingsTickEventProcedure.execute(entity);
		}
	}

	public static class Boots extends ElementearthArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(Elementiummodpart1TheelementsModTabs.TAB_ELEMENTIUM_TAB));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementiummodpart1_theelements:textures/models/armor/elementearth__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			ElementearthArmorBootsTickEventProcedure.execute(entity);
		}
	}
}
