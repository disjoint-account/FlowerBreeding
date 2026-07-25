package net.flowerbreeding.compat;

import com.mojang.serialization.codecs.RecordCodecBuilder;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.Display;
import me.shedaniel.rei.api.common.display.DisplaySerializer;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.api.common.util.EntryIngredients;
import net.flowerbreeding.botanytable.BotanyTableRecipe;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.crafting.RecipeHolder;
import org.jspecify.annotations.NonNull;

import java.util.List;
import java.util.Optional;

public record BotanyDisplay(List<EntryIngredient> inputItems, EntryIngredient output, Optional<Identifier> location) implements Display {

    public static final DisplaySerializer<BotanyDisplay> SERIALIZER = DisplaySerializer.of(
            RecordCodecBuilder.mapCodec(instance -> instance.group(
                        EntryIngredient.codec().listOf().fieldOf("input").forGetter(BotanyDisplay::inputItems),
                        EntryIngredient.codec().fieldOf("output").forGetter(BotanyDisplay::output),
                        Identifier.CODEC.optionalFieldOf("location").forGetter(BotanyDisplay::location))
                        .apply(instance, BotanyDisplay::new)), StreamCodec.composite(
                            EntryIngredient.streamCodec().apply(ByteBufCodecs.list()),
                            BotanyDisplay::inputItems,
                            EntryIngredient.streamCodec(),
                            BotanyDisplay::output,
                            ByteBufCodecs.optional(Identifier.STREAM_CODEC),
                            BotanyDisplay::location,
                            BotanyDisplay::new));

    public BotanyDisplay(RecipeHolder<BotanyTableRecipe> entry) {
        this(entry.id().identifier(), entry.value());
    }

    public BotanyDisplay(Identifier id, BotanyTableRecipe recipe) {
        this(EntryIngredients.ofIngredients(recipe.inputItems()), EntryIngredients.of(recipe.output().create()), Optional.of(id));
    }

    @Override
    public List<EntryIngredient> getInputEntries() {
        return inputItems;
    }

    @Override
    public List<EntryIngredient> getOutputEntries() {
        return List.of(output);
    }

    @Override
    public CategoryIdentifier<?> getCategoryIdentifier() {
        return FBREICommon.BOTANY_CRAFTING;
    }

    @Override
    public Optional<Identifier> getDisplayLocation() {
        return location;
    }

    @Override
    public @NonNull DisplaySerializer<? extends Display> getSerializer() {
        return SERIALIZER;
    }
}
