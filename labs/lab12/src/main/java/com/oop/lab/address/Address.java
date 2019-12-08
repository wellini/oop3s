package com.oop.lab.address;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String block;
    private String apartment;

    public static Address createAddressWithCommaDelimiter(String source) {
        Address address = new Address();
        return address;
    }

    public static Address createAddress(String source) {

    }

    private Address() {
    }

    public String getCountry() {
        return country;
    }

    public Address setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public Address setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public Address setStreet(String street) {
        this.street = street;
        return this;
    }

    public String getHouse() {
        return house;
    }

    public Address setHouse(String house) {
        this.house = house;
        return this;
    }

    public String getBlock() {
        return block;
    }

    public Address setBlock(String block) {
        this.block = block;
        return this;
    }

    public String getApartment() {
        return apartment;
    }

    public Address setApartment(String apartment) {
        this.apartment = apartment;
        return this;
    }
}
