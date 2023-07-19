package ru.xunto.fair_currency.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.List;

public class BaseBlock extends Block implements IFairyBlock {
    BlockParams blockParams;

    public BaseBlock(String registryName, Material material) {
        super(material);
        fairyblockInit(registryName, this);
    }

    public int getRenderType() {
        return getCustomRenderType();
    }

    @Override
    public boolean isOpaqueCube() {
        return getParams().getCustomOpaqueCube();
    }

    @Override
    public BlockParams getParams() {
        if (blockParams == null) {
            blockParams = new BlockParams();
        }
        return blockParams;
    }

    @Override
    public void addCollisionBoxesToList(World p_149743_1_, int p_149743_2_, int p_149743_3_, int p_149743_4_, AxisAlignedBB p_149743_5_, List p_149743_6_, Entity p_149743_7_) {
        if (isPassable()) {
            return;
        }
        super.addCollisionBoxesToList(p_149743_1_, p_149743_2_, p_149743_3_, p_149743_4_, p_149743_5_, p_149743_6_, p_149743_7_);
    }

    public void onEntityCollidedWithBlock(World p_149670_1_, int p_149670_2_, int p_149670_3_, int p_149670_4_, Entity p_149670_5_) {
        if (!blockParams.isSlowdown()) {
            return;
        }
        p_149670_5_.setInWeb();
    }
}