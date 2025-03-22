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

public class LifeOrbItem extends Item {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TFCobblemon.MODID);

    private static final Properties LIFE_ORB_PROPERTIES = new Properties()
            .stacksTo(1)
            .fireResistant()
            .durability(100);

    public LifeOrbItem() {
        super(LIFE_ORB_PROPERTIES);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.tfcobblemon.life_orb_charging"));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
//
//    @Override
//    public boolean isBarVisible(ItemStack pStack) {
//        return true;
//    }

    @Override
    public int getBarColor(ItemStack pStack) {
        return 0xE347C1;
    }

    public boolean isFoil(ItemStack stack) {
        return true;
    }

    public static final RegistryObject<Item> LIFE_ORB_CHARGING = ITEMS.register("life_orb_charging", LifeOrbItem::new);

    // Method to register the items with the event bus
    public static void registerAll(net.minecraftforge.eventbus.api.IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
