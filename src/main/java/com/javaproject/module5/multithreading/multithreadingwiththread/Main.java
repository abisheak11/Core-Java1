package com.javaproject.module5.multithreading.multithreadingwiththread;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order();
        Order order2 = new Order();

        order1.start();
        order2.start();
    }
}
