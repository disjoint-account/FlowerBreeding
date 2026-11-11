package net.flowerbreeding.pollenvials;

import net.flowerbreeding.FBItems;
import net.flowerbreeding.util.FBTags;
import net.minecraft.util.Prediction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import org.jspecify.annotations.NonNull;

public class EmptyPollenVialItem extends Item {
    public EmptyPollenVialItem(Properties settings) {
        super(settings);
    }

    public @NonNull InteractionResult useOn(UseOnContext context) {
        Player user = context.getPlayer();
        InteractionHand hand = context.getHand();
        BlockPos pos = context.getClickedPos();
        Level world = context.getLevel();
        BlockState state = world.getBlockState(pos);
        assert user != null;
        ItemStack itemStack = user.getItemInHand(hand);
        if (state.is(FBTags.Blocks.POLLEN_PLANTS)) {
            ItemStack itemStack1 = new ItemStack(getFlower(context));
            if (!user.hasInfiniteMaterials()) {
                itemStack.shrink(1);
                user.getInventory().placeItemBackInInventory(itemStack1, Prediction.SERVER_ONLY);
                world.playSound(user, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1f, 1f);
                return InteractionResult.SUCCESS;
            } else if (user.hasInfiniteMaterials()) {
                user.getInventory().placeItemBackInInventory(itemStack1, Prediction.SERVER_ONLY);
                world.playSound(user, pos, SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, SoundSource.BLOCKS, 1f, 1f);
                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.TRY_WITH_EMPTY_HAND;
    }

        public ItemLike getFlower(UseOnContext context) {
            BlockPos blockPos = context.getClickedPos();
            Level world = context.getLevel();
            BlockState state = world.getBlockState(blockPos);
                if (state.is(FBTags.Blocks.ALLIUMS)) {
                    return FBItems.ALLIUM_POLLEN_VIAL;
                }
                if (state.is(FBTags.Blocks.CORNFLOWERS)) {
                    return FBItems.CORNFLOWER_POLLEN_VIAL;
                }
                if (state.is(FBTags.Blocks.DAISIES)) {
                    return FBItems.DAISY_POLLEN_VIAL;
                }
                if (state.is(FBTags.Blocks.TORCHFLOWERS)) {
                    return FBItems.TORCHFLOWER_POLLEN_VIAL;
                }
                if (state.is(FBTags.Blocks.TULIPS)) {
                    return FBItems.TULIP_POLLEN_VIAL;
                }
                if (state.is(FBTags.Blocks.AZURE_BLUETS)) {
                    return FBItems.AZURE_BLUET_POLLEN_VIAL;
                }
                if (state.is(FBTags.Blocks.DANDELIONS)) {
                    return FBItems.DANDELION_POLLEN_VIAL;
                }
                if (state.is(FBTags.Blocks.ORCHIDS)) {
                    return FBItems.ORCHID_POLLEN_VIAL;
                }
                if (state.is(FBTags.Blocks.LILIES)) {
                    return FBItems.LILY_POLLEN_VIAL;
                }
                if (state.is(FBTags.Blocks.POPPIES)) {
                    return FBItems.POPPY_POLLEN_VIAL;
                }
                if (state.is(FBTags.Blocks.WITHER_ROSES)) {
                    return FBItems.WITHER_ROSE_POLLEN_VIAL;
                }
                if (state.is(FBTags.Blocks.OPEN_EYEBLOSSOMS)) {
                    return FBItems.EYEBLOSSOM_POLLEN_VIAL;
                }
                if (state.is(FBTags.Blocks.LILACS)) {
                    return FBItems.LILAC_POLLEN_VIAL;
                }
                if (state.is(FBTags.Blocks.PEONIES)) {
                    return FBItems.PEONY_POLLEN_VIAL;
                }
                if (state.is(FBTags.Blocks.PITCHER_PLANTS)) {
                    return FBItems.PITCHER_PLANT_POLLEN_VIAL;
                }
                if (state.is(FBTags.Blocks.ROSE_BUSHES)) {
                    return FBItems.ROSE_BUSH_POLLEN_VIAL;
                }
                if (state.is(FBTags.Blocks.SUNFLOWERS)) {
                    return FBItems.SUNFLOWER_POLLEN_VIAL;
                }
                if (state.is(FBTags.Blocks.PETALS)) {
                    return FBItems.PETAL_POLLEN_VIAL;
                }
                if (state.is(FBTags.Blocks.WILDFLOWERS)) {
                    return FBItems.WILDFLOWER_POLLEN_VIAL;
                }
                if (state.is(FBTags.Blocks.CACTUS_FLOWERS)) {
                    return FBItems.CACTUS_FLOWER_POLLEN_VIAL;
                }
                if (state.is(FBTags.Blocks.SPORE_BLOSSOMS)) {
                    return FBItems.SPORE_BLOSSOM_POLLEN_VIAL;
                }
                if (state.is(FBTags.Blocks.FLOWERING_AZALEAS)) {
                    return FBItems.FLOWERING_AZALEA_POLLEN_VIAL;
                }
                if (state.is(FBTags.Blocks.FLOWERING_AZALEA_LEAVES)) {
                    return FBItems.FLOWERING_AZALEA_LEAVES_POLLEN_VIAL;
                }
                if (state.is(Blocks.BUSH)) {
                    return FBItems.BUSH_POLLEN_VIAL;
                }
                if (state.is(Blocks.SWEET_BERRY_BUSH)) {
                    return FBItems.SWEET_BERRY_POLLEN_VIAL;
                }
                if (state.is(Blocks.CAVE_VINES)) {
                    return FBItems.GLOW_VINE_POLLEN_VIAL;
                }
                if (state.is(Blocks.CAVE_VINES_PLANT)) {
                    return FBItems.GLOW_VINE_POLLEN_VIAL;
                }
                if (state.is(Blocks.VINE)) {
                    return FBItems.VINE_POLLEN_VIAL;
                }
                if (state.is(Blocks.LILY_PAD)) {
                    return FBItems.LILY_PAD_POLLEN_VIAL;
                }
                if (state.is(FBTags.Blocks.MUSHROOMS)) {
                    return FBItems.MUSHROOM_POLLEN_VIAL;
                }
                if (state.is(FBTags.Blocks.FROGLIGHTS)) {
                    return FBItems.FROGLIGHT_POLLEN_VIAL;
                }
                if (state.is(FBTags.Blocks.SHRUBS)) {
                    return FBItems.SHRUB_POLLEN_VIAL;
                }
            return null;
        }
}
