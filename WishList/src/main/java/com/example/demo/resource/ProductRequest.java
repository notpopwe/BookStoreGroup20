package com.example.demo.resource;

public class ProductRequest {
    private String listName;
    private String userID;
    private String book;
    private String bookName;

    public ProductRequest() {
    }

    public ProductRequest(String listName, String userID, String book, String bookName) {
        this.listName = listName;
        this.userID = userID;
        this.book = book;
        this.bookName = bookName;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
    public void setBook(String book) {
        this.book = book;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBook() {
        return book;
    }

    public String getBookName() {
        return bookName;
    }
}
