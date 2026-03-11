package com.javaproject.pratices;

import lombok.extern.log4j.Log4j2;

@Log4j2
//COUNT WORD IN A STRING
public class Question11 {
    public static void main(String[] args) {
        String str="Abisheak";
        int count=0;
        char[]arr=str.toCharArray();
        for (int i=0;i<=arr.length-1;i++){
            count++;
        }
        log.info(count);
    }
}
