package ru.xunto.fair_currency.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import ru.xunto.fair_currency.FairCurrencyMod;
import ru.xunto.fair_currency.init.BlockInit;

import java.util.List;

public class BaseBlock extends Block {
    private String registryName;
    private int renderType = 0;
    private boolean opaqueCube = false;
    private boolean passable = false;
    private String blockConfigName;

    public BaseBlock(String registryName, Material material) {
        super(material);
        this.registryName = registryName;
        this.blockConfigName = registryName;
        this.setBlockName(registryName);
        this.setBlockTextureName(FairCurrencyMod.MODID + ":" + registryName);
        setCreativeTab(FairCurrencyMod.TAB);
        BlockInit.BLOCKS.add(this);
    }

    public void register() {
        GameRegistry.registerBlock(this, this.registryName);
    }

    @Override
    public BaseBlock setLightLevel(float lightLevel) {
        super.setLightLevel(lightLevel);
        return this;
    }

    @Override
    public boolean isOpaqueCube() {
        return this.opaqueCube;
    }

    public BaseBlock setOpaqueCube(Boolean opaqueCube) {
        this.opaqueCube = opaqueCube;
        return this;
    }

    public int getRenderType() {
        return this.renderType;
    }

    public BaseBlock setRenderType(int renderType) {
        this.renderType = renderType;
        return this;
    }

    @Override
    public BaseBlock setHardness(float hardness) {
        super.setHardness(hardness);
        return this;
    }

    public BaseBlock setPassable(boolean passable) {
        this.passable = passable;
        //this.setOpaqueCube(false);
        return this;
    }

    public String getBlockConfigName() {
        return blockConfigName;
    }

    @Override
    public void addCollisionBoxesToList(World p_149743_1_, int p_149743_2_, int p_149743_3_, int p_149743_4_, AxisAlignedBB p_149743_5_, List p_149743_6_, Entity p_149743_7_) {
        if (passable) {
            return;
        }
        super.addCollisionBoxesToList(p_149743_1_, p_149743_2_, p_149743_3_, p_149743_4_, p_149743_5_, p_149743_6_, p_149743_7_);

    }
}
