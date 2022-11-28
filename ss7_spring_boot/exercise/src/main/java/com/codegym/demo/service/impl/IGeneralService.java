package com.codegym.demo.service.impl;

import com.codegym.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IGeneralService<T> {
    Page<Blog> findAll(Pageable pageable);


    Page<Blog> findByNameOrAuthor(String name, Pageable pageable);

    Optional<T> findById(Long id);

    void save(T t);

    void remove(Long id);

}
