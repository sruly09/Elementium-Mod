
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.element.elementiummodpartone_theelements.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class Elementiummodpart1TheelementsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(Elementiummodpart1TheelementsModEntities.ELEMENTFIRE_BOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(Elementiummodpart1TheelementsModEntities.ELEMENTAIR_BOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(Elementiummodpart1TheelementsModEntities.ELEMENTWATER_BOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(Elementiummodpart1TheelementsModEntities.ELEMENTLIGHTNING_BOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(Elementiummodpart1TheelementsModEntities.ELEMENTICE_BOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(Elementiummodpart1TheelementsModEntities.ELEMENTEARTH_BOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(Elementiummodpart1TheelementsModEntities.ELEMENTNATURE_BOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(Elementiummodpart1TheelementsModEntities.ELEMENTVOID_BOW.get(), ThrownItemRenderer::new);
	}
}
