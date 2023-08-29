
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.element.elementiummodpartone_theelements.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.element.elementiummodpartone_theelements.world.features.ores.FireEssenceOreFeature;
import net.element.elementiummodpartone_theelements.Elementiummodpart1TheelementsMod;

@Mod.EventBusSubscriber
public class Elementiummodpart1TheelementsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, Elementiummodpart1TheelementsMod.MODID);
	public static final RegistryObject<Feature<?>> FIRE_ESSENCE_ORE = REGISTRY.register("fire_essence_ore", FireEssenceOreFeature::feature);
}
