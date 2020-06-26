package com.epam.factoryPattern;

public class Dog extends Animal {
    @Override
    String getSound() {
        return "Bark";
    }

    @Override
    String getFoodType() {
        return "Omnivore";
    }

    @Override
    String getSize() {
        return "Small";
    }
}
