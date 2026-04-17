package com.javaproject.pratices;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Question19 {
    public static void main(String[] args) {
        int input=10;
        for(int i=1;i<=input;i++){
            if (i%2!=0){
                log.info(i);
            }
        }
    }
}
