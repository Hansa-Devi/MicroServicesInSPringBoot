package com.springbootmicroservice.ratingsdataservice.resource;

import com.springbootmicroservice.ratingsdataservice.model.MovieRating;
import com.springbootmicroservice.ratingsdataservice.model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingController {

    @RequestMapping("/{movieName}")
    public MovieRating getRating(@PathVariable("movieName") String movieName){
        return new MovieRating(movieName,4);
    }

    @RequestMapping("/user/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId){
        List<MovieRating> rating= Arrays.asList(
                new MovieRating("HelloWorld", 4),
                new MovieRating("ByeWorld", 3)
        );
        UserRating userRating = new UserRating();
        userRating.setUserRatings(rating);
        return userRating;

    }


}
