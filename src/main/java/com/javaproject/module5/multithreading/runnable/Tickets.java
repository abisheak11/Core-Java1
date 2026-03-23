package com.javaproject.module5.multithreading.runnable;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Tickets implements Runnable{
    @Override
    public void run() {
        log.info("Booking start"+Thread.currentThread().getName());


    }
}
