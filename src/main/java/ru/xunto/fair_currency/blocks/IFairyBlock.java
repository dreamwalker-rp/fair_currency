package ru.xunto.fair_currency.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import ru.xunto.fair_currency.FairCurrencyMod;
import ru.xunto.fair_currency.init.BlockInit;

public interface IFairyBlock {
    public default void fairyblockInit(String registryName, Block block) {
        setRegistryName(registryName);
        setBlock(block);
        block.setBlockName(registryName);
        block.setBlockTextureName(FairCurrencyMod.MODID + ":" + registryName);
        block.setCreativeTab(FairCurrencyMod.TAB);
        BlockInit.BLOCKS.add(this);
    }

    public default void register(String test) {
        Block block = getBlock();
        String name = getRegistryName();
        GameRegistry.registerBlock(block, name);
    }

    public default int getCustomRenderType() {
        return getParams().getCustomRenderType();
    }

    public default String getRegistryName() {
        return getParams().getRegistryName();
    }

    public default boolean isOpaqueCube() {
        return getParams().getCustomOpaqueCube();
    }

    public default boolean isPassable() {
        return getParams().isPassable();
    }

    public default Block getBlock() {
        return getParams().getBlock();
    }

    public default void setRegistryName(String registryName) {
        getParams().setRegistryName(registryName);
    }

    public default void setRenderType(int renderType) {
        getParams().setRenderType(renderType);
    }

    public default void setOpaqueCube(boolean opaqueCube) {
        getParams().setCustomOpaqueCube(opaqueCube);
    }

    public default void setPassable(boolean passable) {
        getParams().setPassable(passable);
    }

    public default void setBlock(Block block) {
        getParams().setBlock(block);
    }

    public BlockParams getParams();

    public default Block setLightLevel(float lightLevel) {
        return getParams().setCustomLightLevel(lightLevel);
    }

    public default float getCustomHardness() {
        return getParams().getCustomHardness();
    }

    public default void setCustomHardness(float hardness) {
        getParams().setCustomHardness(hardness);
    }
}
