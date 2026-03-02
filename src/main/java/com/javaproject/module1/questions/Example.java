package com.javaproject.module1.questions;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Example {
    public static void main(String[] args) {


        String str = "dhanus";

        StringBuffer c1 = new StringBuffer();

        char[]arr =str.toCharArray();
        for (int i=0; i<arr.length;i++){
            if (i==0){
                c1.append(Character.toUpperCase(arr[i]));
            }else {
                c1.append(arr[i]);
            }
            }
        log.info(c1);

        }

    }

