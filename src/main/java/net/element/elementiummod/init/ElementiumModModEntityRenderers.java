
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.element.elementiummod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ElementiumModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ElementiumModModEntities.ELEMENTFIRE_BOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ElementiumModModEntities.ELEMENTAIR_BOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ElementiumModModEntities.ELEMENTWATER_BOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ElementiumModModEntities.ELEMENTEARTH_BOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ElementiumModModEntities.ELEMENTVOID_BOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ElementiumModModEntities.ELEMENTLIGHTNING_BOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ElementiumModModEntities.ELEMENTICE_BOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ElementiumModModEntities.ELEMENTNATURE_BOW.get(), ThrownItemRenderer::new);
	}
}
