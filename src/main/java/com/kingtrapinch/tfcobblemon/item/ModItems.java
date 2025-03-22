package com.kingtrapinch.tfcobblemon.item;

import com.kingtrapinch.tfcobblemon.TFCobblemon;
import com.kingtrapinch.tfcobblemon.item.custom.BlankOrbItem;
import com.kingtrapinch.tfcobblemon.item.custom.GolettItem;
import com.kingtrapinch.tfcobblemon.item.custom.LifeOrbItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TFCobblemon.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        GolettItem.registerAll(eventBus);
        LifeOrbItem.registerAll(eventBus);
        BlankOrbItem.registerAll(eventBus);
    }
}
