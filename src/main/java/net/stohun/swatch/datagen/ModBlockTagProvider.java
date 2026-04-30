package net.stohun.swatch.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.stohun.swatch.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.EGG_BLOCK)
                .add(ModBlocks.EGG_STAIRS)
                .add(ModBlocks.EGG_SLAB)
                .add(ModBlocks.EGG_WALL)
                .add(ModBlocks.ROTTEN_EGG_BLOCK)
                .add(ModBlocks.ROTTEN_EGG_STAIRS)
                .add(ModBlocks.ROTTEN_EGG_SLAB)
                .add(ModBlocks.ROTTEN_EGG_WALL)
                .add(ModBlocks.HONEY_CRYSTAL_BLOCK)
                .add(ModBlocks.HONEY_CRYSTAL_STAIRS)
                .add(ModBlocks.HONEY_CRYSTAL_SLAB)
                .add(ModBlocks.HONEY_CRYSTAL_WALL)
                .add(ModBlocks.CRACKED_MUD)
                .add(ModBlocks.CRACKED_MUD_STAIRS)
                .add(ModBlocks.CRACKED_MUD_SLAB)
                .add(ModBlocks.CRACKED_MUD_WALL)
                .add(ModBlocks.EMBALM)
                .add(ModBlocks.EMBALM_STAIRS)
                .add(ModBlocks.EMBALM_SLAB)
                .add(ModBlocks.EMBALM_WALL)
                .add(ModBlocks.LITHOSITE)
                .add(ModBlocks.LITHOSITE_STAIRS)
                .add(ModBlocks.LITHOSITE_SLAB)
                .add(ModBlocks.LITHOSITE_WALL)
                .add(ModBlocks.LITHOSITE_BRICKS)
                .add(ModBlocks.LITHOSITE_BRICKS_STAIRS)
                .add(ModBlocks.LITHOSITE_BRICKS_SLAB)
                .add(ModBlocks.LITHOSITE_BRICKS_WALL)
                .add(ModBlocks.LITHOSITE_TILES)
                .add(ModBlocks.LITHOSITE_TILES_STAIRS)
                .add(ModBlocks.LITHOSITE_TILES_SLAB)
                .add(ModBlocks.LITHOSITE_TILES_WALL)
                .add(ModBlocks.POLISHED_LITHOSITE)
                .add(ModBlocks.POLISHED_LITHOSITE_STAIRS)
                .add(ModBlocks.POLISHED_LITHOSITE_SLAB)
                .add(ModBlocks.POLISHED_LITHOSITE_WALL)
                .add(ModBlocks.CHISELED_LITHOSITE_BRICKS)
                .add(ModBlocks.TERRORCOTTA)
                .add(ModBlocks.TERRORCOTTA_STAIRS)
                .add(ModBlocks.TERRORCOTTA_SLAB)
                .add(ModBlocks.TERRORCOTTA_WALL)
                .add(ModBlocks.TERRORCOTTA_BRICKS)
                .add(ModBlocks.TERRORCOTTA_BRICKS_STAIRS)
                .add(ModBlocks.TERRORCOTTA_BRICKS_SLAB)
                .add(ModBlocks.TERRORCOTTA_BRICKS_WALL)
                .add(ModBlocks.BRACK)
                .add(ModBlocks.BRACK_STAIRS)
                .add(ModBlocks.BRACK_SLAB)
                .add(ModBlocks.BRACK_WALL)
                .add(ModBlocks.BRINE)
                .add(ModBlocks.BRINE_STAIRS)
                .add(ModBlocks.BRINE_SLAB)
                .add(ModBlocks.BRINE_WALL)
                .add(ModBlocks.CORRUM)
                .add(ModBlocks.CORRUM_STAIRS)
                .add(ModBlocks.CORRUM_SLAB)
                .add(ModBlocks.CORRUM_WALL)
                .add(ModBlocks.POLISHED_CORRUM)
                .add(ModBlocks.POLISHED_CORRUM_STAIRS)
                .add(ModBlocks.POLISHED_CORRUM_SLAB)
                .add(ModBlocks.POLISHED_CORRUM_WALL)
                .add(ModBlocks.RIVETED_CORRUM)
                .add(ModBlocks.RIVETED_CORRUM_STAIRS)
                .add(ModBlocks.RIVETED_CORRUM_SLAB)
                .add(ModBlocks.RIVETED_CORRUM_WALL)
                .add(ModBlocks.BLUE_EGG_BLOCK)
                .add(ModBlocks.BLUE_EGG_STAIRS)
                .add(ModBlocks.BLUE_EGG_SLAB)
                .add(ModBlocks.BLUE_EGG_WALL);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.WARPED_BLOOM)
                .add(ModBlocks.WARPED_BLOOM_STAIRS)
                .add(ModBlocks.WARPED_BLOOM_SLAB)
                .add(ModBlocks.WARPED_BLOOM_WALL)
                .add(ModBlocks.GLOWING_WARPED_BLOOM)
                .add(ModBlocks.GLOWING_WARPED_BLOOM_STAIRS)
                .add(ModBlocks.GLOWING_WARPED_BLOOM_SLAB)
                .add(ModBlocks.GLOWING_WARPED_BLOOM_WALL)
                .add(ModBlocks.NETHER_BLOOM)
                .add(ModBlocks.NETHER_BLOOM_STAIRS)
                .add(ModBlocks.NETHER_BLOOM_SLAB)
                .add(ModBlocks.NETHER_BLOOM_WALL)
                .add(ModBlocks.GLOWING_NETHER_BLOOM)
                .add(ModBlocks.GLOWING_NETHER_BLOOM_STAIRS)
                .add(ModBlocks.GLOWING_NETHER_BLOOM_SLAB)
                .add(ModBlocks.GLOWING_NETHER_BLOOM_WALL);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.ROTTEN_PLANKS);

        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.EGG_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.ROTTEN_EGG_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.HONEY_CRYSTAL_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.KELP_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.CRACKED_MUD_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.EMBALM_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.LITHOSITE_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.LITHOSITE_BRICKS_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.LITHOSITE_TILES_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.POLISHED_LITHOSITE_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.WARPED_BLOOM_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.GLOWING_WARPED_BLOOM_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.NETHER_BLOOM_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.GLOWING_NETHER_BLOOM_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.TERRORCOTTA_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.TERRORCOTTA_BRICKS_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.BRACK_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.BRINE_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.CORRUM_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.POLISHED_CORRUM_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.RIVETED_CORRUM_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.BLUE_EGG_WALL);
    }
}
