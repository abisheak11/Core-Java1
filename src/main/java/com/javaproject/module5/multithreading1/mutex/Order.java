package com.javaproject.module5.multithreading1.mutex;

import lombok.extern.log4j.Log4j2;

import java.util.concurrent.locks.ReentrantLock;

@Log4j2
public class Order {

    public String customerName;

    public Order(String customerName){
       this.customerName =customerName;
    }

   ReentrantLock lock = new ReentrantLock();

    public void getOrder(){
        lock.lock();
        log.info(customerName+"your order processing",Thread.currentThread().getName());

        try {
            Thread.sleep(5000);
            log.info("your order placed successfully");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock();
        }

    }

    public static void main(String[] args) {
        Order order1 = new Order("Abisheak");
        Order order2 = new Order("Ajay");

        Thread thread1 = new Thread(()->order1.getOrder());
        Thread thread2 = new Thread(()->order2.getOrder());


        thread1.start();
        thread2.start();

    }
}
