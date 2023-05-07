
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.element.elementiummod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.element.elementiummod.world.features.ores.FireEssenceOreFeature;
import net.element.elementiummod.ElementiumModMod;

@Mod.EventBusSubscriber
public class ElementiumModModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ElementiumModMod.MODID);
	public static final RegistryObject<Feature<?>> FIRE_ESSENCE_ORE = REGISTRY.register("fire_essence_ore", FireEssenceOreFeature::feature);
}
