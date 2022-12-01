package com.example.book.service.impl;

import com.example.book.model.Orders;
import com.example.book.repository.IBookRepository;
import com.example.book.repository.IOderBookRepository;
import com.example.book.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService implements IOrderService {
    @Autowired
    private IOderBookRepository oderBookRepository;


    @Override
    public Iterable<Orders> findAll() {
        return oderBookRepository.findAll();
    }

    @Override
    public Optional<Orders> findById(int id) {
        return oderBookRepository.findById(id);
    }

    @Override
    public void save(Orders orders) {
        oderBookRepository.save(orders);
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public List<Integer> showId() {
        return oderBookRepository.showIdOrder();
    }

    @Override
    public boolean isCheck(int id) {
        List<Integer> list = showId();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == id) {
                return true;
            }
        }
        return false;
    }
}
