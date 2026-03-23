package com.javaproject.module5.multithreading.lamdajoin;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Order {
    public static void main(String[] args)throws Exception {
        Runnable task=()->{
          log.info("order start"+Thread.currentThread().getName());
          log.info("order end"+Thread.currentThread().getName());
        };
        Thread thread = new Thread(task);
        thread.start();
        thread.join();

        Thread thread1 = new Thread(task);
        thread1.start();
        thread1.join();
    }
}
