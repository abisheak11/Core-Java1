package com.javaproject.module5.multithreading1.countdownlatch.coutdownlactwithexecutor;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.concurrent.CountDownLatch;

@Log4j2
@AllArgsConstructor
public class Order implements Runnable {
    public String customerName;
    public int customerId;
    public CountDownLatch latch;

    @Override
    public void run() {
        log.info(customerName+"your order Started");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("your order conformed"+customerId);
        latch.countDown();
    }
}
