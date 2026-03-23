package com.javaproject.module5.multithreading.synchronized3;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Order{

    public synchronized void getOrder(){
        log.info("Get the order details ",Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
            Thread.yield();
        } catch (Exception e) {
           e.printStackTrace();
        }
        log.info("Order is conformed",Thread.currentThread().getName());
    }

}

