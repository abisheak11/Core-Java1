package com.javaproject.pratices;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Question7 {
    public static void main(String[] args) {
        int input =153;
        int check = input;
        int sum = 0;
        while (input>0) {
            int digit = input % 10;
            sum = sum + (digit * digit * digit);
            input = input / 10;
        }
            if (sum==check){
                log.info("it is Armstrong number");
            }else
                log.info("it is not a Armstrong Number");

    }

    }

