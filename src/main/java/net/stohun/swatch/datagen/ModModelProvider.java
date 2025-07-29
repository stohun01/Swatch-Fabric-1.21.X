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
        BlockStateModelGenerator.BlockTexturePool honeyCrystalPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.HONEY_CRYSTAL_BLOCK);
        BlockStateModelGenerator.BlockTexturePool kelpPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.KELP_BLOCK);
        BlockStateModelGenerator.BlockTexturePool crackedMudPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CRACKED_MUD);

        eggPool.stairs(ModBlocks.EGG_STAIRS);
        eggPool.slab(ModBlocks.EGG_SLAB);

        rottenEggPool.stairs(ModBlocks.ROTTEN_EGG_STAIRS);
        rottenEggPool.slab(ModBlocks.ROTTEN_EGG_SLAB);

        honeyCrystalPool.stairs(ModBlocks.HONEY_CRYSTAL_STAIRS);
        honeyCrystalPool.slab(ModBlocks.HONEY_CRYSTAL_SLAB);

        kelpPool.stairs(ModBlocks.KELP_STAIRS);
        kelpPool.slab(ModBlocks.KELP_SLAB);

        crackedMudPool.stairs(ModBlocks.CRACKED_MUD_STAIRS);
        crackedMudPool.slab(ModBlocks.CRACKED_MUD_SLAB);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
