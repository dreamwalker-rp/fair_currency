package ru.xunto.fair_currency.configs.parsejssonstructure;

public class BlockStructure {
    public boolean isPassable() {
        return passable;
    }

    public void setPassable(boolean passable) {
        this.passable = passable;
    }

    public boolean isLightSource() {
        return lightSource;
    }

    public void setLightSource(boolean lightSource) {
        this.lightSource = lightSource;
    }

    public int getHardness() {
        return hardness;
    }

    public void setHardness(int hardness) {
        this.hardness = hardness;
    }

    public boolean isOpaqueCube() {
        return opaqueCube;
    }

    public void setOpaqueCube(boolean opaqueCube) {
        this.opaqueCube = opaqueCube;
    }

    public boolean isSlowdown() {
        return slowdown;
    }

    public void setSlowdown(boolean slowdown) {
        this.slowdown = slowdown;
    }

    boolean passable = false;
    boolean lightSource = false;
    int hardness = 1;
    boolean opaqueCube = true;
    boolean slowdown = false;
}
