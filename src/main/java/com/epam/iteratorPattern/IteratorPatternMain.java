package com.epam.iteratorPattern;

public class IteratorPatternMain {
    public static void main(String[] args) {
        CollectionOfDesserts obj = new CollectionOfDesserts();

        for(Iterator iterator = obj.getIterator(); iterator.hasNext();){
            String name = (String)iterator.next();
            System.out.println("Dessert Name: " + name);
        }
    }
}
