package ru.xunto.fair_currency.blocks;

import net.minecraft.block.BlockWoodSlab;

public class FairySlabBlock extends BlockWoodSlab implements IFairyBlock{
    BlockParams blockParams = new BlockParams();
    public FairySlabBlock(String name, boolean p_i45410_1_) {
        super(p_i45410_1_);
        this.fairyblockInit(name, this);
    }

    @Override
    public String func_150002_b(int p_150002_1_) {
        return null;
    }

    @Override
    public BlockParams getParams() {
        return blockParams;
    }
}
