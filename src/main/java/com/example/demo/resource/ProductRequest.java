package com.example.demo.resource;

import java.util.ArrayList;

public class ProductRequest {

    private String title;

    private String author;

    private int pages;

    private String[] genre;

    private ArrayList<Float> overallRating = new ArrayList<Float>();

    private ArrayList<String> bookReviews = new ArrayList<String>();


    public ProductRequest() {

    }

    public ProductRequest(String title, String author, int pages, String[] genre, ArrayList<Float> overallRating, ArrayList<String> bookReviews) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.genre = genre;
        this.overallRating = overallRating;
        this.bookReviews = bookReviews;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String[] getGenre() {
        return genre;
    }

    public void setGenre(String[] genre) {
        this.genre = genre;
    }

    public ArrayList<Float> getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(ArrayList<Float> overallRating) {
        this.overallRating = overallRating;
    }

    public ArrayList<String> getBookReviews() {
        return bookReviews;
    }

    public void setBookReviews(ArrayList<String> bookReviews) {
        this.bookReviews = bookReviews;
    }
}