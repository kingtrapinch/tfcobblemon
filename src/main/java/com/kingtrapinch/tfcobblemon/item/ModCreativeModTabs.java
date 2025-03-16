package com.kingtrapinch.tfcobblemon.item;

import com.kingtrapinch.tfcobblemon.TFCobblemon;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TFCobblemon.MODID);

    public static final RegistryObject<CreativeModeTab> TFCOBBLEMON_TAB = CREATIVE_MODE_TABS.register("tfcobblemon_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GOLETT.get()))
                .title(Component.translatable("creativetab.tfcobblemon_tab"))
                .displayItems((pParameters, pOutput) -> {
                    pOutput.accept(ModItems.GOLETT.get());
                    pOutput.accept(ModItems.GOLETT_BLACK.get());
                    pOutput.accept(ModItems.GOLETT_BLUE.get());
                    pOutput.accept(ModItems.GOLETT_CYAN.get());
                    pOutput.accept(ModItems.GOLETT_GRAY.get());
                    pOutput.accept(ModItems.GOLETT_GREEN.get());
                    pOutput.accept(ModItems.GOLETT_LIGHTBLUE.get());
                    pOutput.accept(ModItems.GOLETT_LIME.get());
                    pOutput.accept(ModItems.GOLETT_MAGENTA.get());
                    pOutput.accept(ModItems.GOLETT_ORANGE.get());
                    pOutput.accept(ModItems.GOLETT_PINK.get());
                    pOutput.accept(ModItems.GOLETT_PURPLE.get());
                    pOutput.accept(ModItems.GOLETT_RED.get());
                    pOutput.accept(ModItems.GOLETT_WHITE.get());
                    pOutput.accept(ModItems.GOLETT_YELLOW.get());
                })


                .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
