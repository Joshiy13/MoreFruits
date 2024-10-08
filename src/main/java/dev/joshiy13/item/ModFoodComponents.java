package dev.joshiy13.item;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {
        public static final FoodComponent BANANA = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f).build();
        public static final FoodComponent BLUEBERRY = new FoodComponent.Builder().nutrition(2).saturationModifier(0.25f).build();
}
