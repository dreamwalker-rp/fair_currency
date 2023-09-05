package ru.xunto.fair_currency.init;

import net.minecraft.block.material.Material;
import ru.xunto.fair_currency.blocks.BaseBlock;
import ru.xunto.fair_currency.blocks.IFairyBlock;
import ru.xunto.fair_currency.blocks.modEndBlocks.*;
import ru.xunto.fair_currency.configs.BlockData;
import ru.xunto.fair_currency.configs.ConfigParser;
import ru.xunto.fair_currency.configs.EntityToLoad;
import ru.xunto.fair_currency.configs.parsejssonstructure.SettingStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BlockInit {
    public static List<IFairyBlock> BLOCKS = new ArrayList<>();
    private final ConfigParser configParser = new ConfigParser();

    public BlockInit() {
        addBlocks();
        ApplyConfigToBlocks();
    }

    public BaseBlock createNonCollisionBlock(String blockName, Material material, int rendererType, float hardness) {
        BaseBlock baseBlock = new NonCollisionBlock(blockName, material);
        baseBlock.setRenderType(rendererType);
        baseBlock.setHardness(hardness);
        return baseBlock;
    }

    public void addBlocks() {
        BaseBlock lantern_1 = createNonCollisionBlock("lantern_1", Material.plants, 1, 0.0F);
        lantern_1.setLightLevel(1.0F);
        lantern_1.setOpaqueCube(false);
        lantern_1.setBlockBounds(0.25f, 0, 0.25f, 0.75f, 0.75f, 0.75f);

        createEachSideBlocks();
        createCrossBlocks();
        createSmallCubeBlocks();
        createSlabs();
        createAnimatedBlocks();
    }

    public void createEachSideBlocks() {
        BlockInitPrefixEnum blockSettings = BlockInitPrefixEnum.SIDES;
        for (int i = 0; i < blockSettings.getBlockAmount(); i++) {
            new EachSideTextureBlock(blockSettings.getPrefix() + i, Material.rock);
        }
    }

    public void createCrossBlocks() {
        BlockInitPrefixEnum blockSettings = BlockInitPrefixEnum.CROSS;
        for (int i = 0; i < blockSettings.getBlockAmount(); i++) {
            new CrossTextureBlock(blockSettings.getPrefix() + i, Material.rock);
        }
    }

    public void createSmallCubeBlocks() {
        BlockInitPrefixEnum blockSettings = BlockInitPrefixEnum.SMALL_CUBE;
        for (int i = 0; i < blockSettings.getBlockAmount(); i++) {
            new SmallCubeBlock(blockSettings.getPrefix() + i, Material.rock);
        }
    }

    public void createSlabs() {
        BlockInitPrefixEnum blockSettings = BlockInitPrefixEnum.SLAB;
        for (int i = 0; i < blockSettings.getBlockAmount(); i++) {
            new FairySlabBlock(blockSettings.getPrefix() + i, false);
        }
    }

    public void createAnimatedBlocks() {
        BlockInitPrefixEnum blockSettings = BlockInitPrefixEnum.ANIMATED;
        for (int i = 0; i < blockSettings.getBlockAmount(); i++) {
            new AnimatedBlock(blockSettings.getPrefix() + i, Material.rock);
        }
    }

    public void registerAll() {
        for (IFairyBlock block : BLOCKS) {
            block.register();
        }
    }

    private void ApplyConfigToBlocks() {
        EntityToLoad entityToLoad = configParser.getEntityToLoad();
        HashMap<String, BlockData> blocksData = entityToLoad.getBlocks();
        for (IFairyBlock fairyBlock : BLOCKS) {
            String blockName = fairyBlock.getRegistryName();
            if (blocksData.containsKey(blockName)) {
                BlockData data = blocksData.get(blockName);
                if (data.isPassable()) {
                    fairyBlock.setPassable(data.isPassable());
                }
                if (data.isLightSource()) {
                    fairyBlock.setLightLevel(1.0F);
                }
                fairyBlock.setCustomHardness(data.getHardness());
                fairyBlock.setOpaqueCube(data.isOpaqueCube());
                fairyBlock.setSlowdown(data.isSlowdown());
            }
        }
    }

}
