package com.Moyashi.Nekokamiko.hashmap;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.Moyashi.Nekokamiko.config.ConfigFile.*;
import com.Moyashi.Nekokamiko.hopper.core.OriginalHopperEntity;

import static com.Moyashi.Nekokamiko.config.ConfigFile.filePath;
import static com.Moyashi.Nekokamiko.config.ConfigFile.firstline;
import static com.Moyashi.Nekokamiko.hopper.core.OriginalHopperEntity.ItemCount;
import static com.Moyashi.Nekokamiko.hopper.core.OriginalHopperEntity.itemStack;

public class HashMap {
    public static final String CHAT_MESSAGE = "aaa";

   // public static long[] vallue;

    public static int i;
    public static long vallue;
    public static int resultValue;

    public static long arrayValue;
    public static long sum;
    public static long sumValue = firstline;
    public static long conclusionValue;
   /// public static long i;
    public static Player player;
    public static java.util.HashMap<String, Integer> itemmmap = new java.util.HashMap<>();

    public static void hashmap(){

        itemmmap.put(Items.SMOOTH_STONE_SLAB.getRegistryName().toString(), 2);
        itemmmap.put(Items.CUT_RED_SANDSTONE_SLAB.getRegistryName().toString(), 8);
        itemmmap.put(Blocks.RED_SANDSTONE_SLAB.getRegistryName().toString(), 8);
        itemmmap.put(Blocks.CUT_SANDSTONE_SLAB.getRegistryName().toString(), 8);
        itemmmap.put(Items.STONE_BRICK_SLAB.getRegistryName().toString(), 200);
        itemmmap.put(Items.NETHER_BRICK_SLAB.getRegistryName().toString(), 50);
        itemmmap.put(Items.QUARTZ_SLAB.getRegistryName().toString(), 1200);

        itemmmap.put(Items.GRANITE.getRegistryName().toString(), 10);
        itemmmap.put(Items.POLISHED_GRANITE.getRegistryName().toString(), 15);
        itemmmap.put(Items.DIORITE.getRegistryName().toString(), 10);
        itemmmap.put(Items.POLISHED_DIORITE.getRegistryName().toString(), 15);
        itemmmap.put(Items.ANDESITE.getRegistryName().toString(), 10);
        itemmmap.put(Items.POLISHED_ANDESITE.getRegistryName().toString(), 15);
        itemmmap.put(Items.DEEPSLATE.getRegistryName().toString(), 10);
        itemmmap.put(Items.COBBLED_DEEPSLATE.getRegistryName().toString(), 15);
        itemmmap.put(Items.POLISHED_DEEPSLATE.getRegistryName().toString(), 20);
        itemmmap.put(Items.COARSE_DIRT.getRegistryName().toString(), 5);
        itemmmap.put(Items.PODZOL.getRegistryName().toString(), 5);
        itemmmap.put(Items.ROOTED_DIRT.getRegistryName().toString(), 5);
        itemmmap.put(Items.RED_SAND.getRegistryName().toString(), 2);
        itemmmap.put(Items.DEEPSLATE_COAL_ORE.getRegistryName().toString(), 100);
        itemmmap.put(Items.DEEPSLATE_IRON_ORE.getRegistryName().toString(), 125);
        itemmmap.put(Items.DEEPSLATE_GOLD_ORE.getRegistryName().toString(), 2500);
        itemmmap.put(Items.DEEPSLATE_REDSTONE_ORE.getRegistryName().toString(), 75);
        itemmmap.put(Items.DEEPSLATE_EMERALD_ORE.getRegistryName().toString(), 2000);
        itemmmap.put(Items.DEEPSLATE_LAPIS_ORE.getRegistryName().toString(), 1500);
        itemmmap.put(Items.DEEPSLATE_DIAMOND_ORE.getRegistryName().toString(), 10000);
        itemmmap.put(Items.RAW_IRON_BLOCK.getRegistryName().toString(), 1000);
        itemmmap.put(Items.RAW_COPPER_BLOCK.getRegistryName().toString(), 500);
        itemmmap.put(Items.RAW_GOLD_BLOCK.getRegistryName().toString(), 20000);
        itemmmap.put(Items.CRIMSON_STEM.getRegistryName().toString(), 10);
        itemmmap.put(Items.WARPED_STEM.getRegistryName().toString(), 10);
        itemmmap.put(Items.FERN.getRegistryName().toString(), 2);
        itemmmap.put(Items.DEAD_BUSH.getRegistryName().toString(), 2);
        itemmmap.put(Items.SUGAR_CANE.getRegistryName().toString(), 10);
        itemmmap.put(Items.PETRIFIED_OAK_SLAB.getRegistryName().toString(), 0);
        itemmmap.put(Items.COBBLESTONE_SLAB.getRegistryName().toString(), 1);
        itemmmap.put(Items.RED_SANDSTONE.getRegistryName().toString(), 1);
        itemmmap.put(Items.CUT_RED_SANDSTONE_SLAB.getRegistryName().toString(), 1);
        itemmmap.put(Items.SMOOTH_QUARTZ.getRegistryName().toString(), 1400);
        itemmmap.put(Items.SMOOTH_RED_SANDSTONE.getRegistryName().toString(), 5);
        itemmmap.put(Items.SMOOTH_SANDSTONE.getRegistryName().toString(), 5);
        itemmmap.put(Items.COBBLESTONE_STAIRS.getRegistryName().toString(), 1);
        itemmmap.put(Items.SNOW_BLOCK.getRegistryName().toString(), 5);
        itemmmap.put(Items.CARVED_PUMPKIN.getRegistryName().toString(), 90);
        itemmmap.put(Items.JACK_O_LANTERN.getRegistryName().toString(), 120);
        itemmmap.put(Items.INFESTED_STONE.getRegistryName().toString(), 1);
        itemmmap.put(Items.INFESTED_COBBLESTONE.getRegistryName().toString(), 1);
        itemmmap.put(Items.INFESTED_STONE_BRICKS.getRegistryName().toString(), 1);
        itemmmap.put(Items.INFESTED_MOSSY_STONE_BRICKS.getRegistryName().toString(), 1);
        itemmmap.put(Items.INFESTED_CRACKED_STONE_BRICKS.getRegistryName().toString(), 1);
        itemmmap.put(Items.INFESTED_CHISELED_STONE_BRICKS.getRegistryName().toString(), 1);
        itemmmap.put(Items.INFESTED_DEEPSLATE.getRegistryName().toString(), 1);
        itemmmap.put(Items.STONE_BRICKS.getRegistryName().toString(), 10);
        itemmmap.put(Items.MOSSY_STONE_BRICKS.getRegistryName().toString(), 15);
        itemmmap.put(Items.CRACKED_STONE_BRICKS.getRegistryName().toString(), 5);
        itemmmap.put(Items.DEEPSLATE_BRICKS.getRegistryName().toString(), 25);
        itemmmap.put(Items.CRACKED_DEEPSLATE_BRICKS.getRegistryName().toString(), 20);
        itemmmap.put(Items.DEEPSLATE_TILES.getRegistryName().toString(), 30);
        itemmmap.put(Items.CRACKED_DEEPSLATE_TILES.getRegistryName().toString(), 5);
        itemmmap.put(Items.CHISELED_DEEPSLATE.getRegistryName().toString(), 5);
        itemmmap.put(Items.MUSHROOM_STEM.getRegistryName().toString(), 2);
        itemmmap.put(Items.GLOW_LICHEN.getRegistryName().toString(), 2);
        itemmmap.put(Items.COBBLESTONE_WALL.getRegistryName().toString(), 5);
        itemmmap.put(Items.MOSSY_COBBLESTONE_WALL.getRegistryName().toString(), 5);
        itemmmap.put(Items.BRICK_WALL.getRegistryName().toString(), 5);
        itemmmap.put(Items.RED_SANDSTONE_WALL.getRegistryName().toString(), 5);
        itemmmap.put(Items.COBBLED_DEEPSLATE_WALL.getRegistryName().toString(), 5);
        itemmmap.put(Items.POLISHED_DEEPSLATE_WALL.getRegistryName().toString(), 5);
        itemmmap.put(Items.DEEPSLATE_BRICK_WALL.getRegistryName().toString(), 5);
        itemmmap.put(Items.DEEPSLATE_TILE_WALL.getRegistryName().toString(), 5);
        itemmmap.put(Items.CHISELED_QUARTZ_BLOCK.getRegistryName().toString(), 1280);
        itemmmap.put(Items.QUARTZ_PILLAR.getRegistryName().toString(), 1280);
        itemmmap.put(Items.QUARTZ_BLOCK.getRegistryName().toString(), 1280);
        itemmmap.put(Items.DIRT_PATH.getRegistryName().toString(), 12);
        itemmmap.put(Items.TALL_GRASS.getRegistryName().toString(), 2);
        itemmmap.put(Items.LARGE_FERN.getRegistryName().toString(), 2);

        itemmmap.put(Items.PRISMARINE_BRICKS.getRegistryName().toString(), 50);
        itemmmap.put(Items.DARK_PRISMARINE.getRegistryName().toString(), 50);
        itemmmap.put(Items.CHISELED_RED_SANDSTONE.getRegistryName().toString(), 20);
        itemmmap.put(Items.CUT_RED_SANDSTONE.getRegistryName().toString(), 25);
        itemmmap.put(Items.WARPED_WART_BLOCK.getRegistryName().toString(), 300);
        itemmmap.put(Items.COBBLED_DEEPSLATE_STAIRS.getRegistryName().toString(), 5);
        itemmmap.put(Items.POLISHED_DEEPSLATE_STAIRS.getRegistryName().toString(), 5);
        itemmmap.put(Items.DEEPSLATE_BRICK_STAIRS.getRegistryName().toString(), 5);
        itemmmap.put(Items.DEEPSLATE_TILE_STAIRS.getRegistryName().toString(), 5);
        itemmmap.put(Items.COBBLED_DEEPSLATE_SLAB.getRegistryName().toString(), 5);
        itemmmap.put(Items.POLISHED_DEEPSLATE_SLAB.getRegistryName().toString(), 5);
        itemmmap.put(Items.DEEPSLATE_BRICK_SLAB.getRegistryName().toString(), 5);
        itemmmap.put(Items.DEEPSLATE_TILE_SLAB.getRegistryName().toString(), 5);
        itemmmap.put(Items.SLIME_BLOCK.getRegistryName().toString(), 100);
        itemmmap.put(Items.OBSERVER.getRegistryName().toString(), 500);
        itemmmap.put(Items.WARPED_FUNGUS_ON_A_STICK.getRegistryName().toString(), 100);
        itemmmap.put(Items.LAPIS_LAZULI.getRegistryName().toString(), 220);
        itemmmap.put(Items.RAW_IRON.getRegistryName().toString(), 100);
        itemmmap.put(Items.RAW_COPPER.getRegistryName().toString(), 50);
        itemmmap.put(Items.RAW_GOLD.getRegistryName().toString(), 2000);
        itemmmap.put(Items.CRIMSON_SIGN.getRegistryName().toString(), 5);
        itemmmap.put(Items.WARPED_SIGN.getRegistryName().toString(), 5);
        itemmmap.put(Items.POWDER_SNOW_BUCKET.getRegistryName().toString(), 150);
        itemmmap.put(Items.PUFFERFISH_BUCKET.getRegistryName().toString(), 350);
        itemmmap.put(Items.SALMON_BUCKET.getRegistryName().toString(), 450);
        itemmmap.put(Items.COD_BUCKET.getRegistryName().toString(), 210);
        itemmmap.put(Items.TROPICAL_FISH_BUCKET.getRegistryName().toString(), 500);
        itemmmap.put(Items.AXOLOTL_BUCKET.getRegistryName().toString(), 3000);
        itemmmap.put(Items.INK_SAC.getRegistryName().toString(), 30);
        itemmmap.put(Items.GLOW_INK_SAC.getRegistryName().toString(), 60);
        itemmmap.put(Items.COCOA_BEANS.getRegistryName().toString(), 40);
        itemmmap.put(Items.BONE_MEAL.getRegistryName().toString(), 10);
        itemmmap.put(Items.MELON_SLICE.getRegistryName().toString(), 8);
        itemmmap.put(Items.GLOW_ITEM_FRAME.getRegistryName().toString(), 100);
        itemmmap.put(Items.LEATHER_HORSE_ARMOR.getRegistryName().toString(), 400);
        itemmmap.put(Items.BEETROOT_SEEDS.getRegistryName().toString(), 2);
        itemmmap.put(Items.SPLASH_POTION.getRegistryName().toString(), 10);
        itemmmap.put(Items.LINGERING_POTION.getRegistryName().toString(), 10);
        itemmmap.put(Items.TOTEM_OF_UNDYING.getRegistryName().toString(), 100000);
        itemmmap.put(Items.IRON_NUGGET.getRegistryName().toString(), 55);
        itemmmap.put(Items.FLOWER_BANNER_PATTERN.getRegistryName().toString(), 40);
        itemmmap.put(Items.CREEPER_BANNER_PATTERN.getRegistryName().toString(), 40);
        itemmmap.put(Items.SKULL_BANNER_PATTERN.getRegistryName().toString(), 40);
        itemmmap.put(Items.MOJANG_BANNER_PATTERN.getRegistryName().toString(), 40);
        itemmmap.put(Items.GLOBE_BANNER_PATTERN.getRegistryName().toString(), 40);
        itemmmap.put(Items.PIGLIN_BANNER_PATTERN.getRegistryName().toString(), 40);
        itemmmap.put(Items.BLACKSTONE_SLAB.getRegistryName().toString(), 5);
        itemmmap.put(Items.POLISHED_BLACKSTONE_SLAB.getRegistryName().toString(), 5);
        itemmmap.put(Items.POLISHED_BLACKSTONE_BRICK_SLAB.getRegistryName().toString(), 5);

        itemmmap.put(Items.TRIDENT.getRegistryName().toString(), 30000);
        itemmmap.put(Items.CROSSBOW.getRegistryName().toString(), 1000);
        itemmmap.put(Items.SPECTRAL_ARROW.getRegistryName().toString(), 500);
        itemmmap.put(Items.TIPPED_ARROW.getRegistryName().toString(), 300);
        itemmmap.put(Items.NETHERITE_SWORD.getRegistryName().toString(), 80000);
        itemmmap.put(Items.NETHERITE_AXE.getRegistryName().toString(), 120000);
        itemmmap.put(Items.NETHERITE_PICKAXE.getRegistryName().toString(), 120000);
        itemmmap.put(Items.NETHERITE_SHOVEL.getRegistryName().toString(), 40000);
        itemmmap.put(Items.NETHERITE_HOE.getRegistryName().toString(), 80000);

        itemmmap.put(Items.SPYGLASS.getRegistryName().toString(), 5000);
        itemmmap.put(Items.NETHERITE_HELMET.getRegistryName().toString(), 200000);
        itemmmap.put(Items.NETHERITE_CHESTPLATE.getRegistryName().toString(), 320000);
        itemmmap.put(Items.NETHERITE_LEGGINGS.getRegistryName().toString(), 280000);
        itemmmap.put(Items.NETHERITE_BOOTS.getRegistryName().toString(), 160000);

        itemmmap.put(Items.TURTLE_HELMET.getRegistryName().toString(), 6000);
        itemmmap.put(Items.SCUTE.getRegistryName().toString(), 3000);
        itemmmap.put(Items.NAUTILUS_SHELL.getRegistryName().toString(), 5000);
        itemmmap.put(Items.PHANTOM_MEMBRANE.getRegistryName().toString(), 500);

        //建築 Block
        itemmmap.put(Blocks.STONE.getRegistryName().toString(), 1);
        itemmmap.put(Items.WET_SPONGE.getRegistryName().toString(), 30);

        itemmmap.put(Blocks.GRASS_BLOCK.getRegistryName().toString(), 10);
        itemmmap.put(Items.GRASS.getRegistryName().toString(), 1);

        itemmmap.put(Blocks.DIRT.getRegistryName().toString(), 5);
        itemmmap.put(Blocks.COBBLESTONE.getRegistryName().toString(), 0);

        itemmmap.put(Blocks.BEDROCK.getRegistryName().toString(), -1);
        itemmmap.put(Blocks.SAND.getRegistryName().toString(), 1);
        itemmmap.put(Blocks.GRAVEL.getRegistryName().toString(), 5);
        itemmmap.put(Blocks.GOLD_ORE.getRegistryName().toString(), 2000);
        itemmmap.put(Blocks.IRON_ORE.getRegistryName().toString(), 100);
        itemmmap.put(Blocks.COAL_ORE.getRegistryName().toString(), 70);

        itemmmap.put(Blocks.SPONGE.getRegistryName().toString(), 50);
        itemmmap.put(Blocks.GLASS.getRegistryName().toString(), 30);
        itemmmap.put(Blocks.LAPIS_ORE.getRegistryName().toString(), 1200);
        itemmmap.put(Blocks.LAPIS_BLOCK.getRegistryName().toString(), 2000);
        itemmmap.put(Blocks.SANDSTONE.getRegistryName().toString(), 8);

        itemmmap.put(Blocks.GOLD_BLOCK.getRegistryName().toString(), 36000);
        itemmmap.put(Blocks.IRON_BLOCK.getRegistryName().toString(), 4500);

        itemmmap.put(Items.CHISELED_SANDSTONE.getRegistryName().toString(), 16);
        itemmmap.put(Items.CUT_SANDSTONE.getRegistryName().toString(), 16);
        itemmmap.put(Items.POWERED_RAIL.getRegistryName().toString(), 4100);

        // itemmmap.put(Blocks.DOUBLE_STONE_SLAB, 1, 0.getRegistryName().toString(), 2);//焼石
       // itemmmap.put(Blocks.DOUBLE_STONE_SLAB, 1, 1.getRegistryName().toString(), 8);//砂岩
//itemmmap.put(Blocks.DOUBLE_STONE_SLAB, 1, 3.getRegistryName().toString(), 0);//石
       // itemmmap.put(Blocks.DOUBLE_STONE_SLAB, 1, 4.getRegistryName().toString(), 200);//レンガ
       //itemmmap.put(Blocks.DOUBLE_STONE_SLAB, 1, 5.getRegistryName().toString(), 12);//石レンガ
       // itemmmap.put(Blocks.DOUBLE_STONE_SLAB, 1, 6.getRegistryName().toString(), 50);//ネザーレンガ
       //itemmmap.put(Blocks.DOUBLE_STONE_SLAB, 1, 7.getRegistryName().toString(), 1200);//水晶
        //ハーフ
       // itemmmap.put(Blocks.STONE_SLAB, 1, 0.getRegistryName().toString(), 1);//焼石
       /// itemmmap.put(Blocks.STONE_SLAB, 1, 1.getRegistryName().toString(), 4);//砂岩
       // itemmmap.put(Blocks.STONE_SLAB, 1, 3.getRegistryName().toString(), 0);//石
       // itemmmap.put(Blocks.STONE_SLAB, 1, 4.getRegistryName().toString(), 100);//レンガ
       // itemmmap.put(Blocks.STONE_SLAB, 1, 5.getRegistryName().toString(), 5);//石レンガ
       // itemmmap.put(Blocks.STONE_SLAB, 1, 6.getRegistryName().toString(), 25);//ネザーレンガ
       // itemmmap.put(Blocks.STONE_SLAB, 1, 7.getRegistryName().toString(), 600);//水晶
        //
        itemmmap.put(Items.WHITE_WOOL.getRegistryName().toString(), 60);
        itemmmap.put(Items.ORANGE_WOOL.getRegistryName().toString(), 60);
        itemmmap.put(Items.MAGENTA_WOOL.getRegistryName().toString(), 60);
        itemmmap.put(Items.LIGHT_BLUE_WOOL.getRegistryName().toString(), 60);
        itemmmap.put(Items.CYAN_WOOL.getRegistryName().toString(), 60);
        itemmmap.put(Items.PURPLE_WOOL.getRegistryName().toString(), 60);
        itemmmap.put(Items.BLUE_WOOL.getRegistryName().toString(), 60);
        itemmmap.put(Items.BROWN_WOOL.getRegistryName().toString(), 60);
        itemmmap.put(Items.GREEN_WOOL.getRegistryName().toString(), 60);
        itemmmap.put(Items.RED_WOOL.getRegistryName().toString(), 60);
        itemmmap.put(Items.LIGHT_GRAY_WOOL.getRegistryName().toString(), 60);//骨
        itemmmap.put(Items.YELLOW_WOOL.getRegistryName().toString(), 60);//骨
        itemmmap.put(Items.PINK_WOOL.getRegistryName().toString(), 60);//骨
        itemmmap.put(Items.LIME_WOOL.getRegistryName().toString(), 60);//骨
        itemmmap.put(Items.GRAY_WOOL.getRegistryName().toString(), 60);//骨
        itemmmap.put(Items.BLACK_WOOL.getRegistryName().toString(), 60);//骨

        itemmmap.put(Items.WHITE_TERRACOTTA.getRegistryName().toString(), 130);
        itemmmap.put(Items.ORANGE_TERRACOTTA.getRegistryName().toString(), 130);
        itemmmap.put(Items.MAGENTA_TERRACOTTA.getRegistryName().toString(), 130);
        itemmmap.put(Items.LIGHT_BLUE_TERRACOTTA.getRegistryName().toString(), 130);
        itemmmap.put(Items.CYAN_TERRACOTTA.getRegistryName().toString(), 130);
        itemmmap.put(Items.PURPLE_TERRACOTTA.getRegistryName().toString(), 130);
        itemmmap.put(Items.BLUE_TERRACOTTA.getRegistryName().toString(), 130);
        itemmmap.put(Items.BROWN_TERRACOTTA.getRegistryName().toString(), 130);
        itemmmap.put(Items.GREEN_TERRACOTTA.getRegistryName().toString(), 130);
        itemmmap.put(Items.RED_TERRACOTTA.getRegistryName().toString(), 130);
        itemmmap.put(Items.LIGHT_GRAY_TERRACOTTA.getRegistryName().toString(), 130);//骨
        itemmmap.put(Items.YELLOW_TERRACOTTA.getRegistryName().toString(), 130);//骨
        itemmmap.put(Items.PINK_TERRACOTTA.getRegistryName().toString(), 130);//骨
        itemmmap.put(Items.LIME_TERRACOTTA.getRegistryName().toString(), 130);//骨
        itemmmap.put(Items.GRAY_TERRACOTTA.getRegistryName().toString(), 130);//骨
        itemmmap.put(Items.BLACK_TERRACOTTA.getRegistryName().toString(), 130);//骨

        itemmmap.put(Items.WHITE_STAINED_GLASS.getRegistryName().toString(), 12);
        itemmmap.put(Items.ORANGE_STAINED_GLASS.getRegistryName().toString(), 12);
        itemmmap.put(Items.MAGENTA_STAINED_GLASS.getRegistryName().toString(), 12);
        itemmmap.put(Items.LIGHT_BLUE_STAINED_GLASS.getRegistryName().toString(), 12);
        itemmmap.put(Items.CYAN_STAINED_GLASS.getRegistryName().toString(), 12);
        itemmmap.put(Items.PURPLE_STAINED_GLASS.getRegistryName().toString(), 12);
        itemmmap.put(Items.BLUE_STAINED_GLASS.getRegistryName().toString(), 12);
        itemmmap.put(Items.BROWN_STAINED_GLASS.getRegistryName().toString(), 12);
        itemmmap.put(Items.GREEN_STAINED_GLASS.getRegistryName().toString(), 12);
        itemmmap.put(Items.RED_STAINED_GLASS.getRegistryName().toString(), 12);
        itemmmap.put(Items.LIGHT_GRAY_STAINED_GLASS.getRegistryName().toString(), 12);//骨
        itemmmap.put(Items.YELLOW_STAINED_GLASS.getRegistryName().toString(), 12);//骨
        itemmmap.put(Items.PINK_STAINED_GLASS.getRegistryName().toString(), 12);//骨
        itemmmap.put(Items.LIME_STAINED_GLASS.getRegistryName().toString(), 12);//骨
        itemmmap.put(Items.GRAY_STAINED_GLASS.getRegistryName().toString(), 12);//骨
        itemmmap.put(Items.BLACK_STAINED_GLASS.getRegistryName().toString(), 12);//骨

        itemmmap.put(Blocks.BRICKS.getRegistryName().toString(), 200);
        itemmmap.put(Blocks.BOOKSHELF.getRegistryName().toString(), 510);
        itemmmap.put(Blocks.MOSSY_COBBLESTONE.getRegistryName().toString(), 10);
        itemmmap.put(Blocks.OBSIDIAN.getRegistryName().toString(), 5);
        itemmmap.put(Blocks.OAK_STAIRS.getRegistryName().toString(), 10);//オークの階段
        itemmmap.put(Blocks.DIAMOND_ORE.getRegistryName().toString(), 8000);
        itemmmap.put(Blocks.DIAMOND_BLOCK.getRegistryName().toString(), 90000);
        itemmmap.put(Blocks.WHEAT.getRegistryName().toString(), -1);
        itemmmap.put(Blocks.FARMLAND.getRegistryName().toString(), -1);
        itemmmap.put(Blocks.STONE_STAIRS.getRegistryName().toString(), 1);
        itemmmap.put(Blocks.REDSTONE_ORE.getRegistryName().toString(), 50);
        itemmmap.put(Blocks.CHISELED_STONE_BRICKS.getRegistryName().toString(), -1);//光っ);いるレッドストーン
        itemmmap.put(Blocks.ICE.getRegistryName().toString(), 65);
        itemmmap.put(Blocks.SNOW.getRegistryName().toString(), 1);
        itemmmap.put(Blocks.CLAY.getRegistryName().toString(), 120);
        itemmmap.put(Blocks.PUMPKIN.getRegistryName().toString(), 8);//パンプキン
        itemmmap.put(Blocks.NETHERRACK.getRegistryName().toString(), 0);
        itemmmap.put(Blocks.SOUL_SAND.getRegistryName().toString(), 2);
        itemmmap.put(Blocks.GLOWSTONE.getRegistryName().toString(), 400);
        itemmmap.put(Blocks.END_PORTAL.getRegistryName().toString(), -1);//ポータル
        itemmmap.put(Blocks.PUMPKIN.getRegistryName().toString(), 120);
        itemmmap.put(Blocks.BRICK_SLAB.getRegistryName().toString(), 10);
        itemmmap.put(Blocks.MELON.getRegistryName().toString(), 11);//メロン
        itemmmap.put(Blocks.PUMPKIN_STEM.getRegistryName().toString(), -1);//根
        itemmmap.put(Blocks.MELON_STEM.getRegistryName().toString(), -1);
        itemmmap.put(Blocks.BRICK_STAIRS.getRegistryName().toString(), 210);
        itemmmap.put(Blocks.STONE_BRICK_STAIRS.getRegistryName().toString(), 12);
        itemmmap.put(Blocks.MYCELIUM.getRegistryName().toString(), 1);
        itemmmap.put(Blocks.NETHER_BRICKS.getRegistryName().toString(), 10);
        itemmmap.put(Blocks.NETHER_BRICK_STAIRS.getRegistryName().toString(), 12);
        itemmmap.put(Blocks.NETHER_WART.getRegistryName().toString(), -1);//ブロック状態のネザーウォート
        itemmmap.put(Blocks.END_STONE.getRegistryName().toString(), 10);
        itemmmap.put(Blocks.DRAGON_EGG.getRegistryName().toString(), -1);

        itemmmap.put(Blocks.SANDSTONE_STAIRS.getRegistryName().toString(), 20);
        itemmmap.put(Blocks.EMERALD_ORE.getRegistryName().toString(), 1500);
        itemmmap.put(Blocks.EMERALD_BLOCK.getRegistryName().toString(), 2700);
        itemmmap.put(Blocks.SPRUCE_STAIRS.getRegistryName().toString(), 10);//まつの階段
        itemmmap.put(Blocks.BIRCH_STAIRS.getRegistryName().toString(), 10);
        itemmmap.put(Blocks.JUNGLE_STAIRS.getRegistryName().toString(), 10);

        itemmmap.put(Blocks.NETHER_QUARTZ_ORE.getRegistryName().toString(), 280);
        itemmmap.put(Blocks.QUARTZ_STAIRS.getRegistryName().toString(), 1400);

        itemmmap.put(Blocks.HAY_BLOCK.getRegistryName().toString(), 450);
        itemmmap.put(Blocks.TERRACOTTA.getRegistryName().toString(), 130);
        itemmmap.put(Blocks.COAL_BLOCK.getRegistryName().toString(), 450);
        itemmmap.put(Blocks.PACKED_ICE.getRegistryName().toString(), 100);
        itemmmap.put(Blocks.ACACIA_STAIRS.getRegistryName().toString(), 10);//階段
        itemmmap.put(Blocks.DARK_OAK_STAIRS.getRegistryName().toString(), 10);

        itemmmap.put(Blocks.PRISMARINE.getRegistryName().toString(), 20);//海
        itemmmap.put(Blocks.PRISMARINE.getRegistryName().toString(), 45);
        itemmmap.put(Blocks.SEA_LANTERN.getRegistryName().toString(), 120);
        itemmmap.put(Blocks.RED_SANDSTONE.getRegistryName().toString(), 32);//砂
        itemmmap.put(Blocks.RED_SANDSTONE_STAIRS.getRegistryName().toString(), 30);//砂
        itemmmap.put(Blocks.SANDSTONE_SLAB.getRegistryName().toString(), 8);//砂
        itemmmap.put(Blocks.PURPUR_BLOCK.getRegistryName().toString(), 5);//パァー
        itemmmap.put(Blocks.PURPUR_PILLAR.getRegistryName().toString(), 5);
        itemmmap.put(Blocks.PURPUR_STAIRS.getRegistryName().toString(), 6);
        itemmmap.put(Blocks.PURPUR_SLAB.getRegistryName().toString(),2);
        itemmmap.put(Blocks.END_STONE_BRICKS.getRegistryName().toString(),20);

        itemmmap.put(Blocks.MAGMA_BLOCK.getRegistryName().toString(), 20);//マグマ
        itemmmap.put(Blocks.NETHER_WART_BLOCK.getRegistryName().toString(),100);//ネザー
        itemmmap.put(Blocks.RED_NETHER_BRICKS.getRegistryName().toString(), 38);
        itemmmap.put(Blocks.BONE_BLOCK.getRegistryName().toString(), 100);//骨

        //建築 ITEM

        //装飾 BLOCK

        itemmmap.put(Items.WHITE_BED.getRegistryName().toString(), 200);
        itemmmap.put(Items.ORANGE_BED.getRegistryName().toString(), 200);
        itemmmap.put(Items.MAGENTA_BED.getRegistryName().toString(), 200);
        itemmmap.put(Items.LIGHT_BLUE_BED.getRegistryName().toString(), 200);
        itemmmap.put(Items.CYAN_BED.getRegistryName().toString(), 200);
        itemmmap.put(Items.PURPLE_BED.getRegistryName().toString(), 200);
        itemmmap.put(Items.BLUE_BED.getRegistryName().toString(), 200);
        itemmmap.put(Items.BROWN_BED.getRegistryName().toString(), 200);
        itemmmap.put(Items.GREEN_BED.getRegistryName().toString(), 200);
        itemmmap.put(Items.RED_BED.getRegistryName().toString(), 200);
        itemmmap.put(Blocks.COBWEB.getRegistryName().toString(), 40);
        itemmmap.put(Blocks.LIGHT_GRAY_BED.getRegistryName().toString(), 200);//骨
        itemmmap.put(Blocks.YELLOW_BED.getRegistryName().toString(), 200);//骨
        itemmmap.put(Blocks.PINK_BED.getRegistryName().toString(), 200);//骨
        itemmmap.put(Blocks.LIME_BED.getRegistryName().toString(), 200);//骨
        itemmmap.put(Blocks.GRAY_BED.getRegistryName().toString(), 200);//骨
        itemmmap.put(Blocks.BLACK_BED.getRegistryName().toString(), 200);//骨

        itemmmap.put(Items.WHITE_CARPET.getRegistryName().toString(), 1);
        itemmmap.put(Items.ORANGE_CARPET.getRegistryName().toString(), 1);
        itemmmap.put(Items.MAGENTA_CARPET.getRegistryName().toString(), 1);
        itemmmap.put(Items.LIGHT_BLUE_CARPET.getRegistryName().toString(), 1);
        itemmmap.put(Items.CYAN_CARPET.getRegistryName().toString(), 1);
        itemmmap.put(Items.PURPLE_CARPET.getRegistryName().toString(), 1);
        itemmmap.put(Items.BLUE_CARPET.getRegistryName().toString(), 1);
        itemmmap.put(Items.BROWN_CARPET.getRegistryName().toString(), 1);
        itemmmap.put(Items.GREEN_CARPET.getRegistryName().toString(), 1);
        itemmmap.put(Items.RED_CARPET.getRegistryName().toString(), 1);
        itemmmap.put(Items.LIGHT_GRAY_CARPET.getRegistryName().toString(), 1);//骨
        itemmmap.put(Items.YELLOW_CARPET.getRegistryName().toString(), 1);//骨
        itemmmap.put(Items.PINK_CARPET.getRegistryName().toString(), 1);//骨
        itemmmap.put(Items.LIME_CARPET.getRegistryName().toString(), 1);//骨
        itemmmap.put(Items.GRAY_CARPET.getRegistryName().toString(), 1);//骨
        itemmmap.put(Items.BLACK_CARPET.getRegistryName().toString(), 1);//骨

        itemmmap.put(Items.DANDELION.getRegistryName().toString(), 20);
        itemmmap.put(Items.POPPY.getRegistryName().toString(), 20);
        itemmmap.put(Items.BLUE_ORCHID.getRegistryName().toString(), 20);
        itemmmap.put(Items.ALLIUM.getRegistryName().toString(), 20);
        itemmmap.put(Items.AZURE_BLUET.getRegistryName().toString(), 20);
        itemmmap.put(Items.RED_TULIP.getRegistryName().toString(), 20);
        itemmmap.put(Items.ORANGE_TULIP.getRegistryName().toString(), 20);
        itemmmap.put(Items.TORCH.getRegistryName().toString(), 20);
        itemmmap.put(Items.WHITE_TULIP.getRegistryName().toString(), 20);
        itemmmap.put(Items.PINK_TULIP.getRegistryName().toString(), 20);
        itemmmap.put(Items.OXEYE_DAISY.getRegistryName().toString(), 20);
        itemmmap.put(Items.CORNFLOWER.getRegistryName().toString(), 20);
        itemmmap.put(Items.LILY_OF_THE_VALLEY.getRegistryName().toString(), 20);
        itemmmap.put(Items.WITHER_ROSE.getRegistryName().toString(), 20);
        itemmmap.put(Items.SUNFLOWER.getRegistryName().toString(), 20);
        itemmmap.put(Items.LILAC.getRegistryName().toString(), 20);
        itemmmap.put(Items.ROSE_BUSH.getRegistryName().toString(), 20);
        itemmmap.put(Items.PEONY.getRegistryName().toString(), 20);

        itemmmap.put(Blocks.BROWN_MUSHROOM.getRegistryName().toString(), 15);
        itemmmap.put(Blocks.RED_MUSHROOM.getRegistryName().toString(), 15);
        itemmmap.put(Blocks.TORCH.getRegistryName().toString(), 10);
        itemmmap.put(Blocks.FIRE.getRegistryName().toString(), -1);
        itemmmap.put(Blocks.CHEST.getRegistryName().toString(), 50);
        itemmmap.put(Blocks.CRAFTING_TABLE.getRegistryName().toString(), 20);
        itemmmap.put(Blocks.FURNACE.getRegistryName().toString(), 10);
        itemmmap.put(Blocks.LADDER.getRegistryName().toString(), 5);
        itemmmap.put(Blocks.CACTUS.getRegistryName().toString(), 60);
        itemmmap.put(Blocks.JUKEBOX.getRegistryName().toString(), 10250);
        itemmmap.put(Blocks.OAK_FENCE.getRegistryName().toString(), 8);//フェンス
        itemmmap.put(Blocks.SPRUCE_FENCE.getRegistryName().toString(), 8);
        itemmmap.put(Blocks.BIRCH_FENCE.getRegistryName().toString(), 8);
        itemmmap.put(Blocks.JUNGLE_FENCE.getRegistryName().toString(), 8);
        itemmmap.put(Blocks.DARK_OAK_FENCE.getRegistryName().toString(), 8);
        itemmmap.put(Blocks.ACACIA_FENCE.getRegistryName().toString(), 8);

        itemmmap.put(Blocks.BROWN_MUSHROOM_BLOCK.getRegistryName().toString(), -1);
        itemmmap.put(Blocks.RED_MUSHROOM_BLOCK.getRegistryName().toString(), -1);
        itemmmap.put(Blocks.IRON_BARS.getRegistryName().toString(), 190);
        itemmmap.put(Blocks.GLASS_PANE.getRegistryName().toString(), 12);
        itemmmap.put(Blocks.VINE.getRegistryName().toString(), 1);
        itemmmap.put(Blocks.LILY_PAD.getRegistryName().toString(), 1);

        itemmmap.put(Items.WHITE_STAINED_GLASS_PANE.getRegistryName().toString(), 12);
        itemmmap.put(Items.ORANGE_STAINED_GLASS_PANE.getRegistryName().toString(), 12);
        itemmmap.put(Items.MAGENTA_STAINED_GLASS_PANE.getRegistryName().toString(), 12);
        itemmmap.put(Items.LIGHT_BLUE_STAINED_GLASS_PANE.getRegistryName().toString(), 12);
        itemmmap.put(Items.CYAN_STAINED_GLASS_PANE.getRegistryName().toString(), 12);
        itemmmap.put(Items.PURPLE_STAINED_GLASS_PANE.getRegistryName().toString(), 12);
        itemmmap.put(Items.BLUE_STAINED_GLASS_PANE.getRegistryName().toString(), 12);
        itemmmap.put(Items.BROWN_STAINED_GLASS_PANE.getRegistryName().toString(), 12);
        itemmmap.put(Items.GREEN_STAINED_GLASS_PANE.getRegistryName().toString(), 12);
        itemmmap.put(Items.RED_STAINED_GLASS_PANE.getRegistryName().toString(), 12);
        itemmmap.put(Items.LIGHT_GRAY_STAINED_GLASS_PANE.getRegistryName().toString(), 12);//骨
        itemmmap.put(Items.YELLOW_STAINED_GLASS_PANE.getRegistryName().toString(), 12);//骨
        itemmmap.put(Items.PINK_STAINED_GLASS_PANE.getRegistryName().toString(), 12);//骨
        itemmmap.put(Items.LIME_STAINED_GLASS_PANE.getRegistryName().toString(), 12);//骨
        itemmmap.put(Items.GRAY_STAINED_GLASS_PANE.getRegistryName().toString(), 12);//骨
        itemmmap.put(Items.BLACK_STAINED_GLASS_PANE.getRegistryName().toString(), 12);//骨

        itemmmap.put(Blocks.NETHER_BRICK_FENCE.getRegistryName().toString(), 12);
        itemmmap.put(Blocks.ENCHANTING_TABLE.getRegistryName().toString(), 22000);
        itemmmap.put(Blocks.END_PORTAL.getRegistryName().toString(), -1);
        itemmmap.put(Blocks.END_PORTAL_FRAME.getRegistryName().toString(), -1);
        itemmmap.put(Blocks.ENDER_CHEST.getRegistryName().toString(), 150);
        itemmmap.put(Blocks.FLOWER_POT.getRegistryName().toString(), -1);//植木鉢
        itemmmap.put(Blocks.SKELETON_SKULL.getRegistryName().toString(), -1);//頭

        itemmmap.put(Blocks.ANVIL.getRegistryName().toString(), 16000);//壊れた金床
        itemmmap.put(Blocks.CHIPPED_ANVIL.getRegistryName().toString(), -1);//壊れた金床
        itemmmap.put(Blocks.DAMAGED_ANVIL.getRegistryName().toString(), -1);//壊れた金床

        itemmmap.put(Blocks.TRAPPED_CHEST.getRegistryName().toString(), 520);

        itemmmap.put(Blocks.CAVE_VINES_PLANT.getRegistryName().toString(), 20);
        itemmmap.put(Blocks.CHORUS_PLANT.getRegistryName().toString(), 20);
        itemmmap.put(Blocks.KELP_PLANT.getRegistryName().toString(), 1);
        itemmmap.put(Blocks.TWISTING_VINES_PLANT.getRegistryName().toString(), 1);
        itemmmap.put(Blocks.WEEPING_VINES_PLANT.getRegistryName().toString(), 20);

        itemmmap.put(Blocks.END_ROD.getRegistryName().toString(),  5);
        itemmmap.put(Blocks.CHORUS_PLANT.getRegistryName().toString(), -1);
        itemmmap.put(Blocks.CHORUS_FLOWER.getRegistryName().toString(),  -1);
        itemmmap.put(Blocks.STRUCTURE_VOID.getRegistryName().toString(),-1);//ストラクチャー
        itemmmap.put(Blocks.STRUCTURE_BLOCK.getRegistryName().toString(),-1);
        //装飾 ITEM
        itemmmap.put(Items.PAINTING.getRegistryName().toString(), 20);

        itemmmap.put(Blocks.ACACIA_LOG.getRegistryName().toString(), 10);
        itemmmap.put(Blocks.BIRCH_LOG.getRegistryName().toString(), 10);
        itemmmap.put(Blocks.JUNGLE_LOG.getRegistryName().toString(), 10);
        itemmmap.put(Blocks.OAK_LOG.getRegistryName().toString(), 10);
        itemmmap.put(Blocks.SPRUCE_LOG.getRegistryName().toString(), 10);
        itemmmap.put(Blocks.DARK_OAK_LOG.getRegistryName().toString(), 10);

        itemmmap.put(Items.WHITE_CONCRETE.getRegistryName().toString(), 240);
        itemmmap.put(Items.ORANGE_CONCRETE.getRegistryName().toString(), 240);
        itemmmap.put(Items.MAGENTA_CONCRETE.getRegistryName().toString(), 240);
        itemmmap.put(Items.LIGHT_BLUE_CONCRETE.getRegistryName().toString(), 240);
        itemmmap.put(Items.CYAN_CONCRETE.getRegistryName().toString(), 240);
        itemmmap.put(Items.PURPLE_CONCRETE.getRegistryName().toString(), 240);
        itemmmap.put(Items.BLUE_CONCRETE.getRegistryName().toString(), 240);
        itemmmap.put(Items.BROWN_CONCRETE.getRegistryName().toString(), 240);
        itemmmap.put(Items.GREEN_CONCRETE.getRegistryName().toString(), 240);
        itemmmap.put(Items.RED_CONCRETE.getRegistryName().toString(), 240);
        itemmmap.put(Items.LIGHT_GRAY_CONCRETE.getRegistryName().toString(), 240);//骨
        itemmmap.put(Items.YELLOW_CONCRETE.getRegistryName().toString(), 240);//骨
        itemmmap.put(Items.PINK_CONCRETE.getRegistryName().toString(), 240);//骨
        itemmmap.put(Items.LIME_CONCRETE.getRegistryName().toString(), 240);//骨
        itemmmap.put(Items.GRAY_CONCRETE.getRegistryName().toString(), 240);//骨
        itemmmap.put(Items.BLACK_CONCRETE.getRegistryName().toString(), 240);//骨

        itemmmap.put(Items.WHITE_CONCRETE_POWDER.getRegistryName().toString(), 75);
        itemmmap.put(Items.ORANGE_CONCRETE_POWDER.getRegistryName().toString(), 75);
        itemmmap.put(Items.MAGENTA_CONCRETE_POWDER.getRegistryName().toString(), 75);
        itemmmap.put(Items.LIGHT_BLUE_CONCRETE_POWDER.getRegistryName().toString(), 75);
        itemmmap.put(Items.CYAN_CONCRETE_POWDER.getRegistryName().toString(), 75);
        itemmmap.put(Items.PURPLE_CONCRETE_POWDER.getRegistryName().toString(), 75);
        itemmmap.put(Items.BLUE_CONCRETE_POWDER.getRegistryName().toString(), 75);
        itemmmap.put(Items.BROWN_CONCRETE_POWDER.getRegistryName().toString(), 75);
        itemmmap.put(Items.GREEN_CONCRETE_POWDER.getRegistryName().toString(), 75);
        itemmmap.put(Items.RED_CONCRETE_POWDER.getRegistryName().toString(), 75);
        itemmmap.put(Items.LIGHT_GRAY_CONCRETE_POWDER.getRegistryName().toString(), 75);//骨
        itemmmap.put(Items.YELLOW_CONCRETE_POWDER.getRegistryName().toString(), 75);//骨
        itemmmap.put(Items.PINK_CONCRETE_POWDER.getRegistryName().toString(), 75);//骨
        itemmmap.put(Items.LIME_CONCRETE_POWDER.getRegistryName().toString(), 75);//骨
        itemmmap.put(Items.GRAY_CONCRETE_POWDER.getRegistryName().toString(), 75);//骨
        itemmmap.put(Items.BLACK_CONCRETE_POWDER.getRegistryName().toString(), 75);//骨

        itemmmap.put(Blocks.ACACIA_SIGN.getRegistryName().toString(), 24);
        itemmmap.put(Blocks.BIRCH_SIGN.getRegistryName().toString(), 24);
        itemmmap.put(Blocks.JUNGLE_SIGN.getRegistryName().toString(), 24);
        itemmmap.put(Blocks.OAK_SIGN.getRegistryName().toString(), 24);
        itemmmap.put(Blocks.SPRUCE_SIGN.getRegistryName().toString(), 24);
        itemmmap.put(Blocks.DARK_OAK_SIGN.getRegistryName().toString(), 24);

        itemmmap.put(Items.ITEM_FRAME.getRegistryName().toString(), 60);
        itemmmap.put(Items.FLOWER_POT.getRegistryName().toString(), 150);

        itemmmap.put(Items.SKELETON_SKULL.getRegistryName().toString(), 50);
        itemmmap.put(Items.WITHER_SKELETON_SKULL.getRegistryName().toString(), 15000);

        itemmmap.put(Items.ARMOR_STAND.getRegistryName().toString(), 30);

        itemmmap.put(Items.ACACIA_SLAB.getRegistryName().toString(), 4);
        itemmmap.put(Items.BIRCH_SLAB.getRegistryName().toString(), 4);
        itemmmap.put(Items.JUNGLE_SLAB.getRegistryName().toString(), 4);
        itemmmap.put(Items.OAK_SLAB.getRegistryName().toString(), 4);
        itemmmap.put(Items.SPRUCE_SLAB.getRegistryName().toString(), 4);
        itemmmap.put(Items.DARK_OAK_SLAB.getRegistryName().toString(), 4);

        itemmmap.put(Items.DEAD_TUBE_CORAL_FAN.getRegistryName().toString(), 300);
        itemmmap.put(Items.DEAD_BRAIN_CORAL_FAN.getRegistryName().toString(), 300);
        itemmmap.put(Items.DEAD_BUBBLE_CORAL_FAN.getRegistryName().toString(), 300);
        itemmmap.put(Items.DEAD_FIRE_CORAL_FAN.getRegistryName().toString(), 300);
        itemmmap.put(Items.DEAD_HORN_CORAL_FAN.getRegistryName().toString(), 300);

        itemmmap.put(Items.DEAD_TUBE_CORAL_BLOCK.getRegistryName().toString(), 600);
        itemmmap.put(Items.DEAD_BRAIN_CORAL_BLOCK.getRegistryName().toString(), 600);
        itemmmap.put(Items.DEAD_BUBBLE_CORAL_BLOCK.getRegistryName().toString(), 600);
        itemmmap.put(Items.DEAD_FIRE_CORAL_BLOCK.getRegistryName().toString(), 600);
        itemmmap.put(Items.DEAD_HORN_CORAL_BLOCK.getRegistryName().toString(), 600);

        itemmmap.put(Items.OAK_SAPLING.getRegistryName().toString(), 2);
        itemmmap.put(Items.SPRUCE_SAPLING.getRegistryName().toString(), 2);
        itemmmap.put(Items.BIRCH_SAPLING.getRegistryName().toString(), 2);
        itemmmap.put(Items.JUNGLE_SAPLING.getRegistryName().toString(), 2);
        itemmmap.put(Items.ACACIA_SAPLING.getRegistryName().toString(), 2);
        itemmmap.put(Items.DARK_OAK_SAPLING.getRegistryName().toString(), 2);

        itemmmap.put(Items.OAK_LEAVES.getRegistryName().toString(), 3);
        itemmmap.put(Items.SPRUCE_LEAVES.getRegistryName().toString(), 3);
        itemmmap.put(Items.BIRCH_LEAVES.getRegistryName().toString(), 3);
        itemmmap.put(Items.JUNGLE_LEAVES.getRegistryName().toString(), 3);
        itemmmap.put(Items.ACACIA_LEAVES.getRegistryName().toString(), 3);
        itemmmap.put(Items.DARK_OAK_LEAVES.getRegistryName().toString(), 3);

        itemmmap.put(Items.OAK_PLANKS.getRegistryName().toString(), 4);
        itemmmap.put(Items.SPRUCE_PLANKS.getRegistryName().toString(), 4);
        itemmmap.put(Items.BIRCH_PLANKS.getRegistryName().toString(), 4);
        itemmmap.put(Items.JUNGLE_PLANKS.getRegistryName().toString(), 4);
        itemmmap.put(Items.ACACIA_PLANKS.getRegistryName().toString(), 4);
        itemmmap.put(Items.DARK_OAK_PLANKS.getRegistryName().toString(), 4);

        itemmmap.put(Items.WHITE_BANNER.getRegistryName().toString(), 400);
        itemmmap.put(Items.ORANGE_BANNER.getRegistryName().toString(), 400);
        itemmmap.put(Items.MAGENTA_BANNER.getRegistryName().toString(), 400);
        itemmmap.put(Items.LIGHT_BLUE_BANNER.getRegistryName().toString(), 400);
        itemmmap.put(Items.CYAN_BANNER.getRegistryName().toString(), 400);
        itemmmap.put(Items.PURPLE_BANNER.getRegistryName().toString(), 400);
        itemmmap.put(Items.BLUE_BANNER.getRegistryName().toString(), 400);
        itemmmap.put(Items.BROWN_BANNER.getRegistryName().toString(), 400);
        itemmmap.put(Items.GREEN_BANNER.getRegistryName().toString(), 400);
        itemmmap.put(Items.RED_BANNER.getRegistryName().toString(), 400);
        itemmmap.put(Items.COBWEB.getRegistryName().toString(), 40);
        itemmmap.put(Items.LIGHT_GRAY_BANNER.getRegistryName().toString(), 400);//骨
        itemmmap.put(Items.YELLOW_BANNER.getRegistryName().toString(), 400);//骨
        itemmmap.put(Items.PINK_BANNER.getRegistryName().toString(), 400);//骨
        itemmmap.put(Items.LIME_BANNER.getRegistryName().toString(), 400);//骨
        itemmmap.put(Items.GRAY_BANNER.getRegistryName().toString(), 400);//骨
        itemmmap.put(Items.BLACK_BANNER.getRegistryName().toString(), 400);//骨

        itemmmap.put(Items.WHITE_GLAZED_TERRACOTTA.getRegistryName().toString(), 130);
        itemmmap.put(Items.ORANGE_GLAZED_TERRACOTTA.getRegistryName().toString(), 130);
        itemmmap.put(Items.MAGENTA_GLAZED_TERRACOTTA.getRegistryName().toString(), 130);
        itemmmap.put(Items.LIGHT_BLUE_GLAZED_TERRACOTTA.getRegistryName().toString(), 130);
        itemmmap.put(Items.CYAN_GLAZED_TERRACOTTA.getRegistryName().toString(), 130);
        itemmmap.put(Items.PURPLE_GLAZED_TERRACOTTA.getRegistryName().toString(), 130);
        itemmmap.put(Items.BLUE_GLAZED_TERRACOTTA.getRegistryName().toString(), 130);
        itemmmap.put(Items.BROWN_GLAZED_TERRACOTTA.getRegistryName().toString(), 130);
        itemmmap.put(Items.GREEN_GLAZED_TERRACOTTA.getRegistryName().toString(), 130);
        itemmmap.put(Items.RED_GLAZED_TERRACOTTA.getRegistryName().toString(), 130);
        itemmmap.put(Items.LIGHT_GRAY_GLAZED_TERRACOTTA.getRegistryName().toString(), 130);//骨
        itemmmap.put(Items.YELLOW_GLAZED_TERRACOTTA.getRegistryName().toString(), 130);//骨
        itemmmap.put(Items.PINK_GLAZED_TERRACOTTA.getRegistryName().toString(), 130);//骨
        itemmmap.put(Items.LIME_GLAZED_TERRACOTTA.getRegistryName().toString(), 130);//骨
        itemmmap.put(Items.GRAY_GLAZED_TERRACOTTA.getRegistryName().toString(), 130);//骨
        itemmmap.put(Items.BLACK_GLAZED_TERRACOTTA.getRegistryName().toString(), 130);//骨

        itemmmap.put(Items.END_CRYSTAL.getRegistryName().toString(), -1);

        //レッドストーン BLOCK
        itemmmap.put(Blocks.DISPENSER.getRegistryName().toString(), 200);
        itemmmap.put(Blocks.NOTE_BLOCK.getRegistryName().toString(), 120);

        itemmmap.put(Blocks.STICKY_PISTON.getRegistryName().toString(), 800);
        itemmmap.put(Blocks.PISTON.getRegistryName().toString(), 700);
        itemmmap.put(Blocks.PISTON_HEAD.getRegistryName().toString(), -1);//ピストンの先
        itemmmap.put(Blocks.TNT.getRegistryName().toString(), 80);
        itemmmap.put(Blocks.REDSTONE_WIRE.getRegistryName().toString(), -1);
        itemmmap.put(Blocks.OAK_DOOR.getRegistryName().toString(), -1);//木のドア
        itemmmap.put(Blocks.SPRUCE_DOOR.getRegistryName().toString(), -1);//木のドア
        itemmmap.put(Blocks.BIRCH_DOOR.getRegistryName().toString(), -1);//木のドア
        itemmmap.put(Blocks.JUNGLE_DOOR.getRegistryName().toString(), -1);//木のドア
        itemmmap.put(Blocks.ACACIA_DOOR.getRegistryName().toString(), -1);//木のドア
        itemmmap.put(Blocks.DARK_OAK_DOOR.getRegistryName().toString(), -1);//木のドア
        itemmmap.put(Blocks.LEVER.getRegistryName().toString(), 55);
        itemmmap.put(Blocks.STONE_PRESSURE_PLATE.getRegistryName().toString(), 5);
        itemmmap.put(Blocks.IRON_DOOR.getRegistryName().toString(), -1);//鉄のドア

        itemmmap.put(Blocks.ACACIA_PRESSURE_PLATE.getRegistryName().toString(), 10);
        itemmmap.put(Blocks.BIRCH_PRESSURE_PLATE.getRegistryName().toString(), 10);
        itemmmap.put(Blocks.JUNGLE_PRESSURE_PLATE.getRegistryName().toString(), 10);
        itemmmap.put(Blocks.OAK_PRESSURE_PLATE.getRegistryName().toString(), 10);
        itemmmap.put(Blocks.SPRUCE_PRESSURE_PLATE.getRegistryName().toString(), 10);
        itemmmap.put(Blocks.DARK_OAK_PRESSURE_PLATE.getRegistryName().toString(), 10);

        itemmmap.put(Blocks.REDSTONE_TORCH.getRegistryName().toString(), 45);
        itemmmap.put(Blocks.STONE_BUTTON.getRegistryName().toString(), 1);
        itemmmap.put(Blocks.REPEATER.getRegistryName().toString(), 1);

        itemmmap.put(Blocks.ACACIA_TRAPDOOR.getRegistryName().toString(), 15);
        itemmmap.put(Blocks.BIRCH_TRAPDOOR.getRegistryName().toString(), 15);
        itemmmap.put(Blocks.JUNGLE_TRAPDOOR.getRegistryName().toString(), 15);
        itemmmap.put(Blocks.OAK_TRAPDOOR.getRegistryName().toString(), 15);
        itemmmap.put(Blocks.SPRUCE_TRAPDOOR.getRegistryName().toString(), 15);
        itemmmap.put(Blocks.DARK_OAK_TRAPDOOR.getRegistryName().toString(), 15);
        itemmmap.put(Blocks.IRON_TRAPDOOR.getRegistryName().toString(), 1200);

        itemmmap.put(Blocks.OAK_FENCE_GATE.getRegistryName().toString(), 10);//フェンスゲート
        itemmmap.put(Blocks.SPRUCE_FENCE_GATE.getRegistryName().toString(), 10);//フェンスゲート
        itemmmap.put(Blocks.BIRCH_FENCE_GATE.getRegistryName().toString(), 10);//フェンスゲート
        itemmmap.put(Blocks.JUNGLE_FENCE_GATE.getRegistryName().toString(), 10);//フェンスゲート
        itemmmap.put(Blocks.DARK_OAK_FENCE_GATE.getRegistryName().toString(), 10);//フェンスゲート
        itemmmap.put(Blocks.ACACIA_FENCE_GATE.getRegistryName().toString(), 10);//フェンスゲート
        itemmmap.put(Blocks.REDSTONE_LAMP.getRegistryName().toString(), 1500);
        itemmmap.put(Blocks.TRIPWIRE_HOOK.getRegistryName().toString(), 250);
        itemmmap.put(Blocks.TRIPWIRE.getRegistryName().toString(), -1);//糸
        itemmmap.put(Blocks.COMMAND_BLOCK.getRegistryName().toString(), -1);//コマンドブロック

        itemmmap.put(Blocks.ACACIA_WOOD.getRegistryName().toString(), 5);
        itemmmap.put(Blocks.BIRCH_WOOD.getRegistryName().toString(), 5);
        itemmmap.put(Blocks.JUNGLE_WOOD.getRegistryName().toString(), 5);
        itemmmap.put(Blocks.OAK_WOOD.getRegistryName().toString(), 5);
        itemmmap.put(Blocks.SPRUCE_WOOD.getRegistryName().toString(), 5);
        itemmmap.put(Blocks.DARK_OAK_WOOD.getRegistryName().toString(), 5);

        itemmmap.put(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE.getRegistryName().toString(), 8000);
        itemmmap.put(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE.getRegistryName().toString(), 1000);
        itemmmap.put(Blocks.COMPARATOR.getRegistryName().toString(), -1);
        itemmmap.put(Blocks.DAYLIGHT_DETECTOR.getRegistryName().toString(), 1000);
        itemmmap.put(Blocks.REDSTONE_BLOCK.getRegistryName().toString(), 360);
        itemmmap.put(Blocks.HOPPER.getRegistryName().toString(), 2600);
        itemmmap.put(Blocks.DROPPER.getRegistryName().toString(), 50);
        itemmmap.put(Blocks.REPEATING_COMMAND_BLOCK.getRegistryName().toString(), -1);
        itemmmap.put(Blocks.CHAIN_COMMAND_BLOCK.getRegistryName().toString(), -1);
        //レッドストーン ITEM
        itemmmap.put(Items.OAK_DOOR.getRegistryName().toString(), 28);
        itemmmap.put(Items.SPRUCE_DOOR.getRegistryName().toString(), 28);
        itemmmap.put(Items.BIRCH_DOOR.getRegistryName().toString(), 28);
        itemmmap.put(Items.JUNGLE_DOOR.getRegistryName().toString(), 28);
        itemmmap.put(Items.ACACIA_DOOR.getRegistryName().toString(), 28);
        itemmmap.put(Items.DARK_OAK_DOOR.getRegistryName().toString(), 28);
        itemmmap.put(Items.IRON_DOOR.getRegistryName().toString(), 2800);
        itemmmap.put(Items.REDSTONE.getRegistryName().toString(), 40);
        itemmmap.put(Items.REPEATER.getRegistryName().toString(), 150);
        itemmmap.put(Items.COMPARATOR.getRegistryName().toString(), 210);

        //移動 BLOCK
        itemmmap.put(Blocks.DETECTOR_RAIL.getRegistryName().toString(), 600);
        itemmmap.put(Blocks.RAIL.getRegistryName().toString(), 250);
        itemmmap.put(Blocks.ACTIVATOR_RAIL.getRegistryName().toString(), 600);
        //移動 ITEM
        itemmmap.put(Items.MINECART.getRegistryName().toString(), 800);
        itemmmap.put(Items.SADDLE.getRegistryName().toString(), 40);

        itemmmap.put(Items.ACACIA_BOAT.getRegistryName().toString(), 30);
        itemmmap.put(Items.JUNGLE_BOAT.getRegistryName().toString(), 30);
        itemmmap.put(Items.BIRCH_BOAT.getRegistryName().toString(), 30);
        itemmmap.put(Items.SPRUCE_BOAT.getRegistryName().toString(), 30);
        itemmmap.put(Items.OAK_BOAT.getRegistryName().toString(), 30);

        itemmmap.put(Items.SPRUCE_BOAT.getRegistryName().toString(), 30);
        itemmmap.put(Items.BIRCH_BOAT.getRegistryName().toString(), 30);
        itemmmap.put(Items.JUNGLE_BOAT.getRegistryName().toString(), 30);
        itemmmap.put(Items.ACACIA_BOAT.getRegistryName().toString(), 30);
        itemmmap.put(Items.DARK_OAK_BOAT.getRegistryName().toString(), 30);
        itemmmap.put(Items.CHEST_MINECART.getRegistryName().toString(), 830);
        itemmmap.put(Items.FURNACE_MINECART.getRegistryName().toString(), 820);
        itemmmap.put(Items.CARROT_ON_A_STICK.getRegistryName().toString(), 26);
        itemmmap.put(Items.TNT_MINECART.getRegistryName().toString(), 800);
        itemmmap.put(Items.HOPPER_MINECART.getRegistryName().toString(), 980);
        itemmmap.put(Items.COMMAND_BLOCK_MINECART.getRegistryName().toString(), -1);
        itemmmap.put(Items.ELYTRA.getRegistryName().toString(), 200000);

        //その他 BLOCK
        itemmmap.put(Blocks.BEACON.getRegistryName().toString(), 9000);
        //その他 ITEM
        itemmmap.put(Items.BUCKET.getRegistryName().toString(), 150);
        itemmmap.put(Items.WATER_BUCKET.getRegistryName().toString(), 150);
        itemmmap.put(Items.LAVA_BUCKET.getRegistryName().toString(), 200);
        itemmmap.put(Items.SNOWBALL.getRegistryName().toString(), 0);
        itemmmap.put(Items.MILK_BUCKET.getRegistryName().toString(), 600);
        itemmmap.put(Items.PAPER.getRegistryName().toString(), 10);
        itemmmap.put(Items.BOOK.getRegistryName().toString(), 150);
        itemmmap.put(Items.SLIME_BALL.getRegistryName().toString(), 1);
        itemmmap.put(Items.BONE.getRegistryName().toString(), 1);
        itemmmap.put(Items.FILLED_MAP.getRegistryName().toString(), 1);
        itemmmap.put(Items.ENDER_PEARL.getRegistryName().toString(), 20);
        itemmmap.put(Items.ENDER_EYE.getRegistryName().toString(), 20);
        itemmmap.put(Items.EXPERIENCE_BOTTLE.getRegistryName().toString(), 150);
        itemmmap.put(Items.FIRE_CHARGE.getRegistryName().toString(), 50);
        itemmmap.put(Items.WRITABLE_BOOK.getRegistryName().toString(), 180);
        itemmmap.put(Items.WRITTEN_BOOK.getRegistryName().toString(), -1);
        itemmmap.put(Items.MAP.getRegistryName().toString(), 10);

        itemmmap.put(Items.FIREWORK_ROCKET.getRegistryName().toString(), 10);
        itemmmap.put(Items.FIREWORK_STAR.getRegistryName().toString(), 10);

        itemmmap.put(Items.IRON_HORSE_ARMOR.getRegistryName().toString(), 1000);
        itemmmap.put(Items.GOLDEN_HORSE_ARMOR.getRegistryName().toString(), 10000);
        itemmmap.put(Items.DIAMOND_HORSE_ARMOR.getRegistryName().toString(), 20000);
        itemmmap.put("record", 500);

        //食べ物 BLOCK
        itemmmap.put(Blocks.CAKE.getRegistryName().toString(), -1);//ブロックのケーキ
        itemmmap.put(Blocks.COCOA.getRegistryName().toString(), -1);//ブロック状態のカカオ
        itemmmap.put(Blocks.CARROTS.getRegistryName().toString(), -1);//にんじん
        itemmmap.put(Blocks.POTATOES.getRegistryName().toString(), -1);//じゃがいも

        //食べ物 ITEM
        itemmmap.put(Items.APPLE.getRegistryName().toString(), 14);
        itemmmap.put(Items.MUSHROOM_STEW.getRegistryName().toString(), 50);
        itemmmap.put(Items.PORKCHOP.getRegistryName().toString(), 20);
        itemmmap.put(Items.COOKED_PORKCHOP.getRegistryName().toString(), 28);
        itemmmap.put(Items.GOLDEN_APPLE.getRegistryName().toString(), 4000);
        itemmmap.put(Items.ENCHANTED_GOLDEN_APPLE.getRegistryName().toString(), 36000);

       itemmmap.put(Items.COD.getRegistryName().toString(), 62);
       itemmmap.put(Items.SALMON.getRegistryName().toString(), 272);//さけ
       itemmmap.put(Items.TROPICAL_FISH.getRegistryName().toString(), 160);//くまのみ
       itemmmap.put(Items.PUFFERFISH.getRegistryName().toString(), 104);//ふぐ
       itemmmap.put(Items.COOKED_SALMON.getRegistryName().toString(), 70);
       itemmmap.put(Items.COOKED_COD.getRegistryName().toString(), 296);


        itemmmap.put(Items.CAKE.getRegistryName().toString(), 640);
        itemmmap.put(Items.COOKIE.getRegistryName().toString(), 22);
        itemmmap.put(Items.MELON.getRegistryName().toString(), 1);
        itemmmap.put(Items.BEEF.getRegistryName().toString(), 90);
        itemmmap.put(Items.COOKED_BEEF.getRegistryName().toString(), 100);
        itemmmap.put(Items.CHICKEN.getRegistryName().toString(), 40);
        itemmmap.put(Items.COOKED_CHICKEN.getRegistryName().toString(), 50);
        itemmmap.put(Items.ROTTEN_FLESH.getRegistryName().toString(), 0);
        itemmmap.put(Items.SPIDER_EYE.getRegistryName().toString(), 1);
        itemmmap.put(Items.CARROT.getRegistryName().toString(), 16);
        itemmmap.put(Items.POTATO.getRegistryName().toString(), 12);
        itemmmap.put(Items.BAKED_POTATO.getRegistryName().toString(), 24);
        itemmmap.put(Items.POISONOUS_POTATO.getRegistryName().toString(), 0);
        itemmmap.put(Items.GOLDEN_CARROT.getRegistryName().toString(), 650);
        itemmmap.put(Items.PUMPKIN_PIE.getRegistryName().toString(), 128);
        itemmmap.put(Items.RABBIT.getRegistryName().toString(), 24);
        itemmmap.put(Items.COOKED_RABBIT.getRegistryName().toString(), 36);
        itemmmap.put(Items.RABBIT_STEW.getRegistryName().toString(), 188);
        itemmmap.put(Items.MUTTON.getRegistryName().toString(), 50);
        itemmmap.put(Items.COOKED_MUTTON.getRegistryName().toString(), 60);
        itemmmap.put(Items.BEETROOT.getRegistryName().toString(), 40);
        itemmmap.put(Items.BEETROOT_SOUP.getRegistryName().toString(), 30);

        //道具 素材の金属の1/10
        itemmmap.put(Items.IRON_SHOVEL.getRegistryName().toString(), 50);
        itemmmap.put(Items.IRON_PICKAXE.getRegistryName().toString(), 150);
        itemmmap.put(Items.IRON_AXE.getRegistryName().toString(), 150);
        itemmmap.put(Items.FLINT_AND_STEEL.getRegistryName().toString(), 50);
        itemmmap.put(Items.WOODEN_SHOVEL.getRegistryName().toString(), 1);
        itemmmap.put(Items.WOODEN_PICKAXE.getRegistryName().toString(), 1);
        itemmmap.put(Items.WOODEN_AXE.getRegistryName().toString(), 1);
        itemmmap.put(Items.STONE_SHOVEL.getRegistryName().toString(), 2);
        itemmmap.put(Items.STONE_PICKAXE.getRegistryName().toString(), 2);
        itemmmap.put(Items.STONE_AXE.getRegistryName().toString(), 2);
        itemmmap.put(Items.DIAMOND_SHOVEL.getRegistryName().toString(), 1000);
        itemmmap.put(Items.DIAMOND_PICKAXE.getRegistryName().toString(), 3000);
        itemmmap.put(Items.DIAMOND_AXE.getRegistryName().toString(), 3000);
        itemmmap.put(Items.GOLDEN_SHOVEL.getRegistryName().toString(), 400);
        itemmmap.put(Items.GOLDEN_PICKAXE.getRegistryName().toString(), 1200);
        itemmmap.put(Items.GOLDEN_AXE.getRegistryName().toString(), 1200);
        itemmmap.put(Items.WOODEN_HOE.getRegistryName().toString(), 1);
        itemmmap.put(Items.STONE_HOE.getRegistryName().toString(), 2);
        itemmmap.put(Items.IRON_HOE.getRegistryName().toString(), 100);
        itemmmap.put(Items.DIAMOND_HOE.getRegistryName().toString(), 2000);
        itemmmap.put(Items.GOLDEN_HOE.getRegistryName().toString(), 800);
        itemmmap.put(Items.COMPASS.getRegistryName().toString(), 2100);
        itemmmap.put(Items.FISHING_ROD.getRegistryName().toString(), 30);
        itemmmap.put(Items.CLOCK.getRegistryName().toString(), 15000);
        itemmmap.put(Items.SHEARS.getRegistryName().toString(), 500);
        itemmmap.put(Items.LEAD.getRegistryName().toString(), 30);
        itemmmap.put(Items.NAME_TAG.getRegistryName().toString(), 60);

        //戦闘
        itemmmap.put(Items.BOW.getRegistryName().toString(), 20);
        itemmmap.put(Items.ARROW.getRegistryName().toString(), 1);
        itemmmap.put(Items.IRON_SWORD.getRegistryName().toString(), 100);
        itemmmap.put(Items.WOODEN_SWORD.getRegistryName().toString(), 1);
        itemmmap.put(Items.STONE_SWORD.getRegistryName().toString(), 2);
        itemmmap.put(Items.DIAMOND_SWORD.getRegistryName().toString(), 2000);
        itemmmap.put(Items.GOLDEN_SWORD.getRegistryName().toString(), 800);
        itemmmap.put(Items.LEATHER_HELMET.getRegistryName().toString(), 250);//革は素材の値段のまま
        itemmmap.put(Items.LEATHER_CHESTPLATE.getRegistryName().toString(), 400);
        itemmmap.put(Items.LEATHER_LEGGINGS.getRegistryName().toString(), 350);
        itemmmap.put(Items.LEATHER_BOOTS.getRegistryName().toString(), 200);
        itemmmap.put(Items.CHAINMAIL_HELMET.getRegistryName().toString(), -1);//MODで入手できるようにする場合は価格を設定する
        itemmmap.put(Items.CHAINMAIL_CHESTPLATE.getRegistryName().toString(), -1);
        itemmmap.put(Items.CHAINMAIL_LEGGINGS.getRegistryName().toString(), -1);
        itemmmap.put(Items.CHAINMAIL_BOOTS.getRegistryName().toString(), -1);
        itemmmap.put(Items.IRON_HELMET.getRegistryName().toString(), 250);
        itemmmap.put(Items.IRON_CHESTPLATE.getRegistryName().toString(), 400);
        itemmmap.put(Items.IRON_LEGGINGS.getRegistryName().toString(), 350);
        itemmmap.put(Items.IRON_BOOTS.getRegistryName().toString(), 200);
        itemmmap.put(Items.DIAMOND_HELMET.getRegistryName().toString(), 5000);
        itemmmap.put(Items.DIAMOND_CHESTPLATE.getRegistryName().toString(), 8000);
        itemmmap.put(Items.DIAMOND_LEGGINGS.getRegistryName().toString(), 7000);
        itemmmap.put(Items.DIAMOND_BOOTS.getRegistryName().toString(), 4000);
        itemmmap.put(Items.GOLDEN_HELMET.getRegistryName().toString(), 2000);
        itemmmap.put(Items.GOLDEN_CHESTPLATE.getRegistryName().toString(), 6400);
        itemmmap.put(Items.GOLDEN_LEGGINGS.getRegistryName().toString(), 5600);
        itemmmap.put(Items.GOLDEN_BOOTS.getRegistryName().toString(), 3200);
        itemmmap.put(Items.ENCHANTED_BOOK.getRegistryName().toString(), 30);
        itemmmap.put(Items.SHIELD.getRegistryName().toString(), 600);

        //ポーション BLOCK
        itemmmap.put(Blocks.BREWING_STAND.getRegistryName().toString(), -1);//ブロック状態のスタンド
        itemmmap.put(Blocks.CAULDRON.getRegistryName().toString(), -1);//ブロック状態の釜
        //ポーション ITEM
        itemmmap.put(Items.GHAST_TEAR.getRegistryName().toString(), 5);
        itemmmap.put(Items.POTION.getRegistryName().toString(), 1);//ポーションはまた今度
        itemmmap.put(Items.GLASS_BOTTLE.getRegistryName().toString(), 10);
        itemmmap.put(Items.FERMENTED_SPIDER_EYE.getRegistryName().toString(), 1);
        itemmmap.put(Items.BLAZE_POWDER.getRegistryName().toString(), 2);
        itemmmap.put(Items.MAGMA_CREAM.getRegistryName().toString(), 5);
        itemmmap.put(Items.BREWING_STAND.getRegistryName().toString(), 50);
        itemmmap.put(Items.CAULDRON.getRegistryName().toString(), 50);
        itemmmap.put(Items.BREWING_STAND.getRegistryName().toString(), 3500);
        itemmmap.put(Items.GLISTERING_MELON_SLICE.getRegistryName().toString(), 650);
        itemmmap.put(Items.RABBIT_FOOT.getRegistryName().toString(), 320);

        //材料
        itemmmap.put(Items.COAL.getRegistryName().toString(), 50);
        itemmmap.put(Items.CHARCOAL.getRegistryName().toString(), 10);//木炭
        itemmmap.put(Items.DIAMOND.getRegistryName().toString(), 10000);
        itemmmap.put(Items.IRON_INGOT.getRegistryName().toString(), 500);
        itemmmap.put(Items.GOLD_INGOT.getRegistryName().toString(), 4000);
        itemmmap.put(Items.STICK.getRegistryName().toString(), 2);
        itemmmap.put(Items.BOWL.getRegistryName().toString(), 3);
        itemmmap.put(Items.STRING.getRegistryName().toString(), 4);
        itemmmap.put(Items.FEATHER.getRegistryName().toString(), 1);
        itemmmap.put(Items.GUNPOWDER.getRegistryName().toString(), 4);
        itemmmap.put(Items.WHEAT_SEEDS.getRegistryName().toString(), 1);
        itemmmap.put(Items.WHEAT.getRegistryName().toString(), 20);
        itemmmap.put(Items.BREAD.getRegistryName().toString(), 80);
        itemmmap.put(Items.FLINT.getRegistryName().toString(), 3);
        itemmmap.put(Items.LEATHER.getRegistryName().toString(), 50);
        itemmmap.put(Items.BRICK.getRegistryName().toString(), 50);
        itemmmap.put(Items.CLAY_BALL.getRegistryName().toString(), 30);
        itemmmap.put(Items.LEAD.getRegistryName().toString(), 10);
        itemmmap.put(Items.EGG.getRegistryName().toString(), 3);
        itemmmap.put(Items.GLOWSTONE_DUST.getRegistryName().toString(), 100);

        itemmmap.put(Items.WHITE_DYE.getRegistryName().toString(), 5);
        itemmmap.put(Items.ORANGE_DYE.getRegistryName().toString(), 5);
        itemmmap.put(Items.MAGENTA_DYE.getRegistryName().toString(), 5);
        itemmmap.put(Items.LIGHT_BLUE_DYE.getRegistryName().toString(), 5);
        itemmmap.put(Items.CYAN_DYE.getRegistryName().toString(), 5);
        itemmmap.put(Items.PURPLE_DYE.getRegistryName().toString(), 5);
        itemmmap.put(Items.BLUE_DYE.getRegistryName().toString(), 5);
        itemmmap.put(Items.BROWN_DYE.getRegistryName().toString(), 5);
        itemmmap.put(Items.GREEN_DYE.getRegistryName().toString(), 5);
        itemmmap.put(Items.RED_DYE.getRegistryName().toString(), 5);
        itemmmap.put(Items.COBWEB.getRegistryName().toString(), 40);
        itemmmap.put(Items.LIGHT_GRAY_DYE.getRegistryName().toString(), 5);//骨
        itemmmap.put(Items.YELLOW_DYE.getRegistryName().toString(), 5);//骨
        itemmmap.put(Items.PINK_DYE.getRegistryName().toString(), 5);//骨
        itemmmap.put(Items.LIME_DYE.getRegistryName().toString(), 5);//骨
        itemmmap.put(Items.GRAY_DYE.getRegistryName().toString(), 5);//骨
        itemmmap.put(Items.BLACK_DYE.getRegistryName().toString(), 5);//骨

        itemmmap.put(Items.SUGAR.getRegistryName().toString(), 10);
        itemmmap.put(Items.PUMPKIN_SEEDS.getRegistryName().toString(), 2);
        itemmmap.put(Items.MELON_SEEDS.getRegistryName().toString(), 2);
        itemmmap.put(Items.BLAZE_ROD.getRegistryName().toString(), 10);
        itemmmap.put(Items.GOLD_NUGGET.getRegistryName().toString(), 440);
        itemmmap.put(Items.NETHER_WART.getRegistryName().toString(), 10);
        itemmmap.put(Items.EMERALD.getRegistryName().toString(), 300);
        itemmmap.put(Items.NETHER_STAR.getRegistryName().toString(), 8000);
        itemmmap.put(Items.NETHER_BRICK.getRegistryName().toString(), 20);
        itemmmap.put(Items.QUARTZ.getRegistryName().toString(), 300);
        itemmmap.put(Items.PRISMARINE_SHARD.getRegistryName().toString(), 5);
        itemmmap.put(Items.PRISMARINE_CRYSTALS.getRegistryName().toString(), 20);
        itemmmap.put(Items.RABBIT_HIDE.getRegistryName().toString(), 10);
        itemmmap.put(Items.CHORUS_FRUIT.getRegistryName().toString(), 4);
        itemmmap.put(Items.POPPED_CHORUS_FRUIT.getRegistryName().toString(), 1);
        /**
         * 1.13
         */
        itemmmap.put(Items.BLUE_ICE.getRegistryName().toString(), 150);
        itemmmap.put(Items.CONDUIT.getRegistryName().toString(), 150000);
        itemmmap.put(Items.HEART_OF_THE_SEA.getRegistryName().toString(), 100000);
        itemmmap.put(Items.TUBE_CORAL.getRegistryName().toString(), 300);
        itemmmap.put(Items.BRAIN_CORAL.getRegistryName().toString(), 300);
        itemmmap.put(Items.BUBBLE_CORAL.getRegistryName().toString(), 300);
        itemmmap.put(Items.FIRE_CORAL.getRegistryName().toString(), 300);
        itemmmap.put(Items.HORN_CORAL.getRegistryName().toString(), 300);
        itemmmap.put(Items.DEAD_TUBE_CORAL.getRegistryName().toString(), 10);
        itemmmap.put(Items.DEAD_BRAIN_CORAL.getRegistryName().toString(), 10);
        itemmmap.put(Items.DEAD_BUBBLE_CORAL.getRegistryName().toString(), 10);
        itemmmap.put(Items.DEAD_FIRE_CORAL.getRegistryName().toString(), 10);
        itemmmap.put(Items.DEAD_HORN_CORAL.getRegistryName().toString(), 10);
        itemmmap.put(Items.TUBE_CORAL_FAN.getRegistryName().toString(), 250);
        itemmmap.put(Items.BRAIN_CORAL_FAN.getRegistryName().toString(), 250);
        itemmmap.put(Items.BUBBLE_CORAL_FAN.getRegistryName().toString(), 250);
        itemmmap.put(Items.FIRE_CORAL_FAN.getRegistryName().toString(), 250);
        itemmmap.put(Items.HORN_CORAL_FAN.getRegistryName().toString(), 250);

        itemmmap.put(Blocks.TUBE_CORAL_WALL_FAN.getRegistryName().toString(), 250);
        itemmmap.put(Blocks.BRAIN_CORAL_WALL_FAN.getRegistryName().toString(), 250);
        itemmmap.put(Blocks.BUBBLE_CORAL_WALL_FAN.getRegistryName().toString(), 250);
        itemmmap.put(Blocks.FIRE_CORAL_WALL_FAN.getRegistryName().toString(), 250);
        itemmmap.put(Blocks.HORN_CORAL_WALL_FAN.getRegistryName().toString(), 250);

        itemmmap.put(Blocks.DEAD_TUBE_CORAL_WALL_FAN.getRegistryName().toString(), 10);
        itemmmap.put(Blocks.DEAD_BRAIN_CORAL_WALL_FAN.getRegistryName().toString(), 10);
        itemmmap.put(Blocks.DEAD_BUBBLE_CORAL_WALL_FAN.getRegistryName().toString(), 10);
        itemmmap.put(Blocks.DEAD_FIRE_CORAL_WALL_FAN.getRegistryName().toString(), 10);
        itemmmap.put(Blocks.DEAD_HORN_CORAL_WALL_FAN.getRegistryName().toString(), 10);

        itemmmap.put(Items.TUBE_CORAL_BLOCK.getRegistryName().toString(), 500);
        itemmmap.put(Items.BRAIN_CORAL_BLOCK.getRegistryName().toString(), 500);
        itemmmap.put(Items.BUBBLE_CORAL_BLOCK.getRegistryName().toString(), 500);
        itemmmap.put(Items.FIRE_CORAL_BLOCK.getRegistryName().toString(), 500);
        itemmmap.put(Items.HORN_CORAL_BLOCK.getRegistryName().toString(), 500);

        itemmmap.put(Items.KELP.getRegistryName().toString(), 5);
        itemmmap.put(Blocks.KELP_PLANT.getRegistryName().toString(), 10);
        itemmmap.put(Items.DRIED_KELP_BLOCK.getRegistryName().toString(), 30);
        itemmmap.put(Items.DRIED_KELP.getRegistryName().toString(),300);
        itemmmap.put(Items.SEAGRASS.getRegistryName().toString(), 30);
        itemmmap.put(Blocks.TALL_SEAGRASS.getRegistryName().toString(), 30);
        itemmmap.put(Items.SEA_PICKLE.getRegistryName().toString(), 50);
        itemmmap.put(Items.TURTLE_EGG.getRegistryName().toString(), 3000);

        itemmmap.put(Items.PRISMARINE_SLAB.getRegistryName().toString(), 10);
        itemmmap.put(Items.PRISMARINE_BRICK_SLAB.getRegistryName().toString(), 25);
        itemmmap.put(Items.DARK_PRISMARINE_SLAB.getRegistryName().toString(), 30);

        itemmmap.put(Items.PRISMARINE_STAIRS.getRegistryName().toString(), 10);
        itemmmap.put(Items.PRISMARINE_BRICK_STAIRS.getRegistryName().toString(), 10);
        itemmmap.put(Items.DARK_PRISMARINE_STAIRS.getRegistryName().toString(), 10);

        itemmmap.put(Items.OAK_WOOD.getRegistryName().toString(), 15);
        itemmmap.put(Items.SPRUCE_WOOD.getRegistryName().toString(), 15);
        itemmmap.put(Items.BIRCH_WOOD.getRegistryName().toString(), 15);
        itemmmap.put(Items.JUNGLE_WOOD.getRegistryName().toString(), 15);
        itemmmap.put(Items.ACACIA_WOOD.getRegistryName().toString(), 15);
        itemmmap.put(Items.DARK_OAK_WOOD.getRegistryName().toString(), 15);
        itemmmap.put(Items.CRIMSON_HYPHAE.getRegistryName().toString(), 15);
        itemmmap.put(Items.WARPED_HYPHAE.getRegistryName().toString(), 15);

        itemmmap.put(Items.STRIPPED_OAK_WOOD.getRegistryName().toString(), 40);
        itemmmap.put(Items.STRIPPED_SPRUCE_WOOD.getRegistryName().toString(), 40);
        itemmmap.put(Items.STRIPPED_BIRCH_WOOD.getRegistryName().toString(), 40);
        itemmmap.put(Items.STRIPPED_JUNGLE_WOOD.getRegistryName().toString(), 40);
        itemmmap.put(Items.STRIPPED_ACACIA_WOOD.getRegistryName().toString(), 40);
        itemmmap.put(Items.STRIPPED_DARK_OAK_WOOD.getRegistryName().toString(), 40);
        itemmmap.put(Items.STRIPPED_CRIMSON_HYPHAE.getRegistryName().toString(), 40);
        itemmmap.put(Items.STRIPPED_WARPED_HYPHAE.getRegistryName().toString(), 40);

        itemmmap.put(Items.STRIPPED_OAK_LOG.getRegistryName().toString(), 20);
        itemmmap.put(Items.STRIPPED_SPRUCE_LOG.getRegistryName().toString(), 20);
        itemmmap.put(Items.STRIPPED_BIRCH_LOG.getRegistryName().toString(), 20);
        itemmmap.put(Items.STRIPPED_JUNGLE_LOG.getRegistryName().toString(), 20);
        itemmmap.put(Items.STRIPPED_ACACIA_LOG.getRegistryName().toString(), 20);
        itemmmap.put(Items.STRIPPED_DARK_OAK_LOG.getRegistryName().toString(), 20);
        itemmmap.put(Items.STRIPPED_CRIMSON_STEM.getRegistryName().toString(), 20);
        itemmmap.put(Items.STRIPPED_WARPED_STEM.getRegistryName().toString(), 20);

        itemmmap.put(Items.OAK_BUTTON.getRegistryName().toString(), 5);
        itemmmap.put(Items.SPRUCE_BUTTON.getRegistryName().toString(), 5);
        itemmmap.put(Items.BIRCH_BUTTON.getRegistryName().toString(), 5);
        itemmmap.put(Items.JUNGLE_BUTTON.getRegistryName().toString(), 5);
        itemmmap.put(Items.ACACIA_BUTTON.getRegistryName().toString(), 5);
        itemmmap.put(Items.DARK_OAK_BUTTON.getRegistryName().toString(), 5);
        itemmmap.put(Items.CRIMSON_BUTTON.getRegistryName().toString(), 5);
        itemmmap.put(Items.WARPED_BUTTON.getRegistryName().toString(), 5);
        itemmmap.put(Items.POLISHED_BLACKSTONE_BUTTON.getRegistryName().toString(), 5);

        itemmmap.put(Items.PUMPKIN.getRegistryName().toString(), 70);
        itemmmap.put(Items.SHULKER_SHELL.getRegistryName().toString(), 2000);

        itemmmap.put(Items.SHULKER_BOX.getRegistryName().toString(), 5000);
        itemmmap.put(Items.WHITE_SHULKER_BOX.getRegistryName().toString(), 5000);
        itemmmap.put(Items.ORANGE_SHULKER_BOX.getRegistryName().toString(), 5000);
        itemmmap.put(Items.MAGENTA_SHULKER_BOX.getRegistryName().toString(), 5000);
        itemmmap.put(Items.LIGHT_BLUE_SHULKER_BOX.getRegistryName().toString(), 5000);
        itemmmap.put(Items.CYAN_SHULKER_BOX.getRegistryName().toString(), 5000);
        itemmmap.put(Items.PURPLE_SHULKER_BOX.getRegistryName().toString(), 5000);
        itemmmap.put(Items.BLUE_SHULKER_BOX.getRegistryName().toString(), 5000);
        itemmmap.put(Items.BROWN_SHULKER_BOX.getRegistryName().toString(), 5000);
        itemmmap.put(Items.GREEN_SHULKER_BOX.getRegistryName().toString(), 5000);
        itemmmap.put(Items.RED_SHULKER_BOX.getRegistryName().toString(), 5000);
        itemmmap.put(Items.LIGHT_GRAY_SHULKER_BOX.getRegistryName().toString(), 5000);//骨
        itemmmap.put(Items.YELLOW_SHULKER_BOX.getRegistryName().toString(), 5000);//骨
        itemmmap.put(Items.PINK_SHULKER_BOX.getRegistryName().toString(), 5000);//骨
        itemmmap.put(Items.LIME_SHULKER_BOX.getRegistryName().toString(), 5000);//骨
        itemmmap.put(Items.GRAY_SHULKER_BOX.getRegistryName().toString(), 5000);//骨
        itemmmap.put(Items.BLACK_SHULKER_BOX.getRegistryName().toString(), 5000);//骨

        itemmmap.put(Items.SMOOTH_STONE.getRegistryName().toString(), 5);

        /**
         * 1.14
         */
        itemmmap.put(Items.BAMBOO.getRegistryName().toString(), 20);
        itemmmap.put(Blocks.BAMBOO_SAPLING.getRegistryName().toString(), 20);
        itemmmap.put(Items.SCAFFOLDING.getRegistryName().toString(), 25);
        itemmmap.put(Items.CORNFLOWER.getRegistryName().toString(), 20);
        itemmmap.put(Items.LILY_OF_THE_VALLEY.getRegistryName().toString(), 20);
        itemmmap.put(Items.WITHER_ROSE.getRegistryName().toString(), 500);
        itemmmap.put(Items.SWEET_BERRIES.getRegistryName().toString(), 30);
        itemmmap.put(Blocks.SWEET_BERRY_BUSH.getRegistryName().toString(), 100);
        itemmmap.put(Items.BARREL.getRegistryName().toString(), 50);

        itemmmap.put(Items.BLAST_FURNACE.getRegistryName().toString(), 2750);
        itemmmap.put(Items.SMOKER.getRegistryName().toString(), 75);
        itemmmap.put(Items.LOOM.getRegistryName().toString(), 50);
        itemmmap.put(Items.CARTOGRAPHY_TABLE.getRegistryName().toString(), 50);
        itemmmap.put(Items.FLETCHING_TABLE.getRegistryName().toString(), 100);
        itemmmap.put(Items.SMITHING_TABLE.getRegistryName().toString(), 1100);

        itemmmap.put(Items.COMPOSTER.getRegistryName().toString(), 30);
        itemmmap.put(Items.LECTERN.getRegistryName().toString(), 600);
        itemmmap.put(Items.GRINDSTONE.getRegistryName().toString(), 50);
        itemmmap.put(Items.STONECUTTER.getRegistryName().toString(), 600);
        itemmmap.put(Items.BELL.getRegistryName().toString(), 5000);
        itemmmap.put(Items.CAMPFIRE.getRegistryName().toString(), 150);
        itemmmap.put(Items.LANTERN.getRegistryName().toString(), 500);
        itemmmap.put(Items.STONE_STAIRS.getRegistryName().toString(), 10);
        itemmmap.put(Items.STONE_SLAB.getRegistryName().toString(), 5);
        itemmmap.put(Items.MOSSY_COBBLESTONE_SLAB.getRegistryName().toString(), 15);
        itemmmap.put(Items.MOSSY_STONE_BRICK_SLAB.getRegistryName().toString(), 20);

        itemmmap.put(Items.ANDESITE_SLAB.getRegistryName().toString(), 5);
        itemmmap.put(Items.GRANITE_SLAB.getRegistryName().toString(), 5);
        itemmmap.put(Items.DIORITE_SLAB.getRegistryName().toString(), 5);
        itemmmap.put(Items.POLISHED_ANDESITE_SLAB.getRegistryName().toString(), 10);
        itemmmap.put(Items.POLISHED_GRANITE_SLAB.getRegistryName().toString(), 10);
        itemmmap.put(Items.POLISHED_DIORITE_SLAB.getRegistryName().toString(), 10);

        itemmmap.put(Items.SMOOTH_RED_SANDSTONE_SLAB.getRegistryName().toString(), 5);
        itemmmap.put(Items.SMOOTH_SANDSTONE_SLAB.getRegistryName().toString(), 5);
        itemmmap.put(Items.RED_NETHER_BRICK_SLAB.getRegistryName().toString(), 10);
        itemmmap.put(Items.SMOOTH_QUARTZ_SLAB.getRegistryName().toString(), 700);
        itemmmap.put(Items.END_STONE_BRICK_SLAB.getRegistryName().toString(), 20);
        itemmmap.put(Items.MOSSY_COBBLESTONE_STAIRS.getRegistryName().toString(), 5);
        itemmmap.put(Items.MOSSY_STONE_BRICK_STAIRS.getRegistryName().toString(), 5);
        itemmmap.put(Items.ANDESITE_STAIRS.getRegistryName().toString(), 5);
        itemmmap.put(Items.GRANITE_STAIRS.getRegistryName().toString(), 5);
        itemmmap.put(Items.DIORITE_STAIRS.getRegistryName().toString(), 5);
        itemmmap.put(Items.POLISHED_ANDESITE_STAIRS.getRegistryName().toString(), 10);
        itemmmap.put(Items.POLISHED_GRANITE_STAIRS.getRegistryName().toString(), 10);
        itemmmap.put(Items.POLISHED_DIORITE_STAIRS.getRegistryName().toString(), 10);
        itemmmap.put(Items.SMOOTH_RED_SANDSTONE_STAIRS.getRegistryName().toString(), 5);
        itemmmap.put(Items.SMOOTH_SANDSTONE_STAIRS.getRegistryName().toString(), 5);
        itemmmap.put(Items.RED_NETHER_BRICK_STAIRS.getRegistryName().toString(), 25);
        itemmmap.put(Items.SMOOTH_QUARTZ_STAIRS.getRegistryName().toString(), 1500);
        itemmmap.put(Items.END_STONE_BRICK_STAIRS.getRegistryName().toString(), 12);

        itemmmap.put(Items.STONE_BRICK_WALL.getRegistryName().toString(), 2);
        itemmmap.put(Items.MOSSY_STONE_BRICK_WALL.getRegistryName().toString(), 2);
        itemmmap.put(Items.DIORITE_WALL.getRegistryName().toString(), 2);
        itemmmap.put(Items.GRANITE_WALL.getRegistryName().toString(), 2);
        itemmmap.put(Items.ANDESITE_WALL.getRegistryName().toString(), 2);
        itemmmap.put(Items.SANDSTONE_WALL.getRegistryName().toString(), 2);
        itemmmap.put(Items.PRISMARINE_WALL.getRegistryName().toString(), 2);
        itemmmap.put(Items.NETHER_BRICK_WALL.getRegistryName().toString(), 2);
        itemmmap.put(Items.RED_NETHER_BRICK_WALL.getRegistryName().toString(), 2);
        itemmmap.put(Items.END_STONE_BRICK_WALL.getRegistryName().toString(), 2);

        /**
         * 1.15
         */
        itemmmap.put(Items.BEE_NEST.getRegistryName().toString(), 5000);
        itemmmap.put(Items.BEEHIVE.getRegistryName().toString(), 1000);
        itemmmap.put(Items.HONEY_BOTTLE.getRegistryName().toString(), 300);
        itemmmap.put(Items.HONEY_BLOCK.getRegistryName().toString(), 1500);
        itemmmap.put(Items.HONEYCOMB.getRegistryName().toString(), 300);
        itemmmap.put(Items.HONEYCOMB_BLOCK.getRegistryName().toString(), 1500);


        /**
         * 1.16
         */
        itemmmap.put(Items.ANCIENT_DEBRIS.getRegistryName().toString(), 50000);
        itemmmap.put(Items.NETHERITE_SCRAP.getRegistryName().toString(), 50000);
        itemmmap.put(Items.NETHERITE_BLOCK.getRegistryName().toString(), 1944000);
        itemmmap.put(Items.NETHERITE_INGOT.getRegistryName().toString(), 216000);
        itemmmap.put(Items.LODESTONE.getRegistryName().toString(), 220000);
        itemmmap.put(Items.BASALT.getRegistryName().toString(), 50);
        itemmmap.put(Items.POLISHED_BASALT.getRegistryName().toString(), 1100);
        itemmmap.put(Items.SMOOTH_BASALT.getRegistryName().toString(), 75);
        itemmmap.put(Items.BLACKSTONE.getRegistryName().toString(), 50);
        itemmmap.put(Items.POLISHED_BLACKSTONE.getRegistryName().toString(), 75);
        itemmmap.put(Items.CHISELED_POLISHED_BLACKSTONE.getRegistryName().toString(), 100);
        itemmmap.put(Items.POLISHED_BLACKSTONE_BRICKS.getRegistryName().toString(), 100);
        itemmmap.put(Items.CRACKED_POLISHED_BLACKSTONE_BRICKS.getRegistryName().toString(), 100);
        itemmmap.put(Items.GILDED_BLACKSTONE.getRegistryName().toString(), 10000);
        itemmmap.put(Items.NETHER_GOLD_ORE.getRegistryName().toString(), 500);
        itemmmap.put(Items.CRACKED_NETHER_BRICKS.getRegistryName().toString(), 10);
        itemmmap.put(Items.CHISELED_NETHER_BRICKS.getRegistryName().toString(), 20);
        itemmmap.put(Items.QUARTZ_BRICKS.getRegistryName().toString(), 1500);

        itemmmap.put(Items.BLACKSTONE_STAIRS.getRegistryName().toString(), 10);
        itemmmap.put(Items.POLISHED_BLACKSTONE_STAIRS.getRegistryName().toString(), 10);
        itemmmap.put(Items.POLISHED_BLACKSTONE_BRICK_STAIRS.getRegistryName().toString(), 10);

        itemmmap.put(Items.BLACKSTONE_WALL.getRegistryName().toString(), 10);
        itemmmap.put(Items.POLISHED_BLACKSTONE_WALL.getRegistryName().toString(), 10);
        itemmmap.put(Items.POLISHED_BLACKSTONE_BRICK_WALL.getRegistryName().toString(), 10);

        itemmmap.put(Items.POLISHED_BLACKSTONE_BUTTON.getRegistryName().toString(), 5);
        itemmmap.put(Items.POLISHED_BLACKSTONE_PRESSURE_PLATE.getRegistryName().toString(), 10);

        itemmmap.put(Items.SHROOMLIGHT.getRegistryName().toString(), 1500);
        itemmmap.put(Items.WEEPING_VINES.getRegistryName().toString(), 5);
        itemmmap.put(Blocks.WEEPING_VINES_PLANT.getRegistryName().toString(), 5);

        itemmmap.put(Items.TWISTING_VINES.getRegistryName().toString(), 5);
        itemmmap.put(Blocks.TWISTING_VINES_PLANT.getRegistryName().toString(), 5);

        itemmmap.put(Items.NETHER_SPROUTS.getRegistryName().toString(), 5);

        itemmmap.put(Items.CRIMSON_ROOTS.getRegistryName().toString(), 5);
        itemmmap.put(Items.WARPED_ROOTS.getRegistryName().toString(), 5);

        itemmmap.put(Items.CRIMSON_FUNGUS.getRegistryName().toString(), 30);
        itemmmap.put(Items.WARPED_FUNGUS.getRegistryName().toString(), 30);

        itemmmap.put(Items.CRIMSON_NYLIUM.getRegistryName().toString(), 5);
        itemmmap.put(Items.WARPED_NYLIUM.getRegistryName().toString(), 5);

        itemmmap.put(Items.STRIPPED_WARPED_HYPHAE.getRegistryName().toString(), 30);
        itemmmap.put(Items.STRIPPED_CRIMSON_HYPHAE.getRegistryName().toString(), 30);

        itemmmap.put(Items.STRIPPED_CRIMSON_STEM.getRegistryName().toString(), 20);
        itemmmap.put(Items.STRIPPED_WARPED_STEM.getRegistryName().toString(), 20);
        itemmmap.put(Items.CRIMSON_PLANKS.getRegistryName().toString(), 8);
        itemmmap.put(Items.WARPED_PLANKS.getRegistryName().toString(), 8);

        itemmmap.put(Items.WARPED_SLAB.getRegistryName().toString(), 2);
        itemmmap.put(Items.CRIMSON_SLAB.getRegistryName().toString(), 2);

        itemmmap.put(Items.CRIMSON_STAIRS.getRegistryName().toString(), 10);
        itemmmap.put(Items.WARPED_STAIRS.getRegistryName().toString(), 10);
        itemmmap.put(Items.CRIMSON_FENCE.getRegistryName().toString(), 20);
        itemmmap.put(Items.WARPED_FENCE.getRegistryName().toString(), 20);

        itemmmap.put(Items.WARPED_FENCE_GATE.getRegistryName().toString(), 30);
        itemmmap.put(Items.CRIMSON_FENCE_GATE.getRegistryName().toString(), 30);

        itemmmap.put(Items.CRIMSON_DOOR.getRegistryName().toString(), 30);
        itemmmap.put(Items.WARPED_DOOR.getRegistryName().toString(), 30);

        itemmmap.put(Items.CRIMSON_TRAPDOOR.getRegistryName().toString(), 15);
        itemmmap.put(Items.WARPED_TRAPDOOR.getRegistryName().toString(), 15);

        itemmmap.put(Items.WARPED_BUTTON.getRegistryName().toString(), 5);
        itemmmap.put(Items.CRIMSON_BUTTON.getRegistryName().toString(), 5);

        itemmmap.put(Items.CRIMSON_PRESSURE_PLATE.getRegistryName().toString(), 10);
        itemmmap.put(Items.WARPED_PRESSURE_PLATE.getRegistryName().toString(), 10);

        itemmmap.put(Items.CRYING_OBSIDIAN.getRegistryName().toString(), 5000);
        itemmmap.put(Items.RESPAWN_ANCHOR.getRegistryName().toString(), 32500);
        itemmmap.put(Items.SOUL_SOIL.getRegistryName().toString(), 10);
        itemmmap.put(Blocks.SOUL_FIRE.getRegistryName().toString(), 0);
        itemmmap.put(Items.SOUL_TORCH.getRegistryName().toString(), 20);
        itemmmap.put(Items.SOUL_CAMPFIRE.getRegistryName().toString(), 200);
        itemmmap.put(Items.SOUL_LANTERN.getRegistryName().toString(), 500);
        itemmmap.put(Items.CHAIN.getRegistryName().toString(), 700);
        itemmmap.put(Items.TARGET.getRegistryName().toString(), 777);

        /**
         * 1.17
         */
        itemmmap.put(Items.SMALL_AMETHYST_BUD.getRegistryName().toString(), 250);
        itemmmap.put(Items.MEDIUM_AMETHYST_BUD.getRegistryName().toString(), 500);
        itemmmap.put(Items.LARGE_AMETHYST_BUD.getRegistryName().toString(), 1000);
        itemmmap.put(Items.AMETHYST_CLUSTER.getRegistryName().toString(), 2000);
        itemmmap.put(Items.BUDDING_AMETHYST.getRegistryName().toString(), 10000);
        itemmmap.put(Items.AMETHYST_SHARD.getRegistryName().toString(), 2000);
        itemmmap.put(Items.AMETHYST_BLOCK.getRegistryName().toString(), 10000);
        itemmmap.put(Items.POINTED_DRIPSTONE.getRegistryName().toString(), 1000);
        itemmmap.put(Items.DRIPSTONE_BLOCK.getRegistryName().toString(), 4000);
        itemmmap.put(Items.CALCITE.getRegistryName().toString(), 1000);
        itemmmap.put(Items.SMOOTH_BASALT.getRegistryName().toString(), 50);
        itemmmap.put(Items.TUFF.getRegistryName().toString(), 10);
        itemmmap.put(Blocks.CAVE_VINES.getRegistryName().toString(), 5);
        itemmmap.put(Blocks.CAVE_VINES_PLANT.getRegistryName().toString(), 5);
        itemmmap.put(Items.GLOW_BERRIES.getRegistryName().toString(), 100);
        itemmmap.put(Items.AZALEA.getRegistryName().toString(), 50);
        itemmmap.put(Items.FLOWERING_AZALEA.getRegistryName().toString(), 100);
        itemmmap.put(Items.AZALEA_LEAVES.getRegistryName().toString(), 100);
        itemmmap.put(Items.FLOWERING_AZALEA_LEAVES.getRegistryName().toString(), 100);
        itemmmap.put(Items.HANGING_ROOTS.getRegistryName().toString(), 50);
        itemmmap.put(Items.SPORE_BLOSSOM.getRegistryName().toString(), 500);
        itemmmap.put(Items.SMALL_DRIPLEAF.getRegistryName().toString(), 500);
        itemmmap.put(Items.BIG_DRIPLEAF.getRegistryName().toString(), 500);
        itemmmap.put(Blocks.BIG_DRIPLEAF_STEM.getRegistryName().toString(), 0);
        itemmmap.put(Items.MOSS_BLOCK.getRegistryName().toString(), 20);
        itemmmap.put(Items.MOSS_CARPET.getRegistryName().toString(), 60);
        itemmmap.put(Items.TINTED_GLASS.getRegistryName().toString(), 5000);

        itemmmap.put(Items.COPPER_ORE.getRegistryName().toString(), 50);
        itemmmap.put(Items.COPPER_INGOT.getRegistryName().toString(), 250);
        itemmmap.put(Items.DEEPSLATE_COPPER_ORE.getRegistryName().toString(), 50);

        itemmmap.put(Items.COPPER_BLOCK.getRegistryName().toString(), 2500);

        itemmmap.put(Items.EXPOSED_COPPER.getRegistryName().toString(), 2000);
        itemmmap.put(Items.WEATHERED_COPPER.getRegistryName().toString(), 2000);
        itemmmap.put(Items.OXIDIZED_COPPER.getRegistryName().toString(), 3000);

        itemmmap.put(Items.CUT_COPPER.getRegistryName().toString(), 3000);
        itemmmap.put(Items.EXPOSED_CUT_COPPER.getRegistryName().toString(), 2500);
        itemmmap.put(Items.WEATHERED_CUT_COPPER.getRegistryName().toString(), 2500);
        itemmmap.put(Items.OXIDIZED_CUT_COPPER.getRegistryName().toString(), 3500);

        itemmmap.put(Items.WAXED_COPPER_BLOCK.getRegistryName().toString(), 3000);
        itemmmap.put(Items.WAXED_EXPOSED_COPPER.getRegistryName().toString(), 2500);
        itemmmap.put(Items.WAXED_WEATHERED_COPPER.getRegistryName().toString(), 2500);
        itemmmap.put(Items.WAXED_OXIDIZED_COPPER.getRegistryName().toString(), 3500);
        itemmmap.put(Items.WAXED_CUT_COPPER.getRegistryName().toString(), 4000);
        itemmmap.put(Items.WAXED_EXPOSED_CUT_COPPER.getRegistryName().toString(), 3500);
        itemmmap.put(Items.WAXED_WEATHERED_CUT_COPPER.getRegistryName().toString(), 3500);
        itemmmap.put(Items.WAXED_OXIDIZED_CUT_COPPER.getRegistryName().toString(), 4500);

        itemmmap.put(Items.CUT_COPPER_SLAB.getRegistryName().toString(), 300);
        itemmmap.put(Items.EXPOSED_CUT_COPPER_SLAB.getRegistryName().toString(), 300);
        itemmmap.put(Items.WEATHERED_CUT_COPPER_SLAB.getRegistryName().toString(), 300);
        itemmmap.put(Items.OXIDIZED_CUT_COPPER_SLAB.getRegistryName().toString(), 300);
        itemmmap.put(Items.WAXED_CUT_COPPER_SLAB.getRegistryName().toString(), 300);
        itemmmap.put(Items.WAXED_EXPOSED_CUT_COPPER_SLAB.getRegistryName().toString(), 300);
        itemmmap.put(Items.WAXED_WEATHERED_CUT_COPPER_SLAB.getRegistryName().toString(), 300);
        itemmmap.put(Items.WAXED_OXIDIZED_CUT_COPPER_SLAB.getRegistryName().toString(), 300);
        itemmmap.put(Items.CUT_COPPER_STAIRS.getRegistryName().toString(), 2500);
        itemmmap.put(Items.EXPOSED_CUT_COPPER_STAIRS.getRegistryName().toString(), 2500);
        itemmmap.put(Items.WEATHERED_CUT_COPPER_STAIRS.getRegistryName().toString(), 2500);
        itemmmap.put(Items.OXIDIZED_CUT_COPPER_STAIRS.getRegistryName().toString(), 2500);
        itemmmap.put(Items.WAXED_CUT_COPPER_STAIRS.getRegistryName().toString(), 2500);
        itemmmap.put(Items.WAXED_EXPOSED_CUT_COPPER_STAIRS.getRegistryName().toString(), 2500);
        itemmmap.put(Items.WAXED_WEATHERED_CUT_COPPER_STAIRS.getRegistryName().toString(), 2500);
        itemmmap.put(Items.WAXED_OXIDIZED_CUT_COPPER_STAIRS.getRegistryName().toString(), 2500);

        itemmmap.put(Items.LIGHTNING_ROD.getRegistryName().toString(), 1000);
        itemmmap.put(Items.SCULK_SENSOR.getRegistryName().toString(), 5000);

        itemmmap.put(Items.CANDLE.getRegistryName().toString(), 100);
        itemmmap.put(Items.WHITE_CANDLE.getRegistryName().toString(), 100);
        itemmmap.put(Items.ORANGE_CANDLE.getRegistryName().toString(), 100);
        itemmmap.put(Items.MAGENTA_CANDLE.getRegistryName().toString(), 100);
        itemmmap.put(Items.LIGHT_BLUE_CANDLE.getRegistryName().toString(), 100);
        itemmmap.put(Items.YELLOW_CANDLE.getRegistryName().toString(), 100);
        itemmmap.put(Items.LIME_CANDLE.getRegistryName().toString(), 100);
        itemmmap.put(Items.PINK_CANDLE.getRegistryName().toString(), 100);
        itemmmap.put(Items.GRAY_CANDLE.getRegistryName().toString(), 100);
        itemmmap.put(Items.LIGHT_GRAY_CANDLE.getRegistryName().toString(), 100);
        itemmmap.put(Items.CYAN_CANDLE.getRegistryName().toString(), 100);
        itemmmap.put(Items.PURPLE_CANDLE.getRegistryName().toString(), 100);
        itemmmap.put(Items.BLUE_CANDLE.getRegistryName().toString(), 100);
        itemmmap.put(Items.BROWN_CANDLE.getRegistryName().toString(), 100);
        itemmmap.put(Items.GREEN_CANDLE.getRegistryName().toString(), 100);
        itemmmap.put(Items.RED_CANDLE.getRegistryName().toString(), 100);
        itemmmap.put(Items.BLACK_CANDLE.getRegistryName().toString(), 100);
        /**
         itemmmap.put(Items.BEETROOT_SEEDS.getRegistryName().toString(), 2);

         1.12.2以降名前変更分
         **/
        if (itemmmap.containsKey(itemStack.getItem().getRegistryName().toString())) {
            vallue = itemmmap.get(itemStack.getItem().getRegistryName().toString());
            arrayValue = vallue*ItemCount;
            sum += arrayValue;
            conclusionValue = sumValue - sum;

            if (conclusionValue < 0) {
                conclusionValue = 0; // 負の値になった場合はゼロに戻す
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
                bw.write(String.valueOf(conclusionValue));
                bw.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("----------------------------------");
            System.out.println("Item:" + itemStack.getItem().getRegistryName().toString());
            System.out.println("Money:"+vallue);
            System.out.println("SumMoney:"+arrayValue);
            System.out.println("AllMoney:"+sum);
            System.out.println("Conclusion:"+conclusionValue);
            System.out.println("Exist\n");
            System.out.println("----------------------------------");
        } else {
            System.out.println("----------------------------------");
            System.out.println("Item:" + itemStack.getItem().getRegistryName().toString());
            System.out.println("Not Exist\n");
            System.out.println("----------------------------------");
        }
    }
}
