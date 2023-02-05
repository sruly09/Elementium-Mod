
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.element.elementiummod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.element.elementiummod.entity.ElementlightningBowEntity;
import net.element.elementiummod.entity.ElementiceBowEntity;
import net.element.elementiummod.entity.ElementfireBowEntity;
import net.element.elementiummod.entity.ElementearthBowEntity;
import net.element.elementiummod.ElementiumModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElementiumModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, ElementiumModMod.MODID);
	public static final RegistryObject<EntityType<ElementfireBowEntity>> ELEMENTFIRE_BOW = register("projectile_elementfire_bow",
			EntityType.Builder.<ElementfireBowEntity>of(ElementfireBowEntity::new, MobCategory.MISC).setCustomClientFactory(ElementfireBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ElementlightningBowEntity>> ELEMENTLIGHTNING_BOW = register("projectile_elementlightning_bow",
			EntityType.Builder.<ElementlightningBowEntity>of(ElementlightningBowEntity::new, MobCategory.MISC)
					.setCustomClientFactory(ElementlightningBowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ElementearthBowEntity>> ELEMENTEARTH_BOW = register("projectile_elementearth_bow",
			EntityType.Builder.<ElementearthBowEntity>of(ElementearthBowEntity::new, MobCategory.MISC)
					.setCustomClientFactory(ElementearthBowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ElementiceBowEntity>> ELEMENTICE_BOW = register("projectile_elementice_bow",
			EntityType.Builder.<ElementiceBowEntity>of(ElementiceBowEntity::new, MobCategory.MISC).setCustomClientFactory(ElementiceBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}
