package com.epam.alex.entity;

/**
 * Created by AlexandrSerebryakov on 20.10.2016}.
 */
public class AccountA {
    public int getAccountA() {
        return accountA;
    }

    public void setAccountA(int accountA) {
        this.accountA = accountA;
    }

    private volatile int accountA = 1000;
}
