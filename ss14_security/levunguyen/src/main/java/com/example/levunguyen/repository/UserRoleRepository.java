package com.example.levunguyen.repository;

import com.example.levunguyen.entity.AppUser;
import com.example.levunguyen.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    List<UserRole> findByAppUser(AppUser appUser);
}
