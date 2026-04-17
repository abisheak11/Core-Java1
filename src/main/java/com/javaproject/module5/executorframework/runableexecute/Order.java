package com.javaproject.module5.executorframework.runableexecute;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Order implements Runnable{
    public String customerName;
    public int customerId;

    public Order(String customerName,int customerId){
        this.customerId=customerId;
        this.customerName=customerName;
    }

    @Override
    public void run() {
        log.info(customerName+"your order processing");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info(customerId+"Order completed");

    }
}
