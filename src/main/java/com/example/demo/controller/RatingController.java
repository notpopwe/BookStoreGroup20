package com.example.demo.controller;

import com.example.demo.model.Rating;
import com.example.demo.repository.RatingRepository;
import com.example.demo.resource.RatingRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RatingController {
    private final RatingRepository ratingRepository;


    public RatingController(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    @GetMapping("/book/{rating}")
    public ResponseEntity getAverageRatings(@PathVariable String book) {
        Optional<List<Rating>> averageRating = (this.ratingRepository.findAllRatings());

        return ResponseEntity.ok(this.ratingRepository.findAll());
    }

    @PostMapping("/user/book/{rating}")
    public ResponseEntity<Rating> createRating(@RequestBody RatingRequest ratingRequest) {
        Rating ratings = new Rating();

        ratings.setUserRating(ratingRequest.getUserRating());
        return ResponseEntity.status(201).body(this.ratingRepository.save(ratings));

    }
}
