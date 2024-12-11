package net.flowerbreeding.botanytable;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.flowerbreeding.FBBlocks;
import net.flowerbreeding.FBRecipes;
import net.minecraft.item.ItemStack;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.recipe.*;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;

import java.util.stream.Stream;

public class BotanyTableRecipe implements Recipe<BotanyTableRecipeInput> {

    private final Ingredient vial1;
    private final Ingredient vial2;
    private final Ingredient jar;
    public final ItemStack result;

    public BotanyTableRecipe(Ingredient vial1, Ingredient vial2, Ingredient jar, ItemStack result) {
        this.vial1 = vial1;
        this.vial2 = vial2;
        this.jar = jar;
        this.result = result;
    }

    public boolean fits(int width, int height) {
        return width * height >= 2;
    }

    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> ingredients = DefaultedList.ofSize(4);
        ingredients.add(vial1);
        ingredients.add(vial2);
        ingredients.add(jar);
        return ingredients;
    }

    public ItemStack getResult(RegistryWrapper.WrapperLookup wrapperLookup) {
        return this.result;
    }

    public ItemStack createIcon() {
        return new ItemStack(FBBlocks.BOTANY_TABLE);
    }

    @Override
    public boolean isIgnoredInRecipeBook() {
        return true;
    }

    @Override
    public RecipeSerializer<? extends Recipe<BotanyTableRecipeInput>> getSerializer() {
        return FBRecipes.BOTANY_TABLE_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<BotanyTableRecipeInput>> getType() {
        return FBRecipes.BOTANY_TABLE_TYPE;
    }

    @Override
    public IngredientPlacement getIngredientPlacement() {
        return null;
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return null;
    }

    // Used by ClientRecipeBook
    public boolean isEmpty() {
        return Stream.of(this.vial1, this.vial2, this.jar).noneMatch(Ingredient::isEmpty);
    }

    public static class Serializer implements RecipeSerializer<BotanyTableRecipe> {

        public static final MapCodec<BotanyTableRecipe> CODEC = RecordCodecBuilder
                .mapCodec(instance -> instance.group((Ingredient.CODEC.fieldOf("vial1")).forGetter(recipe -> recipe.vial1),
                                (Ingredient.CODEC.fieldOf("vial2")).forGetter(recipe -> recipe.vial2),
                                (Ingredient.CODEC.fieldOf("jar")).forGetter(recipe -> recipe.jar),
                                (ItemStack.VALIDATED_CODEC.fieldOf("result")).forGetter(recipe -> recipe.result))
                                .apply(instance, BotanyTableRecipe::new));

        public static final PacketCodec<RegistryByteBuf, BotanyTableRecipe> PACKET_CODEC = PacketCodec.ofStatic(Serializer::write, Serializer::read);

        @Override
        public MapCodec<BotanyTableRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, BotanyTableRecipe> packetCodec() {
            return PACKET_CODEC;
        }

        private static BotanyTableRecipe read(RegistryByteBuf buf) {
            Ingredient vial1Ingredient = Ingredient.PACKET_CODEC.decode(buf);
            Ingredient vial2Ingredient = Ingredient.PACKET_CODEC.decode(buf);
            Ingredient jarIngredient = Ingredient.PACKET_CODEC.decode(buf);
            ItemStack itemStack = ItemStack.PACKET_CODEC.decode(buf);
            return new BotanyTableRecipe(vial1Ingredient, vial2Ingredient, jarIngredient, itemStack);
        }

        private static void write(RegistryByteBuf buf, BotanyTableRecipe botanyTableRecipe) {
            Ingredient.PACKET_CODEC.encode(buf, botanyTableRecipe.vial1);
            Ingredient.PACKET_CODEC.encode(buf, botanyTableRecipe.vial2);
            Ingredient.PACKET_CODEC.encode(buf, botanyTableRecipe.jar);
            ItemStack.PACKET_CODEC.encode(buf, botanyTableRecipe.result);
        }
    }

    @Override
    public boolean matches(BotanyTableRecipeInput botanyTableRecipeInput, World world) {
        return this.vial1.test(botanyTableRecipeInput.vial1()) && this.vial2.test(botanyTableRecipeInput.vial2()) && this.jar.test(botanyTableRecipeInput.jar());
    }

    @Override
    public ItemStack craft(BotanyTableRecipeInput botanyTableRecipeInput, RegistryWrapper.WrapperLookup wrapperLookup) {
        return this.result.copy();
    }

}