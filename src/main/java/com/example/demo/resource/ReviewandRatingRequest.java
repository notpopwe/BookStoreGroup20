package com.example.demo.resource;

import java.util.ArrayList;

public class ReviewandRatingRequest {

    private String bookID;

    private String userID;

    private float rating;
    private String[] reviews;

    public ReviewandRatingRequest() {

    }

    public ReviewandRatingRequest(String bookID, String userID, float rating, int pages, String[] genre, String[] reviews) {
        this.bookID = bookID;
        this.userID = userID;
        this.rating = rating;
        this.reviews = reviews;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String title) {
        this.bookID = title;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String author) {
        this.userID = userID;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String[] getReviews() {
        return reviews;
    }

    public void setReviews(String[] reviews) {
        this.reviews = reviews;
    }
}