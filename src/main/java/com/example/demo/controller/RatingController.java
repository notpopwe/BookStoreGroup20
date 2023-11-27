package com.example.demo.controller;

import com.example.demo.model.Rating;
import com.example.demo.repository.RatingRepository;
import com.example.demo.resource.RatingRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RatingController {
    private final RatingRepository ratingRepository;


    public RatingController(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    @GetMapping("/ratings")
    public ResponseEntity<List<Rating>>getAllRatings() {
        return ResponseEntity.ok(this.ratingRepository.findAll());
    }

    /*Get the average rating for the entered ISBN*/

    /*@GetMapping("/ratings/{ISBN}")
    public Rating getAverageRatings(@PathVariable String ISBN) {

    }
    */
    @PostMapping("/ratings")
    public ResponseEntity createRating(@RequestBody RatingRequest ratingRequest) {
        Rating ratings = new Rating();

        ratings.setRatingId(ratings.getRatingId());
        ratings.setISBN(ratingRequest.getISBN());
        ratings.setUsername(ratingRequest.getUsername());
        ratings.setUserRating(ratingRequest.getUserRating());
        if(ratings.getUserRating() > 5 || ratings.getUserRating() <=0)
        {
           return ResponseEntity.ok("Invalid Rating");
        }
        ratings.setAverageRating(ratings.getAverageRating());

        return ResponseEntity.status(201).body(this.ratingRepository.save(ratings));

    }
}
