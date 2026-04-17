package com.javaproject.module2.oops.abstract1.polymorphism;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Dog implements Animal{

    @Override
    public void move() {
        log.info("Dog it will run");

    }
}
