package ru.xunto.fair_currency.configs;

import net.minecraft.item.Item;
import ru.xunto.fair_currency.configs.parsejssonstructure.BlockStructure;

import java.util.HashMap;

public class EntityToLoad {
    private HashMap<String, Integer> blocksAmount;
    private HashMap<String, BlockData> blocks;
    private int[] items;

    public EntityToLoad(HashMap<String, Integer> blocksAmount, HashMap<String, BlockStructure> blocks, int[] items) {
        this.blocksAmount = blocksAmount;

        this.blocks = convertSettingToBlockData(blocks);
        this.items = items;
    }

    private HashMap<String, BlockData> convertSettingToBlockData(HashMap<String, BlockStructure> blocks){
        HashMap<String, BlockData> result = new HashMap<>();
        blocks.forEach((key, value)->{
                result.put(key, new BlockData(value));
        }
        );
        return result;
    }

    public HashMap<String, Integer> getBlocksAmount() {
        return blocksAmount;
    }

    public void setBlocksAmount(HashMap<String, Integer> blocksAmount) {
        this.blocksAmount = blocksAmount;
    }

    public Integer getBlockAmountByKey(String field){
        if (!blocksAmount.containsKey(field)){
            return 0;
        }
        return blocksAmount.get(field);
    }

    public HashMap<String, BlockData> getBlocks() {
        return blocks;
    }

    public void setBlocks(HashMap<String, BlockData> blocks) {
        this.blocks = blocks;
    }

    public int[] getItems() {
        return items;
    }

    public void setItems(int[] items) {
        this.items = items;
    }
}
