package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("/user/books/{rating}")
public class Rating {

    private float userRating;
    private float averageRating;

    @DBRef
    private String ISBN;
    private String username;

    public Rating() {
    }

    public Rating(float userRating, float averageRating, String ISBN, String username) {
        this.userRating = userRating;
        this.averageRating = averageRating;
        this.ISBN = ISBN;
        this.username = username;
    }

    public float getUserRating() {
        return userRating;
    }

    public void setUserRating(float userRating) {
        this.userRating = userRating;
    }

    public float getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(float averageRating) {
        this.averageRating = averageRating;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
