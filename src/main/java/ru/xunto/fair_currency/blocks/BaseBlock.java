package ru.xunto.fair_currency.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import ru.xunto.fair_currency.FairCurrencyMod;

public class BaseBlock extends net.minecraft.block.Block {
    private String registryName;
    private int renderType = 0;
    private boolean opaqueCube = false;
    private boolean isCollideble = true;

    public BaseBlock(String registryName, CreativeTabs tab, Material material) {
        super(material);
        this.registryName = registryName;
        this.setBlockName(registryName);
        this.setBlockTextureName(FairCurrencyMod.MODID + ":" + registryName);
        //this.canCollideCheck()
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

    public BaseBlock setCollideble(boolean collideble) {
        this.isCollideble = collideble;
        return this;
    }

    @Override
    public boolean isCollidable() {
        return this.isCollideble;
    }
}
