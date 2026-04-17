package com.javaproject.module5.multithreading1.barrier.barrierwithexcuter;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

@Log4j2
@AllArgsConstructor
public class Order implements Runnable{
    public String customerName;
   CyclicBarrier cyclicBarrier;

    @Override
    public void run() {
        log.info(customerName+"your order Started");
        try {
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
        log.info(customerName+"your order placed");

    }
}
