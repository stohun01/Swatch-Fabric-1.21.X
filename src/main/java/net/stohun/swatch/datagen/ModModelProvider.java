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
        BlockStateModelGenerator.BlockTexturePool lithositePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LITHOSITE);
        BlockStateModelGenerator.BlockTexturePool lithositeBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LITHOSITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool polishedLithositePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_LITHOSITE);
        BlockStateModelGenerator.BlockTexturePool warpedBloomPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WARPED_BLOOM);
        //BlockStateModelGenerator.BlockTexturePool glowingWarpedBloomPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GLOWING_WARPED_BLOOM);
        BlockStateModelGenerator.BlockTexturePool netherBloomPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NETHER_BLOOM);
        //BlockStateModelGenerator.BlockTexturePool glowingNetherBloomPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GLOWING_NETHER_BLOOM);
        BlockStateModelGenerator.BlockTexturePool terrorcottaPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TERRORCOTTA);
        BlockStateModelGenerator.BlockTexturePool terrorcottaBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TERRORCOTTA_BRICKS);
        BlockStateModelGenerator.BlockTexturePool brackPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BRACK);
        BlockStateModelGenerator.BlockTexturePool brinePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BRINE);
        BlockStateModelGenerator.BlockTexturePool corrumPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CORRUM);
        BlockStateModelGenerator.BlockTexturePool polishedCorrumPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_CORRUM);
        //BlockStateModelGenerator.BlockTexturePool rivetedCorrumPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RIVETED_CORRUM);
        BlockStateModelGenerator.BlockTexturePool blueEggPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLUE_EGG_BLOCK);

        eggPool.stairs(ModBlocks.EGG_STAIRS);
        eggPool.slab(ModBlocks.EGG_SLAB);
        eggPool.wall(ModBlocks.EGG_WALL);

        rottenEggPool.stairs(ModBlocks.ROTTEN_EGG_STAIRS);
        rottenEggPool.slab(ModBlocks.ROTTEN_EGG_SLAB);
        rottenEggPool.wall(ModBlocks.ROTTEN_EGG_WALL);

        honeyCrystalPool.stairs(ModBlocks.HONEY_CRYSTAL_STAIRS);
        honeyCrystalPool.slab(ModBlocks.HONEY_CRYSTAL_SLAB);
        honeyCrystalPool.wall(ModBlocks.HONEY_CRYSTAL_WALL);

        kelpPool.stairs(ModBlocks.KELP_STAIRS);
        kelpPool.slab(ModBlocks.KELP_SLAB);
        kelpPool.wall(ModBlocks.KELP_WALL);

        lithositePool.stairs(ModBlocks.LITHOSITE_STAIRS);
        lithositePool.slab(ModBlocks.LITHOSITE_SLAB);
        lithositePool.wall(ModBlocks.LITHOSITE_WALL);

        lithositeBricksPool.stairs(ModBlocks.LITHOSITE_BRICKS_STAIRS);
        lithositeBricksPool.slab(ModBlocks.LITHOSITE_BRICKS_SLAB);
        lithositeBricksPool.wall(ModBlocks.LITHOSITE_BRICKS_WALL);

        polishedLithositePool.stairs(ModBlocks.POLISHED_LITHOSITE_STAIRS);
        polishedLithositePool.slab(ModBlocks.POLISHED_LITHOSITE_SLAB);
        polishedLithositePool.wall(ModBlocks.POLISHED_LITHOSITE_WALL);

        warpedBloomPool.stairs(ModBlocks.WARPED_BLOOM_STAIRS);
        warpedBloomPool.slab(ModBlocks.WARPED_BLOOM_SLAB);
        warpedBloomPool.wall(ModBlocks.WARPED_BLOOM_WALL);

        //glowingWarpedBloomPool.stairs(ModBlocks.GLOWING_WARPED_BLOOM_STAIRS);
        //glowingWarpedBloomPool.slab(ModBlocks.GLOWING_WARPED_BLOOM_SLAB);
        //glowingWarpedBloomPool.wall(ModBlocks.GLOWING_WARPED_BLOOM_WALL);

        netherBloomPool.stairs(ModBlocks.NETHER_BLOOM_STAIRS);
        netherBloomPool.slab(ModBlocks.NETHER_BLOOM_SLAB);
        netherBloomPool.wall(ModBlocks.NETHER_BLOOM_WALL);

        //glowingNetherBloomPool.stairs(ModBlocks.GLOWING_NETHER_BLOOM_STAIRS);
        //glowingNetherBloomPool.slab(ModBlocks.GLOWING_NETHER_BLOOM_SLAB);
        //glowingNetherBloomPool.wall(ModBlocks.GLOWING_NETHER_BLOOM_WALL);

        terrorcottaPool.stairs(ModBlocks.TERRORCOTTA_STAIRS);
        terrorcottaPool.slab(ModBlocks.TERRORCOTTA_SLAB);
        terrorcottaPool.wall(ModBlocks.TERRORCOTTA_WALL);

        terrorcottaBricksPool.stairs(ModBlocks.TERRORCOTTA_BRICKS_STAIRS);
        terrorcottaBricksPool.slab(ModBlocks.TERRORCOTTA_BRICKS_SLAB);
        terrorcottaBricksPool.wall(ModBlocks.TERRORCOTTA_BRICKS_WALL);

        brackPool.stairs(ModBlocks.BRACK_STAIRS);
        brackPool.slab(ModBlocks.BRACK_SLAB);
        brackPool.wall(ModBlocks.BRACK_WALL);

        brinePool.stairs(ModBlocks.BRINE_STAIRS);
        brinePool.slab(ModBlocks.BRINE_SLAB);
        brinePool.wall(ModBlocks.BRINE_WALL);

        corrumPool.stairs(ModBlocks.CORRUM_STAIRS);
        corrumPool.slab(ModBlocks.CORRUM_SLAB);
        corrumPool.wall(ModBlocks.CORRUM_WALL);

        polishedCorrumPool.stairs(ModBlocks.POLISHED_CORRUM_STAIRS);
        polishedCorrumPool.slab(ModBlocks.POLISHED_CORRUM_SLAB);
        polishedCorrumPool.wall(ModBlocks.POLISHED_CORRUM_WALL);

        //rivetedCorrumPool.stairs(ModBlocks.RIVETED_CORRUM_STAIRS);
        //rivetedCorrumPool.slab(ModBlocks.RIVETED_CORRUM_SLAB);
        //rivetedCorrumPool.wall(ModBlocks.RIVETED_CORRUM_WALL);

        blueEggPool.stairs(ModBlocks.BLUE_EGG_STAIRS);
        blueEggPool.slab(ModBlocks.BLUE_EGG_SLAB);
        blueEggPool.wall(ModBlocks.BLUE_EGG_WALL);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
