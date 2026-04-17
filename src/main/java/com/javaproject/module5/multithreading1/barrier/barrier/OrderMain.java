package com.javaproject.module5.multithreading1.barrier.barrier;

import lombok.extern.log4j.Log4j2;

import java.util.concurrent.CyclicBarrier;
@Log4j2
public class OrderMain {
    public static void main(String[] args) {
        CyclicBarrier cyclic = new CyclicBarrier(3,()->{
            log.info("this is my barrier thread");
        });
        Thread thread1 = new Thread(new Order(cyclic));
        Thread thread2 = new Thread(new Order(cyclic));
        Thread thread3 = new Thread(new Order(cyclic));
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
