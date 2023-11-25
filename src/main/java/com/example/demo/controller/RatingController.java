package com.example.demo.controller;

import com.example.demo.model.Rating;
import com.example.demo.repository.RatingRepository;
import com.example.demo.resource.RatingRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RatingController {
    private final RatingRepository ratingRepository;


    public RatingController(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    @GetMapping("/book/{ISBN}")
    public ResponseEntity getAverageRatings(@PathVariable String ISBN) {
        Rating averageRating = (this.ratingRepository.findAverage());

        return ResponseEntity.ok(this.ratingRepository.findAverage());
    }

    @PostMapping("/user/book/{rating}")
    public ResponseEntity<Rating> createRating(@RequestBody RatingRequest ratingRequest) {
        Rating ratings = new Rating();

        ratings.setISBN(ratingRequest.getISBN());
        ratings.setUsername(ratingRequest.getUsername());
        ratings.setUserRating(ratingRequest.getUserRating());

        return ResponseEntity.status(201).body(this.ratingRepository.save(ratings));

    }
}
