package com.example.demo.controller;

import com.example.demo.model.Review;
import com.example.demo.repository.ReviewRepository;
import com.example.demo.resource.ReviewRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ReviewController{

    private final ReviewRepository reviewRepository;

    public ReviewController(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @PostMapping("/books/{reviews}")
    public ResponseEntity<Review> createReview(@RequestBody ReviewRequest productRequest) {
        Review reviews = new Review();

        reviews.setISBN(productRequest.getISBN());
        reviews.setUsername(productRequest.getUsername());
        reviews.setUserReview(productRequest.getUserReview());

        return ResponseEntity.status(201).body(this.reviewRepository.save(reviews));
    }

    @GetMapping("/books/{ISBN, reviews}")
    public ResponseEntity<List<Review>> getAllReviewsByISBN(@PathVariable String ISBN) {

        Optional<Review> bookReviews = Optional.ofNullable(this.reviewRepository.findByISBN((ISBN)));

            return ResponseEntity.ok(this.reviewRepository.findAll());
    }
}
