package com.Moyashi.Nekokamiko.minecart.entity;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.MinecartRenderer;
import net.minecraft.client.resources.sounds.MinecartSoundInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.vehicle.AbstractMinecart;
import com.Moyashi.Nekokamiko.init.ModEntities;
/**
 * Author: MrCrayfish
 */
public class ClientHandler
{
    public static void init()
    {
        //MenuScreenに新しいGUIを登録
        //新たなエンティティレンダラーを登録。cartのレンダーを作成
        EntityRenderers.register(ModEntities.GOLDEN_HOPPER_MINECART.get(), context ->
                new MinecartRenderer<>(context, ModelLayers.HOPPER_MINECART));
    }

    //カートがスポーンした時の処理
    public static void handleGoldenHopperMinecartSpawn(Entity entity)
    {
        //カートが存在すれば
        if(entity != null)
        {
            if(entity instanceof AbstractMinecart)
            {
                Minecraft.getInstance().getSoundManager().play(new MinecartSoundInstance((AbstractMinecart) entity));
            }
        }
    }
}
