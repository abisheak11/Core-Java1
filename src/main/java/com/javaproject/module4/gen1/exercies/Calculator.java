package com.javaproject.module4.gen1.exercies;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Calculator {
    public <T extends Number>Number addition(T a,T b){
        return a.doubleValue()+b.doubleValue();
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Number resp =calculator.addition(10.0,10);
        log.info(resp);
    }
}
