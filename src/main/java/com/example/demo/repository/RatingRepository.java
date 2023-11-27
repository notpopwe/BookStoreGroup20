package com.example.demo.repository;

import com.example.demo.model.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface RatingRepository extends MongoRepository<Rating, String> {
    //Rating findAverage(String ISBN);

}