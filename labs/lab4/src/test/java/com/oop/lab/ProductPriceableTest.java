package com.oop.lab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductPriceableTest {

    private float PRICE = 11.6f;
    private Priceable priceable = new ProductPriceable();

    @Before
    public void setUp() throws Exception {
        ((ProductPriceable) priceable).setPrice(PRICE);
    }

    @Test
    public void getPrice() {
        assertEquals(PRICE, priceable.getPrice(), PRICE - priceable.getPrice());
    }

}