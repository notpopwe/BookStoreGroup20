package com.example.demo.resource;

public class RatingRequest {

    private float overallRating;

    public RatingRequest() {
    }

    public RatingRequest(float overallRating) {
        this.overallRating = overallRating;
    }

    public float getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(float overallRating) {
        this.overallRating = overallRating;
    }
}
