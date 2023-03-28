package com.devspace.javafxproject.models;

public class SavingsAccount extends Account {

    // The interest rate of the account
    private final double interestRate;

    public SavingsAccount(String owner, String accountNumber, double balance, double interestRate) {
        super(owner, accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
