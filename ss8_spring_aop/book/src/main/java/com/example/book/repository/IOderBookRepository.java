package com.example.book.repository;

import com.example.book.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface IOderBookRepository extends JpaRepository<Orders, Integer> {
    @Modifying
    @Transactional
    @Query(value = "SELECT id FROM book_van.orders;",nativeQuery = true)
    List<Integer> showIdOrder();
}
