package baguchan.earthmobsmod.client.render.layer;

import baguchan.earthmobsmod.EarthMobsMod;
import baguchan.earthmobsmod.api.IMuddyPig;
import baguchan.earthmobsmod.api.ISheared;
import baguchan.earthmobsmod.client.ModModelLayers;
import baguchan.earthmobsmod.client.model.MuddyPigModel;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.PigModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.FastColor;
import net.minecraft.world.entity.animal.Pig;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class MuddyPigMudLayer extends RenderLayer<Pig, PigModel<Pig>> {
	private static final ResourceLocation MUD_LOCATION = ResourceLocation.fromNamespaceAndPath(EarthMobsMod.MODID, "textures/entity/muddypig/muddy_pig.png");
	private static final ResourceLocation DRY_MUD_LOCATION = ResourceLocation.fromNamespaceAndPath(EarthMobsMod.MODID, "textures/entity/muddypig/dry_muddy_pig.png");

	private final MuddyPigModel<Pig> model;

	public MuddyPigMudLayer(RenderLayerParent<Pig, PigModel<Pig>> p_174533_, EntityModelSet p_174534_) {
		super(p_174533_);
		this.model = new MuddyPigModel<>(p_174534_.bakeLayer(ModModelLayers.MUDDY_PIG));
	}

	public void render(PoseStack p_117421_, MultiBufferSource p_117422_, int p_117423_, Pig pig, float p_117425_, float p_117426_, float p_117427_, float p_117428_, float p_117429_, float p_117430_) {
        if (pig instanceof IMuddyPig && pig instanceof ISheared) {
            if (((IMuddyPig) pig).isMuddy()) {
				if (pig.isInvisible()) {
					Minecraft minecraft = Minecraft.getInstance();
					boolean flag = minecraft.shouldEntityAppearGlowing(pig);
					if (flag) {
						this.getParentModel().copyPropertiesTo(this.model);
						this.model.prepareMobModel(pig, p_117425_, p_117426_, p_117427_);
						this.model.setupAnim(pig, p_117425_, p_117426_, p_117428_, p_117429_, p_117430_);
						VertexConsumer vertexconsumer = p_117422_.getBuffer(RenderType.outline(MUD_LOCATION));
						this.model.renderToBuffer(p_117421_, vertexconsumer, p_117423_, LivingEntityRenderer.getOverlayCoords(pig, 0.0F), FastColor.ARGB32.colorFromFloat(0.0F, 0.0F, 0.0F, 1.0F));
					}

				} else {
					coloredCutoutModelCopyLayerRender(this.getParentModel(), this.model, MUD_LOCATION, p_117421_, p_117422_, p_117423_, pig, p_117425_, p_117426_, p_117428_, p_117429_, p_117430_, p_117427_, FastColor.ARGB32.colorFromFloat(1, 1, 1, 1));
				}
			}/* else {
				if (pig.isInvisible()) {
					Minecraft minecraft = Minecraft.getInstance();
					boolean flag = minecraft.shouldEntityAppearGlowing(pig);
					if (flag) {
						this.getParentModel().copyPropertiesTo(this.model);
						this.model.prepareMobModel(pig, p_117425_, p_117426_, p_117427_);
						this.model.setupAnim(pig, p_117425_, p_117426_, p_117428_, p_117429_, p_117430_);
						VertexConsumer vertexconsumer = p_117422_.getBuffer(RenderType.outline(DRY_MUD_LOCATION));
						this.model.renderToBuffer(p_117421_, vertexconsumer, p_117423_, LivingEntityRenderer.getOverlayCoords(pig, 0.0F), 0.0F, 0.0F, 0.0F, 1.0F);
					}

				} else {
					float f;
					float f1;
					float f2;
					if (pig.hasCustomName() && "jeb_".equals(pig.getName().getContents())) {
						int i1 = 25;
						int i = pig.tickCount / 25 + pig.getId();
						int j = DyeColor.values().length;
						int k = i % j;
						int l = (i + 1) % j;
						float f3 = ((float) (pig.tickCount % 25) + p_117427_) / 25.0F;
						float[] afloat1 = Sheep.getColorArray(DyeColor.byId(k));
						float[] afloat2 = Sheep.getColorArray(DyeColor.byId(l));
						f = afloat1[0] * (1.0F - f3) + afloat2[0] * f3;
						f1 = afloat1[1] * (1.0F - f3) + afloat2[1] * f3;
						f2 = afloat1[2] * (1.0F - f3) + afloat2[2] * f3;
					} else {
						float[] afloat = Sheep.getColorArray(((ISheared) pig).getColor());
						f = afloat[0];
						f1 = afloat[1];
						f2 = afloat[2];
					}

					coloredCutoutModelCopyLayerRender(this.getParentModel(), this.model, DRY_MUD_LOCATION, p_117421_, p_117422_, p_117423_, pig, p_117425_, p_117426_, p_117428_, p_117429_, p_117430_, p_117427_, f, f1, f2);
				}
			}*/
		}
	}
}