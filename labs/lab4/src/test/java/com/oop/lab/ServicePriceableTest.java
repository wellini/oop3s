package com.oop.lab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ServicePriceableTest {

    private float PRICE = 11.6f;
    private Priceable priceable = new ServicePriceable();

    @Before
    public void setUp() throws Exception {
        ((ServicePriceable) priceable).setPrice(PRICE);
    }

    @Test
    public void getPrice() {
        assertEquals(PRICE, priceable.getPrice(), PRICE - priceable.getPrice());
    }

}