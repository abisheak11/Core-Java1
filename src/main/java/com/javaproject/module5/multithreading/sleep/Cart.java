package com.javaproject.module5.multithreading.sleep;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Cart {
    public static void main(String[] args) {
        Thread thread0 = new Thread(()->{
            log.info("Payment Started");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
            log.info("payment Completed");
        });
        Thread thread1 = new Thread(()->{
            try {
                thread0.join();
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
            log.info("order placed after payment");
            log.info("order completed successfully");
        });
        Thread thread2 = new Thread(()->{
            try {
                thread1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.info("Payment start");
            log.info("payment completed");
        });

        thread0.start();
        thread1.start();
        thread2.start();
    }
}

