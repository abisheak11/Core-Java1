package com.javaproject.pratices;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Question8 {
    public static void main(String[] args) {
        int n =34;
        int a= 0;
        int b= 1;
        for(int i =1;i<=n;i++){
            int c = a+b;
            log.info(a);
            a=b;
            b=c;
        }
    }
}
