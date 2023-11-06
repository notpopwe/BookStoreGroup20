package com.example.demo.controller;

import com.example.demo.model.ReviewandRating;
import com.example.demo.repository.ProductRepository;
import com.example.demo.resource.ReviewandRatingRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {

        this.productRepository = productRepository;
    }

    @GetMapping("/products")
    public ResponseEntity<List<ReviewandRating>> getAllProducts() {

        return ResponseEntity.ok(this.productRepository.findAll());
    }

    @PostMapping("/products")
    public ResponseEntity<ReviewandRating> createProduct(@RequestBody ReviewandRatingRequest productRequest) {

        ReviewandRating product = new ReviewandRating();

        product.setBookID(productRequest.getBookID());
        product.setUserID(productRequest.getUserID());
        product.setRating(productRequest.getRating());
        product.setReviews(productRequest.getReviews());



        return ResponseEntity.status(201).body(this.productRepository.save(product));
    }
}