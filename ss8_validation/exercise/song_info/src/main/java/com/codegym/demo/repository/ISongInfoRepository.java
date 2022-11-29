package com.codegym.demo.repository;

import com.codegym.demo.model.SongInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISongInfoRepository extends JpaRepository<SongInfo, Integer> {
}
