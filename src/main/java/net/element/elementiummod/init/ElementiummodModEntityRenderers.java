
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.element.elementiummod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.element.elementiummod.client.renderer.BlazingCowRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ElementiummodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ElementiummodModEntities.ELEMENTLIGHTNING_BOW_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ElementiummodModEntities.ELEMENTFIRE_BOW_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ElementiummodModEntities.ELEMENTEARTH_BOW_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ElementiummodModEntities.ELEMENTICE_BOW_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ElementiummodModEntities.ELEMENTAIR_BOW_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ElementiummodModEntities.ELEMENTWATER_BOW_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ElementiummodModEntities.ELEMENTNATURE_BOW_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ElementiummodModEntities.ELEMENTVOID_BOW_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ElementiummodModEntities.BLAZING_COW.get(), BlazingCowRenderer::new);
	}
}
