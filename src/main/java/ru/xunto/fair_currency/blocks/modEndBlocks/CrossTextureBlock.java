package ru.xunto.fair_currency.blocks.modEndBlocks;

import net.minecraft.block.material.Material;
import ru.xunto.fair_currency.blocks.BaseBlock;

public class CrossTextureBlock extends BaseBlock {
    public CrossTextureBlock(String registryName, Material material) {
        super(registryName, material);
        setRenderType(1);
        this.setBlockBounds(0.25f, 0.25f, 0.25f,
                0.75f, 0.75f, 0.75f);
    }


}
