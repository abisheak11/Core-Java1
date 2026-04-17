package com.javaproject.module5.multithreading1.blockinqueue1;

import lombok.extern.log4j.Log4j2;

import java.util.concurrent.BlockingQueue;
@Log4j2
public class Producer implements Runnable {

    BlockingQueue<Object>queue=null;

    public Producer (BlockingQueue<Object>theQueue){
        this.queue =theQueue;
    }
    @Override
    public void run() {
        while (true){
            try {
                Object obj = getResource();
                queue.put(obj);
                log.info("Produced Resources :"+queue.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Object getResource(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            log.info("Thread Interrupted");
        }
        return new Object();
    }
}
