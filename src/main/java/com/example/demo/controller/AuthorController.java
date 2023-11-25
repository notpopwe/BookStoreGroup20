package com.example.demo.controller;

import com.example.demo.model.Author;
import com.example.demo.model.Book;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.resource.AuthorRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {
    private final AuthorRepository authorRepository;
    public AuthorController(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }
    @PostMapping("/author")
    public ResponseEntity<Author> createAuthor(@RequestBody AuthorRequest authorRequest){

        Author author = new Author();
        author.setAuthorID(authorRequest.getAuthorID());
        author.setFirstName(authorRequest.getFirstName());
        author.setLastName(authorRequest.getLastName());
        author.setBiography(authorRequest.getBiography());
        author.setPublisher(authorRequest.getPublisher());

        return ResponseEntity.status(201).body(this.authorRepository.save(author));
    }
    @GetMapping("/author")
    public ResponseEntity<List<Author>> getAllBooks(){

        return ResponseEntity.ok(this.authorRepository.findAll());
    }
}
