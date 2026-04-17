package com.javaproject.module5.multithreading1.blockinqueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    BlockingQueue<Object>queue;

    public Producer(BlockingQueue<Object>queue){
        this.queue =queue;
    }
    @Override
    public void run() {
        while (true){
            try {
                Object obj = getResources();
                queue.put(obj);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public Object getResources(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new Object();
    }
}
