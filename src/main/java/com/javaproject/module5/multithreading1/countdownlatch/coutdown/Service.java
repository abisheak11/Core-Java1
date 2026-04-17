package com.javaproject.module5.multithreading1.countdownlatch.coutdown;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.concurrent.CountDownLatch;

@Log4j2
@AllArgsConstructor
public class Service implements Runnable {
    public String name;
    public CountDownLatch latch;

    @Override
    public void run() {
       log.info(name+"Your service started");
       try {
           Thread.sleep(5000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
        log.info("your services completed");
       latch.countDown();
    }
}
