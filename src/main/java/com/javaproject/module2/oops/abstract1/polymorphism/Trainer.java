package com.javaproject.module2.oops.abstract1.polymorphism;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Trainer {
    public void teach(Animal animal){
        animal.move();
    }
    public void teach1(Dog1 dog){
        dog.move();
    }
}
