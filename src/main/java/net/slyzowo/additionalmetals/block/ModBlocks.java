package net.slyzowo.additionalmetals.block;


import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.slyzowo.additionalmetals.AdditionalMetals;
import net.slyzowo.additionalmetals.item.ModItems;

import javax.swing.*;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(AdditionalMetals.MOD_ID);


    public static final DeferredBlock<Block> ALUMINIUM_BLOCK = registerBlock("aluminium_block",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
            ));
    public static final DeferredBlock<Block> ALUMINIUM_ORE = registerBlock("aluminium_ore",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
            ));
    public static final DeferredBlock<Block> DEEPSLATE_ALUMINIUM_ORE = registerBlock("deepslate_aluminium_ore",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
            ));
    public static final DeferredBlock<Block> RAW_ALUMINIUM_BLOCK = registerBlock("raw_aluminium_block",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
            ));
    public static final DeferredBlock<Block> BRASS_BLOCK = registerBlock("brass_block",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
            ));
    public static final DeferredBlock<Block> BRONZE_BLOCK = registerBlock("bronze_block",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
            ));
    public static final DeferredBlock<Block> LITHIUM_BLOCK = registerBlock("lithium_block",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
            ));
    public static final DeferredBlock<Block> RAW_LITHIUM_BLOCK = registerBlock("raw_lithium_block",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
            ));
    public static final DeferredBlock<Block> LITHIUM_ORE = registerBlock("lithium_ore",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
            ));
    public static final DeferredBlock<Block> DEEPSLATE_LITHIUM_ORE = registerBlock("deepslate_lithium_ore",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
            ));
    public static final DeferredBlock<Block> PURPLE_GOLD_BLOCK = registerBlock("purple_gold_block",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
            ));
    public static final DeferredBlock<Block> STEEL_BLOCK = registerBlock("steel_block",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
            ));
    public static final DeferredBlock<Block> TIN_BLOCK = registerBlock("tin_block",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
            ));
    public static final DeferredBlock<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
            ));
    public static final DeferredBlock<Block> TIN_ORE = registerBlock("tin_ore",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
            ));
    public static final DeferredBlock<Block> DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
            ));
    public static final DeferredBlock<Block> TITANIUM_BLOCK = registerBlock("titanium_block",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
            ));
    public static final DeferredBlock<Block> RAW_TITANIUM_BLOCK = registerBlock("raw_titanium_block",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
            ));
    public static final DeferredBlock<Block> TITANIUM_ORE = registerBlock("titanium_ore",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
            ));
    public static final DeferredBlock<Block> DEEPSLATE_TITANIUM_ORE = registerBlock("deepslate_titanium_ore",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
            ));
    public static final DeferredBlock<Block> TUNGSTEN_BLOCK = registerBlock("tungsten_block",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
            ));
    public static final DeferredBlock<Block> RAW_TUNGSTEN_BLOCK = registerBlock("raw_tungsten_block",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
            ));
    public static final DeferredBlock<Block> TUNGSTEN_ORE = registerBlock("tungsten_ore",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
            ));
    public static final DeferredBlock<Block> DEEPSLATE_TUNGSTEN_ORE = registerBlock("deepslate_tungsten_ore",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
            ));
    public static final DeferredBlock<Block> ZINC_BLOCK = registerBlock("zinc_block",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
            ));
    public static final DeferredBlock<Block> RAW_ZINC_BLOCK = registerBlock("raw_zinc_block",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
            ));
    public static final DeferredBlock<Block> ZINC_ORE = registerBlock("zinc_ore",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
            ));
    public static final DeferredBlock<Block> DEEPSLATE_ZINC_ORE = registerBlock("deepslate_zinc_ore",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
            ));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block){
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block){
        ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
