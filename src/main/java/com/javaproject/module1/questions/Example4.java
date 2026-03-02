package com.javaproject.module1.questions;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Example4 {
    public static void main(String[] args) {
        char[]arr={1,2,45,56,25};
        int big = arr[0];
        for(int i=0; i<=arr.length-1;i++){
            if (arr[i]>big){
                big= arr[i];
            }
        }
        log.info(big);
    }
}
