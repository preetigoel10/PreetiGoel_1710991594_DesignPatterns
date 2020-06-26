package com.epam.decoratorPattern;

public class LuxuryCar extends CarDesigner {
    public LuxuryCar(Car c) {
        super(c);
    }
    @Override
    public void assemble(){
        System.out.print("Assembling Luxury Car features");
    }

    @Override
    public long carPrice(){
        return 8000000;
    }
}
