package com.epam.alex.threads;

import com.epam.alex.entity.AccountA;
import com.epam.alex.entity.AccountB;

/**
 * Created by ${AlexandrSerebryakov} on ${09.10.2016}.
 */
public class SecondThread implements Runnable {
    @Override
    public void run() {
        AccountB accountB = new AccountB();
        int d = accountB.getAccountB() - 300;
        accountB.setAccountB(d);
        System.out.println(d);

        AccountA accountA = new AccountA();
        int g = accountA.getAccountA() + 300;
        accountA.setAccountA(g);
        System.out.println(g);

    }
}
