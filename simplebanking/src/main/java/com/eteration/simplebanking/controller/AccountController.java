package com.eteration.simplebanking.controller;

import org.springframework.http.ResponseEntity;

import com.eteration.simplebanking.model.Account;
import com.eteration.simplebanking.model.DepositTransaction;
import com.eteration.simplebanking.model.WithdrawalTransaction;
import com.eteration.simplebanking.services.AccountService;

// This class is a place holder you can change the complete implementation
public class AccountController {

    private AccountService accountService;

    public ResponseEntity<Account> getAccount(String accountNumber) {
        return accountService.findAccount(accountNumber);
    }

    public ResponseEntity<TransactionStatus> credit(String accountNumber, DepositTransaction depositTransaction ) {
        return null;
    }
    public ResponseEntity<TransactionStatus> debit(String accountNumber, WithdrawalTransaction withdrawalTransaction) {
        return null;
	}
}