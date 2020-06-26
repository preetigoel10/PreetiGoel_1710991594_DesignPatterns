package com.epam.decoratorPattern;

public class OrdinaryCar implements Car {
    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }

    @Override
    public long carPrice() {
        return 300000;
    }
}
