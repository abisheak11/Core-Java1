package com.javaproject.module5.multithreading.deadlock;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class DeadLock {
    public static final Object res1 = new Object();
    public static final Object res2 = new Object();
    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
            synchronized (res1){
               log.info("Thread1 locked");
               try {
                   Thread.sleep(3000);
               }catch (Exception e){
                   log.error(e);
               }

               synchronized (res2){
                   log.info("Thread1 executed");
               }
            }
        });
        Thread thread2 = new Thread(()->{
            synchronized (res1){
                log.info("Thread2 locked");
                try {
                    Thread.sleep(3000);
                }catch (Exception e){
                    log.error(e);
                }
                synchronized (res2){
                    log.info("Thread2 executed");
                }
            }
        });
        thread1.start();
        thread2.start();

    }
}
