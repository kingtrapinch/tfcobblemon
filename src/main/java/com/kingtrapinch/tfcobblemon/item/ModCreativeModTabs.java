package com.kingtrapinch.tfcobblemon.item;

import com.kingtrapinch.tfcobblemon.TFCobblemon;
import com.kingtrapinch.tfcobblemon.item.custom.BlankOrbItem;
import com.kingtrapinch.tfcobblemon.item.custom.GolettItem;
import com.kingtrapinch.tfcobblemon.item.custom.LifeOrbItem;
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
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(GolettItem.GOLETT.get()))
                .title(Component.translatable("creativetab.tfcobblemon_tab"))
                .displayItems((pParameters, pOutput) -> {
                    pOutput.accept(BlankOrbItem.BLANK_ORB.get());
                    pOutput.accept(LifeOrbItem.LIFE_ORB_CHARGING.get());


                    pOutput.accept(GolettItem.GOLETT.get());
                    pOutput.accept(GolettItem.GOLETT_BLACK.get());
                    pOutput.accept(GolettItem.GOLETT_BLUE.get());
                    pOutput.accept(GolettItem.GOLETT_CYAN.get());
                    pOutput.accept(GolettItem.GOLETT_GRAY.get());
                    pOutput.accept(GolettItem.GOLETT_GREEN.get());
                    pOutput.accept(GolettItem.GOLETT_LIGHTBLUE.get());
                    pOutput.accept(GolettItem.GOLETT_LIME.get());
                    pOutput.accept(GolettItem.GOLETT_MAGENTA.get());
                    pOutput.accept(GolettItem.GOLETT_ORANGE.get());
                    pOutput.accept(GolettItem.GOLETT_PINK.get());
                    pOutput.accept(GolettItem.GOLETT_PURPLE.get());
                    pOutput.accept(GolettItem.GOLETT_RED.get());
                    pOutput.accept(GolettItem.GOLETT_WHITE.get());
                    pOutput.accept(GolettItem.GOLETT_YELLOW.get());
                })


                .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
