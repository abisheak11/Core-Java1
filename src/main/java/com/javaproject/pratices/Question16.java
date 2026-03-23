package com.javaproject.pratices;

import lombok.extern.log4j.Log4j2;

@Log4j2
//FACTORIAL OF NUMBER
public class Question16 {
    public static void main(String[] args) {
        int num=5;
        int fact=1;
        for (int i=num;i>0;i--){
            fact=fact*i;
        }
        log.info(fact);
    }
}
