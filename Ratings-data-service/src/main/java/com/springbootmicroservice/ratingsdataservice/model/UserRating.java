package com.springbootmicroservice.ratingsdataservice.model;

import java.util.List;

public class UserRating {

    private List<MovieRating> userRatings;

    public List<MovieRating> getUserRatings() {
        return userRatings;
    }

    public void setUserRatings(List<MovieRating> userRatings) {
        this.userRatings = userRatings;
    }
}
