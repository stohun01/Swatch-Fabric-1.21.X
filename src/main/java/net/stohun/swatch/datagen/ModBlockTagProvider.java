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
                .add(ModBlocks.EMBALM)
                .add(ModBlocks.LITHOSITE)
                .add(ModBlocks.LITHOSITE_BRICKS)
                .add(ModBlocks.LITHOSITE_TILES)
                .add(ModBlocks.POLISHED_LITHOSITE);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.WARPED_BLOOM);

        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.EGG_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.ROTTEN_EGG_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.HONEY_CRYSTAL_WALL);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.KELP_WALL);
    }
}
