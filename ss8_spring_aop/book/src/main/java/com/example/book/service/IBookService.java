package com.example.book.service;

import com.example.book.model.Book;

import java.util.Optional;

public interface IBookService {
    Iterable<Book> findAll();

    Optional<Book> findById(int id);

    void save(Book book);

    void remove(int id);

    void removeById(int id);

    void addById(int id);
}
