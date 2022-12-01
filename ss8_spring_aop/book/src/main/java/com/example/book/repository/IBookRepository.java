package com.example.book.repository;

import com.example.book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface IBookRepository extends JpaRepository<Book, Integer> {
    @Modifying
    @Transactional
    @Query(value = "UPDATE `book_van`.`book` SET `amount` = `amount`-1 WHERE `id` = :id", nativeQuery = true)
    void removeById(@Param("id") int id);
    @Modifying
    @Transactional
    @Query(value = "UPDATE `book_van`.`book` SET `amount` = `amount`+1 WHERE `id` = :id", nativeQuery = true)
    void addById(@Param("id") int id);
}
