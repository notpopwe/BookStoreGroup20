package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("/user/book/{rating}")
public class Rating {

    private float userRating;
    private float overallRating;

    public Rating() {
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
