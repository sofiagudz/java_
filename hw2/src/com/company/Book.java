package com.company;

public class Book {
    String name;
    String author;
    String releaseYear;
    String publisher;
    String genre;
    int pagesAmount;

    public Book() {
    }
    public Book(String name, String author, String releaseYear, String publisher, String genre, int pagesAmount) {
        this.name = name;
        this.author = author;
        this.releaseYear = releaseYear;
        this.publisher = publisher;
        this.genre = genre;
        this.pagesAmount = pagesAmount;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getGenre() {
        return genre;
    }

    public int getPagesAmount() {
        return pagesAmount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPagesAmount(int pagesAmount) {
        this.pagesAmount = pagesAmount;
    }

    @Override
    public String toString() {
        return "Name - " + name + "\nAuthor - " + author + "\nRelease year - " + releaseYear + "\nPublishing house - " + publisher +
                "\nGenre - " + genre + "\nNumber of pages - " + pagesAmount;
    }
}
