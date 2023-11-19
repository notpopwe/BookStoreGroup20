package com.example.demo.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document("products")
public class ReviewandRating {

    @Id
    private String id;

    private String bookID;

    private String userID;

    private float rating;
    private String[] reviews;

    public ReviewandRating() {
    }

    public ReviewandRating(String bookID, String userID, float rating, int pages, String[] genre, String[] reviews) {
        this.bookID = bookID;
        this.userID = userID;
        this.rating = rating;
        this.reviews = reviews;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String author) {
        this.userID = author;
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