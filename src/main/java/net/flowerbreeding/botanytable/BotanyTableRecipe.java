package net.flowerbreeding.botanytable;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.flowerbreeding.FBRecipes;
import net.minecraft.core.NonNullList;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import org.jspecify.annotations.NonNull;

import java.util.List;
public record BotanyTableRecipe(List<Ingredient> inputItems, ItemStackTemplate output) implements Recipe<BotanyTableRecipeInput> {

    public static MapCodec<BotanyTableRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
            Ingredient.CODEC.listOf().fieldOf("ingredients").forGetter(BotanyTableRecipe::inputItems),
            ItemStackTemplate.CODEC.fieldOf("result").forGetter(BotanyTableRecipe::output)
    ).apply(inst, BotanyTableRecipe::new));

    public static StreamCodec<RegistryFriendlyByteBuf, BotanyTableRecipe> STREAM_CODEC =
            StreamCodec.composite(
                    Ingredient.CONTENTS_STREAM_CODEC.apply(ByteBufCodecs.list()),
                    BotanyTableRecipe::inputItems,

                    ItemStackTemplate.STREAM_CODEC,
                    BotanyTableRecipe::output,

                    BotanyTableRecipe::new);

    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> list = NonNullList.create();
        list.addAll(inputItems);
        return list;
    }

    @Override
    public boolean matches(BotanyTableRecipeInput pInput, Level pLevel) {
        if(pLevel.isClientSide()) {
            return false;
        }

        for (int i = 0; i < inputItems.size(); i++) {
            if(!inputItems.get(i).test(pInput.getItem(i))) {
                return false;
            }
        }

        return true;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    // Used by ClientRecipeBook
    public boolean isEmpty() {
        return inputItems.stream().noneMatch(Ingredient::isEmpty);
    }

    @Override
    public @NonNull ItemStack assemble(BotanyTableRecipeInput pInput) {
        return output.create().copy();
    }

    @Override
    public boolean showNotification() {
        return true;
    }

    @Override
    public @NonNull String group() {
        return "Growing";
    }


    @Override
    public @NonNull RecipeSerializer<BotanyTableRecipe> getSerializer() {
        return FBRecipes.BOTANY_TABLE_SERIALIZER;
    }

    @Override
    public @NonNull RecipeType<? extends Recipe<BotanyTableRecipeInput>> getType() {
        return FBRecipes.BOTANY_TABLE_TYPE;
    }

    @Override
    public @NonNull PlacementInfo placementInfo() {
        return PlacementInfo.NOT_PLACEABLE;
    }

    @Override
    public @NonNull RecipeBookCategory recipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }

}