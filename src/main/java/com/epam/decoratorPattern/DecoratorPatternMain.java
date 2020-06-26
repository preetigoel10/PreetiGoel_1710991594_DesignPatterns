package com.epam.decoratorPattern;

import java.io.IOException;
import java.util.Scanner;

public class DecoratorPatternMain {
    public static void main(String[] args) throws IOException,NumberFormatException{
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("Car Menu");
            System.out.print("1. Basic Car.\n");
            System.out.print("2. Luxury Car.\n");
            System.out.print("3. Sports Car.\n");
            System.out.print("4. Exit \n");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    OrdinaryCar ordinaryCar=new OrdinaryCar();
                    ordinaryCar.assemble();
                    System.out.println("\nCost of Basic Car is: Rs "+ordinaryCar.carPrice());
                break;

                case 2:
                    Car luxuryCar=new LuxuryCar((Car) new OrdinaryCar());
                    luxuryCar.assemble();
                    System.out.println("\nCost of Luxury Car is: Rs "+luxuryCar.carPrice());
                    break;

                case 3:
                    Car sportsCar=new SportsCar((Car) new OrdinaryCar());
                    sportsCar.assemble();
                    System.out.println("\nCost of Sports Car is: Rs "+sportsCar.carPrice());
                    break;

                case 4:
                    return;

                default:
                    System.out.println("No other cars are available");
            }

        }while(choice!=4);
    }
}
