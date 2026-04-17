package com.javaproject.module5.multithreading1.extentingthread;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Order extends Thread{
    public void run(){
        log.info("Thread Order started",Thread.currentThread().getName());
        log.info("Order processing",Thread.currentThread().getName());
        log.info("order Completed",Thread.currentThread().getName());
    }

    public static void main(String[] args)throws Exception {
        Order order = new Order();
        Order order1= new Order();
        order.start();
        order.join();
        order1.start();

    }
}
