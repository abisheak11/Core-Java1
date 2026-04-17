package com.javaproject.module2.oops.abstract1.polymorphism;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Fish implements Animal{
    @Override
    public void move() {
        log.info("Fish it will swim");
    }
}
