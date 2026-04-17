package com.javaproject.module5.multithreading.runnablejoin;

public class Main {
    public static void main(String[] args)throws Exception {
        Ticket ticket0 = new Ticket();
        Thread thread0 = new Thread(ticket0);
        thread0.start();
        thread0.join();

        Ticket ticket1 = new Ticket();
        Thread thread1 = new Thread(ticket1);
        thread1.start();
        thread1.join();

        Ticket ticket2 = new Ticket();
        Thread thread2 = new Thread(ticket2);
        thread2.start();
        thread2.join();

    }
}
