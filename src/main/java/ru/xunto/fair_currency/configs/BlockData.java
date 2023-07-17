package ru.xunto.fair_currency.configs;

public class BlockData {
    private boolean passable;
    private boolean light_source;
    private float hardness;
    private boolean opaqueCube;

    public boolean isPassable() {
        return passable;
    }

    public void setPassable(boolean passable) {
        this.passable = passable;
    }

    public boolean isLightSource() {
        return light_source;
    }

    public void setLight_source(boolean light_source) {
        this.light_source = light_source;
    }

    public float getHardness() {
        return hardness;
    }

    public void setHardness(float hardness) {
        this.hardness = hardness;
    }

    public boolean isOpaqueCube() {
        return opaqueCube;
    }

    public void setOpaqueCube(boolean opaqueCube) {
        this.opaqueCube = opaqueCube;
    }
}
