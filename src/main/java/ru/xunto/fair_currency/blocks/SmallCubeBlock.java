package ru.xunto.fair_currency.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class SmallCubeBlock extends BaseBlock{
    public SmallCubeBlock(String registryName, Material material) {
        super(registryName, material);
        this.setBlockBounds(0.25f, 0f, 0.25f,
                0.75f, 0.75f, 0.75f);
    }

}
