package net.stohun.swatch.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.stohun.swatch.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool eggPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EGG_BLOCK);
        BlockStateModelGenerator.BlockTexturePool rottenEggPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ROTTEN_EGG_BLOCK);

        eggPool.stairs(ModBlocks.EGG_STAIRS);
        eggPool.slab(ModBlocks.EGG_SLAB);

        rottenEggPool.stairs(ModBlocks.ROTTEN_EGG_STAIRS);
        rottenEggPool.slab(ModBlocks.ROTTEN_EGG_SLAB);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
