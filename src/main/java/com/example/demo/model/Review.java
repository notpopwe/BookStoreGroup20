package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("/reviews")
public class Review {

    private String user;

    private String userReview;

    public Review() {
    }

    public Review(String[][] reviews, String userReview) {
        this.user = user;
        this.userReview = userReview;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUserReview() {
        return userReview;
    }

    public void setUserReview(String userReview) {
        this.userReview = userReview;
    }
}
