package com.company;
public class Country {
    String name;
    String continent;
    String population;
    String countryCode;
    String capitalCity;
    String cities;

    public Country() {
    }
    public Country(String name, String continent, String population, String countryCode, String capitalCity, String cities) {
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.countryCode = countryCode;
        this.capitalCity = capitalCity;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public String getPopulation() {
        return population;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public String getCities() {
        return cities;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public void setCities(String cities) {
        this.cities = cities;
    }
    @Override
    public String toString() {
        return "Name: "+name+"\nContinent: "+continent+"\nPopulation: "+population+
                "\nCountry code: "+countryCode+"\nCapital city: "+capitalCity+"\nCities: "+cities;
    }
}
