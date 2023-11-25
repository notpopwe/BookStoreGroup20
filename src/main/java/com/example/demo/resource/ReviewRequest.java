package com.example.demo.resource;

public class ReviewRequest {

    private String userReview;
    private String ISBN;
    private String username;
    private String name;

    public ReviewRequest() {
    }

    public ReviewRequest(String userReview, String ISBN, String username, String name) {
        this.userReview = userReview;
        this.ISBN = ISBN;
        this.username = username;
        this.name = name;
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
