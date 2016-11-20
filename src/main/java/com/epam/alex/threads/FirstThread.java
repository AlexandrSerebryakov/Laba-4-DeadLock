package com.epam.alex.threads;


import com.epam.alex.entity.AccountA;
import com.epam.alex.entity.AccountB;

/**
 * Created by AlexandrSerebryakov on 20.10.2016}.
 */
public class FirstThread implements Runnable {
    @Override
    public void run() {
        AccountA accountA = new AccountA();
        System.out.println("--------------------");
        System.out.println("Transaction#1:");
        System.out.println("AccountBalanceA = " + accountA.getAccountA());
        int operationFromA = 400;
        int accountBalanceA = accountA.getAccountA() - operationFromA;
        System.out.println("OperationAccountA: -" + operationFromA);
        accountA.setAccountA(accountBalanceA);
        System.out.println("AccountBalanceA = " + accountA.getAccountA());

        AccountB accountB = new AccountB();
        int accountBalanceBefore = accountB.getAccountB();
        int accountBalanceB = accountB.getAccountB() + operationFromA;
        accountB.setAccountB(accountBalanceB);
        System.out.println("AccountBalanceB: " + accountBalanceBefore + " + " + operationFromA + " = " + accountB.getAccountB());
        System.out.println("--------------------");


    }


}
