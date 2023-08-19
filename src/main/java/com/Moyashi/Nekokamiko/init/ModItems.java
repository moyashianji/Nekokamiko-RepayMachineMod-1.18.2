package com.Moyashi.Nekokamiko.init;


import com.Moyashi.Nekokamiko.main.Reference;
import com.Moyashi.Nekokamiko.minecart.item.GoldenHopperMinecartItem;
import com.Moyashi.Nekokamiko.repayhopper.item.RepayHopperItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * Author: MrCrayfish
 */
public class ModItems {
    public static final DeferredRegister<Item> REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    public static final RegistryObject<Item> GOLDEN_HOPPER_MINECART = REGISTER.register("golden_hopper_minecart", () -> new GoldenHopperMinecartItem(new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION).stacksTo(1)));

    public static final RegistryObject<Item> REPAYER_HOPPER = REGISTER.register("repayer_hopper", () -> new GoldenHopperMinecartItem(new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION).stacksTo(1)));

}