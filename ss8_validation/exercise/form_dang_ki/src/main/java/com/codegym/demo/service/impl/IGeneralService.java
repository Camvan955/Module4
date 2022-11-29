package com.codegym.demo.service.impl;

import com.codegym.demo.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IGeneralService<T> {

    void save(T t);

    Page<User>  findAll(Pageable pageable);
}
