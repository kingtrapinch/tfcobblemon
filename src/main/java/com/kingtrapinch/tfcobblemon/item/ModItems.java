package com.kingtrapinch.tfcobblemon.item;

import com.kingtrapinch.tfcobblemon.TFCobblemon;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModItems {

//    public static final List<String> DYE_COLORS = List.of(
//            "black",
//            "blue",
//            "cyan",
//            "gray",
//            "green",
//            "lightblue",
//            "lime",
//            "magenta",
//            "orange",
//            "pink",
//            "purple",
//            "red",
//            "white",
//            "yellow"
//    );
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TFCobblemon.MODID);

    public static final RegistryObject<Item> GOLETT = ITEMS.register("golett",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
                    ));
    public static final RegistryObject<Item> GOLETT_BLACK = ITEMS.register("golett_black",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> GOLETT_BLUE = ITEMS.register("golett_blue",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> GOLETT_CYAN = ITEMS.register("golett_cyan",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> GOLETT_GRAY = ITEMS.register("golett_gray",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> GOLETT_GREEN = ITEMS.register("golett_green",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> GOLETT_LIGHTBLUE = ITEMS.register("golett_lightblue",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> GOLETT_LIME = ITEMS.register("golett_lime",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> GOLETT_MAGENTA = ITEMS.register("golett_magenta",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> GOLETT_ORANGE = ITEMS.register("golett_orange",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> GOLETT_PINK = ITEMS.register("golett_pink",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> GOLETT_PURPLE = ITEMS.register("golett_purple",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> GOLETT_RED = ITEMS.register("golett_red",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> GOLETT_WHITE = ITEMS.register("golett_white",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> GOLETT_YELLOW = ITEMS.register("golett_yellow",
            () -> new Item(new Item.Properties().stacksTo(1)));

//
//    public static void registerColoredItems() {
//        for (String dye : DYE_COLORS) {
//            String itemName = "golett_" + dye;
//            String valueName = "GOLETT_" + dye.toUpperCase();
//            String displayName = "Suspicious " + formatDyeName(dye) + " Vessel";
//
//            ITEMS.register(itemName, () -> new Item(new Item.Properties()
//                    .stacksTo(1)) // Unstackable
//            );
//        }
//    }
//
//    private static String formatDyeName(String dye) {
//        if (dye.equals("lightblue")) {
//            return "Light Blue";
//        }
//        return Character.toUpperCase(dye.charAt(0)) + dye.substring(1);
//    }


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
//

}
