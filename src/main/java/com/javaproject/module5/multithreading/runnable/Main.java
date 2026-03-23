package com.javaproject.module5.multithreading.runnable;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main {
    public static void main(String[] args) {
        log.info("main thread1");
        Tickets tickets1 = new Tickets();
        Tickets tickets2 = new Tickets();
        Tickets tickets3 = new Tickets();

        Thread thread =new Thread(tickets1);
        thread.start();
        Thread thread1 =new Thread(tickets2);
        thread1.start();
        Thread thread2 =new Thread(tickets3);
        thread2.start();

        log.info("main thread2");
    }
}
