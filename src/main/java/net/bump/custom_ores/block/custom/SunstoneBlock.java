package net.bump.custom_ores.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SunstoneBlock extends Block {
    public SunstoneBlock(Settings settings) {
        super(settings);
    }

//    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
//        // Called 4 times on right click:
//        // 2 Times on the Server (1 time per hand)
//        // 2 Times on the Client (1 time per hand)
//        if (world.isClient()) {
//            if (hand == Hand.MAIN_HAND) {
//                player.sendMessage(new LiteralText("CLIENT: This is THE CLIENT! MAIN HAND"), false);
//            } else {
//                player.sendMessage(new LiteralText("CLIENT: This is THE CLIENT! OFF HAND"), false);
//            }
//        }
//        return ActionResult.CONSUME_PARTIAL;
//        // ActionResult.PASS; Indicates an action is not performed but allows other actions to perform.
//        // ActionResult.SUCCESS; Indicates an action is performed and the actor's hand should swing to indicate the performance.
//        // ActionResult.FAIL; Indicates that an action is not performed and prevents other actions from performing.
//        // ActionResult.CONSUME; Indicates an action is performed but no animation should accompany the performance.
//        // ActionResult.CONSUME_PARTIAL;
//    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (!world.isClient()) {
            if (entity instanceof LivingEntity livingEntity) {
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 6000));
            }
        }
    }
}
