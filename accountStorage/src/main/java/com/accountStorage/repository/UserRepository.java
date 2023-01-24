package com.accountStorage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accountStorage.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
