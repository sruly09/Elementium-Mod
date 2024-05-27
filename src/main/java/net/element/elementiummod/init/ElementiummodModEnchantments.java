
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.element.elementiummod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.element.elementiummod.enchantment.CATEnchantment;
import net.element.elementiummod.ElementiummodMod;

public class ElementiummodModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, ElementiummodMod.MODID);
	public static final RegistryObject<Enchantment> CAT = REGISTRY.register("cat", () -> new CATEnchantment());
}
