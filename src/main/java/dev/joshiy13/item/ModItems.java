package dev.joshiy13.item;

import dev.joshiy13.MoreFruits;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    //Fruits
    public static final Item BANANA = registerItem("banana", new Item(new Item.Settings().food(ModFoodComponents.BANANA)));
    //Berries
    public static final Item BLUEBERRY = registerItem("blueberry", new Item(new Item.Settings().food(ModFoodComponents.BLUEBERRY)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreFruits.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoreFruits.LOGGER.info("Registering Items for " + MoreFruits.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            //Fruits
            entries.add(BANANA);
            //Berries
            entries.add(BLUEBERRY);
        });
    }
}