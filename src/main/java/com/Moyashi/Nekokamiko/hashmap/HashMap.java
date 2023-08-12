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

    public static void hashmap(){
        java.util.HashMap<String, Integer> itemmmap = new java.util.HashMap<>();

        //無限に手に入るアイテムは安く

        //建築 Block
        itemmmap.put(Blocks.STONE.getRegistryName().toString(), 1);

        itemmmap.put(Blocks.GRASS.getRegistryName().toString(), 10);
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
       // itemmmap.put(Blocks.DOUBLE_STONE_SLAB, 1, 0.getRegistryName().toString(), 2);//焼石
       // itemmmap.put(Blocks.DOUBLE_STONE_SLAB, 1, 1.getRegistryName().toString(), 8);//砂岩
//itemmmap.put(Blocks.DOUBLE_STONE_SLAB, 1, 3.getRegistryName().toString(), 0);//石
       // itemmmap.put(Blocks.DOUBLE_STONE_SLAB, 1, 4.getRegistryName().toString(), 200);//レンガ
       //itemmmap.put(Blocks.DOUBLE_STONE_SLAB, 1, 5.getRegistryName().toString(), 12);//石レンガ
       // itemmmap.put(Blocks.DOUBLE_STONE_SLAB, 1, 6.getRegistryName().toString(), 50);//ネザーレンガ
       // itemmmap.put(Blocks.DOUBLE_STONE_SLAB, 1, 7.getRegistryName().toString(), 1200);//水晶
        //ハーフ
       // itemmmap.put(Blocks.STONE_SLAB, 1, 0.getRegistryName().toString(), 1);//焼石
       /// itemmmap.put(Blocks.STONE_SLAB, 1, 1.getRegistryName().toString(), 4);//砂岩
       // itemmmap.put(Blocks.STONE_SLAB, 1, 3.getRegistryName().toString(), 0);//石
       // itemmmap.put(Blocks.STONE_SLAB, 1, 4.getRegistryName().toString(), 100);//レンガ
       // itemmmap.put(Blocks.STONE_SLAB, 1, 5.getRegistryName().toString(), 5);//石レンガ
       // itemmmap.put(Blocks.STONE_SLAB, 1, 6.getRegistryName().toString(), 25);//ネザーレンガ
       // itemmmap.put(Blocks.STONE_SLAB, 1, 7.getRegistryName().toString(), 600);//水晶
        //
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

        //itemmmap.put(Blocks.BED.getRegistryName().toString(), -1);//ブロック状態のベッド
        itemmmap.put(Blocks.COBWEB.getRegistryName().toString(), 40);

        //itemmmap.put(Blocks.FLOWER.getRegistryName().toString(), 20);

        itemmmap.put(Blocks.BROWN_MUSHROOM.getRegistryName().toString(), 15);
        itemmmap.put(Blocks.RED_MUSHROOM.getRegistryName().toString(), 15);
        itemmmap.put(Blocks.TORCH.getRegistryName().toString(), 10);
        itemmmap.put(Blocks.FIRE.getRegistryName().toString(), -1);
        //itemmmap.put(Blocks.MOB_SPAWNER.getRegistryName().toString(), -1);
        itemmmap.put(Blocks.CHEST.getRegistryName().toString(), 50);
        itemmmap.put(Blocks.CRAFTING_TABLE.getRegistryName().toString(), 20);
        itemmmap.put(Blocks.FURNACE.getRegistryName().toString(), 10);
        //itemmmap.put(Blocks.LIT_FURNACE.getRegistryName().toString(), -1);//火のついたカマド
       // itemmmap.put(Blocks.STANDING_SIGN.getRegistryName().toString(), -1);//看板
        itemmmap.put(Blocks.LADDER.getRegistryName().toString(), 5);
        //itemmmap.put(Blocks.WALL_SIGN.getRegistryName().toString(), -1);//壁看板
        //itemmmap.put(Blocks.SNOW_LAYER.getRegistryName().toString(), -1);//浅い雪
        itemmmap.put(Blocks.CACTUS.getRegistryName().toString(), 60);
        //itemmmap.put(Blocks.REEDS.getRegistryName().toString(), -1);//ブロックのサトウキビ
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
       // itemmmap.put(Blocks.WATERLILY.getRegistryName().toString(), 1);
        itemmmap.put(Blocks.NETHER_BRICK_FENCE.getRegistryName().toString(), 12);
        itemmmap.put(Blocks.ENCHANTING_TABLE.getRegistryName().toString(), 22000);
        itemmmap.put(Blocks.END_PORTAL.getRegistryName().toString(), -1);
        itemmmap.put(Blocks.END_PORTAL_FRAME.getRegistryName().toString(), -1);
        itemmmap.put(Blocks.ENDER_CHEST.getRegistryName().toString(), 150);
        itemmmap.put(Blocks.FLOWER_POT.getRegistryName().toString(), -1);//植木鉢
        itemmmap.put(Blocks.SKELETON_SKULL.getRegistryName().toString(), -1);//頭
        //itemmmap.put(Blocks.ANVIL, 1, 0.getRegistryName().toString(), 16000);
        //itemmmap.put(Blocks.ANVIL, 1, 1.getRegistryName().toString(), -1);//少し壊れた金床
        //itemmmap.put(Blocks.ANVIL, 1, 2.getRegistryName().toString(), -1);//壊れた金床
        itemmmap.put(Blocks.TRAPPED_CHEST.getRegistryName().toString(), 520);

        itemmmap.put(Blocks.CAVE_VINES_PLANT.getRegistryName().toString(), 20);
        itemmmap.put(Blocks.CHORUS_PLANT.getRegistryName().toString(), 20);
        itemmmap.put(Blocks.KELP_PLANT.getRegistryName().toString(), 1);
        itemmmap.put(Blocks.TWISTING_VINES_PLANT.getRegistryName().toString(), 1);
        itemmmap.put(Blocks.WEEPING_VINES_PLANT.getRegistryName().toString(), 20);
       // itemmmap.put(Blocks, 1, 5.getRegistryName().toString(), 20);

        //itemmmap.put(Blocks.STANDING_BANNER, 1, 0.getRegistryName().toString(), -1);
       // itemmmap.put(Blocks.WALL_BANNER, 1, 0.getRegistryName().toString(), -1);
        itemmmap.put(Blocks.END_ROD.getRegistryName().toString(),  5);
        itemmmap.put(Blocks.CHORUS_PLANT.getRegistryName().toString(), -1);
        itemmmap.put(Blocks.CHORUS_FLOWER.getRegistryName().toString(),  -1);
        itemmmap.put(Blocks.STRUCTURE_VOID.getRegistryName().toString(),-1);//ストラクチャー
        itemmmap.put(Blocks.STRUCTURE_BLOCK.getRegistryName().toString(),-1);
        //装飾 ITEM
        itemmmap.put(Items.PAINTING.getRegistryName().toString(), 20);
        //itemmmap.put(Items.SIGN.getRegistryName().toString(), 24);
        //itemmmap.put(Items.BED.getRegistryName().toString(), 200);
        itemmmap.put(Items.ITEM_FRAME.getRegistryName().toString(), 60);
        itemmmap.put(Items.FLOWER_POT.getRegistryName().toString(), 150);
        //itemmmap.put(Items.SKULL.getRegistryName().toString(), 50);
        //itemmmap.put(Items.SKULL, 1, 1.getRegistryName().toString(), 50);
        //itemmmap.put(Items.SKULL, 1, 2.getRegistryName().toString(), 50);
        //itemmmap.put(Items.SKULL, 1, 3.getRegistryName().toString(), 50);
        //itemmmap.put(Items.SKULL, 1, 4.getRegistryName().toString(), 50);
        //itemmmap.put(Items.SKULL, 1, 5.getRegistryName().toString(), 15000);
        //itemmmap.put(Items.ARMOR_STAND, 1, 0.getRegistryName().toString(), 30);
        //itemmmap.put(Items.BANNER, 1, OreDictionary.WILDCARD_VALUE.getRegistryName().toString(), 400);
        //itemmmap.put(Items.END_CRYSTAL, 1, 0.getRegistryName().toString(), -1);

        //レッドストーン BLOCK
        itemmmap.put(Blocks.DISPENSER.getRegistryName().toString(), 200);
       // itemmmap.put(Blocks.NOTEBLOCK.getRegistryName().toString(), 120);
        itemmmap.put(Blocks.STICKY_PISTON.getRegistryName().toString(), 800);
        itemmmap.put(Blocks.PISTON.getRegistryName().toString(), 700);
        itemmmap.put(Blocks.PISTON_HEAD.getRegistryName().toString(), -1);//ピストンの先
       // itemmmap.put(Blocks.PISTON_EXTENSION.getRegistryName().toString(), -1);
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
       // itemmmap.put(Blocks.WOODEN_PRESSURE_PLATE.getRegistryName().toString(), 10);
        //itemmmap.put(Blocks.UNLIT_REDSTONE_TORCH.getRegistryName().toString(), -1);//消え);いるレッドストーンTOUCH
        itemmmap.put(Blocks.REDSTONE_TORCH.getRegistryName().toString(), 45);
        itemmmap.put(Blocks.STONE_BUTTON.getRegistryName().toString(), 1);
       // itemmmap.put(Blocks.UNPOWERED_REPEATER.getRegistryName().toString(), -1);
        ///itemmmap.put(Blocks.POWERED_REPEATER.getRegistryName().toString(), -1);
        //itemmmap.put(Blocks.TRAPDOOR.getRegistryName().toString(), 15);
        itemmmap.put(Blocks.IRON_TRAPDOOR.getRegistryName().toString(), 1200);
        itemmmap.put(Blocks.OAK_FENCE_GATE.getRegistryName().toString(), 10);//フェンスゲート
        itemmmap.put(Blocks.SPRUCE_FENCE_GATE.getRegistryName().toString(), 10);//フェンスゲート
        itemmmap.put(Blocks.BIRCH_FENCE_GATE.getRegistryName().toString(), 10);//フェンスゲート
        itemmmap.put(Blocks.JUNGLE_FENCE_GATE.getRegistryName().toString(), 10);//フェンスゲート
        itemmmap.put(Blocks.DARK_OAK_FENCE_GATE.getRegistryName().toString(), 10);//フェンスゲート
        itemmmap.put(Blocks.ACACIA_FENCE_GATE.getRegistryName().toString(), 10);//フェンスゲート
        itemmmap.put(Blocks.REDSTONE_LAMP.getRegistryName().toString(), 1500);
       // itemmmap.put(Blocks.LIT_REDSTONE_LAMP.getRegistryName().toString(), -1);
        itemmmap.put(Blocks.TRIPWIRE_HOOK.getRegistryName().toString(), 250);
        itemmmap.put(Blocks.TRIPWIRE.getRegistryName().toString(), -1);//糸
        itemmmap.put(Blocks.COMMAND_BLOCK.getRegistryName().toString(), -1);//コマンドブロック
       // itemmmap.put(Blocks.WOODEN.getRegistryName().toString(), 5);
        itemmmap.put(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE.getRegistryName().toString(), 8000);
        itemmmap.put(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE.getRegistryName().toString(), 1000);
       // itemmmap.put(Blocks.UNPOWERED_COMPARATOR.getRegistryName().toString(), -1);
        //itemmmap.put(Blocks.POWERED_COMPARATOR.getRegistryName().toString(), -1);
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
        //itemmmap.put(Blocks.GOLDEN_RAIL.getRegistryName().toString(), 4100);
        itemmmap.put(Blocks.DETECTOR_RAIL.getRegistryName().toString(), 600);
        itemmmap.put(Blocks.RAIL.getRegistryName().toString(), 250);
        itemmmap.put(Blocks.ACTIVATOR_RAIL.getRegistryName().toString(), 600);
        //移動 ITEM
        itemmmap.put(Items.MINECART.getRegistryName().toString(), 800);
        itemmmap.put(Items.SADDLE.getRegistryName().toString(), 40);
        //itemmmap.put(Items.BOAT.getRegistryName().toString(), 30);
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
        itemmmap.put(Items.ELYTRA.getRegistryName().toString(), 600);

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
        //itemmmap.put(Items.SPAWN_EGG, 1, OreDictionary.WILDCARD_VALUE.getRegistryName().toString(), -1);
        itemmmap.put(Items.EXPERIENCE_BOTTLE.getRegistryName().toString(), 150);
        itemmmap.put(Items.FIRE_CHARGE.getRegistryName().toString(), 50);
        itemmmap.put(Items.WRITABLE_BOOK.getRegistryName().toString(), 180);
        itemmmap.put(Items.WRITTEN_BOOK.getRegistryName().toString(), -1);
        itemmmap.put(Items.MAP.getRegistryName().toString(), 10);
        //itemmmap.put(Items.FIREWORKS, 1, OreDictionary.WILDCARD_VALUE.getRegistryName().toString(), 10);
        //itemmmap.put(Items.FIREWORK_CHARGE, 1, OreDictionary.WILDCARD_VALUE.getRegistryName().toString(), 10);
        itemmmap.put(Items.IRON_HORSE_ARMOR.getRegistryName().toString(), 1000);
        itemmmap.put(Items.GOLDEN_HORSE_ARMOR.getRegistryName().toString(), 10000);
        itemmmap.put(Items.DIAMOND_HORSE_ARMOR.getRegistryName().toString(), 20000);
        itemmmap.put("record", 500);
        //itemmmap.put(Items.RECORD_11.getRegistryName().toString(), -1);

        //        itemmmap.put(Items.RECORD_13.getRegistryName().toString(), 500);
        //        itemmmap.put(Items.RECORD_CAT.getRegistryName().toString(), 500);
        //        itemmmap.put(Items.RECORD_BLOCKS.getRegistryName().toString(), 500);
        //        itemmmap.put(Items.RECORD_CHIRP.getRegistryName().toString(), 500);
        //        itemmmap.put(Items.RECORD_FAR.getRegistryName().toString(), 500);
        //        itemmmap.put(Items.RECORD_MALL.getRegistryName().toString(), 500);
        //        itemmmap.put(Items.RECORD_MELLOHI.getRegistryName().toString(), 500);
        //        itemmmap.put(Items.RECORD_STAL.getRegistryName().toString(), 500);
        //        itemmmap.put(Items.RECORD_STRAD.getRegistryName().toString(), 500);
        //        itemmmap.put(Items.RECORD_WARD.getRegistryName().toString(), 500);
        //        itemmmap.put(Items.RECORD_11.getRegistryName().toString(), -1);
        //        itemmmap.put(Items.RECORD_WAIT.getRegistryName().toString(), 500);

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
       // itemmmap.put(Items.FISH, 1, 0.getRegistryName().toString(), 62);
       // itemmmap.put(Items.FISH, 1, 1.getRegistryName().toString(), 272);//さけ
       // itemmmap.put(Items.FISH, 1, 2.getRegistryName().toString(), 160);//くまのみ
       // itemmmap.put(Items.FISH, 1, 3.getRegistryName().toString(), 104);//ふぐ
       // itemmmap.put(Items.COOKED_FISH, 1, 0.getRegistryName().toString(), 70);
//itemmmap.put(Items.COOKED_FISH, 1, 1.getRegistryName().toString(), 296);
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
        //itemmmap.put(Items.POTIONITEM.getRegistryName().toString(), 1);//ポーションはまた今度
        itemmmap.put(Items.GLASS_BOTTLE.getRegistryName().toString(), 10);
        itemmmap.put(Items.FERMENTED_SPIDER_EYE.getRegistryName().toString(), 1);
        itemmmap.put(Items.BLAZE_POWDER.getRegistryName().toString(), 2);
        itemmmap.put(Items.MAGMA_CREAM.getRegistryName().toString(), 5);
        itemmmap.put(Items.BREWING_STAND.getRegistryName().toString(), 50);
        itemmmap.put(Items.CAULDRON.getRegistryName().toString(), 50);
        itemmmap.put(Items.BREWING_STAND.getRegistryName().toString(), 3500);
        //itemmmap.put(Items.SPECKLED_MELON.getRegistryName().toString(), 650);
        itemmmap.put(Items.RABBIT_FOOT.getRegistryName().toString(), 320);

        //材料
        //itemmmap.put(Items.COAL, 1, 0.getRegistryName().toString(), 50);
        //itemmmap.put(Items.COAL, 1, 1.getRegistryName().toString(), 10);//木炭
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
        //itemmmap.put(Items.REEDS.getRegistryName().toString(), 10);
        itemmmap.put(Items.EGG.getRegistryName().toString(), 3);
        itemmmap.put(Items.GLOWSTONE_DUST.getRegistryName().toString(), 100);
        //itemmmap.put(Items.DYE, 1, 0.getRegistryName().toString(), 30);//染料 イカスミ
       // itemmmap.put(Items.DYE, 1, 1.getRegistryName().toString(), 5);//染料
        //itemmmap.put(Items.DYE, 1, 2.getRegistryName().toString(), 5);//染料
        //itemmmap.put(Items.DYE, 1, 3.getRegistryName().toString(), 40);//染料 カカオ
        //itemmmap.put(Items.DYE, 1, 4.getRegistryName().toString(), 220);//染料 ラピス
        //itemmmap.put(Items.DYE, 1, 5.getRegistryName().toString(), 5);//染料
       // itemmmap.put(Items.DYE, 1, 6.getRegistryName().toString(), 5);//染料
        //itemmmap.put(Items.DYE, 1, 7.getRegistryName().toString(), 5);//染料
       // itemmmap.put(Items.DYE, 1, 8.getRegistryName().toString(), 5);//染料
       // itemmmap.put(Items.DYE, 1, 9.getRegistryName().toString(), 5);//染料
        //itemmmap.put(Items.DYE, 1, 10.getRegistryName().toString(), 5);//染料
       // itemmmap.put(Items.DYE, 1, 11.getRegistryName().toString(), 5);//染料
        //itemmmap.put(Items.DYE, 1, 12.getRegistryName().toString(), 5);//染料
       /// itemmmap.put(Items.DYE, 1, 13.getRegistryName().toString(), 5);//染料
      //  itemmmap.put(Items.DYE, 1, 14.getRegistryName().toString(), 5);//染料
       // itemmmap.put(Items.DYE, 1, 15.getRegistryName().toString(), 10);//染料 骨粉
        itemmmap.put(Items.SUGAR.getRegistryName().toString(), 10);
        itemmmap.put(Items.PUMPKIN_SEEDS.getRegistryName().toString(), 2);
        itemmmap.put(Items.MELON_SEEDS.getRegistryName().toString(), 2);
        itemmmap.put(Items.BLAZE_ROD.getRegistryName().toString(), 10);
        itemmmap.put(Items.GOLD_NUGGET.getRegistryName().toString(), 440);
        itemmmap.put(Items.NETHER_WART.getRegistryName().toString(), 10);
        itemmmap.put(Items.EMERALD.getRegistryName().toString(), 300);
        itemmmap.put(Items.NETHER_STAR.getRegistryName().toString(), 8000);
       // itemmmap.put(Items.NETHERBRICK.getRegistryName().toString(), 20);
        itemmmap.put(Items.QUARTZ.getRegistryName().toString(), 300);
        itemmmap.put(Items.PRISMARINE_SHARD.getRegistryName().toString(), 5);
        itemmmap.put(Items.PRISMARINE_CRYSTALS.getRegistryName().toString(), 20);
        itemmmap.put(Items.RABBIT_HIDE.getRegistryName().toString(), 10);
        itemmmap.put(Items.CHORUS_FRUIT.getRegistryName().toString(), 4);
      //  itemmmap.put(Items.CHORUS_FRUIT_POPPED.getRegistryName().toString(), 1);
        itemmmap.put(Items.BEETROOT_SEEDS.getRegistryName().toString(), 2);

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
