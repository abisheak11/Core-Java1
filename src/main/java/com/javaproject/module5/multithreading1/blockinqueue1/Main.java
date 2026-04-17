package com.javaproject.module5.multithreading1.blockinqueue1;

import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args)throws InterruptedException {
        BlockingQueue<Object>queue= new ArrayBlockingQueue<>(10);
        int numProducer =10;
        int numConsumer =4;

        for (int i =0;i<numProducer;i++){
            new Thread(new Producer(queue)).start();
        }
        for (int j=0; j< numConsumer;j++){
            new Thread(new Consumer(queue)).start();
        }
    }
}
