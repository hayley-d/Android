package com.hayleydodkins.resturantapplication;

public class Dish {
    public String name;
    public String description;
    public double price;

    public String imageUrl;

    public Dish(String name, String desc,double price)
    {
        this.name = name;
        this.description = desc;
        this.price = price;
    }

    @Override
    public String toString(){
        return name + "\n" + description + "\n" + price;
    }
}
