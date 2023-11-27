package com.eteration.simplebanking.model;

import java.util.ArrayList;
import java.util.List;


// This class is a place holder you can change the complete implementation
//@Getter
//@Setter
//@Entity
public class Account {
    private String owner;
    private String accountNumber;
    private double balance=0;

    //@OneToMany
    private List<Transaction> transactions = new ArrayList<>();

    public Account(String owner, String accountNumber){
        this.owner = owner;
        this.accountNumber = accountNumber;
    }

    public void credit(double amount) {
        this.balance += amount;
    }

    public String getOwner(){
        return this.owner;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public List<Transaction> getTransactions(){
        return this.transactions;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientBalanceException{
        if(amount > this.balance){
            throw new InsufficientBalanceException();
        } else {
            this.balance -= amount;
        }
        
    }

    public void post(DepositTransaction depositTrx) {
        this.balance += depositTrx.getAmount();
        this.transactions.add(depositTrx);
    }

    public void post(WithdrawalTransaction withdrawalTrx) throws InsufficientBalanceException {
        if(withdrawalTrx.getAmount() > this.balance){
            throw new InsufficientBalanceException();
        } else {
            this.balance -= withdrawalTrx.getAmount();
            this.transactions.add(withdrawalTrx);
        }
    }
}
