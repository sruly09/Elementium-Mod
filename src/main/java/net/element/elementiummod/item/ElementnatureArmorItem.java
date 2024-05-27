
package net.element.elementiummod.item;

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

import net.element.elementiummod.procedures.ElementnatureArmorLeggingsTickEventProcedure;
import net.element.elementiummod.procedures.ElementnatureArmorHelmetTickEventProcedure;
import net.element.elementiummod.procedures.ElementnatureArmorBootsTickEventProcedure;
import net.element.elementiummod.procedures.ElementnatureArmorBodyTickEventProcedure;
import net.element.elementiummod.init.ElementiummodModItems;

import com.google.common.collect.Iterables;

public abstract class ElementnatureArmorItem extends ArmorItem {
	public ElementnatureArmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 39;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{6, 4, 5, 6}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 18;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.azalea_leaves.break"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ElementiummodModItems.NATURE_ESSENCE.get()));
			}

			@Override
			public String getName() {
				return "elementnature_armor";
			}

			@Override
			public float getToughness() {
				return 3.2f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, type, properties);
	}

	public static class Helmet extends ElementnatureArmorItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementiummod:textures/models/armor/elementnature__layer_1.png";
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				ElementnatureArmorHelmetTickEventProcedure.execute(entity);
			}
		}
	}

	public static class Chestplate extends ElementnatureArmorItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementiummod:textures/models/armor/elementnature__layer_1.png";
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				ElementnatureArmorBodyTickEventProcedure.execute(entity);
			}
		}
	}

	public static class Leggings extends ElementnatureArmorItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementiummod:textures/models/armor/elementnature__layer_2.png";
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				ElementnatureArmorLeggingsTickEventProcedure.execute(entity);
			}
		}
	}

	public static class Boots extends ElementnatureArmorItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementiummod:textures/models/armor/elementnature__layer_1.png";
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				ElementnatureArmorBootsTickEventProcedure.execute(entity);
			}
		}
	}
}
