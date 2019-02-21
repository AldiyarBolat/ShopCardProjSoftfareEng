package com.company;
import java.util.*;


public class Mall {

    public String name;
    public List<Store> stores = new ArrayList<Store>();

    public Mall(String name){
        this.name = name;
    }

    public void addStore(Store newStore) {
        stores.add(newStore);
    }

    public String toString() {
        return this.name;
    }


}
