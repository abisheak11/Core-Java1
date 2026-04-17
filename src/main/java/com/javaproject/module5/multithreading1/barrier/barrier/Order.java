package com.javaproject.module5.multithreading1.barrier.barrier;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

@Log4j2
@AllArgsConstructor
public class Order implements Runnable{
    CyclicBarrier barrier;


    @Override
    public void run() {
        log.info("waiting for barrier");
        try {
            barrier.await();
        }catch (InterruptedException exception){
            log.error(exception.getMessage());
        }catch (BrokenBarrierException exception){
            log.error(exception.getMessage());
        }
        log.info("now execution completed");
    }
}
