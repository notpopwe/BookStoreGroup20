package com.example.demo.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document("product")
public class Product {

    @Id
    private String id;

    private String title;

    private String author;

    private int pages;

    private String[] genre;

    private float overallRating;


    public void ProductRequest() {

    }

    public void ProductRequest(String title, String author, int pages, String[] genre, float overallRating) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.genre = genre;
        this.overallRating = overallRating;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String[] getGenre() {
        return genre;
    }

    public void setGenre(String[] genre) {
        this.genre = genre;
    }

    public float getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(ArrayList<Float> overallRating) {
        float averageRating;
        float total = 0;
        for(int i = 0; i <overallRating.size(); i++)
        {
            total += overallRating.get(i);
        }
        averageRating = total / overallRating.size();
        this.overallRating = averageRating;
    }

}