package com.example.shoppingCart.repository;

import com.example.shoppingCart.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
