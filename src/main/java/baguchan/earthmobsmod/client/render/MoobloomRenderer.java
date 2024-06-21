package baguchan.earthmobsmod.client.render;

import baguchan.earthmobsmod.EarthMobsMod;
import baguchan.earthmobsmod.client.render.layer.CowPlantLayer;
import baguchan.earthmobsmod.entity.Moobloom;
import net.minecraft.client.model.CowModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class MoobloomRenderer<T extends Moobloom> extends MobRenderer<T, CowModel<T>> {
    private static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(EarthMobsMod.MODID, "textures/entity/moobloom/moobloom.png");

	public MoobloomRenderer(EntityRendererProvider.Context p_173952_) {
		super(p_173952_, new CowModel<>(p_173952_.bakeLayer(ModelLayers.COW)), 0.5F);
		this.addLayer(new CowPlantLayer<T>(this));
	}


	@Override
	public ResourceLocation getTextureLocation(T p_110775_1_) {
		return TEXTURE;
	}
}