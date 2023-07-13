package ru.xunto.fair_currency.blocks;

import net.minecraft.block.material.Material;

public class CrossTextureBlock extends BaseBlock{
    public CrossTextureBlock(String registryName, Material material) {
        super(registryName, material);
        setRenderType(1);
        this.setBlockBounds(0.25f, 0.25f, 0.25f,
                0.75f, 0.75f, 0.75f);
    }


}
