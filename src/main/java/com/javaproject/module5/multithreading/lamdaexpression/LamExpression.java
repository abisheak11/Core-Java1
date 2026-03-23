package com.javaproject.module5.multithreading.lamdaexpression;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class LamExpression {
    public static void main(String[] args) {
        String customerName="customer";
        String productName="product";

        Runnable task=()->{
            log.info(customerName+"order placed"+Thread.currentThread().getName());
            log.info("customer got" +productName+Thread.currentThread().getName());
        };
        Thread thread0 = new Thread(task);
        thread0.start();
        Thread thread1 =new Thread(task);
        thread1.start();
    }
}
