package com.Moyashi.Nekokamiko.hud;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import static com.Moyashi.Nekokamiko.config.ConfigFile.filePath;
import static com.Moyashi.Nekokamiko.config.ConfigFile.readFirstLineAsInt;
import static com.Moyashi.Nekokamiko.hashmap.HashMap.vallue;

public class onHUD {

    @SubscribeEvent
    public static void onrRenderGameOverlay(RenderGameOverlayEvent event) {
        Minecraft mc = Minecraft.getInstance();
        Font fontsRenderer = mc.font;

        if (event.getType() == RenderGameOverlayEvent.ElementType.TEXT) {
            // 描画処理のパラメータを設定
            int posX = 10; // X座標
            int posY = 0; // Y座標

            int posX2 = 10;
            int posY2 = 10;
            int color = 0xFFFFFF; // テキストの色 (白色)
            int fontSize = 12; // フォントサイズ

            String line1 = "\u501F\u91D1\u984D"+":"+String.valueOf(readFirstLineAsInt(filePath))+"\u5186";
            String line2 = "\u58F2\u5374\u984D"+":"+String.valueOf(vallue)+"\u5186";

            PoseStack matrixsStack = event.getMatrixStack();
            PoseStack matrixsStack2 = event.getMatrixStack();

            matrixsStack.pushPose();
            matrixsStack2.pushPose();

            RenderSystem.enableBlend();

            matrixsStack.translate(posX, posY, 0);
            matrixsStack2.translate(posX2,posY2,0);
             // prizeMoneyの値を取得して描画
            fontsRenderer.draw(matrixsStack, line1, 10, 0, -1);
            fontsRenderer.draw(matrixsStack2, line2, 10, 10, -1);

            matrixsStack.popPose();
            matrixsStack2.popPose();

        }
    }
    public static void register() {
        MinecraftForge.EVENT_BUS.register(onHUD.class);
    }

}
