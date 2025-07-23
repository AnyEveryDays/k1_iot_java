package org.example.Test03.service;

import org.example.Test03.exception.BookNotFoundException;
import org.example.Test03.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class BookServiceImpl implements BookService {
    private List<Book> books = new ArrayList<>();

    @Override
    public void add(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getBookTitle());
    }

    @Override
    public void deletebook(String booktitle) {
        boolean removed = books.removeIf(book -> book.getBookTitle().equals(booktitle));
        if (!removed) {
            System.out.println("No book found with title: " + booktitle);
        } else {
            System.out.println("Book deleted: " + booktitle);
        }
    }

    @Override
    public void updateBook(String title, String author, String publisher, String bookId) {
        for (Book book : books) {
            if (book.getBookTitle().equals(title)) {
                books.remove(book);
                books.add(new Book(title, author, publisher, bookId));
                System.out.println("Book updated: " + title);
                return;
            }
        }
        System.out.println("Book not found for update: " + title);
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }

    @Override
    public List<Book> searchBook(String keyword) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getBookTitle().contains(keyword) ||
                    book.getAuthor().contains(keyword) ||
                    book.getPublisher().contains(keyword)) {
                foundBooks.add(book);
            }
        }

        if (foundBooks.isEmpty()) {
            throw new BookNotFoundException("No books found for keyword: " + keyword);
        }
        return foundBooks;
    }
}