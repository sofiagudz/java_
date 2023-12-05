package com.company;

import java.text.DateFormat;

public class Person {
    String name;
    String birthDate;
    String phoneNumber;
    String city;
    String country;
    String homeAddress;

    public Person(String name, String birthDate, String phoneNumber, String city, String country, String homeAddress) {
        this.name = name;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.country = country;
        this.homeAddress = homeAddress;
    }

    public Person() {
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String  birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nBirth date: " + birthDate + "\nPhone number: " + phoneNumber +
                "\nCity: " + city + "\nCountry: " + country + "\nHome address: " + homeAddress;

    }
}
