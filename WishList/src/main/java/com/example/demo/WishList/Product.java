package com.example.demo.WishList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("products")
public class Product {

    @Id
    private String id;
    private String listName;
    private String userID;
    private String book;
    private String bookName;

    public Product() {

    }

    public Product(String listName, String userID, String book, String bookName) {
        this.listName = listName;
        this.userID = userID;
        this.bookName = bookName;
        this.book = book;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setBook(String book) {
        this.book = book;
    }
    public String getBook() {
        return book;
    }
    public String getBookName() {
        return bookName;
    }
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
