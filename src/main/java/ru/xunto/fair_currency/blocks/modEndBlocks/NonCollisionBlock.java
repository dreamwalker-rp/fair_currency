package ru.xunto.fair_currency.blocks.modEndBlocks;

import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import ru.xunto.fair_currency.blocks.BaseBlock;

public class NonCollisionBlock extends BaseBlock {

    public NonCollisionBlock(String registryName, Material material) {
        super(registryName, material);
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_) {
        return null;
    }

}
