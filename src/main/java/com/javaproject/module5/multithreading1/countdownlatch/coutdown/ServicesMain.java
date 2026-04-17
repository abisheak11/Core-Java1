package com.javaproject.module5.multithreading1.countdownlatch.coutdown;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.CountDownLatch;

public class ServicesMain {
    private static final Logger log = LogManager.getLogger(ServicesMain.class);

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);
        Thread thread1 = new Thread(new Service("Abisheak",latch));
        Thread thread2 = new Thread(new Service("Ajay",latch));
        Thread thread3 = new Thread(new Service("jerold",latch));

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            latch.await();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("Main Thread ");

    }
}
