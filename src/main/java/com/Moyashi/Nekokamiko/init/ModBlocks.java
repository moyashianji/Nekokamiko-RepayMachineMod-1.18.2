package com.Moyashi.Nekokamiko.init;

import com.Moyashi.Nekokamiko.main.Reference;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.function.Function;
import java.util.function.Supplier;

public class ModBlocks
{
    public static final DeferredRegister<Block> REGISTER = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);


    private static <T extends Block> RegistryObject<T> register(String id, Supplier<T> block)
    {
        return register(id, block, block1 -> new BlockItem(block1, new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE)));
    }

    private static <T extends Block> RegistryObject<T> register(String id, Supplier<T> block, @Nullable Function<T, BlockItem> supplier)
    {
        RegistryObject<T> registryObject = REGISTER.register(id, block);
        if(supplier != null)
        {
            ModItems.REGISTER.register(id, () -> supplier.apply(registryObject.get()));
        }
        return registryObject;
    }
}
