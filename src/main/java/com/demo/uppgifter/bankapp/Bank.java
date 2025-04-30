package com.demo.uppgifter.bankapp;

public class Bank {

    private String bankName;
    private Double accountBalanceSEK;

    public Bank(String bankName, Double accountBalanceSEK) {
        this.bankName = bankName;
        this.accountBalanceSEK = accountBalanceSEK;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Double getAccountBalanceSEK() {
        return accountBalanceSEK;
    }

    public void setAccountBalanceSEK(Double accountBalanceSEK) {
        this.accountBalanceSEK = accountBalanceSEK;
    }
}
