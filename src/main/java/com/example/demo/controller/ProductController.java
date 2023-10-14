package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.resource.ProductRequest;
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

    @GetMapping("/product")
    public ResponseEntity<List<Product>> getAllProducts() {

        return ResponseEntity.ok(this.productRepository.findAll());
    }

    @PostMapping("/product")
    public ResponseEntity<Product> createProduct(@RequestBody ProductRequest productRequest) {

        Product product = new Product();

        product.setTitle(productRequest.getTitle());
        product.setAuthor(productRequest.getAuthor());
        product.setPages(productRequest.getPages());
        product.setOverallRating(productRequest.getOverallRating());
        product.setGenre(productRequest.getGenre());


        return ResponseEntity.status(201).body(this.productRepository.save(product));
    }
}