package com.example.casestudy.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IGeneralService<T> {
    void save(T t);

    Page<T> findAll(Pageable pageable);

    Optional<T> findById(int id);

    void remove(int id);
}
