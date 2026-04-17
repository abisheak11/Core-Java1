package com.javaproject.module5.multithreading1.atomicvariable;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main {
    public static final int NUMBER_THREADS=100;
    public static void main(String[] args)throws Exception {
        Counter counter = new Counter();

       UpdateThread[]updateThreads= new UpdateThread[NUMBER_THREADS];
        for(int i =0;i<NUMBER_THREADS;i++) {
           updateThreads[i]= new UpdateThread(counter);
           updateThreads[i].start();
        }
        for (int i =0;i<NUMBER_THREADS;i++){
            updateThreads[i].join();
        }

        log.info(counter.get());
    }
}
