package com.kingtrapinch.tfcobblemon.mixin;

import com.cobblemon.mod.common.block.RevivalHerbBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;

import javax.annotation.ParametersAreNonnullByDefault;

@Pseudo
@Mixin(RevivalHerbBlock.class)
public abstract class RevivalHerbMixin extends CropBlock {
    public RevivalHerbMixin(Properties p_51021_) {
        super(p_51021_);
    }

    @Override
    @ParametersAreNonnullByDefault
    protected boolean mayPlaceOn(BlockState p_51042_, BlockGetter p_51043_, BlockPos p_51044_) {
        return super.mayPlaceOn(p_51042_, p_51043_, p_51044_) || p_51042_.is(TagKey.create(Registries.BLOCK, new ResourceLocation("tfc:mud"))) || p_51042_.is(TagKey.create(Registries.BLOCK, new ResourceLocation("tfc:farmland")));
    }
}
