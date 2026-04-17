package com.javaproject.module5.multithreading1.atomicvariable;

public class UpdateThread extends Thread{
    public Counter counter;

    public UpdateThread(Counter counter){
        this.counter=counter;
    }
    @Override
    public void run() {
        counter.increment();
    }
}
