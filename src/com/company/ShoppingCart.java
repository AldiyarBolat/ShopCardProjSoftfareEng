package com.company;

import java.util.ArrayList;
import java.util.*;

public class ShoppingCart {

    public List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }


    public String toString() { // show cart
        String res = "";
        double tot = 0;
        for(int i = 0; i < items.size(); i++){
            res += ( (i + 1) + "." + items.get(i).name + "   " + items.get(i).price + "$" + "\n");
            tot += items.get(i).price;
        }
        res+= "\n" + "Total price is:" + tot;
        return res;
    }



}