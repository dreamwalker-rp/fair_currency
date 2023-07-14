package ru.xunto.fair_currency.init;

import net.minecraft.block.material.Material;
import ru.xunto.fair_currency.blocks.*;
import ru.xunto.fair_currency.configs.BlockData;
import ru.xunto.fair_currency.configs.ConfigParser;
import ru.xunto.fair_currency.configs.EntityToLoad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BlockInit {
    public static List<BaseBlock> BLOCKS = new ArrayList<BaseBlock>();
    private ConfigParser configParser = new ConfigParser();

    public BlockInit() {
        addBlocks();
        ApplyConfigToBlocks();
    }

    public BaseBlock createBlock(String blockName, Material material, int rendererType, float hardness) {
        BaseBlock baseBlock = new BaseBlock(blockName, material)
                .setRenderType(rendererType)
                .setHardness(hardness);
        return baseBlock;
    }

    public BaseBlock createNonCollisionBlock(String blockName, Material material, int rendererType, float hardness) {
        BaseBlock baseBlock = new NonCollisionBlock(blockName, material)
                .setRenderType(rendererType)
                .setHardness(hardness);
        return baseBlock;
    }

    public void addBlocks() {
        BaseBlock lantern_1 = createNonCollisionBlock("lantern_1", Material.plants, 1, 0.0F)
                .setLightLevel(1.0F).setOpaqueCube(false);
        lantern_1.setBlockBounds(0.25f, 0, 0.25f, 0.75f, 0.75f, 0.75f);

        createEachSideBlocks();
        createCrossBlocks();
        createSmallCubeBlocks();
    }

    public void createEachSideBlocks() {
        for (int i = 0; i < ConfigParser.EACH_SIDE_BLOCKS; i++) {
            new EachSideTextureBlock("sides_block_" + i, Material.rock);
        }
    }

    public void createCrossBlocks() {
        for (int i = 0; i < ConfigParser.EACH_SIDE_BLOCKS; i++) {
            new CrossTextureBlock("cross_block_" + i, Material.rock);
        }
    }

    public void createSmallCubeBlocks() {
        for (int i = 0; i < ConfigParser.EACH_SIDE_BLOCKS; i++) {
            new SmallCubeBlock("small_cube_" + i, Material.rock);
        }
    }

    public void registerAll() {
        for (BaseBlock block : BLOCKS) {
            block.register();
        }
    }

    private void ApplyConfigToBlocks() {
        EntityToLoad entityToLoad = configParser.getEntityToLoad();
        HashMap<String, BlockData> blocksData = entityToLoad.getBlocks();
        for (BaseBlock block : BLOCKS) {
            String blockName = block.getBlockConfigName();
            if (blocksData.containsKey(blockName)){
                BlockData data = blocksData.get(blockName);
                if (data.isPassable()){
                    block.setPassable(data.isPassable());
                }
                if (data.isLightSource()){
                    block.setLightLevel(1.0F);
                }
                block.setHardness(data.getHardness());
            }
        }
    }

}
