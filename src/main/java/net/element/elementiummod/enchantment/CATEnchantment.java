
package net.element.elementiummod.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.damagesource.DamageSource;

public class CATEnchantment extends Enchantment {
	public CATEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.COMMON, EnchantmentCategory.FISHING_ROD, slots);
	}

	@Override
	public int getMaxLevel() {
		return 25380;
	}

	@Override
	public int getDamageProtection(int level, DamageSource source) {
		return level * 1024;
	}

	@Override
	public boolean isDiscoverable() {
		return false;
	}

	@Override
	public boolean isTradeable() {
		return false;
	}
}
