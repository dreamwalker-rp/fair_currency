package ru.xunto.fair_currency.blocks;

import net.minecraft.block.Block;

public class BlockParams {
    private String registryName = null;
    private int renderType = 0;
    private boolean opaqueCube = false;
    private boolean passable = false;
    private float hardness = 1;
    private float lightLevel = 0;
    private boolean slowsdown = false;
    Block block = null;

    public boolean isSlowsdown() {
        return slowsdown;
    }

    public void setSlowsdown(boolean slowsdown) {
        this.slowsdown = slowsdown;
    }

    public String getRegistryName() {
        return registryName;
    }

    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }

    public int getCustomRenderType() {
        return renderType;
    }

    public void setRenderType(int renderType) {
        this.renderType = renderType;
    }

    public boolean getCustomOpaqueCube() {
        return opaqueCube;
    }

    public void setCustomOpaqueCube(boolean opaqueCube) {
        this.opaqueCube = opaqueCube;
    }

    public boolean isPassable() {
        return passable;
    }

    public void setPassable(boolean passable) {
        this.passable = passable;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public float getCustomLightLevel() {
        return lightLevel;
    }

    public Block setCustomLightLevel(float lightLevel) {
        this.lightLevel = lightLevel;
        block.setLightLevel(lightLevel);
        return block;
    }

    public float getCustomHardness() {
        return hardness;
    }

    public void setCustomHardness(float hardness) {
        this.hardness = hardness;
        block.setHardness(hardness);
    }
}
