package com.springbootmicroservice.movieinfoservice.resources;

import com.springbootmicroservice.movieinfoservice.model.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {

    @RequestMapping("/{movieName}")
    public Movie getMovieInfo(@PathVariable("movieName") String movieName){
        return new Movie(movieName,"Movie Description");
    }
}
