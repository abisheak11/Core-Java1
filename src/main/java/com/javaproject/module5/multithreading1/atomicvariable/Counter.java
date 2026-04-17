package com.javaproject.module5.multithreading1.atomicvariable;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    AtomicInteger value = new AtomicInteger();
    public  void increment(){
        value.incrementAndGet();
    }
    public  void decrement(){
        value.decrementAndGet();
    }
    public int get(){
        return value.get();
    }
}
