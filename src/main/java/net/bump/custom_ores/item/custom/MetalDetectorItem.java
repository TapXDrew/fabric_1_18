package net.bump.custom_ores.item.custom;

import net.bump.custom_ores.CustomOres;
import net.bump.custom_ores.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class MetalDetectorItem extends Item {
    public MetalDetectorItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(context.getWorld().isClient()) {
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean foundBlock = false;

            for(int i = 0; i <= positionClicked.getY() + 64; i++) {
                Block blockBelow = context.getWorld().getBlockState(positionClicked.down(i)).getBlock();

                if(isValuableBlock(blockBelow)) {
                    assert player != null;
                    outputValuableBlockCoordinates(positionClicked.down(i), player, blockBelow);
                    foundBlock = true;
                    break;
                }
            }

            if(!foundBlock) {
                assert player != null;
                player.sendMessage(new TranslatableText("item.custom_ores.metal_detector.no_valuables"), false);
            }
        }

        context.getStack().damage(1, Objects.requireNonNull(context.getPlayer()),
                (player) -> player.sendToolBreakStatus(player.getActiveHand()));

        return super.useOnBlock(context);
    }

    private void outputValuableBlockCoordinates(BlockPos blockpos, PlayerEntity player, Block blockBelow) {
        Map<String, Object> data = new HashMap<>();
        data.put("block", blockBelow.asItem().getName().getString());
        data.put("x", blockpos.getX());
        data.put("y", blockpos.getY());
        data.put("z", blockpos.getZ());

        player.sendMessage(new LiteralText(CustomOres.fString("Found {block} at ({x}, {y}, {z})", data)), false);
    }

    private boolean isValuableBlock(Block block) {
        if (Registry.BLOCK.getKey(block).isPresent()) {
            return Registry.BLOCK.getOrCreateEntry(Registry.BLOCK.getKey(block).get()).isIn(ModTags.Blocks.METAL_DETECTOR_DETECTABLE_BLOCKS);
        }
        return false;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(new TranslatableText("item.custom_ores.metal_detector.tooltip.shift"));
        } else {
            tooltip.add(new TranslatableText("item.custom_ores.metal_detector.tooltip"));
        }
    }
}
