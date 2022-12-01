package com.example.book.service;

import com.example.book.model.Orders;

import java.util.List;
import java.util.Optional;

public interface IOrderService {
    Iterable<Orders> findAll();

    Optional<Orders> findById(int id);

    void save(Orders orders);

    void remove(int id);

    List<Integer> showId();

    boolean isCheck(int bookCode);
}
