package resource;

import model.Author;

public class BookRequest {
    private String ISBN;
    private String name;
    private String bookDescription;
    private double price;
    private Author author;
    private String genre;
    private String publisher;
    private int yearPublished;
    private int copiesSold;


    public BookRequest() {
    }

    public BookRequest(String ISBN, String name, String bookDescription, double price, Author author, String genre, String publisher, int yearPublished, int copiesSold) {
        this.ISBN = ISBN;
        this.name = name;
        this.bookDescription = bookDescription;
        this.price = price;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.yearPublished = yearPublished;
        this.copiesSold = copiesSold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getCopiesSold() {
        return copiesSold;
    }

    public void setCopiesSold(int copiesSold) {
        this.copiesSold = copiesSold;
    }
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

}

