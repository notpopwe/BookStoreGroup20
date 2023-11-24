package com.example.demo.resource;

public class ReviewRequest {

    private String userReview;

    public ReviewRequest() {
    }

    public ReviewRequest(String user, String userReview) {
        this.userReview = userReview;
    }

    public String getUserReview() {
        return userReview;
    }

    public void setUserReview(String userReview) {
        this.userReview = userReview;
    }
}
