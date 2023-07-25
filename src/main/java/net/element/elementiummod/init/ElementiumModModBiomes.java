
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.element.elementiummod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.element.elementiummod.world.biome.ElementiumBiome;
import net.element.elementiummod.ElementiumModMod;

public class ElementiumModModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, ElementiumModMod.MODID);
	public static final RegistryObject<Biome> ELEMENTIUM = REGISTRY.register("elementium", ElementiumBiome::createBiome);
}
