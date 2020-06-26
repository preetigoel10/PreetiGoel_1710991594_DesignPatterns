package com.epam.adapterPattern;

public class AdapterPattern {
    public static void main(String args[]){
        RestaurantMenu targetInterface=new Customer();
        targetInterface.getPizza();
        System.out.print(targetInterface.getPizzaToppings());
    }
}
