
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.element.elementiummod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.element.elementiummod.item.WaterEssenceItem;
import net.element.elementiummod.item.LightningEssenceItem;
import net.element.elementiummod.item.IceEssenceItem;
import net.element.elementiummod.item.FireEssenceItem;
import net.element.elementiummod.item.ElementwaterSwordItem;
import net.element.elementiummod.item.ElementwaterShovelItem;
import net.element.elementiummod.item.ElementwaterPickaxeItem;
import net.element.elementiummod.item.ElementwaterPaxelItem;
import net.element.elementiummod.item.ElementwaterBowItem;
import net.element.elementiummod.item.ElementwaterAxeItem;
import net.element.elementiummod.item.ElementlightningShovelItem;
import net.element.elementiummod.item.ElementlightningPickaxeItem;
import net.element.elementiummod.item.ElementlightningPaxelItem;
import net.element.elementiummod.item.ElementlightningBowItem;
import net.element.elementiummod.item.ElementlightningAxeItem;
import net.element.elementiummod.item.ElementiumlightningSwordItem;
import net.element.elementiummod.item.ElementiumSwordItem;
import net.element.elementiummod.item.ElementiumShovelItem;
import net.element.elementiummod.item.ElementiumPickaxeItem;
import net.element.elementiummod.item.ElementiumDiamondItem;
import net.element.elementiummod.item.ElementiumAxeItem;
import net.element.elementiummod.item.ElementiceSwordItem;
import net.element.elementiummod.item.ElementiceShovelItem;
import net.element.elementiummod.item.ElementicePickaxeItem;
import net.element.elementiummod.item.ElementicePaxelItem;
import net.element.elementiummod.item.ElementiceBowItem;
import net.element.elementiummod.item.ElementiceAxeItem;
import net.element.elementiummod.item.ElementfireSwordItem;
import net.element.elementiummod.item.ElementfireShovelItem;
import net.element.elementiummod.item.ElementfirePickaxeItem;
import net.element.elementiummod.item.ElementfirePaxelItem;
import net.element.elementiummod.item.ElementfireBowItem;
import net.element.elementiummod.item.ElementfireAxeItem;
import net.element.elementiummod.item.ElementearthSwordItem;
import net.element.elementiummod.item.ElementearthShovelItem;
import net.element.elementiummod.item.ElementearthPickaxeItem;
import net.element.elementiummod.item.ElementearthPaxelItem;
import net.element.elementiummod.item.ElementearthBowItem;
import net.element.elementiummod.item.ElementearthAxeItem;
import net.element.elementiummod.item.ElementairSwordItem;
import net.element.elementiummod.item.ElementairShovelItem;
import net.element.elementiummod.item.ElementairPickaxeItem;
import net.element.elementiummod.item.ElementairPaxelItem;
import net.element.elementiummod.item.ElementairBowItem;
import net.element.elementiummod.item.ElementairAxeItem;
import net.element.elementiummod.item.EarthEssenceItem;
import net.element.elementiummod.item.AirEssenceItem;
import net.element.elementiummod.ElementiumModMod;

