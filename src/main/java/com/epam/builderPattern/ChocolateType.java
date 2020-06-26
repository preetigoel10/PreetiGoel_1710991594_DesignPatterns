package com.epam.builderPattern;

import java.util.ArrayList;
import java.util.List;

public class ChocolateType {
    private List<Packaging> items = new ArrayList<Packaging>();

    public void addItem(Packaging packs) {
        items.add(packs);
    }

    public void itemsCost() {
        for (Packaging packs : items) {
            packs.price();
        }
    }

    public void showItems() {
        for (Packaging Packaging : items) {
            System.out.println("Chocolate name: " + Packaging.pack()+", Price: " + Packaging.price());
        }
    }
}
