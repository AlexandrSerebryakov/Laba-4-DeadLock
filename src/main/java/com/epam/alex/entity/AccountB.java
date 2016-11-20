package com.epam.alex.entity;

/**
 * Created by AlexandrSerebryakov on 20.10.2016}.
 */
public class AccountB {
    public int getAccountB() {
        return accountB;
    }

    public void setAccountB(int accountB) {
        this.accountB = accountB;
    }

    private volatile int accountB = 800;
}
