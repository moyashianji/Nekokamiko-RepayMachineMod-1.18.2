package com.Moyashi.Nekokamiko.tooltip;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "modnametooltip", bus = Mod.EventBusSubscriber.Bus.FORGE)
public class addtip {
    private static final Map<String, String> itemTextMap = new HashMap<>();
    static {
        itemTextMap.put("minecraft:smooth_stone_slab", "2");
        itemTextMap.put("minecraft:cut_red_sandstone_slab", "8");
        itemTextMap.put("minecraft:red_sandstone_slab", "8");
        itemTextMap.put("minecraft:cut_sandstone_slab", "8");
        itemTextMap.put("minecraft:stone_brick_slab", "200");
        itemTextMap.put("minecraft:nether_brick_slab", "50");
        itemTextMap.put("minecraft:quartz_slab", "1200");

        itemTextMap.put("minecraft:granite", "10");
        itemTextMap.put("minecraft:polished_granite", "15");
        itemTextMap.put("minecraft:diorite", "10");
        itemTextMap.put("minecraft:polished_diorite", "15");
        itemTextMap.put("minecraft:andesite", "10");
        itemTextMap.put("minecraft:polished_andesite", "15");
        itemTextMap.put("minecraft:deepslate", "10");
        itemTextMap.put("minecraft:cobbled_deepslate", "15");
        itemTextMap.put("minecraft:polished_deepslate", "20");
        itemTextMap.put("minecraft:coarse_dirt", "5");
        itemTextMap.put("minecraft:podzol", "5");
        itemTextMap.put("minecraft:rooted_dirt", "5");
        itemTextMap.put("minecraft:red_sand", "2");
        itemTextMap.put("minecraft:deepslate_coal_ore", "100");
        itemTextMap.put("minecraft:deepslate_iron_ore", "125");
        itemTextMap.put("minecraft:deepslate_gold_ore", "2500");
        itemTextMap.put("minecraft:deepslate_redstone_ore", "75");
        itemTextMap.put("minecraft:deepslate_emerald_ore", "2000");
        itemTextMap.put("minecraft:deepslate_lapis_ore", "1500");
        itemTextMap.put("minecraft:deepslate_diamond_ore", "10000");
        itemTextMap.put("minecraft:raw_iron_block", "1000");
        itemTextMap.put("minecraft:raw_copper_block", "500");
        itemTextMap.put("minecraft:raw_gold_block", "20000");
        itemTextMap.put("minecraft:crimson_stem", "10");
        itemTextMap.put("minecraft:warped_stem", "10");
        itemTextMap.put("minecraft:fern", "2");
        itemTextMap.put("minecraft:dead_bush", "2");
        itemTextMap.put("minecraft:sugar_cane", "10");
        itemTextMap.put("minecraft:petrified_oak_slab", "0");
        itemTextMap.put("minecraft:cobblestone_slab", "1");
        itemTextMap.put("minecraft:red_sandstone", "1");
        itemTextMap.put("minecraft:cut_red_sandstone_slab", "1");
        itemTextMap.put("minecraft:smooth_quartz", "1400");
        itemTextMap.put("minecraft:smooth_red_sandstone", "5");
        itemTextMap.put("minecraft:smooth_sandstone", "5");
        itemTextMap.put("minecraft:cobblestone_stairs", "1");
        itemTextMap.put("minecraft:snow_block", "5");
        itemTextMap.put("minecraft:carved_pumpkin", "90");
        itemTextMap.put("minecraft:jack_o_lantern", "120");
        itemTextMap.put("minecraft:infested_stone", "1");
        itemTextMap.put("minecraft:infested_cobblestone", "1");
        itemTextMap.put("minecraft:infested_stone_bricks", "1");
        itemTextMap.put("minecraft:infested_mossy_stone_bricks", "1");
        itemTextMap.put("minecraft:infested_cracked_stone_bricks", "1");
        itemTextMap.put("minecraft:infested_chiseled_stone_bricks", "1");
        itemTextMap.put("minecraft:infested_deepslate", "1");
        itemTextMap.put("minecraft:stone_bricks", "10");
        itemTextMap.put("minecraft:mossy_stone_bricks", "15");
        itemTextMap.put("minecraft:cracked_stone_bricks", "5");
        itemTextMap.put("minecraft:deepslate_bricks", "25");
        itemTextMap.put("minecraft:cracked_deepslate_bricks", "20");
        itemTextMap.put("minecraft:deepslate_tiles", "30");
        itemTextMap.put("minecraft:cracked_deepslate_tiles", "5");
        itemTextMap.put("minecraft:chiseled_deepslate", "5");
        itemTextMap.put("minecraft:mushroom_stem", "2");
        itemTextMap.put("minecraft:glow_lichen", "2");
        itemTextMap.put("minecraft:cobblestone_wall", "5");
        itemTextMap.put("minecraft:mossy_cobblestone_wall", "5");
        itemTextMap.put("minecraft:brick_wall", "5");
        itemTextMap.put("minecraft:red_sandstone_wall", "5");
        itemTextMap.put("minecraft:cobbled_deepslate_wall", "5");
        itemTextMap.put("minecraft:polished_deepslate_wall", "5");
        itemTextMap.put("minecraft:deepslate_brick_wall", "5");
        itemTextMap.put("minecraft:deepslate_tile_wall", "5");
        itemTextMap.put("minecraft:chiseled_quartz_block", "1280");
        itemTextMap.put("minecraft:quartz_pillar", "1280");
        itemTextMap.put("minecraft:quartz_block", "1280");
        itemTextMap.put("minecraft:dirt_path", "12");
        itemTextMap.put("minecraft:tall_grass", "2");
        itemTextMap.put("minecraft:large_fern", "2");

        itemTextMap.put("minecraft:prismarine_bricks", "50");
        itemTextMap.put("minecraft:dark_prismarine", "50");
        itemTextMap.put("minecraft:chiseled_red_sandstone", "20");
        itemTextMap.put("minecraft:cut_red_sandstone", "25");
        itemTextMap.put("minecraft:warped_wart_block", "300");
        itemTextMap.put("minecraft:cobbled_deepslate_stairs", "5");
        itemTextMap.put("minecraft:polished_deepslate_stairs", "5");
        itemTextMap.put("minecraft:deepslate_brick_stairs", "5");
        itemTextMap.put("minecraft:deepslate_tile_stairs", "5");
        itemTextMap.put("minecraft:cobbled_deepslate_slab", "5");
        itemTextMap.put("minecraft:polished_deepslate_slab", "5");
        itemTextMap.put("minecraft:deepslate_brick_slab", "5");
        itemTextMap.put("minecraft:deepslate_tile_slab", "5");
        itemTextMap.put("minecraft:slime_block", "100");
        itemTextMap.put("minecraft:observer", "500");
        itemTextMap.put("minecraft:warped_fungus_on_a_stick", "100");
        itemTextMap.put("minecraft:lapis_lazuli", "220");
        itemTextMap.put("minecraft:raw_iron", "100");
        itemTextMap.put("minecraft:raw_copper", "50");
        itemTextMap.put("minecraft:raw_gold", "2000");
        itemTextMap.put("minecraft:crimson_sign", "5");
        itemTextMap.put("minecraft:warped_sign", "5");
        itemTextMap.put("minecraft:powder_snow_bucket", "150");
        itemTextMap.put("minecraft:pufferfish_bucket", "350");
        itemTextMap.put("minecraft:salmon_bucket", "450");
        itemTextMap.put("minecraft:cod_bucket", "210");
        itemTextMap.put("minecraft:tropical_fish_bucket", "500");
        itemTextMap.put("minecraft:axolotl_bucket", "3000");
        itemTextMap.put("minecraft:ink_sac", "30");
        itemTextMap.put("minecraft:glow_ink_sac", "60");
        itemTextMap.put("minecraft:cocoa_beans", "40");
        itemTextMap.put("minecraft:bone_meal", "10");
        itemTextMap.put("minecraft:melon_slice", "8");
        itemTextMap.put("minecraft:glow_item_frame", "100");
        itemTextMap.put("minecraft:leather_horse_armor", "400");
        itemTextMap.put("minecraft:beetroot_seeds", "2");
        itemTextMap.put("minecraft:splash_potion", "10");
        itemTextMap.put("minecraft:lingering_potion", "10");
        itemTextMap.put("minecraft:totem_of_undying", "100000");
        itemTextMap.put("minecraft:iron_nugget", "55");
        itemTextMap.put("minecraft:flower_banner_pattern", "40");
        itemTextMap.put("minecraft:creeper_banner_pattern", "40");
        itemTextMap.put("minecraft:skull_banner_pattern", "40");
        itemTextMap.put("minecraft:mojang_banner_pattern", "40");
        itemTextMap.put("minecraft:globe_banner_pattern", "40");
        itemTextMap.put("minecraft:piglin_banner_pattern", "40");
        itemTextMap.put("minecraft:blackstone_slab", "5");
        itemTextMap.put("minecraft:polished_blackstone_slab", "5");
        itemTextMap.put("minecraft:polished_blackstone_brick_slab", "5");

        itemTextMap.put("minecraft:trident", "30000");
        itemTextMap.put("minecraft:crossbow", "1000");
        itemTextMap.put("minecraft:spectral_arrow", "500");
        itemTextMap.put("minecraft:tipped_arrow", "300");
        itemTextMap.put("minecraft:netherite_sword", "80000");
        itemTextMap.put("minecraft:netherite_axe", "120000");
        itemTextMap.put("minecraft:netherite_pickaxe", "120000");
        itemTextMap.put("minecraft:netherite_shovel", "40000");
        itemTextMap.put("minecraft:netherite_hoe", "80000");

        itemTextMap.put("minecraft:spyglass", "5000");
        itemTextMap.put("minecraft:netherite_helmet", "200000");
        itemTextMap.put("minecraft:netherite_chestplate", "320000");
        itemTextMap.put("minecraft:netherite_leggings", "280000");
        itemTextMap.put("minecraft:netherite_boots", "160000");

        itemTextMap.put("minecraft:turtle_helmet", "6000");
        itemTextMap.put("minecraft:scute", "3000");
        itemTextMap.put("minecraft:nautilus_shell", "5000");
        itemTextMap.put("minecraft:phantom_membrane", "500");

        //建築 block
        itemTextMap.put("minecraft:stone", "1");
        itemTextMap.put("minecraft:wet_sponge", "30");

        itemTextMap.put("minecraft:grass_block", "10");
        itemTextMap.put("minecraft:grass", "1");

        itemTextMap.put("minecraft:dirt", "5");
        itemTextMap.put("minecraft:cobblestone", "0");

        itemTextMap.put("minecraft:bedrock", "-1");
        itemTextMap.put("minecraft:sand", "1");
        itemTextMap.put("minecraft:gravel", "5");
        itemTextMap.put("minecraft:gold_ore", "2000");
        itemTextMap.put("minecraft:iron_ore", "100");
        itemTextMap.put("minecraft:coal_ore", "70");

        itemTextMap.put("minecraft:sponge", "50");
        itemTextMap.put("minecraft:glass", "30");
        itemTextMap.put("minecraft:lapis_ore", "1200");
        itemTextMap.put("minecraft:lapis_block", "2000");
        itemTextMap.put("minecraft:sandstone", "8");

        itemTextMap.put("minecraft:gold_block", "36000");
        itemTextMap.put("minecraft:iron_block", "4500");

        itemTextMap.put("minecraft:chiseled_sandstone", "16");
        itemTextMap.put("minecraft:cut_sandstone", "16");
        itemTextMap.put("minecraft:powered_rail", "4100");

        // itemTextMap.put("minecraft:double_stone_slab, "1, "0", "2");//焼石
        // itemTextMap.put("minecraft:double_stone_slab, "1, "1", "8");//砂岩
//itemTextMap.put("minecraft:double_stone_slab, "1, "3", "0");//石
        // itemTextMap.put("minecraft:double_stone_slab, "1, "4", "200");//レンガ
        //itemTextMap.put("minecraft:double_stone_slab, "1, "5", "12");//石レンガ
        // itemTextMap.put("minecraft:double_stone_slab, "1, "6", "50");//ネザーレンガ
        //itemTextMap.put("minecraft:double_stone_slab, "1, "7", "1200");//水晶
        //ハーフ
        // itemTextMap.put("minecraft:stone_slab, "1, "0", "1");//焼石
        /// itemTextMap.put("minecraft:stone_slab, "1, "1", "4");//砂岩
        // itemTextMap.put("minecraft:stone_slab, "1, "3", "0");//石
        // itemTextMap.put("minecraft:stone_slab, "1, "4", "100");//レンガ
        // itemTextMap.put("minecraft:stone_slab, "1, "5", "5");//石レンガ
        // itemTextMap.put("minecraft:stone_slab, "1, "6", "25");//ネザーレンガ
        // itemTextMap.put("minecraft:stone_slab, "1, "7", "600");//水晶
        //
        itemTextMap.put("minecraft:white_wool", "60");
        itemTextMap.put("minecraft:orange_wool", "60");
        itemTextMap.put("minecraft:magenta_wool", "60");
        itemTextMap.put("minecraft:light_blue_wool", "60");
        itemTextMap.put("minecraft:cyan_wool", "60");
        itemTextMap.put("minecraft:purple_wool", "60");
        itemTextMap.put("minecraft:blue_wool", "60");
        itemTextMap.put("minecraft:brown_wool", "60");
        itemTextMap.put("minecraft:green_wool", "60");
        itemTextMap.put("minecraft:red_wool", "60");
        itemTextMap.put("minecraft:light_gray_wool", "60");//骨
        itemTextMap.put("minecraft:yellow_wool", "60");//骨
        itemTextMap.put("minecraft:pink_wool", "60");//骨
        itemTextMap.put("minecraft:lime_wool", "60");//骨
        itemTextMap.put("minecraft:gray_wool", "60");//骨
        itemTextMap.put("minecraft:black_wool", "60");//骨

        itemTextMap.put("minecraft:white_terracotta", "130");
        itemTextMap.put("minecraft:orange_terracotta", "130");
        itemTextMap.put("minecraft:magenta_terracotta", "130");
        itemTextMap.put("minecraft:light_blue_terracotta", "130");
        itemTextMap.put("minecraft:cyan_terracotta", "130");
        itemTextMap.put("minecraft:purple_terracotta", "130");
        itemTextMap.put("minecraft:blue_terracotta", "130");
        itemTextMap.put("minecraft:brown_terracotta", "130");
        itemTextMap.put("minecraft:green_terracotta", "130");
        itemTextMap.put("minecraft:red_terracotta", "130");
        itemTextMap.put("minecraft:light_gray_terracotta", "130");//骨
        itemTextMap.put("minecraft:yellow_terracotta", "130");//骨
        itemTextMap.put("minecraft:pink_terracotta", "130");//骨
        itemTextMap.put("minecraft:lime_terracotta", "130");//骨
        itemTextMap.put("minecraft:gray_terracotta", "130");//骨
        itemTextMap.put("minecraft:black_terracotta", "130");//骨

        itemTextMap.put("minecraft:white_stained_glass", "12");
        itemTextMap.put("minecraft:orange_stained_glass", "12");
        itemTextMap.put("minecraft:magenta_stained_glass", "12");
        itemTextMap.put("minecraft:light_blue_stained_glass", "12");
        itemTextMap.put("minecraft:cyan_stained_glass", "12");
        itemTextMap.put("minecraft:purple_stained_glass", "12");
        itemTextMap.put("minecraft:blue_stained_glass", "12");
        itemTextMap.put("minecraft:brown_stained_glass", "12");
        itemTextMap.put("minecraft:green_stained_glass", "12");
        itemTextMap.put("minecraft:red_stained_glass", "12");
        itemTextMap.put("minecraft:light_gray_stained_glass", "12");//骨
        itemTextMap.put("minecraft:yellow_stained_glass", "12");//骨
        itemTextMap.put("minecraft:pink_stained_glass", "12");//骨
        itemTextMap.put("minecraft:lime_stained_glass", "12");//骨
        itemTextMap.put("minecraft:gray_stained_glass", "12");//骨
        itemTextMap.put("minecraft:black_stained_glass", "12");//骨

        itemTextMap.put("minecraft:bricks", "200");
        itemTextMap.put("minecraft:bookshelf", "510");
        itemTextMap.put("minecraft:mossy_cobblestone", "10");
        itemTextMap.put("minecraft:obsidian", "5");
        itemTextMap.put("minecraft:oak_stairs", "10");//オークの階段
        itemTextMap.put("minecraft:diamond_ore", "8000");
        itemTextMap.put("minecraft:diamond_block", "90000");
        itemTextMap.put("minecraft:wheat", "-1");
        itemTextMap.put("minecraft:farmland", "-1");
        itemTextMap.put("minecraft:stone_stairs", "1");
        itemTextMap.put("minecraft:redstone_ore", "50");
        itemTextMap.put("minecraft:chiseled_stone_bricks", "-1");//光っ");いるレッドストーン
        itemTextMap.put("minecraft:ice", "65");
        itemTextMap.put("minecraft:snow", "1");
        itemTextMap.put("minecraft:clay", "120");
        itemTextMap.put("minecraft:pumpkin", "8");//パンプキン
        itemTextMap.put("minecraft:netherrack", "0");
        itemTextMap.put("minecraft:soul_sand", "2");
        itemTextMap.put("minecraft:glowstone", "400");
        itemTextMap.put("minecraft:end_portal", "-1");//ポータル
        itemTextMap.put("minecraft:pumpkin", "120");
        itemTextMap.put("minecraft:brick_slab", "10");
        itemTextMap.put("minecraft:melon", "11");//メロン
        itemTextMap.put("minecraft:pumpkin_stem", "-1");//根
        itemTextMap.put("minecraft:melon_stem", "-1");
        itemTextMap.put("minecraft:brick_stairs", "210");
        itemTextMap.put("minecraft:stone_brick_stairs", "12");
        itemTextMap.put("minecraft:mycelium", "1");
        itemTextMap.put("minecraft:nether_bricks", "10");
        itemTextMap.put("minecraft:nether_brick_stairs", "12");
        itemTextMap.put("minecraft:nether_wart", "-1");//ブロック状態のネザーウォート
        itemTextMap.put("minecraft:end_stone", "10");
        itemTextMap.put("minecraft:dragon_egg", "-1");

        itemTextMap.put("minecraft:sandstone_stairs", "20");
        itemTextMap.put("minecraft:emerald_ore", "1500");
        itemTextMap.put("minecraft:emerald_block", "2700");
        itemTextMap.put("minecraft:spruce_stairs", "10");//まつの階段
        itemTextMap.put("minecraft:birch_stairs", "10");
        itemTextMap.put("minecraft:jungle_stairs", "10");

        itemTextMap.put("minecraft:nether_quartz_ore", "280");
        itemTextMap.put("minecraft:quartz_stairs", "1400");

        itemTextMap.put("minecraft:hay_block", "450");
        itemTextMap.put("minecraft:terracotta", "130");
        itemTextMap.put("minecraft:coal_block", "450");
        itemTextMap.put("minecraft:packed_ice", "100");
        itemTextMap.put("minecraft:acacia_stairs", "10");//階段
        itemTextMap.put("minecraft:dark_oak_stairs", "10");

        itemTextMap.put("minecraft:prismarine", "20");//海
        itemTextMap.put("minecraft:prismarine", "45");
        itemTextMap.put("minecraft:sea_lantern", "120");
        itemTextMap.put("minecraft:red_sandstone", "32");//砂
        itemTextMap.put("minecraft:red_sandstone_stairs", "30");//砂
        itemTextMap.put("minecraft:sandstone_slab", "8");//砂
        itemTextMap.put("minecraft:purpur_block", "5");//パァー
        itemTextMap.put("minecraft:purpur_pillar", "5");
        itemTextMap.put("minecraft:purpur_stairs", "6");
        itemTextMap.put("minecraft:purpur_slab","2");
        itemTextMap.put("minecraft:end_stone_bricks","20");
        itemTextMap.put("minecraft:magma_block", "20");//マグマ
        itemTextMap.put("minecraft:nether_wart_block","100");//ネザー
        itemTextMap.put("minecraft:red_nether_bricks", "38");
        itemTextMap.put("minecraft:bone_block", "100");//骨

        //建築 item

        //装飾 block

        itemTextMap.put("minecraft:white_bed", "200");
        itemTextMap.put("minecraft:orange_bed", "200");
        itemTextMap.put("minecraft:magenta_bed", "200");
        itemTextMap.put("minecraft:light_blue_bed", "200");
        itemTextMap.put("minecraft:cyan_bed", "200");
        itemTextMap.put("minecraft:purple_bed", "200");
        itemTextMap.put("minecraft:blue_bed", "200");
        itemTextMap.put("minecraft:brown_bed", "200");
        itemTextMap.put("minecraft:green_bed", "200");
        itemTextMap.put("minecraft:red_bed", "200");
        itemTextMap.put("minecraft:cobweb", "40");
        itemTextMap.put("minecraft:light_gray_bed", "200");//骨
        itemTextMap.put("minecraft:yellow_bed", "200");//骨
        itemTextMap.put("minecraft:pink_bed", "200");//骨
        itemTextMap.put("minecraft:lime_bed", "200");//骨
        itemTextMap.put("minecraft:gray_bed", "200");//骨
        itemTextMap.put("minecraft:black_bed", "200");//骨

        itemTextMap.put("minecraft:white_carpet", "1");
        itemTextMap.put("minecraft:orange_carpet", "1");
        itemTextMap.put("minecraft:magenta_carpet", "1");
        itemTextMap.put("minecraft:light_blue_carpet", "1");
        itemTextMap.put("minecraft:cyan_carpet", "1");
        itemTextMap.put("minecraft:purple_carpet", "1");
        itemTextMap.put("minecraft:blue_carpet", "1");
        itemTextMap.put("minecraft:brown_carpet", "1");
        itemTextMap.put("minecraft:green_carpet", "1");
        itemTextMap.put("minecraft:red_carpet", "1");
        itemTextMap.put("minecraft:light_gray_carpet", "1");//骨
        itemTextMap.put("minecraft:yellow_carpet", "1");//骨
        itemTextMap.put("minecraft:pink_carpet", "1");//骨
        itemTextMap.put("minecraft:lime_carpet", "1");//骨
        itemTextMap.put("minecraft:gray_carpet", "1");//骨
        itemTextMap.put("minecraft:black_carpet", "1");//骨

        itemTextMap.put("minecraft:dandelion", "20");
        itemTextMap.put("minecraft:poppy", "20");
        itemTextMap.put("minecraft:blue_orchid", "20");
        itemTextMap.put("minecraft:allium", "20");
        itemTextMap.put("minecraft:azure_bluet", "20");
        itemTextMap.put("minecraft:red_tulip", "20");
        itemTextMap.put("minecraft:orange_tulip", "20");
        itemTextMap.put("minecraft:torch", "20");
        itemTextMap.put("minecraft:white_tulip", "20");
        itemTextMap.put("minecraft:pink_tulip", "20");
        itemTextMap.put("minecraft:oxeye_daisy", "20");
        itemTextMap.put("minecraft:cornflower", "20");
        itemTextMap.put("minecraft:lily_of_the_valley", "20");
        itemTextMap.put("minecraft:wither_rose", "20");
        itemTextMap.put("minecraft:sunflower", "20");
        itemTextMap.put("minecraft:lilac", "20");
        itemTextMap.put("minecraft:rose_bush", "20");
        itemTextMap.put("minecraft:peony", "20");

        itemTextMap.put("minecraft:brown_mushroom", "15");
        itemTextMap.put("minecraft:red_mushroom", "15");
        itemTextMap.put("minecraft:torch", "10");
        itemTextMap.put("minecraft:fire", "-1");
        itemTextMap.put("minecraft:chest", "50");
        itemTextMap.put("minecraft:crafting_table", "20");
        itemTextMap.put("minecraft:furnace", "10");
        itemTextMap.put("minecraft:ladder", "5");
        itemTextMap.put("minecraft:cactus", "60");
        itemTextMap.put("minecraft:jukebox", "10250");
        itemTextMap.put("minecraft:oak_fence", "8");//フェンス
        itemTextMap.put("minecraft:spruce_fence", "8");
        itemTextMap.put("minecraft:birch_fence", "8");
        itemTextMap.put("minecraft:jungle_fence", "8");
        itemTextMap.put("minecraft:dark_oak_fence", "8");
        itemTextMap.put("minecraft:acacia_fence", "8");

        itemTextMap.put("minecraft:brown_mushroom_block", "-1");
        itemTextMap.put("minecraft:red_mushroom_block", "-1");
        itemTextMap.put("minecraft:iron_bars", "190");
        itemTextMap.put("minecraft:glass_pane", "12");
        itemTextMap.put("minecraft:vine", "1");
        itemTextMap.put("minecraft:lily_pad", "1");

        itemTextMap.put("minecraft:white_stained_glass_pane", "12");
        itemTextMap.put("minecraft:orange_stained_glass_pane", "12");
        itemTextMap.put("minecraft:magenta_stained_glass_pane", "12");
        itemTextMap.put("minecraft:light_blue_stained_glass_pane", "12");
        itemTextMap.put("minecraft:cyan_stained_glass_pane", "12");
        itemTextMap.put("minecraft:purple_stained_glass_pane", "12");
        itemTextMap.put("minecraft:blue_stained_glass_pane", "12");
        itemTextMap.put("minecraft:brown_stained_glass_pane", "12");
        itemTextMap.put("minecraft:green_stained_glass_pane", "12");
        itemTextMap.put("minecraft:red_stained_glass_pane", "12");
        itemTextMap.put("minecraft:light_gray_stained_glass_pane", "12");//骨
        itemTextMap.put("minecraft:yellow_stained_glass_pane", "12");//骨
        itemTextMap.put("minecraft:pink_stained_glass_pane", "12");//骨
        itemTextMap.put("minecraft:lime_stained_glass_pane", "12");//骨
        itemTextMap.put("minecraft:gray_stained_glass_pane", "12");//骨
        itemTextMap.put("minecraft:black_stained_glass_pane", "12");//骨

        itemTextMap.put("minecraft:nether_brick_fence", "12");
        itemTextMap.put("minecraft:enchanting_table", "22000");
        itemTextMap.put("minecraft:end_portal", "-1");
        itemTextMap.put("minecraft:end_portal_frame", "-1");
        itemTextMap.put("minecraft:ender_chest", "150");
        itemTextMap.put("minecraft:flower_pot", "-1");//植木鉢
        itemTextMap.put("minecraft:skeleton_skull", "-1");//頭

        itemTextMap.put("minecraft:anvil", "16000");//壊れた金床
        itemTextMap.put("minecraft:chipped_anvil", "-1");//壊れた金床
        itemTextMap.put("minecraft:damaged_anvil", "-1");//壊れた金床

        itemTextMap.put("minecraft:trapped_chest", "520");

        itemTextMap.put("minecraft:cave_vines_plant", "20");
        itemTextMap.put("minecraft:chorus_plant", "20");
        itemTextMap.put("minecraft:kelp_plant", "1");
        itemTextMap.put("minecraft:twisting_vines_plant", "1");
        itemTextMap.put("minecraft:weeping_vines_plant", "20");

        itemTextMap.put("minecraft:end_rod", " 5");
        itemTextMap.put("minecraft:chorus_plant", "-1");
        itemTextMap.put("minecraft:chorus_flower", " -1");
        itemTextMap.put("minecraft:structure_void","-1");

        itemTextMap.put("minecraft:structure_block","-1");
                //装飾 item
        itemTextMap.put("minecraft:painting", "20");

        itemTextMap.put("minecraft:acacia_log", "10");
        itemTextMap.put("minecraft:birch_log", "10");
        itemTextMap.put("minecraft:jungle_log", "10");
        itemTextMap.put("minecraft:oak_log", "10");
        itemTextMap.put("minecraft:spruce_log", "10");
        itemTextMap.put("minecraft:dark_oak_log", "10");

        itemTextMap.put("minecraft:white_concrete", "240");
        itemTextMap.put("minecraft:orange_concrete", "240");
        itemTextMap.put("minecraft:magenta_concrete", "240");
        itemTextMap.put("minecraft:light_blue_concrete", "240");
        itemTextMap.put("minecraft:cyan_concrete", "240");
        itemTextMap.put("minecraft:purple_concrete", "240");
        itemTextMap.put("minecraft:blue_concrete", "240");
        itemTextMap.put("minecraft:brown_concrete", "240");
        itemTextMap.put("minecraft:green_concrete", "240");
        itemTextMap.put("minecraft:red_concrete", "240");
        itemTextMap.put("minecraft:light_gray_concrete", "240");//骨
        itemTextMap.put("minecraft:yellow_concrete", "240");//骨
        itemTextMap.put("minecraft:pink_concrete", "240");//骨
        itemTextMap.put("minecraft:lime_concrete", "240");//骨
        itemTextMap.put("minecraft:gray_concrete", "240");//骨
        itemTextMap.put("minecraft:black_concrete", "240");//骨

        itemTextMap.put("minecraft:white_concrete_powder", "75");
        itemTextMap.put("minecraft:orange_concrete_powder", "75");
        itemTextMap.put("minecraft:magenta_concrete_powder", "75");
        itemTextMap.put("minecraft:light_blue_concrete_powder", "75");
        itemTextMap.put("minecraft:cyan_concrete_powder", "75");
        itemTextMap.put("minecraft:purple_concrete_powder", "75");
        itemTextMap.put("minecraft:blue_concrete_powder", "75");
        itemTextMap.put("minecraft:brown_concrete_powder", "75");
        itemTextMap.put("minecraft:green_concrete_powder", "75");
        itemTextMap.put("minecraft:red_concrete_powder", "75");
        itemTextMap.put("minecraft:light_gray_concrete_powder", "75");//骨
        itemTextMap.put("minecraft:yellow_concrete_powder", "75");//骨
        itemTextMap.put("minecraft:pink_concrete_powder", "75");//骨
        itemTextMap.put("minecraft:lime_concrete_powder", "75");//骨
        itemTextMap.put("minecraft:gray_concrete_powder", "75");//骨
        itemTextMap.put("minecraft:black_concrete_powder", "75");//骨

        itemTextMap.put("minecraft:acacia_sign", "24");
        itemTextMap.put("minecraft:birch_sign", "24");
        itemTextMap.put("minecraft:jungle_sign", "24");
        itemTextMap.put("minecraft:oak_sign", "24");
        itemTextMap.put("minecraft:spruce_sign", "24");
        itemTextMap.put("minecraft:dark_oak_sign", "24");

        itemTextMap.put("minecraft:item_frame", "60");
        itemTextMap.put("minecraft:flower_pot", "150");

        itemTextMap.put("minecraft:skeleton_skull", "50");
        itemTextMap.put("minecraft:wither_skeleton_skull", "15000");

        itemTextMap.put("minecraft:armor_stand", "30");

        itemTextMap.put("minecraft:acacia_slab", "4");
        itemTextMap.put("minecraft:birch_slab", "4");
        itemTextMap.put("minecraft:jungle_slab", "4");
        itemTextMap.put("minecraft:oak_slab", "4");
        itemTextMap.put("minecraft:spruce_slab", "4");
        itemTextMap.put("minecraft:dark_oak_slab", "4");

        itemTextMap.put("minecraft:dead_tube_coral_fan", "300");
        itemTextMap.put("minecraft:dead_brain_coral_fan", "300");
        itemTextMap.put("minecraft:dead_bubble_coral_fan", "300");
        itemTextMap.put("minecraft:dead_fire_coral_fan", "300");
        itemTextMap.put("minecraft:dead_horn_coral_fan", "300");

        itemTextMap.put("minecraft:dead_tube_coral_block", "600");
        itemTextMap.put("minecraft:dead_brain_coral_block", "600");
        itemTextMap.put("minecraft:dead_bubble_coral_block", "600");
        itemTextMap.put("minecraft:dead_fire_coral_block", "600");
        itemTextMap.put("minecraft:dead_horn_coral_block", "600");

        itemTextMap.put("minecraft:oak_sapling", "2");
        itemTextMap.put("minecraft:spruce_sapling", "2");
        itemTextMap.put("minecraft:birch_sapling", "2");
        itemTextMap.put("minecraft:jungle_sapling", "2");
        itemTextMap.put("minecraft:acacia_sapling", "2");
        itemTextMap.put("minecraft:dark_oak_sapling", "2");

        itemTextMap.put("minecraft:oak_leaves", "3");
        itemTextMap.put("minecraft:spruce_leaves", "3");
        itemTextMap.put("minecraft:birch_leaves", "3");
        itemTextMap.put("minecraft:jungle_leaves", "3");
        itemTextMap.put("minecraft:acacia_leaves", "3");
        itemTextMap.put("minecraft:dark_oak_leaves", "3");

        itemTextMap.put("minecraft:oak_planks", "4");
        itemTextMap.put("minecraft:spruce_planks", "4");
        itemTextMap.put("minecraft:birch_planks", "4");
        itemTextMap.put("minecraft:jungle_planks", "4");
        itemTextMap.put("minecraft:acacia_planks", "4");
        itemTextMap.put("minecraft:dark_oak_planks", "4");

        itemTextMap.put("minecraft:white_banner", "400");
        itemTextMap.put("minecraft:orange_banner", "400");
        itemTextMap.put("minecraft:magenta_banner", "400");
        itemTextMap.put("minecraft:light_blue_banner", "400");
        itemTextMap.put("minecraft:cyan_banner", "400");
        itemTextMap.put("minecraft:purple_banner", "400");
        itemTextMap.put("minecraft:blue_banner", "400");
        itemTextMap.put("minecraft:brown_banner", "400");
        itemTextMap.put("minecraft:green_banner", "400");
        itemTextMap.put("minecraft:red_banner", "400");
        itemTextMap.put("minecraft:cobweb", "40");
        itemTextMap.put("minecraft:light_gray_banner", "400");//骨
        itemTextMap.put("minecraft:yellow_banner", "400");//骨
        itemTextMap.put("minecraft:pink_banner", "400");//骨
        itemTextMap.put("minecraft:lime_banner", "400");//骨
        itemTextMap.put("minecraft:gray_banner", "400");//骨
        itemTextMap.put("minecraft:black_banner", "400");//骨

        itemTextMap.put("minecraft:white_glazed_terracotta", "130");
        itemTextMap.put("minecraft:orange_glazed_terracotta", "130");
        itemTextMap.put("minecraft:magenta_glazed_terracotta", "130");
        itemTextMap.put("minecraft:light_blue_glazed_terracotta", "130");
        itemTextMap.put("minecraft:cyan_glazed_terracotta", "130");
        itemTextMap.put("minecraft:purple_glazed_terracotta", "130");
        itemTextMap.put("minecraft:blue_glazed_terracotta", "130");
        itemTextMap.put("minecraft:brown_glazed_terracotta", "130");
        itemTextMap.put("minecraft:green_glazed_terracotta", "130");
        itemTextMap.put("minecraft:red_glazed_terracotta", "130");
        itemTextMap.put("minecraft:light_gray_glazed_terracotta", "130");//骨
        itemTextMap.put("minecraft:yellow_glazed_terracotta", "130");//骨
        itemTextMap.put("minecraft:pink_glazed_terracotta", "130");//骨
        itemTextMap.put("minecraft:lime_glazed_terracotta", "130");//骨
        itemTextMap.put("minecraft:gray_glazed_terracotta", "130");//骨
        itemTextMap.put("minecraft:black_glazed_terracotta", "130");//骨

        itemTextMap.put("minecraft:end_crystal", "-1");

        //レッドストーン block
        itemTextMap.put("minecraft:dispenser", "200");
        itemTextMap.put("minecraft:note_block", "120");

        itemTextMap.put("minecraft:sticky_piston", "800");
        itemTextMap.put("minecraft:piston", "700");
        itemTextMap.put("minecraft:piston_head", "-1");//ピストンの先
        itemTextMap.put("minecraft:tnt", "80");
        itemTextMap.put("minecraft:redstone_wire", "-1");
        itemTextMap.put("minecraft:oak_door", "-1");//木のドア
        itemTextMap.put("minecraft:spruce_door", "-1");//木のドア
        itemTextMap.put("minecraft:birch_door", "-1");//木のドア
        itemTextMap.put("minecraft:jungle_door", "-1");//木のドア
        itemTextMap.put("minecraft:acacia_door", "-1");//木のドア
        itemTextMap.put("minecraft:dark_oak_door", "-1");//木のドア
        itemTextMap.put("minecraft:lever", "55");
        itemTextMap.put("minecraft:stone_pressure_plate", "5");
        itemTextMap.put("minecraft:iron_door", "-1");//鉄のドア

        itemTextMap.put("minecraft:acacia_pressure_plate", "10");
        itemTextMap.put("minecraft:birch_pressure_plate", "10");
        itemTextMap.put("minecraft:jungle_pressure_plate", "10");
        itemTextMap.put("minecraft:oak_pressure_plate", "10");
        itemTextMap.put("minecraft:spruce_pressure_plate", "10");
        itemTextMap.put("minecraft:dark_oak_pressure_plate", "10");

        itemTextMap.put("minecraft:redstone_torch", "45");
        itemTextMap.put("minecraft:stone_button", "1");
        itemTextMap.put("minecraft:repeater", "1");

        itemTextMap.put("minecraft:acacia_trapdoor", "15");
        itemTextMap.put("minecraft:birch_trapdoor", "15");
        itemTextMap.put("minecraft:jungle_trapdoor", "15");
        itemTextMap.put("minecraft:oak_trapdoor", "15");
        itemTextMap.put("minecraft:spruce_trapdoor", "15");
        itemTextMap.put("minecraft:dark_oak_trapdoor", "15");
        itemTextMap.put("minecraft:iron_trapdoor", "1200");

        itemTextMap.put("minecraft:oak_fence_gate", "10");//フェンスゲート
        itemTextMap.put("minecraft:spruce_fence_gate", "10");//フェンスゲート
        itemTextMap.put("minecraft:birch_fence_gate", "10");//フェンスゲート
        itemTextMap.put("minecraft:jungle_fence_gate", "10");//フェンスゲート
        itemTextMap.put("minecraft:dark_oak_fence_gate", "10");//フェンスゲート
        itemTextMap.put("minecraft:acacia_fence_gate", "10");//フェンスゲート
        itemTextMap.put("minecraft:redstone_lamp", "1500");
        itemTextMap.put("minecraft:tripwire_hook", "250");
        itemTextMap.put("minecraft:tripwire", "-1");//糸
        itemTextMap.put("minecraft:command_block", "-1");//コマンドブロック

        itemTextMap.put("minecraft:acacia_wood", "5");
        itemTextMap.put("minecraft:birch_wood", "5");
        itemTextMap.put("minecraft:jungle_wood", "5");
        itemTextMap.put("minecraft:oak_wood", "5");
        itemTextMap.put("minecraft:spruce_wood", "5");
        itemTextMap.put("minecraft:dark_oak_wood", "5");

        itemTextMap.put("minecraft:light_weighted_pressure_plate", "8000");
        itemTextMap.put("minecraft:heavy_weighted_pressure_plate", "1000");
        itemTextMap.put("minecraft:comparator", "-1");
        itemTextMap.put("minecraft:daylight_detector", "1000");
        itemTextMap.put("minecraft:redstone_block", "360");
        itemTextMap.put("minecraft:hopper", "2600");
        itemTextMap.put("minecraft:dropper", "50");
        itemTextMap.put("minecraft:repeating_command_block", "-1");
        itemTextMap.put("minecraft:chain_command_block", "-1");
        //レッドストーン item
        itemTextMap.put("minecraft:oak_door", "28");
        itemTextMap.put("minecraft:spruce_door", "28");
        itemTextMap.put("minecraft:birch_door", "28");
        itemTextMap.put("minecraft:jungle_door", "28");
        itemTextMap.put("minecraft:acacia_door", "28");
        itemTextMap.put("minecraft:dark_oak_door", "28");
        itemTextMap.put("minecraft:iron_door", "2800");
        itemTextMap.put("minecraft:redstone", "40");
        itemTextMap.put("minecraft:repeater", "150");
        itemTextMap.put("minecraft:comparator", "210");

        //移動 block
        itemTextMap.put("minecraft:detector_rail", "600");
        itemTextMap.put("minecraft:rail", "250");
        itemTextMap.put("minecraft:activator_rail", "600");
        //移動 item
        itemTextMap.put("minecraft:minecart", "800");
        itemTextMap.put("minecraft:saddle", "40");

        itemTextMap.put("minecraft:acacia_boat", "30");
        itemTextMap.put("minecraft:jungle_boat", "30");
        itemTextMap.put("minecraft:birch_boat", "30");
        itemTextMap.put("minecraft:spruce_boat", "30");
        itemTextMap.put("minecraft:oak_boat", "30");

        itemTextMap.put("minecraft:spruce_boat", "30");
        itemTextMap.put("minecraft:birch_boat", "30");
        itemTextMap.put("minecraft:jungle_boat", "30");
        itemTextMap.put("minecraft:acacia_boat", "30");
        itemTextMap.put("minecraft:dark_oak_boat", "30");
        itemTextMap.put("minecraft:chest_minecart", "830");
        itemTextMap.put("minecraft:furnace_minecart", "820");
        itemTextMap.put("minecraft:carrot_on_a_stick", "26");
        itemTextMap.put("minecraft:tnt_minecart", "800");
        itemTextMap.put("minecraft:hopper_minecart", "980");
        itemTextMap.put("minecraft:command_block_minecart", "-1");
        itemTextMap.put("minecraft:elytra", "200000");

        //その他 block
        itemTextMap.put("minecraft:beacon", "9000");
        //その他 item
        itemTextMap.put("minecraft:bucket", "150");
        itemTextMap.put("minecraft:water_bucket", "150");
        itemTextMap.put("minecraft:lava_bucket", "200");
        itemTextMap.put("minecraft:snowball", "0");
        itemTextMap.put("minecraft:milk_bucket", "600");
        itemTextMap.put("minecraft:paper", "10");
        itemTextMap.put("minecraft:book", "150");
        itemTextMap.put("minecraft:slime_ball", "1");
        itemTextMap.put("minecraft:bone", "1");
        itemTextMap.put("minecraft:filled_map", "1");
        itemTextMap.put("minecraft:ender_pearl", "20");
        itemTextMap.put("minecraft:ender_eye", "20");
        itemTextMap.put("minecraft:experience_bottle", "150");
        itemTextMap.put("minecraft:fire_charge", "50");
        itemTextMap.put("minecraft:writable_book", "180");
        itemTextMap.put("minecraft:written_book", "-1");
        itemTextMap.put("minecraft:map", "10");

        itemTextMap.put("minecraft:firework_rocket", "10");
        itemTextMap.put("minecraft:firework_star", "10");

        itemTextMap.put("minecraft:iron_horse_armor", "1000");
        itemTextMap.put("minecraft:golden_horse_armor", "10000");
        itemTextMap.put("minecraft:diamond_horse_armor", "20000");
        itemTextMap.put("record", "500");

        //食べ物 block
        itemTextMap.put("minecraft:cake", "-1");//ブロックのケーキ
        itemTextMap.put("minecraft:cocoa", "-1");//ブロック状態のカカオ
        itemTextMap.put("minecraft:carrots", "-1");//にんじん
        itemTextMap.put("minecraft:potatoes", "-1");//じゃがいも

        //食べ物 item
        itemTextMap.put("minecraft:apple", "14");
        itemTextMap.put("minecraft:mushroom_stew", "50");
        itemTextMap.put("minecraft:porkchop", "20");
        itemTextMap.put("minecraft:cooked_porkchop", "28");
        itemTextMap.put("minecraft:golden_apple", "4000");
        itemTextMap.put("minecraft:enchanted_golden_apple", "36000");

        itemTextMap.put("minecraft:cod", "62");
        itemTextMap.put("minecraft:salmon", "272");//さけ
        itemTextMap.put("minecraft:tropical_fish", "160");//くまのみ
        itemTextMap.put("minecraft:pufferfish", "104");//ふぐ
        itemTextMap.put("minecraft:cooked_salmon", "70");
        itemTextMap.put("minecraft:cooked_cod", "296");


        itemTextMap.put("minecraft:cake", "640");
        itemTextMap.put("minecraft:cookie", "22");
        itemTextMap.put("minecraft:melon", "1");
        itemTextMap.put("minecraft:beef", "90");
        itemTextMap.put("minecraft:cooked_beef", "100");
        itemTextMap.put("minecraft:chicken", "40");
        itemTextMap.put("minecraft:cooked_chicken", "50");
        itemTextMap.put("minecraft:rotten_flesh", "0");
        itemTextMap.put("minecraft:spider_eye", "1");
        itemTextMap.put("minecraft:carrot", "16");
        itemTextMap.put("minecraft:potato", "12");
        itemTextMap.put("minecraft:baked_potato", "24");
        itemTextMap.put("minecraft:poisonous_potato", "0");
        itemTextMap.put("minecraft:golden_carrot", "650");
        itemTextMap.put("minecraft:pumpkin_pie", "128");
        itemTextMap.put("minecraft:rabbit", "24");
        itemTextMap.put("minecraft:cooked_rabbit", "36");
        itemTextMap.put("minecraft:rabbit_stew", "188");
        itemTextMap.put("minecraft:mutton", "50");
        itemTextMap.put("minecraft:cooked_mutton", "60");
        itemTextMap.put("minecraft:beetroot", "40");
        itemTextMap.put("minecraft:beetroot_soup", "30");

        //道具 素材の金属の1/10
        itemTextMap.put("minecraft:iron_shovel", "50");
        itemTextMap.put("minecraft:iron_pickaxe", "150");
        itemTextMap.put("minecraft:iron_axe", "150");
        itemTextMap.put("minecraft:flint_and_steel", "50");
        itemTextMap.put("minecraft:wooden_shovel", "1");
        itemTextMap.put("minecraft:wooden_pickaxe", "1");
        itemTextMap.put("minecraft:wooden_axe", "1");
        itemTextMap.put("minecraft:stone_shovel", "2");
        itemTextMap.put("minecraft:stone_pickaxe", "2");
        itemTextMap.put("minecraft:stone_axe", "2");
        itemTextMap.put("minecraft:diamond_shovel", "1000");
        itemTextMap.put("minecraft:diamond_pickaxe", "3000");
        itemTextMap.put("minecraft:diamond_axe", "3000");
        itemTextMap.put("minecraft:golden_shovel", "400");
        itemTextMap.put("minecraft:golden_pickaxe", "1200");
        itemTextMap.put("minecraft:golden_axe", "1200");
        itemTextMap.put("minecraft:wooden_hoe", "1");
        itemTextMap.put("minecraft:stone_hoe", "2");
        itemTextMap.put("minecraft:iron_hoe", "100");
        itemTextMap.put("minecraft:diamond_hoe", "2000");
        itemTextMap.put("minecraft:golden_hoe", "800");
        itemTextMap.put("minecraft:compass", "2100");
        itemTextMap.put("minecraft:fishing_rod", "30");
        itemTextMap.put("minecraft:clock", "15000");
        itemTextMap.put("minecraft:shears", "500");
        itemTextMap.put("minecraft:lead", "30");
        itemTextMap.put("minecraft:name_tag", "60");

        //戦闘
        itemTextMap.put("minecraft:bow", "20");
        itemTextMap.put("minecraft:arrow", "1");
        itemTextMap.put("minecraft:iron_sword", "100");
        itemTextMap.put("minecraft:wooden_sword", "1");
        itemTextMap.put("minecraft:stone_sword", "2");
        itemTextMap.put("minecraft:diamond_sword", "2000");
        itemTextMap.put("minecraft:golden_sword", "800");
        itemTextMap.put("minecraft:leather_helmet", "250");//革は素材の値段のまま
        itemTextMap.put("minecraft:leather_chestplate", "400");
        itemTextMap.put("minecraft:leather_leggings", "350");
        itemTextMap.put("minecraft:leather_boots", "200");
        itemTextMap.put("minecraft:chainmail_helmet", "-1");//modで入手できるようにする場合は価格を設定する
        itemTextMap.put("minecraft:chainmail_chestplate", "-1");
        itemTextMap.put("minecraft:chainmail_leggings", "-1");
        itemTextMap.put("minecraft:chainmail_boots", "-1");
        itemTextMap.put("minecraft:iron_helmet", "250");
        itemTextMap.put("minecraft:iron_chestplate", "400");
        itemTextMap.put("minecraft:iron_leggings", "350");
        itemTextMap.put("minecraft:iron_boots", "200");
        itemTextMap.put("minecraft:diamond_helmet", "5000");
        itemTextMap.put("minecraft:diamond_chestplate", "8000");
        itemTextMap.put("minecraft:diamond_leggings", "7000");
        itemTextMap.put("minecraft:diamond_boots", "4000");
        itemTextMap.put("minecraft:golden_helmet", "2000");
        itemTextMap.put("minecraft:golden_chestplate", "6400");
        itemTextMap.put("minecraft:golden_leggings", "5600");
        itemTextMap.put("minecraft:golden_boots", "3200");
        itemTextMap.put("minecraft:enchanted_book", "30");
        itemTextMap.put("minecraft:shield", "600");

        //ポーション block
        itemTextMap.put("minecraft:brewing_stand", "-1");//ブロック状態のスタンド
        itemTextMap.put("minecraft:cauldron", "-1");//ブロック状態の釜
        //ポーション item
        itemTextMap.put("minecraft:ghast_tear", "5");
        itemTextMap.put("minecraft:potion", "1");//ポーションはまた今度
        itemTextMap.put("minecraft:glass_bottle", "10");
        itemTextMap.put("minecraft:fermented_spider_eye", "1");
        itemTextMap.put("minecraft:blaze_powder", "2");
        itemTextMap.put("minecraft:magma_cream", "5");
        itemTextMap.put("minecraft:brewing_stand", "50");
        itemTextMap.put("minecraft:cauldron", "50");
        itemTextMap.put("minecraft:brewing_stand", "3500");
        itemTextMap.put("minecraft:glistering_melon_slice", "650");
        itemTextMap.put("minecraft:rabbit_foot", "320");

        //材料
        itemTextMap.put("minecraft:coal", "50");
        itemTextMap.put("minecraft:charcoal", "10");//木炭
        itemTextMap.put("minecraft:diamond", "10000");
        itemTextMap.put("minecraft:iron_ingot", "500");
        itemTextMap.put("minecraft:gold_ingot", "4000");
        itemTextMap.put("minecraft:stick", "2");
        itemTextMap.put("minecraft:bowl", "3");
        itemTextMap.put("minecraft:string", "4");
        itemTextMap.put("minecraft:feather", "1");
        itemTextMap.put("minecraft:gunpowder", "4");
        itemTextMap.put("minecraft:wheat_seeds", "1");
        itemTextMap.put("minecraft:wheat", "20");
        itemTextMap.put("minecraft:bread", "80");
        itemTextMap.put("minecraft:flint", "3");
        itemTextMap.put("minecraft:leather", "50");
        itemTextMap.put("minecraft:brick", "50");
        itemTextMap.put("minecraft:clay_ball", "30");
        itemTextMap.put("minecraft:lead", "10");
        itemTextMap.put("minecraft:egg", "3");
        itemTextMap.put("minecraft:glowstone_dust", "100");

        itemTextMap.put("minecraft:white_dye", "5");
        itemTextMap.put("minecraft:orange_dye", "5");
        itemTextMap.put("minecraft:magenta_dye", "5");
        itemTextMap.put("minecraft:light_blue_dye", "5");
        itemTextMap.put("minecraft:cyan_dye", "5");
        itemTextMap.put("minecraft:purple_dye", "5");
        itemTextMap.put("minecraft:blue_dye", "5");
        itemTextMap.put("minecraft:brown_dye", "5");
        itemTextMap.put("minecraft:green_dye", "5");
        itemTextMap.put("minecraft:red_dye", "5");
        itemTextMap.put("minecraft:cobweb", "40");
        itemTextMap.put("minecraft:light_gray_dye", "5");//骨
        itemTextMap.put("minecraft:yellow_dye", "5");//骨
        itemTextMap.put("minecraft:pink_dye", "5");//骨
        itemTextMap.put("minecraft:lime_dye", "5");//骨
        itemTextMap.put("minecraft:gray_dye", "5");//骨
        itemTextMap.put("minecraft:black_dye", "5");//骨

        itemTextMap.put("minecraft:sugar", "10");
        itemTextMap.put("minecraft:pumpkin_seeds", "2");
        itemTextMap.put("minecraft:melon_seeds", "2");
        itemTextMap.put("minecraft:blaze_rod", "10");
        itemTextMap.put("minecraft:gold_nugget", "440");
        itemTextMap.put("minecraft:nether_wart", "10");
        itemTextMap.put("minecraft:emerald", "300");
        itemTextMap.put("minecraft:nether_star", "8000");
        itemTextMap.put("minecraft:nether_brick", "20");
        itemTextMap.put("minecraft:quartz", "300");
        itemTextMap.put("minecraft:prismarine_shard", "5");
        itemTextMap.put("minecraft:prismarine_crystals", "20");
        itemTextMap.put("minecraft:rabbit_hide", "10");
        itemTextMap.put("minecraft:chorus_fruit", "4");
        itemTextMap.put("minecraft:popped_chorus_fruit", "1");
        /**
         * 1.13
         */
        itemTextMap.put("minecraft:blue_ice", "150");
        itemTextMap.put("minecraft:conduit", "150000");
        itemTextMap.put("minecraft:heart_of_the_sea", "100000");
        itemTextMap.put("minecraft:tube_coral", "300");
        itemTextMap.put("minecraft:brain_coral", "300");
        itemTextMap.put("minecraft:bubble_coral", "300");
        itemTextMap.put("minecraft:fire_coral", "300");
        itemTextMap.put("minecraft:horn_coral", "300");
        itemTextMap.put("minecraft:dead_tube_coral", "10");
        itemTextMap.put("minecraft:dead_brain_coral", "10");
        itemTextMap.put("minecraft:dead_bubble_coral", "10");
        itemTextMap.put("minecraft:dead_fire_coral", "10");
        itemTextMap.put("minecraft:dead_horn_coral", "10");
        itemTextMap.put("minecraft:tube_coral_fan", "250");
        itemTextMap.put("minecraft:brain_coral_fan", "250");
        itemTextMap.put("minecraft:bubble_coral_fan", "250");
        itemTextMap.put("minecraft:fire_coral_fan", "250");
        itemTextMap.put("minecraft:horn_coral_fan", "250");

        itemTextMap.put("minecraft:tube_coral_wall_fan", "250");
        itemTextMap.put("minecraft:brain_coral_wall_fan", "250");
        itemTextMap.put("minecraft:bubble_coral_wall_fan", "250");
        itemTextMap.put("minecraft:fire_coral_wall_fan", "250");
        itemTextMap.put("minecraft:horn_coral_wall_fan", "250");

        itemTextMap.put("minecraft:dead_tube_coral_wall_fan", "10");
        itemTextMap.put("minecraft:dead_brain_coral_wall_fan", "10");
        itemTextMap.put("minecraft:dead_bubble_coral_wall_fan", "10");
        itemTextMap.put("minecraft:dead_fire_coral_wall_fan", "10");
        itemTextMap.put("minecraft:dead_horn_coral_wall_fan", "10");

        itemTextMap.put("minecraft:tube_coral_block", "500");
        itemTextMap.put("minecraft:brain_coral_block", "500");
        itemTextMap.put("minecraft:bubble_coral_block", "500");
        itemTextMap.put("minecraft:fire_coral_block", "500");
        itemTextMap.put("minecraft:horn_coral_block", "500");

        itemTextMap.put("minecraft:kelp", "5");
        itemTextMap.put("minecraft:kelp_plant", "10");
        itemTextMap.put("minecraft:dried_kelp_block", "30");
        itemTextMap.put("minecraft:dried_kelp","300");
        itemTextMap.put("minecraft:seagrass", "30");
        itemTextMap.put("minecraft:tall_seagrass", "30");
        itemTextMap.put("minecraft:sea_pickle", "50");
        itemTextMap.put("minecraft:turtle_egg", "3000");

        itemTextMap.put("minecraft:prismarine_slab", "10");
        itemTextMap.put("minecraft:prismarine_brick_slab", "25");
        itemTextMap.put("minecraft:dark_prismarine_slab", "30");

        itemTextMap.put("minecraft:prismarine_stairs", "10");
        itemTextMap.put("minecraft:prismarine_brick_stairs", "10");
        itemTextMap.put("minecraft:dark_prismarine_stairs", "10");

        itemTextMap.put("minecraft:oak_wood", "15");
        itemTextMap.put("minecraft:spruce_wood", "15");
        itemTextMap.put("minecraft:birch_wood", "15");
        itemTextMap.put("minecraft:jungle_wood", "15");
        itemTextMap.put("minecraft:acacia_wood", "15");
        itemTextMap.put("minecraft:dark_oak_wood", "15");
        itemTextMap.put("minecraft:crimson_hyphae", "15");
        itemTextMap.put("minecraft:warped_hyphae", "15");

        itemTextMap.put("minecraft:stripped_oak_wood", "40");
        itemTextMap.put("minecraft:stripped_spruce_wood", "40");
        itemTextMap.put("minecraft:stripped_birch_wood", "40");
        itemTextMap.put("minecraft:stripped_jungle_wood", "40");
        itemTextMap.put("minecraft:stripped_acacia_wood", "40");
        itemTextMap.put("minecraft:stripped_dark_oak_wood", "40");
        itemTextMap.put("minecraft:stripped_crimson_hyphae", "40");
        itemTextMap.put("minecraft:stripped_warped_hyphae", "40");

        itemTextMap.put("minecraft:stripped_oak_log", "20");
        itemTextMap.put("minecraft:stripped_spruce_log", "20");
        itemTextMap.put("minecraft:stripped_birch_log", "20");
        itemTextMap.put("minecraft:stripped_jungle_log", "20");
        itemTextMap.put("minecraft:stripped_acacia_log", "20");
        itemTextMap.put("minecraft:stripped_dark_oak_log", "20");
        itemTextMap.put("minecraft:stripped_crimson_stem", "20");
        itemTextMap.put("minecraft:stripped_warped_stem", "20");

        itemTextMap.put("minecraft:oak_button", "5");
        itemTextMap.put("minecraft:spruce_button", "5");
        itemTextMap.put("minecraft:birch_button", "5");
        itemTextMap.put("minecraft:jungle_button", "5");
        itemTextMap.put("minecraft:acacia_button", "5");
        itemTextMap.put("minecraft:dark_oak_button", "5");
        itemTextMap.put("minecraft:crimson_button", "5");
        itemTextMap.put("minecraft:warped_button", "5");
        itemTextMap.put("minecraft:polished_blackstone_button", "5");

        itemTextMap.put("minecraft:pumpkin", "70");
        itemTextMap.put("minecraft:shulker_shell", "2000");

        itemTextMap.put("minecraft:shulker_box", "5000");
        itemTextMap.put("minecraft:white_shulker_box", "5000");
        itemTextMap.put("minecraft:orange_shulker_box", "5000");
        itemTextMap.put("minecraft:magenta_shulker_box", "5000");
        itemTextMap.put("minecraft:light_blue_shulker_box", "5000");
        itemTextMap.put("minecraft:cyan_shulker_box", "5000");
        itemTextMap.put("minecraft:purple_shulker_box", "5000");
        itemTextMap.put("minecraft:blue_shulker_box", "5000");
        itemTextMap.put("minecraft:brown_shulker_box", "5000");
        itemTextMap.put("minecraft:green_shulker_box", "5000");
        itemTextMap.put("minecraft:red_shulker_box", "5000");
        itemTextMap.put("minecraft:light_gray_shulker_box", "5000");//骨
        itemTextMap.put("minecraft:yellow_shulker_box", "5000");//骨
        itemTextMap.put("minecraft:pink_shulker_box", "5000");//骨
        itemTextMap.put("minecraft:lime_shulker_box", "5000");//骨
        itemTextMap.put("minecraft:gray_shulker_box", "5000");//骨
        itemTextMap.put("minecraft:black_shulker_box", "5000");//骨

        itemTextMap.put("minecraft:smooth_stone", "5");

        /**
         * 1.14
         */
        itemTextMap.put("minecraft:bamboo", "20");
        itemTextMap.put("minecraft:bamboo_sapling", "20");
        itemTextMap.put("minecraft:scaffolding", "25");
        itemTextMap.put("minecraft:cornflower", "20");
        itemTextMap.put("minecraft:lily_of_the_valley", "20");
        itemTextMap.put("minecraft:wither_rose", "500");
        itemTextMap.put("minecraft:sweet_berries", "30");
        itemTextMap.put("minecraft:sweet_berry_bush", "100");
        itemTextMap.put("minecraft:barrel", "50");

        itemTextMap.put("minecraft:blast_furnace", "2750");
        itemTextMap.put("minecraft:smoker", "75");
        itemTextMap.put("minecraft:loom", "50");
        itemTextMap.put("minecraft:cartography_table", "50");
        itemTextMap.put("minecraft:fletching_table", "100");
        itemTextMap.put("minecraft:smithing_table", "1100");

        itemTextMap.put("minecraft:composter", "30");
        itemTextMap.put("minecraft:lectern", "600");
        itemTextMap.put("minecraft:grindstone", "50");
        itemTextMap.put("minecraft:stonecutter", "600");
        itemTextMap.put("minecraft:bell", "5000");
        itemTextMap.put("minecraft:campfire", "150");
        itemTextMap.put("minecraft:lantern", "500");
        itemTextMap.put("minecraft:stone_stairs", "10");
        itemTextMap.put("minecraft:stone_slab", "5");
        itemTextMap.put("minecraft:mossy_cobblestone_slab", "15");
        itemTextMap.put("minecraft:mossy_stone_brick_slab", "20");

        itemTextMap.put("minecraft:andesite_slab", "5");
        itemTextMap.put("minecraft:granite_slab", "5");
        itemTextMap.put("minecraft:diorite_slab", "5");
        itemTextMap.put("minecraft:polished_andesite_slab", "10");
        itemTextMap.put("minecraft:polished_granite_slab", "10");
        itemTextMap.put("minecraft:polished_diorite_slab", "10");

        itemTextMap.put("minecraft:smooth_red_sandstone_slab", "5");
        itemTextMap.put("minecraft:smooth_sandstone_slab", "5");
        itemTextMap.put("minecraft:red_nether_brick_slab", "10");
        itemTextMap.put("minecraft:smooth_quartz_slab", "700");
        itemTextMap.put("minecraft:end_stone_brick_slab", "20");
        itemTextMap.put("minecraft:mossy_cobblestone_stairs", "5");
        itemTextMap.put("minecraft:mossy_stone_brick_stairs", "5");
        itemTextMap.put("minecraft:andesite_stairs", "5");
        itemTextMap.put("minecraft:granite_stairs", "5");
        itemTextMap.put("minecraft:diorite_stairs", "5");
        itemTextMap.put("minecraft:polished_andesite_stairs", "10");
        itemTextMap.put("minecraft:polished_granite_stairs", "10");
        itemTextMap.put("minecraft:polished_diorite_stairs", "10");
        itemTextMap.put("minecraft:smooth_red_sandstone_stairs", "5");
        itemTextMap.put("minecraft:smooth_sandstone_stairs", "5");
        itemTextMap.put("minecraft:red_nether_brick_stairs", "25");
        itemTextMap.put("minecraft:smooth_quartz_stairs", "1500");
        itemTextMap.put("minecraft:end_stone_brick_stairs", "12");

        itemTextMap.put("minecraft:stone_brick_wall", "2");
        itemTextMap.put("minecraft:mossy_stone_brick_wall", "2");
        itemTextMap.put("minecraft:diorite_wall", "2");
        itemTextMap.put("minecraft:granite_wall", "2");
        itemTextMap.put("minecraft:andesite_wall", "2");
        itemTextMap.put("minecraft:sandstone_wall", "2");
        itemTextMap.put("minecraft:prismarine_wall", "2");
        itemTextMap.put("minecraft:nether_brick_wall", "2");
        itemTextMap.put("minecraft:red_nether_brick_wall", "2");
        itemTextMap.put("minecraft:end_stone_brick_wall", "2");

        /**
         * 1.15
         */
        itemTextMap.put("minecraft:bee_nest", "5000");
        itemTextMap.put("minecraft:beehive", "1000");
        itemTextMap.put("minecraft:honey_bottle", "300");
        itemTextMap.put("minecraft:honey_block", "1500");
        itemTextMap.put("minecraft:honeycomb", "300");
        itemTextMap.put("minecraft:honeycomb_block", "1500");


        /**
         * 1.16
         */
        itemTextMap.put("minecraft:ancient_debris", "50000");
        itemTextMap.put("minecraft:netherite_scrap", "50000");
        itemTextMap.put("minecraft:netherite_block", "1944000");
        itemTextMap.put("minecraft:netherite_ingot", "216000");
        itemTextMap.put("minecraft:lodestone", "220000");
        itemTextMap.put("minecraft:basalt", "50");
        itemTextMap.put("minecraft:polished_basalt", "1100");
        itemTextMap.put("minecraft:smooth_basalt", "75");
        itemTextMap.put("minecraft:blackstone", "50");
        itemTextMap.put("minecraft:polished_blackstone", "75");
        itemTextMap.put("minecraft:chiseled_polished_blackstone", "100");
        itemTextMap.put("minecraft:polished_blackstone_bricks", "100");
        itemTextMap.put("minecraft:cracked_polished_blackstone_bricks", "100");
        itemTextMap.put("minecraft:gilded_blackstone", "10000");
        itemTextMap.put("minecraft:nether_gold_ore", "500");
        itemTextMap.put("minecraft:cracked_nether_bricks", "10");
        itemTextMap.put("minecraft:chiseled_nether_bricks", "20");
        itemTextMap.put("minecraft:quartz_bricks", "1500");

        itemTextMap.put("minecraft:blackstone_stairs", "10");
        itemTextMap.put("minecraft:polished_blackstone_stairs", "10");
        itemTextMap.put("minecraft:polished_blackstone_brick_stairs", "10");

        itemTextMap.put("minecraft:blackstone_wall", "10");
        itemTextMap.put("minecraft:polished_blackstone_wall", "10");
        itemTextMap.put("minecraft:polished_blackstone_brick_wall", "10");

        itemTextMap.put("minecraft:polished_blackstone_button", "5");
        itemTextMap.put("minecraft:polished_blackstone_pressure_plate", "10");

        itemTextMap.put("minecraft:shroomlight", "1500");
        itemTextMap.put("minecraft:weeping_vines", "5");
        itemTextMap.put("minecraft:weeping_vines_plant", "5");

        itemTextMap.put("minecraft:twisting_vines", "5");
        itemTextMap.put("minecraft:twisting_vines_plant", "5");

        itemTextMap.put("minecraft:nether_sprouts", "5");

        itemTextMap.put("minecraft:crimson_roots", "5");
        itemTextMap.put("minecraft:warped_roots", "5");

        itemTextMap.put("minecraft:crimson_fungus", "30");
        itemTextMap.put("minecraft:warped_fungus", "30");

        itemTextMap.put("minecraft:crimson_nylium", "5");
        itemTextMap.put("minecraft:warped_nylium", "5");

        itemTextMap.put("minecraft:stripped_warped_hyphae", "30");
        itemTextMap.put("minecraft:stripped_crimson_hyphae", "30");

        itemTextMap.put("minecraft:stripped_crimson_stem", "20");
        itemTextMap.put("minecraft:stripped_warped_stem", "20");
        itemTextMap.put("minecraft:crimson_planks", "8");
        itemTextMap.put("minecraft:warped_planks", "8");

        itemTextMap.put("minecraft:warped_slab", "2");
        itemTextMap.put("minecraft:crimson_slab", "2");

        itemTextMap.put("minecraft:crimson_stairs", "10");
        itemTextMap.put("minecraft:warped_stairs", "10");
        itemTextMap.put("minecraft:crimson_fence", "20");
        itemTextMap.put("minecraft:warped_fence", "20");

        itemTextMap.put("minecraft:warped_fence_gate", "30");
        itemTextMap.put("minecraft:crimson_fence_gate", "30");

        itemTextMap.put("minecraft:crimson_door", "30");
        itemTextMap.put("minecraft:warped_door", "30");

        itemTextMap.put("minecraft:crimson_trapdoor", "15");
        itemTextMap.put("minecraft:warped_trapdoor", "15");

        itemTextMap.put("minecraft:warped_button", "5");
        itemTextMap.put("minecraft:crimson_button", "5");

        itemTextMap.put("minecraft:crimson_pressure_plate", "10");
        itemTextMap.put("minecraft:warped_pressure_plate", "10");

        itemTextMap.put("minecraft:crying_obsidian", "5000");
        itemTextMap.put("minecraft:respawn_anchor", "32500");
        itemTextMap.put("minecraft:soul_soil", "10");
        itemTextMap.put("minecraft:soul_fire", "0");
        itemTextMap.put("minecraft:soul_torch", "20");
        itemTextMap.put("minecraft:soul_campfire", "200");
        itemTextMap.put("minecraft:soul_lantern", "500");
        itemTextMap.put("minecraft:chain", "700");
        itemTextMap.put("minecraft:target", "777");

        /**
         * 1.17
         */
        itemTextMap.put("minecraft:small_amethyst_bud", "250");
        itemTextMap.put("minecraft:medium_amethyst_bud", "500");
        itemTextMap.put("minecraft:large_amethyst_bud", "1000");
        itemTextMap.put("minecraft:amethyst_cluster", "2000");
        itemTextMap.put("minecraft:budding_amethyst", "10000");
        itemTextMap.put("minecraft:amethyst_shard", "2000");
        itemTextMap.put("minecraft:amethyst_block", "10000");
        itemTextMap.put("minecraft:pointed_dripstone", "1000");
        itemTextMap.put("minecraft:dripstone_block", "4000");
        itemTextMap.put("minecraft:calcite", "1000");
        itemTextMap.put("minecraft:smooth_basalt", "50");
        itemTextMap.put("minecraft:tuff", "10");
        itemTextMap.put("minecraft:cave_vines", "5");
        itemTextMap.put("minecraft:cave_vines_plant", "5");
        itemTextMap.put("minecraft:glow_berries", "100");
        itemTextMap.put("minecraft:azalea", "50");
        itemTextMap.put("minecraft:flowering_azalea", "100");
        itemTextMap.put("minecraft:azalea_leaves", "100");
        itemTextMap.put("minecraft:flowering_azalea_leaves", "100");
        itemTextMap.put("minecraft:hanging_roots", "50");
        itemTextMap.put("minecraft:spore_blossom", "500");
        itemTextMap.put("minecraft:small_dripleaf", "500");
        itemTextMap.put("minecraft:big_dripleaf", "500");
        itemTextMap.put("minecraft:big_dripleaf_stem", "0");
        itemTextMap.put("minecraft:moss_block", "20");
        itemTextMap.put("minecraft:moss_carpet", "60");
        itemTextMap.put("minecraft:tinted_glass", "5000");

        itemTextMap.put("minecraft:copper_ore", "50");
        itemTextMap.put("minecraft:copper_ingot", "250");
        itemTextMap.put("minecraft:deepslate_copper_ore", "50");

        itemTextMap.put("minecraft:copper_block", "2500");

        itemTextMap.put("minecraft:exposed_copper", "2000");
        itemTextMap.put("minecraft:weathered_copper", "2000");
        itemTextMap.put("minecraft:oxidized_copper", "3000");

        itemTextMap.put("minecraft:cut_copper", "3000");
        itemTextMap.put("minecraft:exposed_cut_copper", "2500");
        itemTextMap.put("minecraft:weathered_cut_copper", "2500");
        itemTextMap.put("minecraft:oxidized_cut_copper", "3500");

        itemTextMap.put("minecraft:waxed_copper_block", "3000");
        itemTextMap.put("minecraft:waxed_exposed_copper", "2500");
        itemTextMap.put("minecraft:waxed_weathered_copper", "2500");
        itemTextMap.put("minecraft:waxed_oxidized_copper", "3500");
        itemTextMap.put("minecraft:waxed_cut_copper", "4000");
        itemTextMap.put("minecraft:waxed_exposed_cut_copper", "3500");
        itemTextMap.put("minecraft:waxed_weathered_cut_copper", "3500");
        itemTextMap.put("minecraft:waxed_oxidized_cut_copper", "4500");

        itemTextMap.put("minecraft:cut_copper_slab", "300");
        itemTextMap.put("minecraft:exposed_cut_copper_slab", "300");
        itemTextMap.put("minecraft:weathered_cut_copper_slab", "300");
        itemTextMap.put("minecraft:oxidized_cut_copper_slab", "300");
        itemTextMap.put("minecraft:waxed_cut_copper_slab", "300");
        itemTextMap.put("minecraft:waxed_exposed_cut_copper_slab", "300");
        itemTextMap.put("minecraft:waxed_weathered_cut_copper_slab", "300");
        itemTextMap.put("minecraft:waxed_oxidized_cut_copper_slab", "300");
        itemTextMap.put("minecraft:cut_copper_stairs", "2500");
        itemTextMap.put("minecraft:exposed_cut_copper_stairs", "2500");
        itemTextMap.put("minecraft:weathered_cut_copper_stairs", "2500");
        itemTextMap.put("minecraft:oxidized_cut_copper_stairs", "2500");
        itemTextMap.put("minecraft:waxed_cut_copper_stairs", "2500");
        itemTextMap.put("minecraft:waxed_exposed_cut_copper_stairs", "2500");
        itemTextMap.put("minecraft:waxed_weathered_cut_copper_stairs", "2500");
        itemTextMap.put("minecraft:waxed_oxidized_cut_copper_stairs", "2500");

        itemTextMap.put("minecraft:lightning_rod", "1000");
        itemTextMap.put("minecraft:sculk_sensor", "5000");

        itemTextMap.put("minecraft:candle", "100");
        itemTextMap.put("minecraft:white_candle", "100");
        itemTextMap.put("minecraft:orange_candle", "100");
        itemTextMap.put("minecraft:magenta_candle", "100");
        itemTextMap.put("minecraft:light_blue_candle", "100");
        itemTextMap.put("minecraft:yellow_candle", "100");
        itemTextMap.put("minecraft:lime_candle", "100");
        itemTextMap.put("minecraft:pink_candle", "100");
        itemTextMap.put("minecraft:gray_candle", "100");
        itemTextMap.put("minecraft:light_gray_candle", "100");
        itemTextMap.put("minecraft:cyan_candle", "100");
        itemTextMap.put("minecraft:purple_candle", "100");
        itemTextMap.put("minecraft:blue_candle", "100");
        itemTextMap.put("minecraft:brown_candle", "100");
        itemTextMap.put("minecraft:green_candle", "100");
        itemTextMap.put("minecraft:red_candle", "100");
        itemTextMap.put("minecraft:black_candle", "100");        // 他のアイテムも同様に追加
    }

    @SubscribeEvent
    public static void onToolTip(ItemTooltipEvent event) {
        ItemStack itemStack = event.getItemStack();
        String itemId = itemStack.getItem().getRegistryName().toString();

        if (itemTextMap.containsKey(itemId)) {
            String customText = itemTextMap.get(itemId);
            event.getToolTip().add(Component.nullToEmpty("価格:" + customText));
        }
    }
    public static void register() {
        MinecraftForge.EVENT_BUS.register(addtip.class);
    }

}