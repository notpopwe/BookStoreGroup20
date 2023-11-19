package com.example.demo.repository;

import com.example.demo.model.ReviewandRating;
import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface ProductRepository extends MongoRepository<ReviewandRating, String> {

}