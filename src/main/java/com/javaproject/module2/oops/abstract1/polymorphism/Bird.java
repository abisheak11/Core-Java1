package com.javaproject.module2.oops.abstract1.polymorphism;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Bird implements Animal{
    @Override
    public void move() {
        log.info("Bird it will fly");
    }
}
