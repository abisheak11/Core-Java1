package com.javaproject.module5.multithreading.synchronized3;

public class OrderMain {
    public static void main(String[] args) {
        Order order = new Order();

        Thread thread = new Thread(()-> order.getOrder());
        Thread thread1 = new Thread(()->order.getOrder());
        Thread thread2 = new Thread(()-> order.getOrder());
        thread.setPriority(6);
        thread1.setPriority(7);
        thread2.setPriority(8);
        thread.start();
        thread1.start();
        thread2.start();
    }
}
