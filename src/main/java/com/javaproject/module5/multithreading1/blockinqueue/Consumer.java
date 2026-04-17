package com.javaproject.module5.multithreading1.blockinqueue;

import lombok.extern.log4j.Log4j2;

import java.util.concurrent.BlockingQueue;
@Log4j2
public class Consumer implements Runnable{
    BlockingQueue<Object>queue= null;
    public Consumer(BlockingQueue<Object>queue){
        this.queue = queue;
    }
    @Override
    public void run() {
        try {
            Object obj = queue.take();
            log.info(queue.size());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static  void take(Object obj){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
            log.info("Thread Interrupted");
        }
        log.info("Consumed Resources"+obj);
    }
}
