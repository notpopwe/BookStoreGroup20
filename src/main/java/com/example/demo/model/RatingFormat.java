package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("/Rating")
public class RatingFormat extends ReviewandRating{

    private float userRating;
    private float overallRating;

    public RatingFormat() {
    }


}
