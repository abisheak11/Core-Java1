package com.javaproject.pratices;

import lombok.extern.log4j.Log4j2;

@Log4j2
//REVERSE THE NUMBER
public class Question2 {
    public static void main(String[] args) {
        int num= 123;
        int reverse=0;
        while (num>0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num= num/10;
        }
        log.info(reverse);

    }
}
