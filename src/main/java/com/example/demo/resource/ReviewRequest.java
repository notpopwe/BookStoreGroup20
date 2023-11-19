package com.example.demo.resource;

public class ReviewRequest {

    private String[][] bookReviews;

    private String userReview;

    public ReviewRequest() {
    }

    public ReviewRequest(String[][] bookReviews, String userReview) {
        this.bookReviews = bookReviews;
        this.userReview = userReview;
    }

    public String[][] getBookReviews() {  
        return bookReviews;
    }

    public void setBookReviews(String[][] bookReviews) {
        this.bookReviews = bookReviews;
    }

    public String getUserReview() {
        return userReview;
    }

    public void setUserReview(String userReview) {
        this.userReview = userReview;
    }
}
