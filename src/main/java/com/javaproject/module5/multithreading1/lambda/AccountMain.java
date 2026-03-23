package com.javaproject.module5.multithreading1.lambda;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        Runnable task1=()->{
            account.withDraw("ajay",500);
        };
        Runnable task2=()->{
            account.withDraw("rexa",300);
        };
        Thread thread = new Thread(task1);
        thread.start();
        Thread thread1 = new Thread(task2);
        thread1.start();


    }
}
