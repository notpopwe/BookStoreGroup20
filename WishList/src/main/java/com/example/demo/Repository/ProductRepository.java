package com.example.demo.Repository;

import com.example.demo.WishList.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
