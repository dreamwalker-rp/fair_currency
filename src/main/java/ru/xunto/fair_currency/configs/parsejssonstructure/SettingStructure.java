package ru.xunto.fair_currency.configs.parsejssonstructure;

import java.util.HashMap;

public class SettingStructure {
    HashMap<String, Integer> blocksAmount;
    HashMap<String, BlockStructure> blocks;

    public HashMap<String, Integer> getBlocksAmount() {
        return blocksAmount;
    }

    public void setBlocksAmount(HashMap<String, Integer> blocksAmount) {
        this.blocksAmount = blocksAmount;
    }

    public HashMap<String, BlockStructure> getBlocks() {
        return blocks;
    }

    public void setBlocks(HashMap<String, BlockStructure> blocks) {
        this.blocks = blocks;
    }

    public int[] getItems() {
        return items;
    }

    public void setItems(int[] items) {
        this.items = items;
    }

    int[] items;
}
