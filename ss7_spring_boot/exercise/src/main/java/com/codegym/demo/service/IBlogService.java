package com.codegym.demo.service;


import com.codegym.demo.model.Blog;
import com.codegym.demo.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IBlogService {

    Page<Blog> findAll(Pageable pageable);

    void save(Blog blog);

    void update(Blog blog);

    Optional<Blog> findById(long id);

    List<Blog> findByCategory(Category category);
}
