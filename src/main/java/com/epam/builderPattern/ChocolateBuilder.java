package com.epam.builderPattern;

public class ChocolateBuilder {
    public ChocolateType buildCadburyChocolate(){
        ChocolateType chocolateType1=new ChocolateType();
        chocolateType1.addItem(new Cadbury());
        return chocolateType1;
    }
    public ChocolateType buildNestleChocolate(){
        ChocolateType chocolateType2=new ChocolateType();
        chocolateType2.addItem(new Nestle());
        return chocolateType2;
    }
}
