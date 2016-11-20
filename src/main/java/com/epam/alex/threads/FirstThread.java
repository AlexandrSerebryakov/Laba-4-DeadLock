package com.epam.alex.threads;


import com.epam.alex.entity.AccountA;
import com.epam.alex.entity.AccountB;

/**
 * Created by ${AlexandrSerebryakov} on ${09.10.2016}.
 */
public class FirstThread implements Runnable {
    @Override
    public void run() {
        AccountA accountA = new AccountA();
        int g = accountA.getAccountA() - 400;
        accountA.setAccountA(g);
        System.out.println(g);

        AccountB accountB = new AccountB();
        int d = accountB.getAccountB() + 400;
        accountB.setAccountB(d);
        System.out.println(d);


    }


}
