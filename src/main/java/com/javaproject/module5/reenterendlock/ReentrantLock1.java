package com.javaproject.module5.reenterendlock;

import lombok.extern.log4j.Log4j2;

import java.util.concurrent.locks.ReentrantLock;

@Log4j2
public class ReentrantLock1 {
    ReentrantLock lock = new ReentrantLock();

    public void print(){
        lock.lock();
        try {
            log.info(Thread.currentThread().getName()+"acquired lock");

            nestedMethod();
        }finally {
            lock.unlock();
        }
    }
    public void nestedMethod(){
        lock.lock();
        try {
            log.info(Thread.currentThread().getName()+"inside nested method");
        }finally {
           lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantLock1 obj = new ReentrantLock1();
        Thread thread = new Thread(()-> obj.print());
        Thread thread1 = new Thread(()-> obj.print());
        thread.start();
        thread1.start();

    }
}
