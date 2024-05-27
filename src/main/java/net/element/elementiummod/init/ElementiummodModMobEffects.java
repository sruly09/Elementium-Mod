
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.element.elementiummod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.element.elementiummod.potion.PoisonResistanceMobEffect;
import net.element.elementiummod.ElementiummodMod;

public class ElementiummodModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ElementiummodMod.MODID);
	public static final RegistryObject<MobEffect> POISON_RESISTANCE = REGISTRY.register("poison_resistance", () -> new PoisonResistanceMobEffect());
}
