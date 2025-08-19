package net.stohun.swatch.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.stohun.swatch.Swatch;

public class ModBlocks {

    public static final Block EGG_BLOCK = registerBlock("egg_block",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block EGG_STAIRS = registerBlock("egg_stairs",
            new StairsBlock(ModBlocks.EGG_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block EGG_SLAB = registerBlock("egg_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block EGG_WALL = registerBlock("egg_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block ROTTEN_EGG_BLOCK = registerBlock("rotten_egg_block",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block ROTTEN_EGG_STAIRS = registerBlock("rotten_egg_stairs",
            new StairsBlock(ModBlocks.EGG_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block ROTTEN_EGG_SLAB = registerBlock("rotten_egg_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block ROTTEN_EGG_WALL = registerBlock("rotten_egg_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block HONEY_CRYSTAL_BLOCK = registerBlock("honey_crystal_block",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block HONEY_CRYSTAL_STAIRS = registerBlock("honey_crystal_stairs",
            new StairsBlock(ModBlocks.HONEY_CRYSTAL_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block HONEY_CRYSTAL_SLAB = registerBlock("honey_crystal_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block HONEY_CRYSTAL_WALL = registerBlock("honey_crystal_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block KELP_BLOCK = registerBlock("kelp_block",
            new Block(AbstractBlock.Settings.create().strength(0.5f).sounds(BlockSoundGroup.AZALEA_LEAVES)));

    public static final Block KELP_STAIRS = registerBlock("kelp_stairs",
            new StairsBlock(ModBlocks.KELP_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(0.5f).sounds(BlockSoundGroup.AZALEA_LEAVES)));

    public static final Block KELP_SLAB = registerBlock("kelp_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(0.5f).sounds(BlockSoundGroup.AZALEA_LEAVES)));

    public static final Block KELP_WALL = registerBlock("kelp_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(0.5f).requiresTool().sounds(BlockSoundGroup.AZALEA_LEAVES)));

    public static final Block CRACKED_MUD = registerBlock("cracked_mud",
            new Block(AbstractBlock.Settings.create().strength(1.25f, 4.2f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block CRACKED_MUD_STAIRS = registerBlock("cracked_mud_stairs",
            new StairsBlock(ModBlocks.KELP_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.25f, 4.2f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block CRACKED_MUD_SLAB = registerBlock("cracked_mud_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.25f, 4.2f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block CRACKED_MUD_WALL = registerBlock("cracked_mud_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.25f, 4.2f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block EMBALM = registerBlock("embalm",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block EMBALM_STAIRS = registerBlock("embalm_stairs",
            new StairsBlock(ModBlocks.EMBALM.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block EMBALM_SLAB = registerBlock("embalm_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block EMBALM_WALL = registerBlock("embalm_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block LITHOSITE = registerBlock("lithosite",
            new Block(AbstractBlock.Settings.create().strength(1.25f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block LITHOSITE_STAIRS = registerBlock("lithosite_stairs",
            new StairsBlock(ModBlocks.LITHOSITE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.25f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block LITHOSITE_SLAB = registerBlock("lithosite_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.25f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block LITHOSITE_WALL = registerBlock("lithosite_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.25f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block LITHOSITE_BRICKS = registerBlock("lithosite_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.25f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block LITHOSITE_BRICKS_STAIRS = registerBlock("lithosite_bricks_stairs",
            new StairsBlock(ModBlocks.LITHOSITE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.25f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block LITHOSITE_BRICKS_SLAB = registerBlock("lithosite_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.25f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block LITHOSITE_BRICKS_WALL = registerBlock("lithosite_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.25f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block LITHOSITE_TILES = registerBlock("lithosite_tiles",
            new Block(AbstractBlock.Settings.create().strength(1.25f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block LITHOSITE_TILES_STAIRS = registerBlock("lithosite_tiles_stairs",
            new StairsBlock(ModBlocks.LITHOSITE_TILES.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.25f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block LITHOSITE_TILES_SLAB = registerBlock("lithosite_tiles_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.25f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block LITHOSITE_TILES_WALL = registerBlock("lithosite_tiles_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.25f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_LITHOSITE = registerBlock("polished_lithosite",
            new Block(AbstractBlock.Settings.create().strength(1.25f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_LITHOSITE_STAIRS = registerBlock("polished_lithosite_stairs",
            new StairsBlock(ModBlocks.POLISHED_LITHOSITE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1.25f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_LITHOSITE_SLAB = registerBlock("polished_lithosite_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.25f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_LITHOSITE_WALL = registerBlock("polished_lithosite_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.25f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block CHISELED_LITHOSITE_BRICKS = registerBlock("chiseled_lithosite_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.25f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block WARPED_BLOOM = registerBlock("warped_bloom",
            new Block(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.WART_BLOCK)));

    public static final Block WARPED_BLOOM_STAIRS = registerBlock("warped_bloom_stairs",
            new StairsBlock(ModBlocks.WARPED_BLOOM.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.WART_BLOCK)));

    public static final Block WARPED_BLOOM_SLAB = registerBlock("warped_bloom_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.WART_BLOCK)));

    public static final Block WARPED_BLOOM_WALL = registerBlock("warped_bloom_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.WART_BLOCK)));

    public static final Block GLOWING_WARPED_BLOOM = registerBlock("glowing_warped_bloom",
            new Block(AbstractBlock.Settings.create().emissiveLighting(ModBlocks::always).luminance(value -> 1).strength(1f).sounds(BlockSoundGroup.WART_BLOCK)));

    public static final Block GLOWING_WARPED_BLOOM_STAIRS = registerBlock("glowing_warped_bloom_stairs",
            new StairsBlock(ModBlocks.GLOWING_WARPED_BLOOM.getDefaultState(),
                    AbstractBlock.Settings.create().emissiveLighting(ModBlocks::always).luminance(value -> 1).strength(1f).sounds(BlockSoundGroup.WART_BLOCK)));

    public static final Block GLOWING_WARPED_BLOOM_SLAB = registerBlock("glowing_warped_bloom_slab",
            new SlabBlock(AbstractBlock.Settings.create().emissiveLighting(ModBlocks::always).luminance(value -> 1).strength(1f).sounds(BlockSoundGroup.WART_BLOCK)));

    public static final Block GLOWING_WARPED_BLOOM_WALL = registerBlock("glowing_warped_bloom_wall",
            new WallBlock(AbstractBlock.Settings.create().emissiveLighting(ModBlocks::always).luminance(value -> 1).strength(1f).sounds(BlockSoundGroup.WART_BLOCK)));

    public static final Block NETHER_BLOOM = registerBlock("nether_bloom",
            new Block(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.WART_BLOCK)));

    public static final Block NETHER_BLOOM_STAIRS = registerBlock("nether_bloom_stairs",
            new StairsBlock(ModBlocks.NETHER_BLOOM.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.WART_BLOCK)));

    public static final Block NETHER_BLOOM_SLAB = registerBlock("nether_bloom_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.WART_BLOCK)));

    public static final Block NETHER_BLOOM_WALL = registerBlock("nether_bloom_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.WART_BLOCK)));

    public static final Block GLOWING_NETHER_BLOOM = registerBlock("glowing_nether_bloom",
            new Block(AbstractBlock.Settings.create().emissiveLighting(ModBlocks::always).luminance(value -> 1).strength(1f).sounds(BlockSoundGroup.WART_BLOCK)));

    public static final Block GLOWING_NETHER_BLOOM_STAIRS = registerBlock("glowing_nether_bloom_stairs",
            new StairsBlock(ModBlocks.GLOWING_NETHER_BLOOM.getDefaultState(),
                    AbstractBlock.Settings.create().emissiveLighting(ModBlocks::always).luminance(value -> 1).strength(1f).sounds(BlockSoundGroup.WART_BLOCK)));

    public static final Block GLOWING_NETHER_BLOOM_SLAB = registerBlock("glowing_nether_bloom_slab",
            new SlabBlock(AbstractBlock.Settings.create().emissiveLighting(ModBlocks::always).luminance(value -> 1).strength(1f).sounds(BlockSoundGroup.WART_BLOCK)));

    public static final Block GLOWING_NETHER_BLOOM_WALL = registerBlock("glowing_nether_bloom_wall",
            new WallBlock(AbstractBlock.Settings.create().emissiveLighting(ModBlocks::always).luminance(value -> 1).strength(1f).sounds(BlockSoundGroup.WART_BLOCK)));

    public static final Block ROTTEN_PLANKS = registerBlock("rotten_planks",
            new MangroveRootsBlock(AbstractBlock.Settings.create().strength(2.0f, 3.0f).sounds(BlockSoundGroup.BAMBOO_WOOD).nonOpaque()));

    public static final Block PINK_BOUQUET_SLAB = registerBlock("pink_bouquet_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(0.5f).sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque().noCollision().nonOpaque()));

    public static final Block WHITE_BOUQUET_SLAB = registerBlock("white_bouquet_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(0.5f).sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque().noCollision().nonOpaque()));

    public static final Block YELLOW_BOUQUET_SLAB = registerBlock("yellow_bouquet_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(0.5f).sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque().noCollision().nonOpaque()));

    private static boolean always(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Swatch.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Swatch.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Swatch.LOGGER.info("Registering Mod Blocks for " + Swatch.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.EGG_BLOCK);
            entries.add(ModBlocks.EGG_STAIRS);
            entries.add(ModBlocks.EGG_SLAB);
            entries.add(ModBlocks.EGG_WALL);
            entries.add(ModBlocks.ROTTEN_EGG_BLOCK);
            entries.add(ModBlocks.ROTTEN_EGG_STAIRS);
            entries.add(ModBlocks.ROTTEN_EGG_SLAB);
            entries.add(ModBlocks.ROTTEN_EGG_WALL);
            entries.add(ModBlocks.HONEY_CRYSTAL_BLOCK);
            entries.add(ModBlocks.HONEY_CRYSTAL_STAIRS);
            entries.add(ModBlocks.HONEY_CRYSTAL_SLAB);
            entries.add(ModBlocks.HONEY_CRYSTAL_WALL);
            entries.add(ModBlocks.KELP_BLOCK);
            entries.add(ModBlocks.KELP_STAIRS);
            entries.add(ModBlocks.KELP_SLAB);
            entries.add(ModBlocks.KELP_WALL);
            entries.add(ModBlocks.CRACKED_MUD);
            entries.add(ModBlocks.CRACKED_MUD_STAIRS);
            entries.add(ModBlocks.CRACKED_MUD_SLAB);
            entries.add(ModBlocks.CRACKED_MUD_WALL);
            entries.add(ModBlocks.EMBALM);
            entries.add(ModBlocks.EMBALM_STAIRS);
            entries.add(ModBlocks.EMBALM_SLAB);
            entries.add(ModBlocks.EMBALM_WALL);
            entries.add(ModBlocks.LITHOSITE);
            entries.add(ModBlocks.LITHOSITE_STAIRS);
            entries.add(ModBlocks.LITHOSITE_SLAB);
            entries.add(ModBlocks.LITHOSITE_WALL);
            entries.add(ModBlocks.LITHOSITE_BRICKS);
            entries.add(ModBlocks.LITHOSITE_BRICKS_STAIRS);
            entries.add(ModBlocks.LITHOSITE_BRICKS_SLAB);
            entries.add(ModBlocks.LITHOSITE_BRICKS_WALL);
            entries.add(ModBlocks.LITHOSITE_TILES);
            entries.add(ModBlocks.LITHOSITE_TILES_STAIRS);
            entries.add(ModBlocks.LITHOSITE_TILES_SLAB);
            entries.add(ModBlocks.LITHOSITE_TILES_WALL);
            entries.add(ModBlocks.POLISHED_LITHOSITE);
            entries.add(ModBlocks.POLISHED_LITHOSITE_STAIRS);
            entries.add(ModBlocks.POLISHED_LITHOSITE_SLAB);
            entries.add(ModBlocks.POLISHED_LITHOSITE_WALL);
            entries.add(ModBlocks.CHISELED_LITHOSITE_BRICKS);
            entries.add(ModBlocks.WARPED_BLOOM);
            entries.add(ModBlocks.WARPED_BLOOM_STAIRS);
            entries.add(ModBlocks.WARPED_BLOOM_SLAB);
            entries.add(ModBlocks.WARPED_BLOOM_WALL);
            entries.add(ModBlocks.GLOWING_WARPED_BLOOM);
            entries.add(ModBlocks.GLOWING_WARPED_BLOOM_STAIRS);
            entries.add(ModBlocks.GLOWING_WARPED_BLOOM_SLAB);
            entries.add(ModBlocks.GLOWING_WARPED_BLOOM_WALL);
            entries.add(ModBlocks.NETHER_BLOOM);
            entries.add(ModBlocks.NETHER_BLOOM_STAIRS);
            entries.add(ModBlocks.NETHER_BLOOM_SLAB);
            entries.add(ModBlocks.NETHER_BLOOM_WALL);
            entries.add(ModBlocks.GLOWING_NETHER_BLOOM);
            entries.add(ModBlocks.GLOWING_NETHER_BLOOM_STAIRS);
            entries.add(ModBlocks.GLOWING_NETHER_BLOOM_SLAB);
            entries.add(ModBlocks.GLOWING_NETHER_BLOOM_WALL);
            entries.add(ModBlocks.ROTTEN_PLANKS);
            entries.add(ModBlocks.PINK_BOUQUET_SLAB);
            entries.add(ModBlocks.WHITE_BOUQUET_SLAB);
            entries.add(ModBlocks.YELLOW_BOUQUET_SLAB);
        });

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.KELP_BLOCK, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.KELP_STAIRS, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.KELP_SLAB, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.KELP_WALL, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ROTTEN_PLANKS, 5, 20);
    }
}
