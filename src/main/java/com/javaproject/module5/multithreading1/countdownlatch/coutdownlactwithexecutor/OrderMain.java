package com.javaproject.module5.multithreading1.countdownlatch.coutdownlactwithexecutor;

import lombok.extern.log4j.Log4j2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
@Log4j2
public class OrderMain {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(2);
        Order order1 = new Order("Abishek",111,latch);
        Order order2 = new Order("Ajay",112,latch);
        Order order3 = new Order("jerold",113,latch);
        Order order4 = new Order("Vijay",114,latch);
        Order order5 = new Order("Siva",115,latch);
        Order order6 = new Order("Ajith",116,latch);

        List<Order>orders = Arrays.asList(order1,order2,order3,order4,order5,order6);

        ExecutorService service = Executors.newFixedThreadPool(2);
        for (Order order:orders){
            try {
                service.submit(order);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        try {
            latch.await();
            log.info("Main thread running");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        service.shutdown();

    }

}
