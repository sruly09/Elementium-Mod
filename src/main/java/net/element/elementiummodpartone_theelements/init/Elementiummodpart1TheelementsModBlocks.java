
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
import net.element.elementiummodpartone_theelements.block.TheBlazingLogBlock;
import net.element.elementiummodpartone_theelements.block.TheBlazingLeavesBlock;
import net.element.elementiummodpartone_theelements.block.TheBlazingGrassBlockBlock;
import net.element.elementiummodpartone_theelements.block.ObsidianInfusedElemondiumBlock;
import net.element.elementiummodpartone_theelements.block.FireEssenceOreBlock;
import net.element.elementiummodpartone_theelements.block.ElementiumOreBlock;
import net.element.elementiummodpartone_theelements.block.ElementiumDimensionPortalBlock;
import net.element.elementiummodpartone_theelements.block.ElementiumBlockBlock;
import net.element.elementiummodpartone_theelements.block.EarthEssenceOreBlock;
import net.element.elementiummodpartone_theelements.block.BlazingWoodBlock;
import net.element.elementiummodpartone_theelements.block.BlazingStairsBlock;
import net.element.elementiummodpartone_theelements.block.BlazingSlabBlock;
import net.element.elementiummodpartone_theelements.block.BlazingPressurePlateBlock;
import net.element.elementiummodpartone_theelements.block.BlazingPlanksBlock;
import net.element.elementiummodpartone_theelements.block.BlazingLogWoodBlock;
import net.element.elementiummodpartone_theelements.block.BlazingLogStairsBlock;
import net.element.elementiummodpartone_theelements.block.BlazingLogSlabBlock;
import net.element.elementiummodpartone_theelements.block.BlazingLogPressurePlateBlock;
import net.element.elementiummodpartone_theelements.block.BlazingLogPlanksBlock;
import net.element.elementiummodpartone_theelements.block.BlazingLogLogBlock;
import net.element.elementiummodpartone_theelements.block.BlazingLogFenceGateBlock;
import net.element.elementiummodpartone_theelements.block.BlazingLogFenceBlock;
import net.element.elementiummodpartone_theelements.block.BlazingLogButtonBlock;
import net.element.elementiummodpartone_theelements.block.BlazingLogBlock;
import net.element.elementiummodpartone_theelements.block.BlazingLeavesBlock;
import net.element.elementiummodpartone_theelements.block.BlazingFenceGateBlock;
import net.element.elementiummodpartone_theelements.block.BlazingFenceBlock;
import net.element.elementiummodpartone_theelements.block.BlazingDirtBlock;
import net.element.elementiummodpartone_theelements.block.BlazingButtonBlock;
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
	public static final RegistryObject<Block> BLAZING_DIRT = REGISTRY.register("blazing_dirt", () -> new BlazingDirtBlock());
	public static final RegistryObject<Block> BLAZING_LOG_WOOD = REGISTRY.register("blazing_log_wood", () -> new BlazingLogWoodBlock());
	public static final RegistryObject<Block> BLAZING_LOG_LOG = REGISTRY.register("blazing_log_log", () -> new BlazingLogLogBlock());
	public static final RegistryObject<Block> BLAZING_LOG_PLANKS = REGISTRY.register("blazing_log_planks", () -> new BlazingLogPlanksBlock());
	public static final RegistryObject<Block> BLAZING_LOG_STAIRS = REGISTRY.register("blazing_log_stairs", () -> new BlazingLogStairsBlock());
	public static final RegistryObject<Block> BLAZING_LOG_SLAB = REGISTRY.register("blazing_log_slab", () -> new BlazingLogSlabBlock());
	public static final RegistryObject<Block> BLAZING_LOG_FENCE = REGISTRY.register("blazing_log_fence", () -> new BlazingLogFenceBlock());
	public static final RegistryObject<Block> BLAZING_LOG_FENCE_GATE = REGISTRY.register("blazing_log_fence_gate", () -> new BlazingLogFenceGateBlock());
	public static final RegistryObject<Block> BLAZING_LOG_PRESSURE_PLATE = REGISTRY.register("blazing_log_pressure_plate", () -> new BlazingLogPressurePlateBlock());
	public static final RegistryObject<Block> BLAZING_LOG_BUTTON = REGISTRY.register("blazing_log_button", () -> new BlazingLogButtonBlock());
	public static final RegistryObject<Block> BLAZING_WOOD = REGISTRY.register("blazing_wood", () -> new BlazingWoodBlock());
	public static final RegistryObject<Block> BLAZING_LOG = REGISTRY.register("blazing_log", () -> new BlazingLogBlock());
	public static final RegistryObject<Block> BLAZING_PLANKS = REGISTRY.register("blazing_planks", () -> new BlazingPlanksBlock());
	public static final RegistryObject<Block> BLAZING_LEAVES = REGISTRY.register("blazing_leaves", () -> new BlazingLeavesBlock());
	public static final RegistryObject<Block> BLAZING_STAIRS = REGISTRY.register("blazing_stairs", () -> new BlazingStairsBlock());
	public static final RegistryObject<Block> BLAZING_SLAB = REGISTRY.register("blazing_slab", () -> new BlazingSlabBlock());
	public static final RegistryObject<Block> BLAZING_FENCE_GATE = REGISTRY.register("blazing_fence_gate", () -> new BlazingFenceGateBlock());
	public static final RegistryObject<Block> BLAZING_FENCE = REGISTRY.register("blazing_fence", () -> new BlazingFenceBlock());
	public static final RegistryObject<Block> BLAZING_PRESSURE_PLATE = REGISTRY.register("blazing_pressure_plate", () -> new BlazingPressurePlateBlock());
	public static final RegistryObject<Block> BLAZING_BUTTON = REGISTRY.register("blazing_button", () -> new BlazingButtonBlock());
	public static final RegistryObject<Block> THE_BLAZING_LOG = REGISTRY.register("the_blazing_log", () -> new TheBlazingLogBlock());
	public static final RegistryObject<Block> THE_BLAZING_LEAVES = REGISTRY.register("the_blazing_leaves", () -> new TheBlazingLeavesBlock());

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
