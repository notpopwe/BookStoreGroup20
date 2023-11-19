package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("/Reviews")
public class ReviewFormat extends ReviewandRating {

    private String[][] bookReviews;

    private String userReview;

    public ReviewFormat() {
    }

    public ReviewFormat(String id, String bookID, String userID, String book, String user, int rating, String[][] reviews, String userReview) {
        super(id, bookID, userID, book, user, rating);
        this.bookReviews = reviews;
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
