package ru.xunto.fair_currency.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

import java.util.List;

public class BaseBlock extends Block implements IFairyBlock {
    BlockParams blockParams = new BlockParams();

    public BaseBlock(String registryName, Material material) {
        super(material);
        fairyblockInit(registryName, this);
        BlockParams blocksParams = new BlockParams();
    }
//
//    @Override
//    public BaseBlock setLightLevel(float lightLevel) {
//        super.setLightLevel(getParams().getCustomLightLevel());
//        return this;
//    }

    public int getRenderType() {
        return getCustomRenderType();
    }

    @Override
    public BlockParams getParams() {
        return blockParams;
    }

    @Override
    public void addCollisionBoxesToList(World p_149743_1_, int p_149743_2_, int p_149743_3_, int p_149743_4_, AxisAlignedBB p_149743_5_, List p_149743_6_, Entity p_149743_7_) {
        if (isPassable()) {
            return;
        }
        super.addCollisionBoxesToList(p_149743_1_, p_149743_2_, p_149743_3_, p_149743_4_, p_149743_5_, p_149743_6_, p_149743_7_);

    }

}