package com.example.demo.controller;

import com.example.demo.model.Rating;
import com.example.demo.repository.RatingRepository;
import com.example.demo.resource.RatingRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RatingController {
    private final RatingRepository ratingRepository;


    public RatingController(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    @GetMapping("/Ratings")
    public ResponseEntity<List<Rating>> getAllRatings() {
        return
    }

    @PostMapping("/Ratings")
    public ResponseEntity<Rating> createRating(@RequestBody RatingRequest productRequest) {
        Rating ratings = new Rating();



        return

    }
}
