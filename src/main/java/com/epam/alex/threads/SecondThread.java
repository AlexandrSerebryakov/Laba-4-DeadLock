package com.epam.alex.threads;

import com.epam.alex.entity.AccountA;
import com.epam.alex.entity.AccountB;

/**
 * Created by AlexandrSerebryakov on 20.10.2016}.
 */
public class SecondThread implements Runnable {
    @Override
    public void run() {
        AccountB accountB = new AccountB();
        System.out.println("--------------------");
        System.out.println("Transaction#2:");
        System.out.println("AccountBalanceB = " + accountB.getAccountB());
        int operationFromB = 300;
        int accountBalanceB = accountB.getAccountB() - operationFromB;
        System.out.println("OperationAccountB: -" + operationFromB);
        accountB.setAccountB(accountBalanceB);
        System.out.println("AccountBalanceB = " + accountB.getAccountB());

        AccountA accountA = new AccountA();
        int accountBalanceBefore = accountA.getAccountA();
        int accountBalanceA = accountA.getAccountA() + operationFromB;
        accountA.setAccountA(accountBalanceA);
        System.out.println("AccountBalanceB: " + accountBalanceBefore + " + " + operationFromB + " = " + accountA.getAccountA());
        System.out.println("--------------------");

    }
}
