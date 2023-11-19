package com.example.demo.resource;

public class ReviewRequest {

    private String user;

    private String userReview;

    public ReviewRequest() {
    }

    public ReviewRequest(String user, String userReview) {
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
