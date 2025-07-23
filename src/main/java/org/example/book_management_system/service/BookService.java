package org.example.Test03.service;

import org.example.Test03.model.Book;

import java.util.List;

public interface BookService {
    void add(Book book);
    void updateBook(String booktitle, String author,String publisher,String bookid);
    void deletebook(String booktitle);

    // 검색 기능
    List<Book> getAllBooks();
    List<Book> searchBook(String booktitle);
}
