package net.bump.custom_ores.item.custom;

import net.bump.custom_ores.CustomOres;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.LiteralText;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

import java.util.*;

public class MetalDetectorItem extends Item {
    public MetalDetectorItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (context.getWorld().isClient()) {
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();

            int down = 0;
            int blockValue = -1;
            Block valuableBlock = null;

            for (int i = 0; i <= positionClicked.getY() + 64; i++) {
                Block blockBelow = context.getWorld().getBlockState(positionClicked.down(i)).getBlock();

                int foundValue = getBlockValue(blockBelow);
                if (foundValue > blockValue) {
                    blockValue = foundValue;
                    valuableBlock = blockBelow;
                    down = i;
                }
            }
            assert player != null;
            if (blockValue > 0) {
                outputValuableBlockCoordinates(positionClicked.down(down), player, valuableBlock);
            } else {
                player.sendMessage(new TranslatableText("item.custom_ores.metal_detector.no_valuables"), false);
            }
        }
        context.getStack().damage(1, Objects.requireNonNull(context.getPlayer()), (player) -> player.sendToolBreakStatus(player.getActiveHand()));

        return super.useOnBlock(context);
    }

    private void outputValuableBlockCoordinates(BlockPos blockpos, PlayerEntity player, Block blockBelow) {
        Map<String, Object> data = new HashMap<>();
        data.put("block", blockBelow.asItem().getName().getString());
        data.put("x", blockpos.getX());
        data.put("y", blockpos.getY());
        data.put("z", blockpos.getZ());

        player.sendMessage(new LiteralText(CustomOres.fString("Found {block} as ({x}, {y}, {z})", data)), false);
    }

    private int getBlockValue(Block block) {
        List<Block> DiamondOre = new ArrayList<>();
        DiamondOre.add(Blocks.DIAMOND_ORE);
        DiamondOre.add(Blocks.DEEPSLATE_DIAMOND_ORE);

        List<Block> LapisOre = new ArrayList<>();
        LapisOre.add(Blocks.LAPIS_ORE);
        LapisOre.add(Blocks.DEEPSLATE_LAPIS_ORE);

        List<Block> EmeraldOre = new ArrayList<>();
        EmeraldOre.add(Blocks.EMERALD_ORE);
        EmeraldOre.add(Blocks.DEEPSLATE_EMERALD_ORE);

        List<Block> RedstoneOre = new ArrayList<>();
        RedstoneOre.add(Blocks.REDSTONE_ORE);
        RedstoneOre.add(Blocks.DEEPSLATE_REDSTONE_ORE);

        List<Block> GoldOre = new ArrayList<>();
        GoldOre.add(Blocks.GOLD_ORE);
        GoldOre.add(Blocks.DEEPSLATE_GOLD_ORE);
        GoldOre.add(Blocks.NETHER_GOLD_ORE);

        List<Block> IronOre = new ArrayList<>();
        IronOre.add(Blocks.IRON_ORE);
        IronOre.add(Blocks.DEEPSLATE_IRON_ORE);

        List<Block> CopperOre = new ArrayList<>();
        CopperOre.add(Blocks.COPPER_ORE);
        CopperOre.add(Blocks.DEEPSLATE_COPPER_ORE);

        List<Block> CoalOre = new ArrayList<>();
        CoalOre.add(Blocks.COAL_ORE);
        CoalOre.add(Blocks.DEEPSLATE_COPPER_ORE);


        if (CoalOre.contains(block)) {
            return 1;
        } else if (CopperOre.contains(block)) {
            return 2;
        } else if (IronOre.contains(block)) {
            return 3;
        } else if (GoldOre.contains(block)) {
            return 4;
        } else if (RedstoneOre.contains(block)) {
            return 5;
        } else if (EmeraldOre.contains(block)) {
            return 6;
        } else if (LapisOre.contains(block)) {
            return 7;
        } else if (DiamondOre.contains(block)) {
            return 8;
        }
        return 0;
    }


}
