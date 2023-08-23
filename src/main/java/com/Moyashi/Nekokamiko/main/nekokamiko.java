package com.Moyashi.Nekokamiko.main;


import com.Moyashi.Nekokamiko.hud.onHUD;
import com.Moyashi.Nekokamiko.init.ModBlocks;
import com.Moyashi.Nekokamiko.init.ModEntities;
import com.Moyashi.Nekokamiko.init.ModItems;
import com.Moyashi.Nekokamiko.init.RenderRegistry;
import com.Moyashi.Nekokamiko.minecart.entity.ClientHandler;
import com.Moyashi.Nekokamiko.tooltip.addtip;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

import static com.Moyashi.Nekokamiko.config.ConfigFile.generateConfigFile;
import com.Moyashi.Nekokamiko.tooltip.Config;

/**
 * Author: MrCrayfish
 */
@Mod(Reference.MOD_ID)
public class nekokamiko {
    public nekokamiko()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.REGISTER.register(bus);
        ModItems.REGISTER.register(bus);
        ModEntities.REGISTER.register(bus);
        generateConfigFile();
        onHUD.register();
        addtip.register();
        Config.register();

        bus.addListener(this::onClientSetup);
        bus.addListener(this::onGatherData);
    }
    //
    private void setup(final FMLCommonSetupEvent event){


    }
    private void onClientSetup(FMLClientSetupEvent event)
    {
        ClientHandler.init();
    }

    private void onGatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();


    }
}
