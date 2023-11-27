package com.eteration.simplebanking.services;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.eteration.simplebanking.model.Account;
import com.eteration.simplebanking.repository.AccountRepository;

@Service
// This class is a place holder you can change the complete implementation
public class AccountService {

    private AccountRepository accountRepository;

    public ResponseEntity<Account> findAccount(String accountNumber){
        return accountRepository.findAccount(accountNumber);
    }

}
