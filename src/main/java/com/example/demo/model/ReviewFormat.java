package com.example.demo.model;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;

public class ReviewFormat extends Product{

    @Id
    private ArrayList<String> bookReviews = new ArrayList<String>();

    private String name;

    private String review;

    public ReviewFormat() {
    }

    public ReviewFormat(ArrayList<String> bookReviews, String name, String review) {
        this.bookReviews = bookReviews;
        this.name = name;
        this.review = review;
    }

    public ArrayList<String> getBookReviews() {
        return bookReviews;
    }

    public void setBookReviews(ArrayList<String> bookReviews) {
        this.bookReviews = bookReviews;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
