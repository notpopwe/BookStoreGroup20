package com.example.demo.controller;

import com.example.demo.Repository.ProductRepository;
import com.example.demo.WishList.Product;
import com.example.demo.resource.ProductRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/userID")
    public ResponseEntity<Product> createWishList(@RequestBody ProductRequest productRequest) {
        Product product = new Product();
        product.setListName(productRequest.getListName());
        product.setUserID(productRequest.getUserID());

        return ResponseEntity.status(201).body(this.productRepository.save(product));
    }

    @PostMapping("/userID/{id}")
    public ResponseEntity<Product> createBook(@RequestBody ProductRequest productRequest) {
        Product product = new Product();
        product.setBook(productRequest.getBook());
        product.setBookName(productRequest.getBookName());

        return ResponseEntity.status(201).body(this.productRepository.save(product));
    }

    @GetMapping("/userID/{id}")
    public ResponseEntity getProductByID(@PathVariable String id) {

        Optional<Product> product = this.productRepository.findById(id);

        if(product.isPresent()) {
            return ResponseEntity.ok(product.get());
        } else {
            return ResponseEntity.ok("The book with id: " + id + " was not found.");
        }
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
}
