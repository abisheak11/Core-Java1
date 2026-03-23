package com.javaproject.module5.multithreading.runnablejoin;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Ticket implements Runnable{
    @Override
    public void run() {
        log.info("Ticket Booking Start"+Thread.currentThread().getName());
        log.info("Ticket Booking Conform "+Thread.currentThread().getName());
    }
}
