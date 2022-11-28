package com.codegym.demo.repository;

import com.codegym.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBlogRepository extends JpaRepository<Blog, Long> {

    @Query(value = "select * from blog where blog.name like concat('%', :name, '%') or blog.author like concat('%', :author, '%') order by day_of_write ", nativeQuery = true)
    Page<Blog> findByNameOrAuthor(String name, String author, Pageable pageable);

}
