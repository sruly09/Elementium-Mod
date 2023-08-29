
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.element.elementiummodpartone_theelements.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.element.elementiummodpartone_theelements.potion.PoisonResistanceMobEffect;
import net.element.elementiummodpartone_theelements.Elementiummodpart1TheelementsMod;

public class Elementiummodpart1TheelementsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Elementiummodpart1TheelementsMod.MODID);
	public static final RegistryObject<MobEffect> POISON_RESISTANCE = REGISTRY.register("poison_resistance", () -> new PoisonResistanceMobEffect());
}
