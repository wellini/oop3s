package com.oop.lab;

public class ServicePriceable implements Priceable{
    private float price;

    public ServicePriceable() {
    }

    public ServicePriceable(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
