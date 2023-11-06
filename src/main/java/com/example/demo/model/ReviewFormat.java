package com.example.demo.model;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;

public class ReviewFormat extends Product{

    @Id
    private ArrayList<String> bookReviews = new ArrayList<String>();

    private String customerName;

    private String review;

    public ReviewFormat() {
    }

    public ReviewFormat(ArrayList<String> bookReviews, String customerName, String review) {
        super.ProductRequest();
        this.bookReviews = bookReviews;
        this.customerName = customerName;
        this.review = review;
    }

    public ArrayList<String> getBookReviews() {
        return bookReviews;
    }

    public void setBookReviews(ArrayList<String> bookReviews) {
        this.bookReviews = bookReviews;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String name) {
        this.customerName = customerName;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
