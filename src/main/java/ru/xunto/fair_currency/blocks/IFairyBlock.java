package ru.xunto.fair_currency.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import ru.xunto.fair_currency.FairCurrencyMod;
import ru.xunto.fair_currency.init.BlockInit;

public interface IFairyBlock {
    default void fairyblockInit(String registryName, Block block) {
        setRegistryName(registryName);
        setBlock(block);
        block.setBlockName(registryName);
        block.setBlockTextureName(FairCurrencyMod.MODID + ":" + registryName);
        block.setCreativeTab(FairCurrencyMod.TAB);
        BlockInit.BLOCKS.add(this);
    }

    default void register(String test) {
        Block block = getBlock();
        String name = getRegistryName();
        GameRegistry.registerBlock(block, name);
    }

    default int getCustomRenderType() {
        return getParams().getCustomRenderType();
    }

    default String getRegistryName() {
        return getParams().getRegistryName();
    }

    default void setRegistryName(String registryName) {
        getParams().setRegistryName(registryName);
    }

    default boolean isOpaqueCube() {
        return getParams().getCustomOpaqueCube();
    }

    default void setOpaqueCube(boolean opaqueCube) {
        getParams().setCustomOpaqueCube(opaqueCube);
    }

    default boolean isPassable() {
        return getParams().isPassable();
    }

    default void setPassable(boolean passable) {
        getParams().setPassable(passable);
    }

    default Block getBlock() {
        return getParams().getBlock();
    }

    default void setBlock(Block block) {
        getParams().setBlock(block);
    }

    default void setRenderType(int renderType) {
        getParams().setRenderType(renderType);
    }

    BlockParams getParams();

    default Block setLightLevel(float lightLevel) {
        return getParams().setCustomLightLevel(lightLevel);
    }

    default float getCustomHardness() {
        return getParams().getCustomHardness();
    }

    default void setCustomHardness(float hardness) {
        getParams().setCustomHardness(hardness);
    }

    default boolean isSlowdown() {
        return getParams().isSlowdown();
    }

    default void setSlowdown(boolean isSlowdown) {
        getParams().setSlowdown(isSlowdown);
    }
}
