package com.javaproject.module5.star;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Hospital {

    public synchronized void ward() {

        String name = Thread.currentThread().getName();
        log.info("patience are waiting");

        while (true){
            log.info(name+ "first patience consulting keep on going");
        }
    }
}
