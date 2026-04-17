package com.javaproject.module5.multithreading1.volatile1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main {
    public static void main(String[] args) {
        new Thread(()->{
            Account account1 =Account.getInstance();
            log.info("Account1"+account1.hashCode());
        }).start();
        new Thread(()->{
            Account account2 =Account.getInstance();
            log.info("Account2"+account2.hashCode());
        }).start();
    }
}
