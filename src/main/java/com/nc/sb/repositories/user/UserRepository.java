package com.nc.sb.repositories.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nc.sb.models.user.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}