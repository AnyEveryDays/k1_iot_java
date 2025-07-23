package org.example.Test03.model;

import java.time.LocalDateTime;

public class Book {
    private String bookTitle;
    private String author;
    private String publisher;
    private String bookId;
    private LocalDateTime createdAt;

    public Book(String bookTitle, String author, String publisher, String bookId){
        this.bookTitle = bookTitle;
        this.author = author;
        this.publisher = publisher;
        this.bookId = bookId;
        this.createdAt = LocalDateTime.now();
    }
    public String getBookTitle() { return bookTitle;}
    public String getAuthor() { return author;}
    public String getPublisher() { return publisher;}
    public String getBookId() { return bookId;}
    public LocalDateTime getCreatedAt() { return createdAt; }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString(){
        return "Title: "+ bookTitle+", Author: "+ author+"Publisher: "+publisher +"BookId"+ bookId;
    }
}
