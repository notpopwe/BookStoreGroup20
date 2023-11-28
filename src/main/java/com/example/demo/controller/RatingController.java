package com.example.demo.controller;

import com.example.demo.model.Rating;
import com.example.demo.repository.RatingRepository;
import com.example.demo.resource.RatingRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.DecimalFormat;
import java.util.List;

@RestController
public class RatingController {
    private final RatingRepository ratingRepository;


    public RatingController(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    @GetMapping("/ratings")
    public ResponseEntity<List<Rating>>getAllRatings() {
        return ResponseEntity.ok(this.ratingRepository.findAll());
    }

    /*Get the average rating for the entered ISBN*/

    @GetMapping("/ratings/{ISBN}")
    public ResponseEntity getAverageRatings(@PathVariable String ISBN) {
        int i;
        int totalRating = 0;
        float averageRating;
        List<Rating> bookRating = this.ratingRepository.findByISBN(ISBN);
        DecimalFormat df = new DecimalFormat(".0");

        Rating ratings = new Rating();

        i = bookRating.size() - 1;
        while(i != -1)
        {
            totalRating += (bookRating.get(i).getUserRating());
            i--;
        }

        averageRating = (float) totalRating / bookRating.size();

        if(bookRating.isEmpty())
        {
            return ResponseEntity.ok("This book with ISBN{" + ISBN +"} does not have any ratings yet");
        }
        else {
            return ResponseEntity.ok("The average rating for the book with ISBN{" + ISBN + "} is: " + df.format(averageRating));
        }

    }
    @PostMapping("/ratings")
    public ResponseEntity createRating(@RequestBody RatingRequest ratingRequest) {
        Rating ratings = new Rating();

        ratings.setRatingId(ratings.getRatingId());
        ratings.setISBN(ratingRequest.getISBN());
        ratings.setUsername(ratingRequest.getUsername());
        ratings.setUserRating(ratingRequest.getUserRating());
        if(ratings.getUserRating() > 5 || ratings.getUserRating() <=0)
        {
           return ResponseEntity.ok("Invalid Rating");
        }

        return ResponseEntity.status(201).body(this.ratingRepository.save(ratings));

    }
}
