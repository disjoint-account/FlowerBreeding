package net.flowerbreeding.botanytable;

import net.minecraft.world.Container;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import org.jetbrains.annotations.Nullable;
import org.jspecify.annotations.NonNull;

import java.util.List;

public class BotanyTableSlot extends Slot {

    private final Item item;
    private final List<Item> items;

    public BotanyTableSlot(Container inventory, int index, int x, int y, @Nullable Item item, @Nullable List<Item> items) {
        super(inventory, index, x, y);
        this.item = item;
        this.items = items;
    }

    @Override
    public boolean mayPlace(@NonNull ItemStack stack) {
        if(items!=null){
            for(Item modifier: items){
                if(stack.is(modifier)){
                    return true;
                }
            }
            return false;
        }else if(item!=null){
            return stack.is(item);
        }else{
            return false;
        }
    }
}