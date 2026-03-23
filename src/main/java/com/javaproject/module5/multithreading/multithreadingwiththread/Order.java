package com.javaproject.module5.multithreading.multithreadingwiththread;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Order extends Thread{
    public void run(){
        log.info("order Start"+Thread.currentThread().getName());
        log.info("order End"+Thread.currentThread().getName());
    }
}
