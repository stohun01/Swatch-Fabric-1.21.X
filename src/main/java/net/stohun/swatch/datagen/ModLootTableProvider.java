package net.stohun.swatch.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.stohun.swatch.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.EGG_BLOCK);
        addDrop(ModBlocks.EGG_STAIRS);
        addDrop(ModBlocks.EGG_SLAB, slabDrops(ModBlocks.EGG_SLAB));
        addDrop(ModBlocks.EGG_WALL);
        addDrop(ModBlocks.ROTTEN_EGG_BLOCK);
        addDrop(ModBlocks.ROTTEN_EGG_STAIRS);
        addDrop(ModBlocks.ROTTEN_EGG_SLAB, slabDrops(ModBlocks.ROTTEN_EGG_SLAB));
        addDrop(ModBlocks.ROTTEN_EGG_WALL);
        addDrop(ModBlocks.EMBALM);
        addDrop(ModBlocks.EMBALM_STAIRS);
        addDrop(ModBlocks.EMBALM_SLAB, slabDrops(ModBlocks.EMBALM_SLAB));
        addDrop(ModBlocks.EMBALM_WALL);
        addDrop(ModBlocks.HONEY_CRYSTAL_BLOCK);
        addDrop(ModBlocks.HONEY_CRYSTAL_STAIRS);
        addDrop(ModBlocks.HONEY_CRYSTAL_SLAB, slabDrops(ModBlocks.HONEY_CRYSTAL_SLAB));
        addDrop(ModBlocks.HONEY_CRYSTAL_WALL);
        addDrop(ModBlocks.KELP_BLOCK);
        addDrop(ModBlocks.KELP_STAIRS);
        addDrop(ModBlocks.KELP_SLAB, slabDrops(ModBlocks.KELP_SLAB));
        addDrop(ModBlocks.KELP_WALL);
        addDrop(ModBlocks.CRACKED_MUD);
        addDrop(ModBlocks.CRACKED_MUD_STAIRS);
        addDrop(ModBlocks.CRACKED_MUD_SLAB, slabDrops(ModBlocks.CRACKED_MUD_SLAB));
        addDrop(ModBlocks.CRACKED_MUD_WALL);
        addDrop(ModBlocks.LITHOSITE);
        addDrop(ModBlocks.LITHOSITE_STAIRS);
        addDrop(ModBlocks.LITHOSITE_SLAB);
        addDrop(ModBlocks.LITHOSITE_WALL);
        addDrop(ModBlocks.LITHOSITE_BRICKS);
        addDrop(ModBlocks.LITHOSITE_BRICKS_STAIRS);
        addDrop(ModBlocks.LITHOSITE_BRICKS_SLAB);
        addDrop(ModBlocks.LITHOSITE_BRICKS_WALL);
        addDrop(ModBlocks.LITHOSITE_TILES);
        addDrop(ModBlocks.LITHOSITE_TILES_STAIRS);
        addDrop(ModBlocks.LITHOSITE_TILES_SLAB);
        addDrop(ModBlocks.LITHOSITE_TILES_WALL);
        addDrop(ModBlocks.POLISHED_LITHOSITE);
        addDrop(ModBlocks.POLISHED_LITHOSITE_STAIRS);
        addDrop(ModBlocks.POLISHED_LITHOSITE_SLAB);
        addDrop(ModBlocks.POLISHED_LITHOSITE_WALL);
        addDrop(ModBlocks.WARPED_BLOOM);

    }
}
