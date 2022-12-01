package com.example.book.service.impl;

import com.example.book.model.Book;
import com.example.book.repository.IBookRepository;
import com.example.book.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService implements IBookService {

    @Autowired
    private IBookRepository bookRepository;


    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> findById(int id) {
        return bookRepository.findById(id);
    }

    @Override
    public void save(Book book) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void removeById(int id) {
        bookRepository.removeById(id);
    }

    @Override
    public void addById(int id) {
        bookRepository.addById(id);
    }

}
