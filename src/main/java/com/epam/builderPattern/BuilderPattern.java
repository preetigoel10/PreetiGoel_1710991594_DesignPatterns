package com.epam.builderPattern;

public class BuilderPattern {
    public static void main(String args[]){
        ChocolateBuilder chocolateBuilder=new ChocolateBuilder();
        ChocolateType chocolateType1=chocolateBuilder.buildCadburyChocolate();
        chocolateType1.showItems();

        ChocolateType chocolateType2=chocolateBuilder.buildNestleChocolate();
        chocolateType2.showItems();
    }
}
