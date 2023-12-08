package com.example.fooddeliveryapp.Backend;

import android.annotation.SuppressLint;

import androidx.annotation.NonNull;

public class Item {
    private String name;
    private int id;
    private double price;

    public Item() {}

    public Item(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @NonNull
    @SuppressLint("DefaultLocale")
    public String toString() {
        return String.format("Name: %s\nPrice: $%.2f", name, price);
    }
}
