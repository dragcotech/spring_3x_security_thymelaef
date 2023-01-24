package com.accountStorage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accountStorage.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

    List<Account> findByUser(String user);

}
