package com.example.demo.resource;

public class RatingRequest {
    private String ratingId;
    private int userRating;
    private float averageRating;
    private String ISBN;
    private String username;
    private int totalRatings;
    private int star5;
    private int star4;
    private int star3;
    private int star2;
    private int star1;

    public RatingRequest() {
    }

    public RatingRequest(String ratingId, int userRating, float averageRating, String ISBN, String username, int totalRatings, int star5, int star4, int star3, int star2, int star1) {
        this.ratingId = ratingId;
        this.userRating = userRating;
        this.averageRating = averageRating;
        this.ISBN = ISBN;
        this.username = username;
        this.totalRatings = totalRatings;
        this.star5 = star5;
        this.star4 = star4;
        this.star3 = star3;
        this.star2 = star2;
        this.star1 = star1;
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
        switch (userRating) {
            case 5:
                totalRatings++;
                star5++;
                break;
            case 4:
                totalRatings++;
                star4++;
                break;
            case 3:
                totalRatings++;
                star3++;
                break;
            case 2:
                totalRatings++;
                star2++;
                break;
            case 1:
                totalRatings++;
                star1++;
                break;
        }
        this.userRating = userRating;
    }

    public float getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(float averageRating) {
        averageRating = (float) ((star1 * 1) + (star2 * 2) + (star3 * 3) + (star4 * 4) + (star5 * 5)) / totalRatings;
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

    public int getTotalRatings() {
        return totalRatings;
    }

    public void setTotalRatings(int totalRatings) {
        this.totalRatings = totalRatings;
    }

    public int getStar5() {
        return star5;
    }

    public void setStar5(int star5) {
        this.star5 = star5;
    }

    public int getStar4() {
        return star4;
    }

    public void setStar4(int star4) {
        this.star4 = star4;
    }

    public int getStar3() {
        return star3;
    }

    public void setStar3(int star3) {
        this.star3 = star3;
    }

    public int getStar2() {
        return star2;
    }

    public void setStar2(int star2) {
        this.star2 = star2;
    }

    public int getStar1() {
        return star1;
    }

    public void setStar1(int star1) {
        this.star1 = star1;
    }
}
