package com.example.demo.controller;

import com.example.demo.Repository.ProductRepository;
import com.example.demo.WishList.Product;
import com.example.demo.resource.ProductRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/userID")
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(this.productRepository.findAll());
    }

    @GetMapping("/userID/{id}")
    public ResponseEntity<List<Product>> getListProducts(@PathVariable String id) {
        return ResponseEntity.ok(this.productRepository.findAll());
    }

    @PostMapping("/userID")
    public ResponseEntity<Product> createWishList(@RequestBody ProductRequest listRequest) {
        Product product = new Product();
        product.setListName(listRequest.getListName());
        product.setUserID(listRequest.getUserID());

        return ResponseEntity.status(201).body(this.productRepository.save(product));
    }

    @PostMapping("/userID/{id}")
    public ResponseEntity<Product> createBook(@RequestBody ProductRequest bookRequest) {
        Product product = new Product();
        product.setBook(bookRequest.getBook());

        return ResponseEntity.status(201).body(this.productRepository.save(product));
    }

    @DeleteMapping("/userID/{id}")
    public ResponseEntity deleteProductByID (@PathVariable String id){

        Optional<Product> product = this.productRepository.findById(id);

        if (product.isPresent()) {
            this.productRepository.deleteById(id);
            return ResponseEntity.ok("Item deleted.");
        } else {
                return ResponseEntity.ok("The book with id: " + id + " was not found for deletion.");
        }
    }

    @DeleteMapping("/userID")
    public ResponseEntity deleteAll () {
        this.productRepository.deleteAll();
        return null;
    }
}
