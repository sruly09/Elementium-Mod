
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.element.elementiummodpartone_theelements.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.element.elementiummodpartone_theelements.block.WaterEssenceOreBlock;
import net.element.elementiummodpartone_theelements.block.TheBlazingGrassBlockBlock;
import net.element.elementiummodpartone_theelements.block.ObsidianInfusedElemondiumBlock;
import net.element.elementiummodpartone_theelements.block.FireEssenceOreBlock;
import net.element.elementiummodpartone_theelements.block.ElementiumOreBlock;
import net.element.elementiummodpartone_theelements.block.ElementiumDimensionPortalBlock;
import net.element.elementiummodpartone_theelements.block.ElementiumBlockBlock;
import net.element.elementiummodpartone_theelements.block.EarthEssenceOreBlock;
import net.element.elementiummodpartone_theelements.block.AirEssenceOreBlock;
import net.element.elementiummodpartone_theelements.Elementiummodpart1TheelementsMod;

public class Elementiummodpart1TheelementsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, Elementiummodpart1TheelementsMod.MODID);
	public static final RegistryObject<Block> ELEMENTIUM_BLOCK = REGISTRY.register("elementium_block", () -> new ElementiumBlockBlock());
	public static final RegistryObject<Block> ELEMONDIUM_INFUSED_OBSIDIAN = REGISTRY.register("elemondium_infused_obsidian", () -> new ObsidianInfusedElemondiumBlock());
	public static final RegistryObject<Block> ELEMENTIUM_DIMENSION_PORTAL = REGISTRY.register("elementium_dimension_portal", () -> new ElementiumDimensionPortalBlock());
	public static final RegistryObject<Block> ELEMENTIUM_ORE = REGISTRY.register("elementium_ore", () -> new ElementiumOreBlock());
	public static final RegistryObject<Block> FIRE_ESSENCE_ORE = REGISTRY.register("fire_essence_ore", () -> new FireEssenceOreBlock());
	public static final RegistryObject<Block> AIR_ESSENCE_ORE = REGISTRY.register("air_essence_ore", () -> new AirEssenceOreBlock());
	public static final RegistryObject<Block> WATER_ESSENCE_ORE = REGISTRY.register("water_essence_ore", () -> new WaterEssenceOreBlock());
	public static final RegistryObject<Block> EARTH_ESSENCE_ORE = REGISTRY.register("earth_essence_ore", () -> new EarthEssenceOreBlock());
	public static final RegistryObject<Block> THE_BLAZING_GRASS_BLOCK = REGISTRY.register("the_blazing_grass_block", () -> new TheBlazingGrassBlockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			ElementiumBlockBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
			ElementiumBlockBlock.itemColorLoad(event);
		}
	}
}
