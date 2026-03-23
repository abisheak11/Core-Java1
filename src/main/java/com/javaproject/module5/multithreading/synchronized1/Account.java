package com.javaproject.module5.multithreading.synchronized1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Account {
    private double balances =10000.0;

    public synchronized void withdraw(double amount){
        log.info("Thread Started",Thread.currentThread().getName());
        try {
            wait(3000);
        } catch (Exception e){
            log.error(e);
        }
        if (balances>= amount){
            balances-=amount;
            log.info("Withdraw"+amount+"New balances"+balances);
        }else {
            log.info("Insufficient"+amount+"current balances"+balances);
        }
        log.info("Thread Was Completed successfully ",Thread.currentThread().getName());
    }
}
