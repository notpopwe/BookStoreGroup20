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

    @GetMapping("/reviews")
    public ResponseEntity <List<Review>> getAllReviews() {
        return ResponseEntity.ok(this.reviewRepository.findAll());
    }

    /*Get all reviews for the selected ISBN*/
    @GetMapping("/reviews/{ISBN}")
    public ResponseEntity getAllReviewsByISBN(@PathVariable String ISBN) {
        List<Review> bookReviews = this.reviewRepository.findByISBN(ISBN);

        if(bookReviews.isEmpty())
        {
            return ResponseEntity.ok("This book with ISBN{" + ISBN + "} does not have any reviews yet");
        }else {
            return ResponseEntity.ok(bookReviews);
        }

    }

    @PostMapping("/reviews")
    public ResponseEntity<Review> createReview(@RequestBody ReviewRequest reviewRequest) {
        Review reviews = new Review();

        reviews.setReviewID(reviews.getReviewID());
        reviews.setISBN(reviewRequest.getISBN());
        reviews.setUsername(reviewRequest.getUsername());
        reviews.setName(reviewRequest.getName());
        reviews.setUserReview(reviewRequest.getUserReview());

        return ResponseEntity.status(201).body(this.reviewRepository.save(reviews));
    }
}
