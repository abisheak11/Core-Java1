package com.javaproject.module5.livelock;

public class LiveMain {

    public static void main(String[] args) {
        Police police = new Police();
        Criminal criminal = new Criminal();
        Thread thread1 = new Thread(()->police.giveHostage(criminal));
        Thread thread2 = new Thread(()->criminal.releaseHostage(police));
        thread1.start();
        thread2.start();

    }
}
