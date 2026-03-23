package com.javaproject.pratices;

import lombok.extern.log4j.Log4j2;

@Log4j2

//SUM OF DIGITS
public class Question9 {
    public static void main(String[] args) {

        int input=1234;
        int sum=0;
        while (input>0){
            int digit = input%10;
            sum=sum+digit;
            input=input/10;
        }
        log.info(sum);
    }
}
