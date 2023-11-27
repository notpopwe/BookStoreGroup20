package com.example.demo.repository;

import com.example.demo.model.Rating;
import com.example.demo.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;


public interface RatingRepository extends MongoRepository<Rating, String> {
    @Query("{'ISBN' :  ?0}")
    List<Rating> findByISBN(String ISBN);

}