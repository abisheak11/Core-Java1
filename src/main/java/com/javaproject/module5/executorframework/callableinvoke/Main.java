package com.javaproject.module5.executorframework.callableinvoke;

import lombok.extern.log4j.Log4j2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
@Log4j2
public class Main {
    //CALLABLE INVOKE ALL
    public static void main(String[] args) {
        Order order1 = new Order("Ajith",111);
        Order order2 = new Order("Vijay",112);
        Order order3 = new Order("Surya",113);
        Order order4 = new Order("Chiyan",114);
        Order order5 = new Order("Pradee",115);

        List<Order>orders = Arrays.asList(order1,order2,order3,order4,order5);

        //WORKER THREAD CREATION
        ExecutorService service = Executors.newFixedThreadPool(2);

        //LIST OF FUTURE OBJECT
        List<Future<Order>>orderFuture=null;
        try {

            orderFuture=service.invokeAll(orders);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        orderFuture.forEach(order -> {
            try {
           Order order6 = order.get();
           log.info(order6.getCustomerName()+order6.getCustomerId());
           } catch (Exception e) {
               throw new RuntimeException(e);
           }
        });
        service.shutdown();
    }
}
