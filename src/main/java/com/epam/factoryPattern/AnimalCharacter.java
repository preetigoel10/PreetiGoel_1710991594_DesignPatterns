package com.epam.factoryPattern;

import java.io.IOException;
import java.util.Scanner;

public class AnimalCharacter {
    public static void main(String args[])throws IOException {
        AnimalCharacterFactory animalFactory = new AnimalCharacterFactory();
        Scanner sc=new Scanner(System.in);
        System.out.print("Choose one:\nDog\nCat\nElephant\nEnter the name of animal whose characteristics you want:");
        String animalName=sc.next();
        Animal p = animalFactory.getAnimal(animalName);
        System.out.println(animalName.toUpperCase()+" is a "+p.getFoodType()+",it is "+p.getSize()+" in size and it "+p.getSound());
    }
}
