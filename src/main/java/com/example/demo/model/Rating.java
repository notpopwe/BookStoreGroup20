package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document("ratings")
public class Rating {
    @Id
    private String ratingId;

    private int userRating;
    private float averageRating;
    private String ISBN;
    private String username;

    private int ratingScale;

    public Rating() {
    }

    public Rating(String ratingId, int userRating, float averageRating, String ISBN, String username, int ratingScale) {
        this.ratingId = ratingId;
        this.userRating = userRating;
        this.averageRating = averageRating;
        this.ISBN = ISBN;
        this.username = username;
        this.ratingScale = ratingScale;
    }

    public String getRatingId() {
        return ratingId;
    }

    public void setRatingId(String ratingId) {
        this.ratingId = ratingId;
    }

    public int getUserRating() {
        return userRating;
    }

    public void setUserRating(int userRating) {
        this.userRating = userRating;
    }

    public float getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(float averageRating) {
        this.averageRating = averageRating;
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

    public int getRatingScale() {
        return ratingScale;
    }

    public void setRatingScale(int ratingScale) {
        int star5 = 0, star4 = 0, star3 = 0, star2 = 0, star1 = 0;

        switch(getUserRating())
        {
            case 5:
                star5++;
                break;
            case 4:
                star4++;
                break;
            case 3:
                star3++;
                break;
            case 2:
                star2++;
                break;
            case 1:
                star1++;
                break;
        }
        this.ratingScale = ratingScale;
    }
}
