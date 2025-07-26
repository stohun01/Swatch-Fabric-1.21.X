package net.stohun.swatch.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.stohun.swatch.Swatch;

public class ModBlocks {

    public static final Block EGG_BLOCK = registerBlock("egg_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block ROTTEN_EGG_BLOCK = registerBlock("rotten_egg_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

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
            entries.add(ModBlocks.ROTTEN_EGG_BLOCK);
        });
    }
}
