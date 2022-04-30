package com.springbootmicroservice.moviecatalogservice.resource;

import com.springbootmicroservice.moviecatalogservice.model.Movie;
import com.springbootmicroservice.moviecatalogservice.model.MovieCatalog;
import com.springbootmicroservice.moviecatalogservice.model.MovieRating;
import com.springbootmicroservice.moviecatalogservice.model.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

    @Autowired
    private RestTemplate restTemplate;

//    @Autowired
//    private WebClient.Builder webClientBuilder;

    @RequestMapping("/{userId}")
    public List<MovieCatalog> getCatalog(@PathVariable("userId") String userId) {

        UserRating ratings = restTemplate.getForObject("http://movie-rating-service/ratingsdata/user/"+ userId,UserRating.class);
        return ratings.getUserRatings().stream().map(rating -> {
            Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieName(), Movie.class);
                    return new MovieCatalog(movie.getName(), movie.getDesc(), rating.getRating());
        })
                .collect(Collectors.toList());
    }
}
//            Movie movie= webClientBuilder.build()
//            .get().uri("http://localhost:8083/movies/" + rating.getMovieName())
//            .retrieve()
//            .bodyToMono(Movie.class)
//            .block();