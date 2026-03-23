package com.javaproject.module5.multithreading.synchronized1;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        Thread thread = new Thread(()->account.withdraw(5000));
        Thread thread1 = new Thread(()->account.withdraw(6000));
        thread.start();
        thread1.start();
    }
}
