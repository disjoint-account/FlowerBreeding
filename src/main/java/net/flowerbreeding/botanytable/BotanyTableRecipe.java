package net.flowerbreeding.botanytable;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.flowerbreeding.FBRecipes;
import net.minecraft.item.ItemStack;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;

public record BotanyTableRecipe(Ingredient inputItem, ItemStack output) implements Recipe<BotanyTableRecipeInput> {
    @Override
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }

    @Override
    public boolean matches(BotanyTableRecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(BotanyTableRecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public boolean fits(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getResult(RegistryWrapper.WrapperLookup registriesLookup) {
        return output;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return FBRecipes.BOTANY_TABLE_SERIALIZER;
    }

    @Override
    public RecipeType<?> getType() {
        return FBRecipes.BOTANY_TABLE_TYPE;
    }

    public static class Serializer implements RecipeSerializer<BotanyTableRecipe> {
        public static final MapCodec<BotanyTableRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.DISALLOW_EMPTY_CODEC.fieldOf("ingredient").forGetter(BotanyTableRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(BotanyTableRecipe::output)
        ).apply(inst, BotanyTableRecipe::new));
        public static final PacketCodec<RegistryByteBuf, BotanyTableRecipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, BotanyTableRecipe::inputItem,
                        ItemStack.PACKET_CODEC, BotanyTableRecipe::output,
                        BotanyTableRecipe::new);

        @Override
        public MapCodec<BotanyTableRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, BotanyTableRecipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}