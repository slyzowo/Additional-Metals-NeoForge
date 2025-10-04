package net.slyzowo.additionalmetals.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.slyzowo.additionalmetals.block.ModBlocks;
import net.slyzowo.additionalmetals.item.ModItems;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.ALUMINIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_ALUMINIUM_BLOCK.get());
        add(ModBlocks.ALUMINIUM_ORE.get(), block -> createOreDrop(ModBlocks.ALUMINIUM_ORE.get(), ModItems.RAW_ALUMINIUM.get()));
        add(ModBlocks.DEEPSLATE_ALUMINIUM_ORE.get(), block -> createOreDrop(ModBlocks.DEEPSLATE_ALUMINIUM_ORE.get(), ModItems.RAW_ALUMINIUM.get()));

        dropSelf(ModBlocks.BRASS_BLOCK.get());
        dropSelf(ModBlocks.BRONZE_BLOCK.get());

        dropSelf(ModBlocks.LITHIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_LITHIUM_BLOCK.get());
        add(ModBlocks.LITHIUM_ORE.get(), block -> createOreDrop(ModBlocks.LITHIUM_ORE.get(), ModItems.RAW_LITHIUM.get()));
        add(ModBlocks.DEEPSLATE_LITHIUM_ORE.get(), block -> createOreDrop(ModBlocks.DEEPSLATE_LITHIUM_ORE.get(), ModItems.RAW_LITHIUM.get()));

        dropSelf(ModBlocks.PURPLE_GOLD_BLOCK.get());
        dropSelf(ModBlocks.STEEL_BLOCK.get());

        dropSelf(ModBlocks.TIN_BLOCK.get());
        dropSelf(ModBlocks.RAW_TIN_BLOCK.get());
        add(ModBlocks.TIN_ORE.get(), block -> createOreDrop(ModBlocks.TIN_ORE.get(), ModItems.RAW_TIN.get()));
        add(ModBlocks.DEEPSLATE_TIN_ORE.get(), block -> createOreDrop(ModBlocks.DEEPSLATE_TIN_ORE.get(), ModItems.RAW_TIN.get()));

        dropSelf(ModBlocks.TITANIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_TITANIUM_BLOCK.get());
        add(ModBlocks.TITANIUM_ORE.get(), block -> createOreDrop(ModBlocks.TITANIUM_ORE.get(), ModItems.RAW_TITANIUM.get()));
        add(ModBlocks.DEEPSLATE_TITANIUM_ORE.get(), block -> createOreDrop(ModBlocks.DEEPSLATE_TITANIUM_ORE.get(), ModItems.RAW_TITANIUM.get()));

        dropSelf(ModBlocks.TUNGSTEN_BLOCK.get());
        dropSelf(ModBlocks.RAW_TUNGSTEN_BLOCK.get());
        add(ModBlocks.TUNGSTEN_ORE.get(), block -> createOreDrop(ModBlocks.TUNGSTEN_ORE.get(), ModItems.RAW_TUNGSTEN.get()));
        add(ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get(), block -> createOreDrop(ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get(), ModItems.RAW_TUNGSTEN.get()));

        dropSelf(ModBlocks.ZINC_BLOCK.get());
        dropSelf(ModBlocks.RAW_ZINC_BLOCK.get());
        add(ModBlocks.ZINC_ORE.get(), block -> createOreDrop(ModBlocks.ZINC_ORE.get(), ModItems.RAW_ZINC.get()));
        add(ModBlocks.DEEPSLATE_ZINC_ORE.get(), block -> createOreDrop(ModBlocks.DEEPSLATE_ZINC_ORE.get(), ModItems.RAW_ZINC.get()));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks(){
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