public class ElementiumModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ElementiumModMod.MODID);
	public static final RegistryObject<Item> ELEMENTIUM_DIAMOND = REGISTRY.register("elementium_diamond", () -> new ElementiumDiamondItem());
	public static final RegistryObject<Item> ELEMENTIUM_BLOCK = block(ElementiumModModBlocks.ELEMENTIUM_BLOCK,
			ElementiumModModTabs.TAB_ELEMENTIUM_TAB);
	public static final RegistryObject<Item> ELEMENTIUM_ORE = block(ElementiumModModBlocks.ELEMENTIUM_ORE, ElementiumModModTabs.TAB_ELEMENTIUM_TAB);
	public static final RegistryObject<Item> FIRE_ESSENCE = REGISTRY.register("fire_essence", () -> new FireEssenceItem());
	public static final RegistryObject<Item> AIR_ESSENCE = REGISTRY.register("air_essence", () -> new AirEssenceItem());
	public static final RegistryObject<Item> WATER_ESSENCE = REGISTRY.register("water_essence", () -> new WaterEssenceItem());
	public static final RegistryObject<Item> EARTH_ESSENCE = REGISTRY.register("earth_essence", () -> new EarthEssenceItem());
	public static final RegistryObject<Item> LIGHTNING_ESSENCE = REGISTRY.register("lightning_essence", () -> new LightningEssenceItem());
	public static final RegistryObject<Item> ICE_ESSENCE = REGISTRY.register("ice_essence", () -> new IceEssenceItem());
	public static final RegistryObject<Item> ELEMENTFIRE_SWORD = REGISTRY.register("elementfire_sword", () -> new ElementfireSwordItem());
	public static final RegistryObject<Item> ELEMENTFIRE_BOW = REGISTRY.register("elementfire_bow", () -> new ElementfireBowItem());
	public static final RegistryObject<Item> ELEMENTFIRE_PAXEL = REGISTRY.register("elementfire_paxel", () -> new ElementfirePaxelItem());
	public static final RegistryObject<Item> ELEMENTFIRE_PICKAXE = REGISTRY.register("elementfire_pickaxe", () -> new ElementfirePickaxeItem());
	public static final RegistryObject<Item> ELEMENTFIRE_AXE = REGISTRY.register("elementfire_axe", () -> new ElementfireAxeItem());
	public static final RegistryObject<Item> ELEMENTFIRE_SHOVEL = REGISTRY.register("elementfire_shovel", () -> new ElementfireShovelItem());
	public static final RegistryObject<Item> ELEMENTIUM_SWORD = REGISTRY.register("elementium_sword", () -> new ElementiumSwordItem());
	public static final RegistryObject<Item> ELEMENTIUM_PICKAXE = REGISTRY.register("elementium_pickaxe", () -> new ElementiumPickaxeItem());
	public static final RegistryObject<Item> ELEMENTIUM_AXE = REGISTRY.register("elementium_axe", () -> new ElementiumAxeItem());
	public static final RegistryObject<Item> ELEMENTIUM_SHOVEL = REGISTRY.register("elementium_shovel", () -> new ElementiumShovelItem());
	public static final RegistryObject<Item> ELEMENTIUMLIGHTNING_SWORD = REGISTRY.register("elementiumlightning_sword",
			() -> new ElementiumlightningSwordItem());
	public static final RegistryObject<Item> ELEMENTLIGHTNING_BOW = REGISTRY.register("elementlightning_bow", () -> new ElementlightningBowItem());
	public static final RegistryObject<Item> ELEMENTLIGHTNING_PAXEL = REGISTRY.register("elementlightning_paxel",
			() -> new ElementlightningPaxelItem());
	public static final RegistryObject<Item> ELEMENTLIGHTNING_PICKAXE = REGISTRY.register("elementlightning_pickaxe",
			() -> new ElementlightningPickaxeItem());
	public static final RegistryObject<Item> ELEMENTLIGHTNING_AXE = REGISTRY.register("elementlightning_axe", () -> new ElementlightningAxeItem());
	public static final RegistryObject<Item> ELEMENTLIGHTNING_SHOVEL = REGISTRY.register("elementlightning_shovel",
			() -> new ElementlightningShovelItem());
	public static final RegistryObject<Item> ELEMENTEARTH_SWORD = REGISTRY.register("elementearth_sword", () -> new ElementearthSwordItem());
	public static final RegistryObject<Item> ELEMENTEARTH_BOW = REGISTRY.register("elementearth_bow", () -> new ElementearthBowItem());
	public static final RegistryObject<Item> ELEMENTEARTH_PAXEL = REGISTRY.register("elementearth_paxel", () -> new ElementearthPaxelItem());
	public static final RegistryObject<Item> ELEMENTEARTH_PICKAXE = REGISTRY.register("elementearth_pickaxe", () -> new ElementearthPickaxeItem());
	public static final RegistryObject<Item> ELEMENTEARTH_AXE = REGISTRY.register("elementearth_axe", () -> new ElementearthAxeItem());
	public static final RegistryObject<Item> ELEMENTEARTH_SHOVEL = REGISTRY.register("elementearth_shovel", () -> new ElementearthShovelItem());
	public static final RegistryObject<Item> ELEMENTICE_SWORD = REGISTRY.register("elementice_sword", () -> new ElementiceSwordItem());
	public static final RegistryObject<Item> ELEMENTICE_BOW = REGISTRY.register("elementice_bow", () -> new ElementiceBowItem());
	public static final RegistryObject<Item> ELEMENTICE_PAXEL = REGISTRY.register("elementice_paxel", () -> new ElementicePaxelItem());
	public static final RegistryObject<Item> ELEMENTICE_PICKAXE = REGISTRY.register("elementice_pickaxe", () -> new ElementicePickaxeItem());
	public static final RegistryObject<Item> ELEMENTICE_AXE = REGISTRY.register("elementice_axe", () -> new ElementiceAxeItem());
	public static final RegistryObject<Item> ELEMENTICE_SHOVEL = REGISTRY.register("elementice_shovel", () -> new ElementiceShovelItem());
	public static final RegistryObject<Item> ELEMENTAIR_SWORD = REGISTRY.register("elementair_sword", () -> new ElementairSwordItem());
	public static final RegistryObject<Item> ELEMENTAIR_BOW = REGISTRY.register("elementair_bow", () -> new ElementairBowItem());
	public static final RegistryObject<Item> ELEMENTAIR_PAXEL = REGISTRY.register("elementair_paxel", () -> new ElementairPaxelItem());
	public static final RegistryObject<Item> ELEMENTAIR_PICKAXE = REGISTRY.register("elementair_pickaxe", () -> new ElementairPickaxeItem());
	public static final RegistryObject<Item> ELEMENTAIR_AXE = REGISTRY.register("elementair_axe", () -> new ElementairAxeItem());
	public static final RegistryObject<Item> ELEMENTAIR_SHOVEL = REGISTRY.register("elementair_shovel", () -> new ElementairShovelItem());
	public static final RegistryObject<Item> ELEMENTWATER_SWORD = REGISTRY.register("elementwater_sword", () -> new ElementwaterSwordItem());
	public static final RegistryObject<Item> ELEMENTWATER_BOW = REGISTRY.register("elementwater_bow", () -> new ElementwaterBowItem());
	public static final RegistryObject<Item> ELEMENTWATER_PAXEL = REGISTRY.register("elementwater_paxel", () -> new ElementwaterPaxelItem());
	public static final RegistryObject<Item> ELEMENTWATER_PICKAXE = REGISTRY.register("elementwater_pickaxe", () -> new ElementwaterPickaxeItem());
	public static final RegistryObject<Item> ELEMENTWATER_AXE = REGISTRY.register("elementwater_axe", () -> new ElementwaterAxeItem());
	public static final RegistryObject<Item> ELEMENTWATER_SHOVEL = REGISTRY.register("elementwater_shovel", () -> new ElementwaterShovelItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
