package com.oop.lab;

public class ProductPriceable implements Priceable{
    private float price;

    public ProductPriceable() {
    }

    public ProductPriceable(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
