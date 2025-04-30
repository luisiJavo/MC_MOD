
package net.mcreator.modtest.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.modtest.entity.MobTest01Entity;

public class MobTest01Renderer extends HumanoidMobRenderer<MobTest01Entity, HumanoidModel<MobTest01Entity>> {
	public MobTest01Renderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<MobTest01Entity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(MobTest01Entity entity) {
		return ResourceLocation.parse("modtest:textures/entities/leerock.png");
	}
}
