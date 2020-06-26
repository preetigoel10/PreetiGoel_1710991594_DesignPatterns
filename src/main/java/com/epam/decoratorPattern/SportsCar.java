package com.epam.decoratorPattern;

public class SportsCar extends CarDesigner{
    public SportsCar(Car c) {
        super(c);
    }

    @Override
    public void assemble(){
        car.assemble();
        System.out.print("Assembling Sports Car features");
    }
    @Override
    public long carPrice(){
        return 5000000;
    }
}
