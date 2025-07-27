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
                        entries.add(ModBlocks.ROTTEN_EGG_BLOCK);
                        entries.add(ModBlocks.ROTTEN_EGG_STAIRS);
                        entries.add(ModBlocks.ROTTEN_EGG_SLAB);
                        entries.add(ModBlocks.EMBALM);

                    }).build());

    public static void registerItemGroups() {
        Swatch.LOGGER.info("Registering Item Group for " + Swatch.MOD_ID);
    }
}
