
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.element.elementiummod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.element.elementiummod.entity.ElementwaterBowProjectileEntity;
import net.element.elementiummod.entity.ElementvoidBowProjectileEntity;
import net.element.elementiummod.entity.ElementnatureBowProjectileEntity;
import net.element.elementiummod.entity.ElementlightningBowProjectileEntity;
import net.element.elementiummod.entity.ElementiceBowProjectileEntity;
import net.element.elementiummod.entity.ElementfireBowProjectileEntity;
import net.element.elementiummod.entity.ElementearthBowProjectileEntity;
import net.element.elementiummod.entity.ElementairBowProjectileEntity;
import net.element.elementiummod.ElementiummodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ElementiummodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ElementiummodMod.MODID);
	public static final RegistryObject<EntityType<ElementlightningBowProjectileEntity>> ELEMENTLIGHTNING_BOW_PROJECTILE = register("elementlightning_bow_projectile",
			EntityType.Builder.<ElementlightningBowProjectileEntity>of(ElementlightningBowProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ElementlightningBowProjectileEntity::new).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ElementfireBowProjectileEntity>> ELEMENTFIRE_BOW_PROJECTILE = register("elementfire_bow_projectile",
			EntityType.Builder.<ElementfireBowProjectileEntity>of(ElementfireBowProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ElementfireBowProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ElementearthBowProjectileEntity>> ELEMENTEARTH_BOW_PROJECTILE = register("elementearth_bow_projectile",
			EntityType.Builder.<ElementearthBowProjectileEntity>of(ElementearthBowProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ElementearthBowProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ElementiceBowProjectileEntity>> ELEMENTICE_BOW_PROJECTILE = register("elementice_bow_projectile",
			EntityType.Builder.<ElementiceBowProjectileEntity>of(ElementiceBowProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ElementiceBowProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ElementairBowProjectileEntity>> ELEMENTAIR_BOW_PROJECTILE = register("elementair_bow_projectile",
			EntityType.Builder.<ElementairBowProjectileEntity>of(ElementairBowProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ElementairBowProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ElementwaterBowProjectileEntity>> ELEMENTWATER_BOW_PROJECTILE = register("elementwater_bow_projectile",
			EntityType.Builder.<ElementwaterBowProjectileEntity>of(ElementwaterBowProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ElementwaterBowProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ElementnatureBowProjectileEntity>> ELEMENTNATURE_BOW_PROJECTILE = register("elementnature_bow_projectile",
			EntityType.Builder.<ElementnatureBowProjectileEntity>of(ElementnatureBowProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ElementnatureBowProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ElementvoidBowProjectileEntity>> ELEMENTVOID_BOW_PROJECTILE = register("elementvoid_bow_projectile",
			EntityType.Builder.<ElementvoidBowProjectileEntity>of(ElementvoidBowProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(ElementvoidBowProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}
}
