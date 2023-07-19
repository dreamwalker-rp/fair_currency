package ru.xunto.fair_currency.init;

import ru.xunto.fair_currency.configs.ConfigParser;

public enum BlockInitPrefixEnum {
    SIDES("sides_block_", 0, "sides"),
    CROSS("cross_block_", 0, "cross"),
    SMALL_CUBE("small_cube_", 0, "smallCube"),
    SLAB("slab_", 0, "slab"),
    ANIMATED("animated_block_", 0, "animated");

    private String prefix;
    private int blockAmount;

    private String blockAmountField;

    BlockInitPrefixEnum(String prefix, int blockAmount, String blockAmountField) {
        this.prefix = prefix;
        this.blockAmountField = blockAmountField;
        this.blockAmount = getBlockAmountByField(blockAmountField);

    }

    private Integer getBlockAmountByField(String field){
        ConfigParser configParser = new ConfigParser();
        return configParser.getEntityToLoad().getBlockAmountByKey(field);
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public int getBlockAmount() {
        return blockAmount;
    }

    public void setBlockAmount(int blockAmount) {
        this.blockAmount = blockAmount;
    }

    public String getBlockAmountField() {
        return blockAmountField;
    }

    public void setBlockAmountField(String blockAmountField) {
        this.blockAmountField = blockAmountField;
    }
}
