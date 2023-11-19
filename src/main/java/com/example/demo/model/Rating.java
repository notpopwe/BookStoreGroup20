package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("/rating")
public class Rating {

    private float userRating;
    private float overallRating;

    public Rating() {
    }


}
