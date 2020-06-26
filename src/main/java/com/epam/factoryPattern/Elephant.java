package com.epam.factoryPattern;

public class Elephant extends Animal {

    @Override
    String getSound() {
        return "Trumpets";
    }

    @Override
    String getFoodType() {
        return "Herbivore";
    }

    @Override
    String getSize() {
        return "Huge";
    }
}
