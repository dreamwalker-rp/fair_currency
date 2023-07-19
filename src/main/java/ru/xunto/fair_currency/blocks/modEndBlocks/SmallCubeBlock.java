package ru.xunto.fair_currency.blocks.modEndBlocks;

import net.minecraft.block.material.Material;
import ru.xunto.fair_currency.blocks.BaseBlock;

public class SmallCubeBlock extends BaseBlock {
    public SmallCubeBlock(String registryName, Material material) {
        super(registryName, material);
        this.setBlockBounds(0.25f, 0f, 0.25f,
                0.75f, 0.5f, 0.75f);
    }

}
