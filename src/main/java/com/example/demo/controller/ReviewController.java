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

    @PostMapping("/book/{review}")
    public ResponseEntity<Review> createReview(@RequestBody ReviewRequest productRequest, @PathVariable String review) {
        Review reviews = new Review();

        reviews.setUser(productRequest.getUser());
        reviews.setUserReview(productRequest.getUserReview());

        return ResponseEntity.status(201).body(this.reviewRepository.save(reviews));
    }

    @GetMapping("/reviews/{ISBN}")
    public ResponseEntity<List<Review>> getAllReviewsbyISBN(@PathVariable String ISBN) {

        Optional<Review> bookReviews = Optional.ofNullable(this.reviewRepository.findByISBN((ISBN)));

        if(bookReviews.isPresent())
        {
            return ResponseEntity.ok(this.reviewRepository.);
        }
        else{
            return ResponseEntity.ok();
        }
    }
}
