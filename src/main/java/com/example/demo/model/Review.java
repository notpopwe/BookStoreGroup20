package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("book/{reviews}")
public class Review extends User{

    @Field(value = "username")

    @Field(value = "body")
    private String userReview;

    public Review() {
    }

    public Review(String username, String userReview)
    {
        super(username);
        this.userReview = userReview;
    }

    public String getUserReview() {
        return userReview;
    }

    public void setUserReview(String userReview) {
        this.userReview = userReview;
    }
}
