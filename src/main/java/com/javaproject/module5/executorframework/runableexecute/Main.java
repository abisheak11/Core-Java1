package com.javaproject.module5.executorframework.runableexecute;

import lombok.extern.log4j.Log4j2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Log4j2
public class Main {
    //RUNNABLE EXECUTE
    public static void main(String[] args) {
        Order order1 = new Order("Abisheak",1);
        Order order2 = new Order("Ajay",2);
        Order order3 = new Order("Jerold",3);
        Order order4 = new Order("Ragul",4);
        Order order5 = new Order("Giri",5);
        Order order6 = new Order("Reronld",3);

        List<Order>orders= Arrays.asList(order1,order2,order3,order4,order5,order6);

        ExecutorService service = Executors.newFixedThreadPool(1);

        for (Order order :orders){
            try {
               service.execute(order);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
        service.shutdown();
    }
}
