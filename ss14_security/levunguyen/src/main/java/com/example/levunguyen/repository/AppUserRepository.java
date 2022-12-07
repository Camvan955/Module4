package com.example.levunguyen.repository;

import com.example.levunguyen.entity.AppUser;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {

    AppUser findByUserName(String userName);
}
