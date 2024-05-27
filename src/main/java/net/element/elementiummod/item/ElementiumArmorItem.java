
package net.element.elementiummod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.element.elementiummod.init.ElementiummodModItems;

public abstract class ElementiumArmorItem extends ArmorItem {
	public ElementiumArmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 40;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{5, 6, 5, 7}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 19;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.shoot"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ElementiummodModItems.ELEMONDIUM.get()));
			}

			@Override
			public String getName() {
				return "elementium_armor";
			}

			@Override
			public float getToughness() {
				return 3f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.1f;
			}
		}, type, properties);
	}

	public static class Helmet extends ElementiumArmorItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementiummod:textures/models/armor/elementium__layer_1.png";
		}
	}

	public static class Chestplate extends ElementiumArmorItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementiummod:textures/models/armor/elementium__layer_1.png";
		}
	}

	public static class Leggings extends ElementiumArmorItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementiummod:textures/models/armor/elementium__layer_2.png";
		}
	}

	public static class Boots extends ElementiumArmorItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "elementiummod:textures/models/armor/elementium__layer_1.png";
		}
	}
}
