package com.javaproject.module1.questions;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Example2 {

    public String name="malayalam";

    StringBuffer sb = new StringBuffer();

    public void getName(){
        for (int i=name.length()-1;i>=0;i--){
         sb.append(name.charAt(i));
        }
        if (name.compareTo(sb.toString())==0) {

            log.info("its palindrome");
        } else {
            log.info("its not a palindrome");
        }
    }
    public static void main(String[] args) {
        Example2 eg = new Example2();
        eg.getName();
    }
}
