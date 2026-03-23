package com.javaproject.module5.multithreading1.runnable;

public class OrderMain {
    public static void main(String[] args) {
        Order order1 = new Order("Iphone","Abishek");
        Order order2 = new Order("samsung","Ajay");

        Thread thread = new Thread(order1);
        thread.start();

        Thread thread1 = new Thread(order2);
        thread1.start();

    }
}
