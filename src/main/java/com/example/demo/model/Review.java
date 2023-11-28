package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("reviews")
public class Review {

    @Id
    private String reviewID;
    private String userReview;

    private String ISBN;
    private String username;
    private String name;

    public Review() {
    }

    public Review(String reviewID, String userReview, String ISBN, String username, String name) {
        this.reviewID = reviewID;
        this.userReview = userReview;
        this.ISBN = ISBN;
        this.username = username;
        this.name = name;
    }

    public String getReviewID() {
        return reviewID;
    }

    public void setReviewID(String reviewID) {
        this.reviewID = reviewID;
    }

    public String getUserReview() {
        return userReview;
    }

    public void setUserReview(String userReview) {
        this.userReview = userReview;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}