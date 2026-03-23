package com.javaproject.module5.multithreading1.runnable;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
public class Order implements Runnable{
    private String productName;
    private String customerName;

    @Override
    public void run() {
        log.info(customerName+Thread.currentThread().getName());
        try {
            Thread.sleep(6000);
        }catch (Exception e){
          log.info(e);
        }
        log.info(productName+ "Order completed Successfully"+Thread.currentThread().getName());
    }
}
