package net.flowerbreeding.blockentities;

import net.minecraft.block.Block;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.world.LightType;
import net.minecraft.world.World;

public class VaseBlockEntityRenderer implements BlockEntityRenderer<VaseBlockEntity> {
    public VaseBlockEntityRenderer(BlockEntityRendererFactory.Context context) {

    }

    @Override
    public void render(VaseBlockEntity entity, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light, int overlay) {
        ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();
        ItemStack stack = entity.getStack(0);
        matrices.push();
        matrices.translate(0.5f, 1.15f, 0.5f);
        matrices.scale(0.5f, 0.5f, 0.5f);
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(90));

        itemRenderer.renderItem(stack, ModelTransformationMode.GUI, getLightLevel(entity.getWorld(),
                entity.getPos()), OverlayTexture.DEFAULT_UV, matrices, vertexConsumers, entity.getWorld(), 1);
        matrices.pop();
    }

    private static Identifier getFlowerTextureIdSlot0(VaseBlockEntity entity) {
        Item item = entity.getStack(0).getItem();
        Block block = Block.getBlockFromItem(item);
        String string = block.getTranslationKey();
        if (string.contains("minecraft")) {
            String name = string.substring(15);
            return Identifier.of("minecraft:textures/block/" + name);
        } else {
            String name = string.substring(21);
            return Identifier.of("flowerbreeding:textures/block/" + name);
        }
    }
    private static Identifier getFlowerTextureIdSlot1(VaseBlockEntity entity) {
        Item item = entity.getStack(0).getItem();
        Block block = Block.getBlockFromItem(item);
        String string = block.getTranslationKey();
        if (string.contains("minecraft")) {
            String name = string.substring(15);
            return Identifier.of("minecraft:textures/block/" + name);
        } else {
            String name = string.substring(21);
            return Identifier.of("flowerbreeding:textures/block/" + name);
        }
    }
    private static Identifier getFlowerTextureIdSlot2(VaseBlockEntity entity) {
        Item item = entity.getStack(0).getItem();
        Block block = Block.getBlockFromItem(item);
        String string = block.getTranslationKey();
        if (string.contains("minecraft")) {
            String name = string.substring(15);
            return Identifier.of("minecraft:textures/block/" + name);
        } else {
            String name = string.substring(21);
            return Identifier.of("flowerbreeding:textures/block/" + name);
        }
    }
    private static Identifier getFlowerTextureIdSlot3(VaseBlockEntity entity) {
        Item item = entity.getStack(0).getItem();
        Block block = Block.getBlockFromItem(item);
        String string = block.getTranslationKey();
        if (string.contains("minecraft")) {
            String name = string.substring(15);
            return Identifier.of("minecraft:textures/block/" + name);
        } else {
            String name = string.substring(21);
            return Identifier.of("flowerbreeding:textures/block/" + name);
        }
    }

    private int getLightLevel(World world, BlockPos pos) {
        int bLight = world.getLightLevel(LightType.BLOCK, pos);
        int sLight = world.getLightLevel(LightType.SKY, pos);
        return LightmapTextureManager.pack(bLight, sLight);
    }
}