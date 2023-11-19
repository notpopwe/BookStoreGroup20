package com.example.demo.resource;

public class RatingRequest {

    private float userRating;
    private float overallRating;

    public RatingRequest() {
    }

    public RatingRequest(float userRating, float overallRating) {
        this.userRating = userRating;
        this.overallRating = overallRating;
    }

    public float getUserRating() {
        return userRating;
    }

    public void setUserRating(float userRating) {
        this.userRating = userRating;
    }

    public float getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(float overallRating) {
        this.overallRating = overallRating;
    }
}
