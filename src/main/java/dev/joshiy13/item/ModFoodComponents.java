package dev.joshiy13.item;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {
        //Fruits
        public static final FoodComponent BANANA = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f).build();

        //Berries
        public static final FoodComponent BLUEBERRY = new FoodComponent.Builder().nutrition(2).saturationModifier(0.25f).build();
        public static final FoodComponent BLACKBERRY = new FoodComponent.Builder().nutrition(2).saturationModifier(0.25f).build();
        public static final FoodComponent CHERRY = new FoodComponent.Builder().nutrition(2).saturationModifier(0.25f).build();

        //Juices

        public static final FoodComponent SWEET_BERRY_JUICE = new FoodComponent.Builder().nutrition(5).saturationModifier(0.25f).build();
        public static final FoodComponent BLUE_BERRY_JUICE = new FoodComponent.Builder().nutrition(5).saturationModifier(0.25f).build();
}
