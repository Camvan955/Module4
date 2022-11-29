package com.codegym.demo.service.impl;

import com.codegym.demo.model.SongInfo;
import com.codegym.demo.repository.ISongInfoRepository;
import com.codegym.demo.service.ISongInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SongInfoService implements ISongInfoService {

    @Autowired
    private ISongInfoRepository songInfoRepository;

    @Override
    public void save(SongInfo songInfo) {
        songInfoRepository.save(songInfo);
    }

    @Override
    public Page<SongInfo> findAll(Pageable pageable) {
        return songInfoRepository.findAll(pageable);
    }

    @Override
    public Optional<SongInfo> findByTd(int id) {
        return songInfoRepository.findById(id);
    }
}
