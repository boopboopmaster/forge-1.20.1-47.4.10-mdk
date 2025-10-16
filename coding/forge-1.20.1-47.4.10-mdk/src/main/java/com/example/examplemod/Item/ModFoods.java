package com.example.examplemod.Item;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

    public class ModFoods {
        public static final FoodProperties MINT = new FoodProperties.Builder().nutrition(2).fast()
                .alwaysEat() .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.HEAL, 200), 0.1f).build();
        public static final FoodProperties MANGO = new FoodProperties.Builder().nutrition(2).fast()
                .alwaysEat() .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 0.1f).build();

    }