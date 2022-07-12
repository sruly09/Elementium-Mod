
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.element.elementiummod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.element.elementiummod.ElementiumModMod;

public class ElementiumModModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, ElementiumModMod.MODID);
	public static final RegistryObject<Potion> POTIONOF_IMMORTALITY = REGISTRY.register("potionof_immortality",
			() -> new Potion(new MobEffectInstance(MobEffects.WATER_BREATHING, 4600, 52, false, true),
					new MobEffectInstance(MobEffects.SLOW_FALLING, 4600, 50, false, true),
					new MobEffectInstance(MobEffects.HEALTH_BOOST, 4600, 50, false, true),
					new MobEffectInstance(MobEffects.ABSORPTION, 4600, 5, false, true),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 4600, 0, false, true),
					new MobEffectInstance(MobEffects.REGENERATION, 4600, 75, false, true),
					new MobEffectInstance(MobEffects.SATURATION, 3600, 25, false, true)));
}
