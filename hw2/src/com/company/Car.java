package com.company;

public class Car {
    String name;
    String carBrand;
    String releaseYear;
    int engineCapacity;
    public Car() {
    }
    public Car(String name, String carBrand, String releaseYear, int engineCapasity) {
        this.name = name;
        this.carBrand = carBrand;
        this.releaseYear = releaseYear;
        this.engineCapacity = engineCapasity;
    }

    public String getName() {
        return name;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public int getEngineCapasity() {
        return engineCapacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setEngineCapasity(int engineCapasity) {
        this.engineCapacity = engineCapasity;
    }

    @Override
    public String toString() {
        return "Name - " + name + "\nCar brand - " + carBrand + "\nRelease year - " + releaseYear + "\nEngine capacity - " + engineCapacity;
    }
}
