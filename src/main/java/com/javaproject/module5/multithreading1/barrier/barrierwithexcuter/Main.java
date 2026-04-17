package com.javaproject.module5.multithreading1.barrier.barrierwithexcuter;

import lombok.extern.log4j.Log4j2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Log4j2
public class Main {
    public static void main(String[] args) {
        CyclicBarrier cyclic = new CyclicBarrier(3,()->{
            log.info("this my cyclic barrier thread");
        });
        Order order1 = new Order("Jero",cyclic);
        Order order2 = new Order("Ajay",cyclic);
        Order order3 = new Order("Raju",cyclic);
        List<Order>orders = Arrays.asList(order1,order2,order3);

        ExecutorService service = Executors.newFixedThreadPool(1);

        for (Order order :orders){
            service.submit(order);
        }
    }
}
