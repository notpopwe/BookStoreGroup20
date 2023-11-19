package com.example.demo.controller;

import com.example.demo.model.RatingFormat;
import com.example.demo.model.ReviewandRating;
import com.example.demo.repository.ProductRepository;
import com.example.demo.resource.RatingRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RatingController {
    private final ProductRepository ratingRepository;


    public RatingController(ProductRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    @GetMapping("/Ratings")
    public ResponseEntity<List<ReviewandRating>> getAllRatings() {
        return ResponseEntity.ok(this.ratingRepository.findAll());
    }

    @PostMapping("/Ratings")
    public ResponseEntity<RatingFormat> createRating(@RequestBody RatingRequest productRequest) {
        RatingFormat ratings = new RatingFormat();

        ratings.setOverallRating(productRequest.getOverallRating());

        return ResponseEntity.status(201).body(this.ratingRepository.save(ratings));

    }
}
