package com.kingtrapinch.tfcobblemon.mixin;

import com.cobblemon.mod.common.block.VivichokeBlock;
import net.dries007.tfc.common.TFCTags;
import net.dries007.tfc.util.Helpers;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;

@Pseudo
@Mixin(VivichokeBlock.class)
public abstract class VivichokeMixin extends CropBlock {
    public VivichokeMixin(Properties p_51021_) {
        super(p_51021_);
    }

@Override
protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos)
{
    return Helpers.isBlock(level.getBlockState(pos), TFCTags.Blocks.FARMLAND);
}


}

//@Override
//protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos)
//{
//    return Helpers.isBlock(level.getBlockState(pos), TFCTags.Blocks.BUSH_PLANTABLE_ON);
//}


//    @Override
//    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
//        return Helpers.isBlock(level.getBlockState(pos.below()), ;
//    }
//}