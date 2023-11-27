package com.eteration.simplebanking.model;

import java.util.Date;

// This class is a place holder you can change the complete implementation
public abstract class Transaction {
	private Date date = new Date();
    protected double amount;

    //@ManyToOne
    private Account account;

    public Transaction(double amount) {
        this.amount = amount;
        this.date = new Date();
    }

    public Transaction() {
    }

    public Date getDate(){
        return this.date;
    }

    public double getAmount(){
        return this.amount;
    }
}
