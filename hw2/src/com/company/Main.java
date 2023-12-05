package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Person

//        Person person = new Person("Ivan Ivanenko", "23/04/1999", "0985467236", "Kyiv", "Ukraine", "Lesi Ukrainky blvd");
//        System.out.println(person.toString());
//
//        Person person2 = new Person();
//        System.out.println("\nEnter data for the new Person object");
//        String name, date, phNumber, city, country, address;
//
//        System.out.print("Name: ");
//        name = scanner.nextLine();
//        person2.setName(name);
//
//        System.out.print("Birth date: ");
//        date = scanner.nextLine();
//        person2.setBirthDate(date);
//
//        System.out.print("Phone number: ");
//        phNumber = scanner.nextLine();
//        person2.setPhoneNumber(phNumber);
//
//        System.out.print("City: ");
//        city = scanner.nextLine();
//        person2.setCity(city);
//
//        System.out.print("Country: ");
//        country = scanner.nextLine();
//        person2.setCountry(country);
//
//        System.out.print("Home address: ");
//        address = scanner.nextLine();
//        person2.setHomeAddress(address);
//
//        System.out.println("\nObject person2:");
//        System.out.println(person2.toString());

        //City

//        City city = new City("Kyiv", "Kyiv region", "Ukraine", "2.884 million(2017)", "01001", "+38");
//        System.out.println(city.toString());
//
//        City city2 = new City();
//        System.out.println("\nEnter data for the new City object");
//
//        System.out.print("Name: ");
//        String name = scanner.nextLine();
//        city2.setName(name);
//
//        System.out.print("Region: ");
//        String region = scanner.nextLine();
//        city2.setRegion(region);
//
//        System.out.print("Country: ");
//        String country = scanner.nextLine();
//        city2.setCountry(country);
//
//        System.out.print("Population: ");
//        String popul = scanner.nextLine();
//        city2.setPopulation(popul);
//
//        System.out.print("Postcode: ");
//        String postcode = scanner.nextLine();
//        city2.setPostcode(postcode);
//
//        System.out.print("Country code: ");
//        String countryCode = scanner.nextLine();
//        city2.setCountryCode(countryCode);
//
//        System.out.println("\nObject city2:");
//        System.out.println(city2.toString());

        //Country

//        Country country = new Country("Ukraine", "Europe", "43.79 million(2021)", "+38", "Kyiv", "Lviv, Kharkiv, Odesa, Poltava");
//        System.out.println(country.toString());
//
//        Country country2 = new Country();
//        System.out.println("\nEnter data for the new Country object");
//
//        System.out.print("Name: ");
//        String name = scanner.nextLine();
//        country2.setName(name);
//
//        System.out.print("Continent: ");
//        String continent = scanner.nextLine();
//        country2.setContinent(continent);
//
//        System.out.print("Population: ");
//        String popul = scanner.nextLine();
//        country2.setPopulation(popul);
//
//        System.out.print("Country code: ");
//        String code = scanner.nextLine();
//        country2.setCountryCode(code);
//
//        System.out.print("Capital city: ");
//        String capCity = scanner.nextLine();
//        country2.setCapitalCity(capCity);
//
//        System.out.print("Cities: ");
//        String cities = scanner.nextLine();
//        country2.setCities(cities);
//
//        System.out.println("\nObject country2:");
//        System.out.println(country2.toString());

        //Fraction

//        Fraction f1 = new Fraction(30,2);
//        Fraction f2 = new Fraction(3,2);
//
//        Fraction addition = f1.Addition(f2);
//        Fraction subtraction = f1.Subtraction(f2);
//        Fraction mult = f1.Multiplication(f2);
//        Fraction division = f1.Division(f2);
//
//        System.out.println("Addition: "+addition.toString());
//        System.out.println("Subtraction: "+subtraction.toString());
//        System.out.println("Multiplication: "+mult.toString());
//        System.out.println("Division: "+division.toString());

        //Book

//        Book book = new Book("Charisma", "Olivia Fox Cabane", "2018", "Alpina Publisher", "Popular psychology", 272);
//        System.out.println(book.toString());
//
//        Book book2 = new Book();
//        System.out.println("\nEnter data for the new Book object");
//
//        System.out.print("Name: ");
//        String name = scanner.nextLine();
//        book2.setName(name);
//
//        System.out.print("Author: ");
//        String author = scanner.nextLine();
//        book2.setAuthor(author);
//
//        System.out.print("Release year: ");
//        String year = scanner.nextLine();
//        book2.setReleaseYear(year);
//
//        System.out.print("Publishing house: ");
//        String publ = scanner.nextLine();
//        book2.setPublisher(publ);
//
//        System.out.print("Genre: ");
//        String genre = scanner.nextLine();
//        book2.setGenre(genre);
//
//        System.out.print("Number of pages: ");
//        int pages = scanner.nextInt();
//        book2.setPagesAmount(pages);
//
//        System.out.println(book2.toString());

        //Car

        Car car = new Car("Mercedes-AMG G 63", "Mercedes", "2020", 3982);
        System.out.println(car.toString());

        Car car2 = new Car();
        System.out.println("\nEnter data for the new Car object");

        System.out.print("Name: ");
        String name = scanner.nextLine();
        car2.setName(name);

        System.out.print("Car brand: ");
        String brand = scanner.nextLine();
        car2.setCarBrand(brand);

        System.out.print("Release year: ");
        String year = scanner.nextLine();
        car2.setReleaseYear(year);

        System.out.print("Engine capacity: ");
        int engCapacity = scanner.nextInt();
        car2.setEngineCapasity(engCapacity);

        System.out.println(car2.toString());
    }
}
