package dev.joshiy13.item;

import dev.joshiy13.MoreFruits;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MORE_FRUITS_FRUITS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreFruits.MOD_ID, "more_fruits_fruits"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BANANA))
                    .displayName(Text.translatable("itemgroup.morefruits.more_fruits_fruits"))
                    .entries((displayContext, entries) -> {
                        //Fruits
                        entries.add(ModItems.BANANA);
                    }).build());

    public static final ItemGroup MORE_FRUITS_BERRIES_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreFruits.MOD_ID, "more_fruits_berries"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CHERRY))
                    .displayName(Text.translatable("itemgroup.morefruits.more_fruits_berries"))
                    .entries((displayContext, entries) -> {
                        //Berries
                        entries.add(ModItems.BLACKBERRY);
                        entries.add(ModItems.CHERRY);
                        entries.add(ModItems.BLUEBERRY);
                    }).build());

    public static final ItemGroup MORE_FRUITS_BERRIES_OTHER = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreFruits.MOD_ID, "more_fruits_other"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SWEET_BERRY_JUICE))
                    .displayName(Text.translatable("itemgroup.morefruits.more_fruits_other"))
                    .entries((displayContext, entries) -> {
                        //Other (Juices, Blocks and such)
                        entries.add(ModItems.SWEET_BERRY_JUICE);
                        entries.add(ModItems.BLUE_BERRY_JUICE);
                    }).build());



    public static void registerItemGroups() {
        MoreFruits.LOGGER.info("Registering Item Groups for " + MoreFruits.MOD_ID);
    }
}
