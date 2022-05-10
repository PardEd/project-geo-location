package ru.netology.entity;

public record Location(String city, Country country,
                       String street, int house) {

    public String getCity() {
        return city;
    }

    public Country getCountry() {
        return country;
    }

    public String getStreet() {
        return street;
    }

    public int getHouse() {
        return house;
    }
}
