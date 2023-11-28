package com.example.demo.repository;

import com.example.demo.model.Review;
import com.example.demo.resource.RatingRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ReviewRepository extends MongoRepository<Review, String> {
    @Query("{'ISBN' :  ?0}")
    List<Review> findByISBN(String ISBN);
}
