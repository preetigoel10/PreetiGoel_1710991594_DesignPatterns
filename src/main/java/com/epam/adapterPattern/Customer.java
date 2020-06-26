package com.epam.adapterPattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Customer extends Pizza implements RestaurantMenu {

public void getPizza(){
        try{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the pizza name :");
        String pizzaName=br.readLine();
        System.out.print("Enter the pizza size:");
        String pizzaSize=br.readLine();
        System.out.print("Enter the pizza price:");
        int pizzaPrice=Integer.parseInt(br.readLine());

        setPizzaName(pizzaName);
        setPizzaPrice(pizzaPrice);
        setPizzaSize(pizzaSize);
        }catch(Exception e){
        e.printStackTrace();
        }
        }
@Override
public String getPizzaToppings() {
        String pizzaName=getPizzaName();
        String pizzaSize=getPizzaSize();
        int pizzaPrice=getPizzaPrice();
        return ("The pizza : "+pizzaName+" of size: "+pizzaSize+" is for Rs "+pizzaPrice);
        }
}
