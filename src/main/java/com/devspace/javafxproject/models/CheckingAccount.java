package com.devspace.javafxproject.models;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class CheckingAccount extends Account {

    // The number of transactions that can be made per day
    private final IntegerProperty transactionsPerDay;

    public CheckingAccount(String owner, String accountNumber, double balance, int transactionsPerDay) {
        super(owner, accountNumber, balance);
        this.transactionsPerDay = new SimpleIntegerProperty(this, "TransactionsPerDay", transactionsPerDay);
    }

    public IntegerProperty transactionsPerDayProperty() {
        return transactionsPerDay;
    }
}
