package com.eteration.simplebanking.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import com.eteration.simplebanking.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    //@Query("SELECT a FROM Account WHERE a.accountNumber=:accountNumber")
    ResponseEntity<Account> findAccount(String accountNumber);
}