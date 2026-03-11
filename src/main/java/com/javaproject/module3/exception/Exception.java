package com.javaproject.module3.exception;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Exception {
    public static void main(String[] args) {
        Exception exception = new Exception();
        exception.getDivision(5,0);
    }
    public int getDivision(int a, int b) {
        int c =0;
        try {
           c = a / b;

        } catch (ArithmeticException exception) {
            exception.printStackTrace();
        }
        return c;
    }
}
