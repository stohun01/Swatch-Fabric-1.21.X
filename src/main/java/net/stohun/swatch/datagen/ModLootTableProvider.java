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
        addDrop(ModBlocks.ROTTEN_EGG_BLOCK);
        addDrop(ModBlocks.ROTTEN_EGG_STAIRS);
        addDrop(ModBlocks.ROTTEN_EGG_SLAB, slabDrops(ModBlocks.ROTTEN_EGG_SLAB));
        addDrop(ModBlocks.EMBALM);
    }
}
