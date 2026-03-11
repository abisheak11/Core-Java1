package com.javaproject.module1.questions;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Example6 {

    public static void main(String[] args) {

    int[]arr ={1,2,4,5};
    int count=arr.length;

            for (int i = arr.length-1; i >= 0; i--) {
                log.info("{}",arr[i]);

        }
    }
}