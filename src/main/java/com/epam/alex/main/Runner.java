package com.epam.alex.main;

import com.epam.alex.threads.FirstThread;
import com.epam.alex.threads.SecondThread;

/**
 * Created by ${AlexandrSerebryakov} on ${09.10.2016}.
 */
public class Runner {
    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread();
        new Thread(firstThread).start();

        SecondThread secondThread = new SecondThread();
        new Thread(secondThread).start();

    }
}
