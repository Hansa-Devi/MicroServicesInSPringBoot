package com.springbootmicroservice.moviecatalogservice.model;

public class Movie {

    private String movieName;
    private String desc;

    public Movie() {
    }

    public Movie(String movieName, String desc) {
        this.movieName = movieName;
        this.desc = desc;
    }

    public String getName() {
        return movieName;
    }

    public void setName(String movieName) {
        this.movieName = movieName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
