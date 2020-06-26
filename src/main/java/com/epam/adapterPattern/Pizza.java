package com.epam.adapterPattern;

class Pizza {
    private String pizzaName;
    private String pizzaSize;
    private int pizzaPrice;

    String getPizzaName() {
        return pizzaName;
    }

    void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    String getPizzaSize() {
        return pizzaSize;
    }

    void setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    int getPizzaPrice() {
        return pizzaPrice;
    }

    void setPizzaPrice(int pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }


}
