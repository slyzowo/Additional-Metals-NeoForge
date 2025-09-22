package net.slyzowo.additionalmetals.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.slyzowo.additionalmetals.AdditionalMetals;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.slyzowo.additionalmetals.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AdditionalMetals.MOD_ID);


    public static final Supplier<CreativeModeTab> ADDITIONAL_METALS_TAB = CREATIVE_MODE_TAB.register("additional_metals_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.PURPLE_GOLD_INGOT.get()))
                    .title(Component.translatable("creativetab.additionalmetals"))
                    .displayItems((itemDisplayParameters, output) ->{

                        output.accept(ModBlocks.ALUMINIUM_BLOCK);
                        output.accept(ModBlocks.RAW_ALUMINIUM_BLOCK);
                        output.accept(ModBlocks.ALUMINIUM_ORE);
                        output.accept(ModBlocks.DEEPSLATE_ALUMINIUM_ORE);
                        output.accept(ModItems.ALUMINIUM_INGOT);
                        output.accept(ModItems.RAW_ALUMINIUM);
                        output.accept(ModItems.ALUMINIUM_NUGGET);
                        output.accept(ModItems.ALUMINIUM_SHEET);

                        output.accept(ModBlocks.BRASS_BLOCK);
                        output.accept(ModItems.BRASS_INGOT);
                        output.accept(ModItems.BRASS_NUGGET);
                        output.accept(ModItems.BRASS_SHEET);

                        output.accept(ModBlocks.BRONZE_BLOCK);
                        output.accept(ModItems.BRONZE_INGOT);
                        output.accept(ModItems.BRONZE_NUGGET);
                        output.accept(ModItems.BRONZE_SHEET);

                        output.accept(ModBlocks.LITHIUM_BLOCK);
                        output.accept(ModBlocks.RAW_LITHIUM_BLOCK);
                        output.accept(ModBlocks.LITHIUM_ORE);
                        output.accept(ModBlocks.DEEPSLATE_LITHIUM_ORE);
                        output.accept(ModItems.LITHIUM_INGOT);
                        output.accept(ModItems.RAW_LITHIUM);
                        output.accept(ModItems.LITHIUM_NUGGET);
                        output.accept(ModItems.LITHIUM_SHEET);

                        output.accept(ModBlocks.PURPLE_GOLD_BLOCK);
                        output.accept(ModItems.PURPLE_GOLD_INGOT);
                        output.accept(ModItems.PURPLE_GOLD_NUGGET);
                        output.accept(ModItems.PURPLE_GOLD_SHEET);

                        output.accept(ModBlocks.STEEL_BLOCK);
                        output.accept(ModItems.STEEL_INGOT);
                        output.accept(ModItems.STEEL_NUGGET);
                        output.accept(ModItems.STEEL_SHEET);

                        output.accept(ModBlocks.TIN_BLOCK);
                        output.accept(ModBlocks.RAW_TIN_BLOCK);
                        output.accept(ModBlocks.TIN_ORE);
                        output.accept(ModBlocks.DEEPSLATE_TIN_ORE);
                        output.accept(ModItems.TIN_INGOT);
                        output.accept(ModItems.RAW_TIN);
                        output.accept(ModItems.TIN_NUGGET);
                        output.accept(ModItems.TIN_SHEET);

                        output.accept(ModBlocks.TITANIUM_BLOCK);
                        output.accept(ModBlocks.RAW_TITANIUM_BLOCK);
                        output.accept(ModBlocks.TITANIUM_ORE);
                        output.accept(ModBlocks.DEEPSLATE_TITANIUM_ORE);
                        output.accept(ModItems.TITANIUM_INGOT);
                        output.accept(ModItems.RAW_TITANIUM);
                        output.accept(ModItems.TITANIUM_NUGGET);
                        output.accept(ModItems.TITANIUM_SHEET);

                        output.accept(ModBlocks.TUNGSTEN_BLOCK);
                        output.accept(ModBlocks.RAW_TUNGSTEN_BLOCK);
                        output.accept(ModBlocks.TUNGSTEN_ORE);
                        output.accept(ModBlocks.DEEPSLATE_TUNGSTEN_ORE);
                        output.accept(ModItems.TUNGSTEN_INGOT);
                        output.accept(ModItems.RAW_TUNGSTEN);
                        output.accept(ModItems.TUNGSTEN_NUGGET);
                        output.accept(ModItems.TUNGSTEN_SHEET);

                        output.accept(ModBlocks.ZINC_BLOCK);
                        output.accept(ModBlocks.RAW_ZINC_BLOCK);
                        output.accept(ModBlocks.ZINC_ORE);
                        output.accept(ModBlocks.DEEPSLATE_ZINC_ORE);
                        output.accept(ModItems.ZINC_INGOT);
                        output.accept(ModItems.RAW_ZINC);
                        output.accept(ModItems.ZINC_NUGGET);
                        output.accept(ModItems.ZINC_SHEET);
                    })
                    .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
