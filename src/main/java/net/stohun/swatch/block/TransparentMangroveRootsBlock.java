package net.stohun.swatch.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.MangroveRootsBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class TransparentMangroveRootsBlock extends MangroveRootsBlock {
    public TransparentMangroveRootsBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean isTransparent(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }
}
