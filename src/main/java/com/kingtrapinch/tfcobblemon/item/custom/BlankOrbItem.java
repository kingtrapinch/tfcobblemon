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

import java.util.List;

public class BlankOrbItem extends Item {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TFCobblemon.MODID);

    private static final Properties ORB_PROPERTIES = new Properties()
            .stacksTo(1)
            .fireResistant();

    public BlankOrbItem() {
        super(ORB_PROPERTIES);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.tfcobblemon.blank_orb"));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

    public static final RegistryObject<Item> BLANK_ORB = ITEMS.register("blank_orb", BlankOrbItem::new);

    // Method to register the items with the event bus
    public static void registerAll(net.minecraftforge.eventbus.api.IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
