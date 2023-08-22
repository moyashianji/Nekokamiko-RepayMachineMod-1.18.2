package com.Moyashi.Nekokamiko.render;

import com.Moyashi.Nekokamiko.minecart.entity.GoldenHopperMinecart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MinecartRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.TntMinecartRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.AbstractMinecart;
import net.minecraft.world.level.Level;
import net.minecraftforge.fml.common.Mod;



public class GoldenMinecartRenderer extends MinecartRenderer{
    public GoldenMinecartRenderer(EntityRendererProvider.Context render) {
        super(render, ModelLayers.MINECART);
    }
    @Override
    public ResourceLocation getTextureLocation(AbstractMinecart entity){
        return new ResourceLocation("nekokamiko:textures/entity/minecart_gold.png");
    }

}