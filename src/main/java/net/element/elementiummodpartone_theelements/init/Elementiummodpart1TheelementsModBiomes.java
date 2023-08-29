
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.element.elementiummodpartone_theelements.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.element.elementiummodpartone_theelements.world.biome.ElementiumBiome;
import net.element.elementiummodpartone_theelements.Elementiummodpart1TheelementsMod;

public class Elementiummodpart1TheelementsModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, Elementiummodpart1TheelementsMod.MODID);
	public static final RegistryObject<Biome> ELEMENTIUM = REGISTRY.register("elementium", ElementiumBiome::createBiome);
}
