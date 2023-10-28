package com.example.demo.repository;

import com.example.demo.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface BooksRepository extends MongoRepository<Book, String> {
    @Query("{'Author.authorID': ?0}")
    List<Book> findByAuthorId(String authorID);
}
