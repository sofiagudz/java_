package com.company;

public class City {
    String name;
    String region;
    String country;
    String population;
    String postcode;
    String countryCode;

    public City(String name, String region, String country, String population, String postcode, String countryCode) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.population = population;
        this.postcode = postcode;
        this.countryCode = countryCode;
    }

    public City() {
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getCountry() {
        return country;
    }

    public String getPopulation() {
        return population;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "Name: "+name+"\nRegion: "+region+"\nCountry: "+country+"\nPopulation: "+population+
                "\nPostcode: "+postcode+"\nCountry code: "+countryCode;
    }
}
