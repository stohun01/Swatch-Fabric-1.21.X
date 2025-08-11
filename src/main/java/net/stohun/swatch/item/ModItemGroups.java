package net.stohun.swatch.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.stohun.swatch.Swatch;
import net.stohun.swatch.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup SWATCH_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Swatch.MOD_ID, "swatch_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.EGG_BLOCK))
                    .displayName(Text.translatable("itemgroup.swatch.swatch_blocks"))
                    .entries((displayContext, entries) -> {
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

                    }).build());

    public static void registerItemGroups() {
        Swatch.LOGGER.info("Registering Item Group for " + Swatch.MOD_ID);
    }
}
