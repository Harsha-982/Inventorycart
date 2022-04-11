package com.example.GroceryCart;


public class Address{
    private String name;
    private String d_no;
    private String street;
    private String home_Town;
    public Address(){
        this.name="";
        this.d_no="";
        this.street="";
        this.home_Town="";
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getD_no() {
        return d_no;
    }

    public void setD_no(String d_no) {
        this.d_no = d_no;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHome_Town() {
        return home_Town;
    }

    public void setHome_Town(String home_Town) {
        this.home_Town = home_Town;
    }

}


