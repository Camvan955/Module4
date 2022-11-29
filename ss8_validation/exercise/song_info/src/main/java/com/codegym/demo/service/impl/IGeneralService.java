package com.codegym.demo.service.impl;

import com.codegym.demo.model.SongInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IGeneralService<T> {

    void save(T t);

    Page<SongInfo> findAll(Pageable pageable);

    Optional<T> findByTd(int id);

}
