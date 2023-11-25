package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("book/{reviews}")
public class Review {

    @Field(value = "body")
    private String userReview;
    @DBRef
    private String ISBN;
    private String username;
    @Field(value = "name")
    private String name;

    public Review() {
    }

    public Review(String userReview, String ISBN, String username, String name) {
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
