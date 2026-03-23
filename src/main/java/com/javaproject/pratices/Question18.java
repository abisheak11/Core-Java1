package com.javaproject.pratices;

import lombok.extern.log4j.Log4j2;

@Log4j2
//SUM OF ARRAY ELEMENT
public class Question18 {
    public static void main(String[] args) {
        int[] num={1,2,2,3,7,8,35};
        int num1=0;
        for (int i =0; i<=num.length-1;i++){
            num1=num1+num[i];
        }
        log.info(num1);

    }
}
