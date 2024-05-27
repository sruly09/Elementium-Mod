
package net.element.elementiummod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

import net.element.elementiummod.entity.BlazingCowEntity;

public class BlazingCowRenderer extends MobRenderer<BlazingCowEntity, CowModel<BlazingCowEntity>> {
	public BlazingCowRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BlazingCowEntity entity) {
		return new ResourceLocation("elementiummod:textures/entities/theblazingcow.png");
	}
}
