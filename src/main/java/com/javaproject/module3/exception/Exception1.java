package com.javaproject.module3.exception;

import lombok.extern.log4j.Log4j2;

import java.io.FileInputStream;
import java.io.IOException;

@Log4j2
public class Exception1 {

    public static void main(String[] args) throws Exception {
        String input = "C:\\Users\\abi1p\\java intelj\\corejava\\src\\main\\resources\\input.txt";
        Exception1 exception1 = new Exception1();
        exception1.getDivision(50, 10);
        exception1.pipeLine(3, 0);
        //  exception1.read(input);
        // exception1.read1(input);
    }

    public int getDivision(int a, int b) {
        int c = 0;
        try {
            c = a / b;

        } catch (ArithmeticException exception) {
            log.error(exception);
        }
        log.error("Null pointer Working");
        return c;
    }

    public int pipeLine(int num1, int num2) {
        int res = 0;
        try {
            res = num1 / num2;
        } catch (ArithmeticException | NullPointerException exception) {
            log.error(exception);
        }
        log.info(res);
        return res;
    }

    public int print() {
        try {
            return 10;
        } catch (Exception e) {
            log.error(e);
        } finally {
            return 20;

        }
    }

    public void read(String input) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(input);
            int var;
            while ((var = fileInputStream.read()) != -1) {
                log.info(var);
            }
        } catch (Exception e) {

            log.error(e);
        } finally {
            fileInputStream.close();
        }

    }

    public void read1(String input) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(input)) {
            int var;
            while ((var = fileInputStream.read()) != -1) {
                log.info(var);
            }
        } catch (Exception e) {

            log.error(e);
        }
    }

}


