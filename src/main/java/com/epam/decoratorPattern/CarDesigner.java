package com.epam.decoratorPattern;

public class CarDesigner implements Car {
    protected Car car;

    public CarDesigner(Car c){
        this.car=c;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }

    @Override
    public long carPrice() {
        return this.car.carPrice();
    }
}
