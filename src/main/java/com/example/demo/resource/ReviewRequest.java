package com.example.demo.resource;

import com.example.demo.model.Product;

import java.util.ArrayList;

public class ReviewRequest extends Product {

    private ArrayList<String> bookReviews = new ArrayList<String>();

    private String customerName;

    private String review;

    public ReviewRequest() {
    }

    public ReviewRequest(ArrayList<String> bookReviews, String customerName, String review) {
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
