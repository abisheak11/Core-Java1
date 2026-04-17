package com.javaproject.module5.readandwritelock;

import lombok.extern.log4j.Log4j2;

import java.util.Date;
import java.util.concurrent.locks.ReentrantReadWriteLock;
@Log4j2
public class ReadWriteExample {
    ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void readOp(){
        lock.readLock().lock();
        try {
           log.info(Thread.currentThread().getName()+"Reading");
        }finally {
            lock.readLock().unlock();
        }
    }
    public void writeOp(){
        lock.writeLock().lock();
        try {
            log.info(Thread.currentThread().getName()+"writen");
        }finally {
            lock.writeLock().unlock();
        }
    }

    public static void main(String[] args) {
        ReadWriteExample example = new ReadWriteExample();

        for (int i =0; i<3;i++){
            new Thread(()->example.readOp()).start();
        }
        new Thread(()-> example.writeOp()).start();

    }
}
