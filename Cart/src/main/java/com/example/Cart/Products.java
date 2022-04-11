package com.example.Cart;

import java.util.ArrayList;

public class Products {
    private static ArrayList<String> items= new ArrayList<String>();
    static {
    }
    public ArrayList<String> retriveItems(){
        return items;
    }
    public void addItems(String name) {
        items.add(name);
    }
    public void deleteItems(String name){
        items.remove(name);
    }
}
