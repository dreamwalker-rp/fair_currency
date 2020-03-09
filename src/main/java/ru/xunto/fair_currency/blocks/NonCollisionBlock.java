package ru.xunto.fair_currency.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class NonCollisionBlock extends BaseBlock {

    public NonCollisionBlock(String registryName, CreativeTabs tab, Material material) {
        super(registryName, tab, material);
        this.setBlockBounds(0.25f, 0.25f, 0.25f,
                0.75f, 0.75f, 0.75f);
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_) {
        return null;
    }

}
