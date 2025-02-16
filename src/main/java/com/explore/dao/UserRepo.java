package com.explore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.explore.model.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
