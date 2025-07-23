package org.example.Test03.exception;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String error){
        super(error);
    }
}
