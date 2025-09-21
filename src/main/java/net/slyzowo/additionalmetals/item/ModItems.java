package net.slyzowo.additionalmetals.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.slyzowo.additionalmetals.AdditionalMetals;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AdditionalMetals.MOD_ID);

    public static final DeferredItem<Item> RAW_ALUMINIUM = ITEMS.register("raw_aluminium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALUMINIUM_NUGGET = ITEMS.register("aluminium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALUMINIUM_SHEET = ITEMS.register("aluminium_sheet", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BRASS_INGOT = ITEMS.register("brass_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRASS_NUGGET = ITEMS.register("brass_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRASS_SHEET = ITEMS.register("brass_sheet", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_SHEET = ITEMS.register("bronze_sheet", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_LITHIUM = ITEMS.register("raw_lithium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LITHIUM_INGOT = ITEMS.register("lithium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LITHIUM_NUGGET = ITEMS.register("lithium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LITHIUM_SHEET = ITEMS.register("lithium_sheet", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> PURPLE_GOLD_INGOT = ITEMS.register("purple_gold_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PURPLE_GOLD_NUGGET = ITEMS.register("purple_gold_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PURPLE_GOLD_SHEET = ITEMS.register("purple_gold_sheet", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_SHEET = ITEMS.register("steel_sheet", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN_NUGGET = ITEMS.register("tin_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN_SHEET = ITEMS.register("tin_sheet", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_TITANIUM = ITEMS.register("raw_titanium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TITANIUM_SHEET = ITEMS.register("titanium_sheet", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_TUNGSTEN = ITEMS.register("raw_tungsten", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TUNGSTEN_NUGGET = ITEMS.register("tungsten_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TUNGSTEN_SHEET = ITEMS.register("tungsten_sheet", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_ZINC = ITEMS.register("raw_zinc", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZINC_INGOT = ITEMS.register("zinc_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZINC_SHEET = ITEMS.register("zinc_sheet", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
