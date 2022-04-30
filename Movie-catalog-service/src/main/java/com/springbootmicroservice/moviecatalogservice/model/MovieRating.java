package com.springbootmicroservice.moviecatalogservice.model;

public class MovieRating {

    private String movieName;
    private int rating;

    public MovieRating() {
    }

    public MovieRating(String movieName, int rating) {
        this.movieName = movieName;
        this.rating = rating;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
