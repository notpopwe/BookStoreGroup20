package com.example.demo.controller;

import com.example.demo.model.ReviewFormat;
import com.example.demo.model.ReviewandRating;
import com.example.demo.repository.ProductRepository;
import com.example.demo.resource.ReviewRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReviewController extends ReviewandRating{

    private final ProductRepository reviewRepository;

    public ReviewController(ProductRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @GetMapping("/Reviews")
    public ResponseEntity<List<ReviewandRating>> getAllReview() {
        return ResponseEntity.ok(this.reviewRepository.findAll());
    }

    @PostMapping("/Reviews")
    public ResponseEntity<ReviewFormat> createReview(@RequestBody ReviewRequest productRequest) {
        ReviewFormat reviews = new ReviewFormat();

        reviews.setBookReviews(productRequest.getBookReviews());
        reviews.setUserReview(productRequest.getUserReview());

        return ResponseEntity.status(201).body(this.reviewRepository.save(reviews));
    }
}
