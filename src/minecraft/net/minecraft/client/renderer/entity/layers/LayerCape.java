package net.minecraft.client.renderer.entity.layers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import clientname.cosmetics.CosmeticController;
import clientname.http.gsonobjs.ObjectUserCosmetics;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EnumPlayerModelParts;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;

public class LayerCape implements LayerRenderer
{
	
	/*
	 * public boolean Monkies = true; public boolean Ace = false;
	 * 
	 * private static final ResourceLocation MONKIES = new
	 * ResourceLocation("clientname/123.png"); private static final ResourceLocation
	 * DEFAULT = new ResourceLocation("clientname/default.png"); private final
	 * RenderPlayer playerRenderer; private static final String __OBFID =
	 * "CL_00002425";
	 * 
	 * public LayerCape(RenderPlayer playerRendererIn) { this.playerRenderer =
	 * playerRendererIn; }
	 * 
	 * public void doRenderLayer(AbstractClientPlayer entitylivingbaseIn, float
	 * p_177141_2_, float p_177141_3_, float partialTicks, float p_177141_5_, float
	 * p_177141_6_, float p_177141_7_, float scale) { if
	 * (entitylivingbaseIn.hasPlayerInfo() && !entitylivingbaseIn.isInvisible() &&
	 * entitylivingbaseIn.isWearing(EnumPlayerModelParts.CAPE)) { boolean
	 * watermellon = false; // for testing new capes :)
	 * 
	 * if(CosmeticController.shouldRenderCape(entitylivingbaseIn)) { if(Monkies ==
	 * true) { this.playerRenderer.bindTexture(MONKIES); GlStateManager.color(1.0F,
	 * 1.0F, 1.0F, 1.0F); GlStateManager.pushMatrix();
	 * GlStateManager.translate(0.0F, 0.0F, 0.125F); double d0 =
	 * entitylivingbaseIn.prevChasingPosX + (entitylivingbaseIn.chasingPosX -
	 * entitylivingbaseIn.prevChasingPosX) * (double)partialTicks -
	 * (entitylivingbaseIn.prevPosX + (entitylivingbaseIn.posX -
	 * entitylivingbaseIn.prevPosX) * (double)partialTicks); double d1 =
	 * entitylivingbaseIn.prevChasingPosY + (entitylivingbaseIn.chasingPosY -
	 * entitylivingbaseIn.prevChasingPosY) * (double)partialTicks -
	 * (entitylivingbaseIn.prevPosY + (entitylivingbaseIn.posY -
	 * entitylivingbaseIn.prevPosY) * (double)partialTicks); double d2 =
	 * entitylivingbaseIn.prevChasingPosZ + (entitylivingbaseIn.chasingPosZ -
	 * entitylivingbaseIn.prevChasingPosZ) * (double)partialTicks -
	 * (entitylivingbaseIn.prevPosZ + (entitylivingbaseIn.posZ -
	 * entitylivingbaseIn.prevPosZ) * (double)partialTicks); float f =
	 * entitylivingbaseIn.prevRenderYawOffset + (entitylivingbaseIn.renderYawOffset
	 * - entitylivingbaseIn.prevRenderYawOffset) * partialTicks; double d3 =
	 * (double)MathHelper.sin(f * (float)Math.PI / 180.0F); double d4 =
	 * (double)(-MathHelper.cos(f * (float)Math.PI / 180.0F)); float f1 = (float)d1
	 * * 10.0F; f1 = MathHelper.clamp_float(f1, -6.0F, 32.0F); float f2 = (float)(d0
	 * * d3 + d2 * d4) * 100.0F; float f3 = (float)(d0 * d4 - d2 * d3) * 100.0F;
	 * 
	 * if (f2 < 0.0F) { f2 = 0.0F; }
	 * 
	 * if (f2 > 165.0F) { f2 = 165.0F; }
	 * 
	 * float f4 = entitylivingbaseIn.prevCameraYaw + (entitylivingbaseIn.cameraYaw -
	 * entitylivingbaseIn.prevCameraYaw) * partialTicks; f1 = f1 +
	 * MathHelper.sin((entitylivingbaseIn.prevDistanceWalkedModified +
	 * (entitylivingbaseIn.distanceWalkedModified -
	 * entitylivingbaseIn.prevDistanceWalkedModified) * partialTicks) * 6.0F) *
	 * 32.0F * f4;
	 * 
	 * if (entitylivingbaseIn.isSneaking()) { f1 += 25.0F;
	 * GlStateManager.translate(0.0F, 0.142F, -0.0178F); }
	 * 
	 * GlStateManager.rotate(6.0F + f2 / 2.0F + f1, 1.0F, 0.0F, 0.0F);
	 * GlStateManager.rotate(f3 / 2.0F, 0.0F, 0.0F, 1.0F); GlStateManager.rotate(-f3
	 * / 2.0F, 0.0F, 1.0F, 0.0F); GlStateManager.rotate(180.0F, 0.0F, 1.0F, 0.0F);
	 * this.playerRenderer.getMainModel().renderCape(0.0625F);
	 * GlStateManager.popMatrix(); } } else if(Ace == true){
	 * this.playerRenderer.bindTexture(DEFAULT); } else {
	 * 
	 * this.playerRenderer.bindTexture(DEFAULT); GlStateManager.color(1.0F, 1.0F,
	 * 1.0F, 1.0F); GlStateManager.pushMatrix(); GlStateManager.translate(0.0F,
	 * 0.0F, 0.125F); double d0 = entitylivingbaseIn.prevChasingPosX +
	 * (entitylivingbaseIn.chasingPosX - entitylivingbaseIn.prevChasingPosX) *
	 * (double)partialTicks - (entitylivingbaseIn.prevPosX +
	 * (entitylivingbaseIn.posX - entitylivingbaseIn.prevPosX) *
	 * (double)partialTicks); double d1 = entitylivingbaseIn.prevChasingPosY +
	 * (entitylivingbaseIn.chasingPosY - entitylivingbaseIn.prevChasingPosY) *
	 * (double)partialTicks - (entitylivingbaseIn.prevPosY +
	 * (entitylivingbaseIn.posY - entitylivingbaseIn.prevPosY) *
	 * (double)partialTicks); double d2 = entitylivingbaseIn.prevChasingPosZ +
	 * (entitylivingbaseIn.chasingPosZ - entitylivingbaseIn.prevChasingPosZ) *
	 * (double)partialTicks - (entitylivingbaseIn.prevPosZ +
	 * (entitylivingbaseIn.posZ - entitylivingbaseIn.prevPosZ) *
	 * (double)partialTicks); float f = entitylivingbaseIn.prevRenderYawOffset +
	 * (entitylivingbaseIn.renderYawOffset - entitylivingbaseIn.prevRenderYawOffset)
	 * * partialTicks; double d3 = (double)MathHelper.sin(f * (float)Math.PI /
	 * 180.0F); double d4 = (double)(-MathHelper.cos(f * (float)Math.PI / 180.0F));
	 * float f1 = (float)d1 * 10.0F; f1 = MathHelper.clamp_float(f1, -6.0F, 32.0F);
	 * float f2 = (float)(d0 * d3 + d2 * d4) * 100.0F; float f3 = (float)(d0 * d4 -
	 * d2 * d3) * 100.0F;
	 * 
	 * if (f2 < 0.0F) { f2 = 0.0F; }
	 * 
	 * if (f2 > 165.0F) { f2 = 165.0F; }
	 * 
	 * float f4 = entitylivingbaseIn.prevCameraYaw + (entitylivingbaseIn.cameraYaw -
	 * entitylivingbaseIn.prevCameraYaw) * partialTicks; f1 = f1 +
	 * MathHelper.sin((entitylivingbaseIn.prevDistanceWalkedModified +
	 * (entitylivingbaseIn.distanceWalkedModified -
	 * entitylivingbaseIn.prevDistanceWalkedModified) * partialTicks) * 6.0F) *
	 * 32.0F * f4;
	 * 
	 * if (entitylivingbaseIn.isSneaking()) { f1 += 25.0F;
	 * GlStateManager.translate(0.0F, 0.142F, -0.0178F); }
	 * 
	 * GlStateManager.rotate(6.0F + f2 / 2.0F + f1, 1.0F, 0.0F, 0.0F);
	 * GlStateManager.rotate(f3 / 2.0F, 0.0F, 0.0F, 1.0F); GlStateManager.rotate(-f3
	 * / 2.0F, 0.0F, 1.0F, 0.0F); GlStateManager.rotate(180.0F, 0.0F, 1.0F, 0.0F);
	 * this.playerRenderer.getMainModel().renderCape(0.0625F);
	 * GlStateManager.popMatrix(); } } }
	 */

    public boolean shouldCombineTextures()
    {
        return false;
    }

    public void doRenderLayer(EntityLivingBase entitylivingbaseIn, float p_177141_2_, float p_177141_3_, float partialTicks, float p_177141_5_, float p_177141_6_, float p_177141_7_, float scale)
    {
        this.doRenderLayer((AbstractClientPlayer)entitylivingbaseIn, p_177141_2_, p_177141_3_, partialTicks, p_177141_5_, p_177141_6_, p_177141_7_, scale);
    }
}