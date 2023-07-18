package ru.xunto.fair_currency.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class FairySlabBlock extends BlockSlab implements IFairyBlock{
    BlockParams blockParams = new BlockParams();
    public FairySlabBlock(String name, boolean p_i45410_1_) {
        super(p_i45410_1_, Material.rock);
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

    @SideOnly(Side.CLIENT)
    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
    {
        return Item.getItemFromBlock(this);
    }

    public boolean isOpaqueCube()
    {
        return false;
    }
}
