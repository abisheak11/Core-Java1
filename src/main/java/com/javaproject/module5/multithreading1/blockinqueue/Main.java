package com.javaproject.module5.multithreading1.blockinqueue;


import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<Object>queue= new ArrayBlockingQueue<>(10);

         new Producer(queue);
         new Consumer(queue);

        ExecutorService service =Executors.newFixedThreadPool(10);
        ExecutorService service1 =Executors.newFixedThreadPool(4);

        service.execute(new Producer(queue));
        service1.execute(new Consumer(queue));

    }
}
