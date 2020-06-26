package com.epam.factoryPattern;

public class Cat extends Animal {

    @Override
    String getSound() {
        return "Meow";
    }

    @Override
    String getFoodType() {
        return "Carnivore";
    }

    @Override
    String getSize() {
        return "Small";
    }
}
