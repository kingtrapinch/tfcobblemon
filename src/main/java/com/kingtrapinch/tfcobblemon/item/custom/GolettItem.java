package com.kingtrapinch.tfcobblemon.item.custom;

import com.kingtrapinch.tfcobblemon.TFCobblemon;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.awt.*;
import java.util.List;

public class GolettItem extends Item {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TFCobblemon.MODID);

    private static final Item.Properties GOLETT_PROPERTIES = new Item.Properties()
            .stacksTo(1)
            .fireResistant();

    public GolettItem() {
        super(GOLETT_PROPERTIES);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.tfcobblemon.golett"));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

    public static final RegistryObject<Item> GOLETT = ITEMS.register("golett", GolettItem::new);
    public static final RegistryObject<Item> GOLETT_BLACK = ITEMS.register("golett_black", GolettItem::new);
    public static final RegistryObject<Item> GOLETT_BLUE = ITEMS.register("golett_blue", GolettItem::new);
    public static final RegistryObject<Item> GOLETT_CYAN = ITEMS.register("golett_cyan", GolettItem::new);
    public static final RegistryObject<Item> GOLETT_GRAY = ITEMS.register("golett_gray", GolettItem::new);
    public static final RegistryObject<Item> GOLETT_GREEN = ITEMS.register("golett_green", GolettItem::new);
    public static final RegistryObject<Item> GOLETT_LIGHTBLUE = ITEMS.register("golett_lightblue", GolettItem::new);
    public static final RegistryObject<Item> GOLETT_LIME = ITEMS.register("golett_lime", GolettItem::new);
    public static final RegistryObject<Item> GOLETT_MAGENTA = ITEMS.register("golett_magenta", GolettItem::new);
    public static final RegistryObject<Item> GOLETT_ORANGE = ITEMS.register("golett_orange", GolettItem::new);
    public static final RegistryObject<Item> GOLETT_PINK = ITEMS.register("golett_pink", GolettItem::new);
    public static final RegistryObject<Item> GOLETT_PURPLE = ITEMS.register("golett_purple", GolettItem::new);
    public static final RegistryObject<Item> GOLETT_RED = ITEMS.register("golett_red", GolettItem::new);
    public static final RegistryObject<Item> GOLETT_WHITE = ITEMS.register("golett_white", GolettItem::new);
    public static final RegistryObject<Item> GOLETT_YELLOW = ITEMS.register("golett_yellow", GolettItem::new);

    // Method to register the items with the event bus
    public static void registerAll(net.minecraftforge.eventbus.api.IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
