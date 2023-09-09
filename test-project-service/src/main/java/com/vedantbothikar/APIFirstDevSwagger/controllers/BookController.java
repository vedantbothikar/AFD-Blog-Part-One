package com.vedantbothikar.APIFirstDevSwagger.controllers;

import com.example.api.BooksApi;
import com.example.models.Book;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class BookController implements BooksApi {
    @Override
    public ResponseEntity<String> createBook(Book body) {
        return null;
    }

    @Override
    public ResponseEntity<List<Book>> getAllBooksInLibrary() {
        return null;
    }

    @Override
    public ResponseEntity<Book> getBookById(String bookId) {
        return null;
    }
}
