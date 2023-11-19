package com.example.demo.repository;

import com.example.demo.model.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RatingRepository extends MongoRepository<Rating, String> {

}