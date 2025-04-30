package com.demo.uppgifter.bankapp;

import java.util.HashMap;
import java.util.Map;

public class User {

    private String name;
    private String email;
    private String pinCode;
    private Bank bank;
    private Map<String, Double> pocketBalance;



    public User(String name, String email, String pinCode, Bank bank) {
        this.name = name;
        this.email = email;
        this.pinCode = pinCode;
        this.bank = bank;

        pocketBalance = new HashMap<>();
        pocketBalance.put("USD", 0.0);
        pocketBalance.put("EUR", 0.0);
        pocketBalance.put("GBP", 0.0);
        pocketBalance.put("SEK", 0.0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Map<String, Double> getPocketBalance() {
        return pocketBalance;
    }

    public void setPocketBalance(Map<String, Double> pocketBalance) {
        this.pocketBalance = pocketBalance;
    }
}
