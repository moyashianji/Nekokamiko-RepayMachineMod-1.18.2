package com.Moyashi.Nekokamiko.tooltip;

import com.Moyashi.Nekokamiko.hud.onHUD;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.inventory.tooltip.TooltipComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.event.RenderTooltipEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.w3c.dom.Text;
import com.Moyashi.Nekokamiko.hashmap.HashMap;
import javax.swing.text.html.BlockView;
import java.util.List;

import static com.Moyashi.Nekokamiko.hashmap.HashMap.itemmmap;
import static com.Moyashi.Nekokamiko.hopper.core.OriginalHopperEntity.itemStack;
import static net.minecraftforge.client.gui.GuiUtils.drawTexturedModalRect;

public class addtip {

    @SubscribeEvent
    public void onItemTooltipEvent(ItemTooltipEvent event) {
        System.out.println("aaaawdawwwwwwwwwwwwwwwwwwwww");

        ItemStack itemStackk = event.getItemStack();
        List<Component> toolTip = event.getToolTip();
        System.out.println(toolTip);
        int i = itemmmap.get(itemStackk.getItem().getRegistryName().toString());

        if (i == -1) {
            toolTip.add(Component.nullToEmpty("    " + "Not for sale"));
            return;
        }

        if (i != -2) {
            toolTip.add(Component.nullToEmpty("    " + String.format("%1$ ,9d", i) + " MP"));
        }

    }
    public static void register() {
        MinecraftForge.EVENT_BUS.register(addtip.class);
    }

    int index = 0;

    //ツールチップ
    @SubscribeEvent
    public void RenderTooltipEvent(RenderTooltipEvent event) {

        index = -1;

        ItemStack itemm = event.getItemStack();
        List<String> list = (List<String>) event.getListenerList();

        if (itemm == null) return;

        int i = itemmmap.get(itemm.getItem().getRegistryName().toString());

        if (i == -2) return;

        if(list.size()==0) {
            index = -1;
            return;
        }
        for (int j = 0; j < list.size(); j++) {

            if (list.get(j).endsWith(" MP") || list.get(j).endsWith("Not for sale")) {
                index = j;
                //list.set(j, list.get(j).replaceAll("[MCE]", ""));
                break;
            }

        }

    }

    //ツールチップ

}

