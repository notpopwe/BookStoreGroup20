package com.example.demo.resource;

public class RatingRequest {
    private String ratingId;
    private int userRating;
    private String ISBN;
    private String username;


    public RatingRequest() {
    }

    public RatingRequest(String ratingId, int userRating, String ISBN, String username) {
        this.ratingId = ratingId;
        this.userRating = userRating;
        this.ISBN = ISBN;
        this.username = username;
    }

    public String getRatingId() {
        return ratingId;
    }

    public void setRatingId(String ratingId) {
        this.ratingId = ratingId;
    }

    public int getUserRating() {
        return userRating;
    }

    public void setUserRating(int userRating) {
        this.userRating = userRating;
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
