
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.element.elementiummod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.element.elementiummod.block.WaterEssenceOreBlock;
import net.element.elementiummod.block.TheBlazingLogBlock;
import net.element.elementiummod.block.TheBlazingLeavesBlock;
import net.element.elementiummod.block.TheBlazingGrassBlockBlock;
import net.element.elementiummod.block.ObsidianInfusedElemondiumBlock;
import net.element.elementiummod.block.FireEssenceOreBlock;
import net.element.elementiummod.block.ElementiumOreBlock;
import net.element.elementiummod.block.ElementiumDimensionPortalBlock;
import net.element.elementiummod.block.ElementiumBlockBlock;
import net.element.elementiummod.block.EarthEssenceOreBlock;
import net.element.elementiummod.block.BlazinggWoodBlock;
import net.element.elementiummod.block.BlazinggStairsBlock;
import net.element.elementiummod.block.BlazinggSlabBlock;
import net.element.elementiummod.block.BlazinggPressurePlateBlock;
import net.element.elementiummod.block.BlazinggPlanksBlock;
import net.element.elementiummod.block.BlazinggLogBlock;
import net.element.elementiummod.block.BlazinggLeavesBlock;
import net.element.elementiummod.block.BlazinggFenceGateBlock;
import net.element.elementiummod.block.BlazinggFenceBlock;
import net.element.elementiummod.block.BlazinggButtonBlock;
import net.element.elementiummod.block.BlazingWoodBlock;
import net.element.elementiummod.block.BlazingStairsBlock;
import net.element.elementiummod.block.BlazingSlabBlock;
import net.element.elementiummod.block.BlazingPressurePlateBlock;
import net.element.elementiummod.block.BlazingPlanksBlock;
import net.element.elementiummod.block.BlazingLogWoodBlock;
import net.element.elementiummod.block.BlazingLogStairsBlock;
import net.element.elementiummod.block.BlazingLogSlabBlock;
import net.element.elementiummod.block.BlazingLogPressurePlateBlock;
import net.element.elementiummod.block.BlazingLogPlanksBlock;
import net.element.elementiummod.block.BlazingLogLogBlock;
import net.element.elementiummod.block.BlazingLogFenceGateBlock;
import net.element.elementiummod.block.BlazingLogFenceBlock;
import net.element.elementiummod.block.BlazingLogButtonBlock;
import net.element.elementiummod.block.BlazingLogBlock;
import net.element.elementiummod.block.BlazingLeavesBlock;
import net.element.elementiummod.block.BlazingFenceGateBlock;
import net.element.elementiummod.block.BlazingFenceBlock;
import net.element.elementiummod.block.BlazingDirtBlock;
import net.element.elementiummod.block.BlazingButtonBlock;
import net.element.elementiummod.block.AirEssenceOreBlock;
import net.element.elementiummod.ElementiummodMod;

public class ElementiummodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ElementiummodMod.MODID);
	public static final RegistryObject<Block> ELEMENTIUM_BLOCK = REGISTRY.register("elementium_block", () -> new ElementiumBlockBlock());
	public static final RegistryObject<Block> ELEMENTIUM_ORE = REGISTRY.register("elementium_ore", () -> new ElementiumOreBlock());
	public static final RegistryObject<Block> FIRE_ESSENCE_ORE = REGISTRY.register("fire_essence_ore", () -> new FireEssenceOreBlock());
	public static final RegistryObject<Block> AIR_ESSENCE_ORE = REGISTRY.register("air_essence_ore", () -> new AirEssenceOreBlock());
	public static final RegistryObject<Block> WATER_ESSENCE_ORE = REGISTRY.register("water_essence_ore", () -> new WaterEssenceOreBlock());
	public static final RegistryObject<Block> ELEMONDIUM_INFUSED_OBSIDIAN = REGISTRY.register("elemondium_infused_obsidian", () -> new ObsidianInfusedElemondiumBlock());
	public static final RegistryObject<Block> ELEMENTIUM_DIMENSION_PORTAL = REGISTRY.register("elementium_dimension_portal", () -> new ElementiumDimensionPortalBlock());
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
	public static final RegistryObject<Block> BLAZING_FENCE = REGISTRY.register("blazing_fence", () -> new BlazingFenceBlock());
	public static final RegistryObject<Block> BLAZING_FENCE_GATE = REGISTRY.register("blazing_fence_gate", () -> new BlazingFenceGateBlock());
	public static final RegistryObject<Block> BLAZING_PRESSURE_PLATE = REGISTRY.register("blazing_pressure_plate", () -> new BlazingPressurePlateBlock());
	public static final RegistryObject<Block> BLAZING_BUTTON = REGISTRY.register("blazing_button", () -> new BlazingButtonBlock());
	public static final RegistryObject<Block> THE_BLAZING_LOG = REGISTRY.register("the_blazing_log", () -> new TheBlazingLogBlock());
	public static final RegistryObject<Block> THE_BLAZING_LEAVES = REGISTRY.register("the_blazing_leaves", () -> new TheBlazingLeavesBlock());
	public static final RegistryObject<Block> BLAZINGG_WOOD = REGISTRY.register("blazingg_wood", () -> new BlazinggWoodBlock());
	public static final RegistryObject<Block> BLAZINGG_LOG = REGISTRY.register("blazingg_log", () -> new BlazinggLogBlock());
	public static final RegistryObject<Block> BLAZINGG_PLANKS = REGISTRY.register("blazingg_planks", () -> new BlazinggPlanksBlock());
	public static final RegistryObject<Block> BLAZINGG_LEAVES = REGISTRY.register("blazingg_leaves", () -> new BlazinggLeavesBlock());
	public static final RegistryObject<Block> BLAZINGG_STAIRS = REGISTRY.register("blazingg_stairs", () -> new BlazinggStairsBlock());
	public static final RegistryObject<Block> BLAZINGG_SLAB = REGISTRY.register("blazingg_slab", () -> new BlazinggSlabBlock());
	public static final RegistryObject<Block> BLAZINGG_FENCE = REGISTRY.register("blazingg_fence", () -> new BlazinggFenceBlock());
	public static final RegistryObject<Block> BLAZINGG_FENCE_GATE = REGISTRY.register("blazingg_fence_gate", () -> new BlazinggFenceGateBlock());
	public static final RegistryObject<Block> BLAZINGG_PRESSURE_PLATE = REGISTRY.register("blazingg_pressure_plate", () -> new BlazinggPressurePlateBlock());
	public static final RegistryObject<Block> BLAZINGG_BUTTON = REGISTRY.register("blazingg_button", () -> new BlazinggButtonBlock());

	// Start of user code block custom blocks
	// End of user code block custom blocks
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
