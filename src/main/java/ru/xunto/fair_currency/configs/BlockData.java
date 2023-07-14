package ru.xunto.fair_currency.configs;

public class BlockData {
    private boolean passable;
    private boolean light_source;
    private float hardness;

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
}
