package com.example.demo.controller;

import com.example.demo.model.Review;
import com.example.demo.repository.ReviewRepository;
import com.example.demo.resource.ReviewRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ReviewController{

    private final ReviewRepository reviewRepository;

    public ReviewController(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @PostMapping("/reviews")
    public ResponseEntity<Review> createReview(@RequestBody ReviewRequest productRequest) {
        Review reviews = new Review();

        reviews.setUser(productRequest.getUser());
        reviews.setUserReview(productRequest.getUserReview());

        return ResponseEntity.status(201).body(this.reviewRepository.save(reviews));
    }

    @GetMapping("/reviews/book")
    public ResponseEntity getAllReviewsbyISBN(@PathVariable String ISBN) {

        Optional<Review> bookReviews = this.reviewRepository.findById((ISBN));

        if(bookReviews.isPresent())
        {
            return ResponseEntity.ok(bookReviews.get());
        }
        else{
            return ResponseEntity.ok("This book(" + ISBN + ") does not have any reviews at the moment");
        }
    }
}
