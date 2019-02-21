package com.company;
import java.util.*;
public class Store {


    public String name;
    public List<Item> items = new ArrayList<Item>();
    public int storeid;

    public Store(String name, int storeid){
        this.name = name;
        this.storeid = storeid;
    }

    public String toString() {
        // TODO - implement Store.toString
        throw new UnsupportedOperationException();
    }



}