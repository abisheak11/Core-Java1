package com.javaproject.module5.multithreading1.notify;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class OddEvenPrinter1 {
    public int number = 1;
    public int limit;

    public OddEvenPrinter1(int limit) {
        this.limit = limit;
    }

    public void printOdd() {
        synchronized (this) {
            while (number <= limit) {
                if (limit % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                         Thread.currentThread().interrupt();
                    }
                } else {
                    log.info(number);
                    number++;
                    notify();
                }

            }
        }
    }

    public void printEven() {
        synchronized (this) {
            while (number <= limit) {
                if (limit % 2 != 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        //Thread.currentThread().interrupt();
                    }
                } else {
                    log.info(number);
                    number++;
                    notify();
                }

            }
        }
    }

    public static void main(String[] args) {
        OddEvenPrinter1 printer = new OddEvenPrinter1(10);
        Thread thread1 = new Thread(() -> printer.printOdd());
        Thread thread2 = new Thread(() -> printer.printEven());
        thread1.start();
        thread2.start();

    }
}
