package com.javaproject.module5.executorframework.callableinvoke;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;

import java.util.concurrent.Callable;
@Getter
@Log4j2
public class Order implements Callable<Order> {
    private String customerName;
    private int customerId;

    public Order(String customerName,int customerId){
        this.customerId= customerId;
        this.customerName = customerName;
    }
    @Override
    public Order call() throws Exception {
        log.info(customerName+" your order is started");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info(customerName+"your order is conformed"+customerId);
        return this;
    }
}
