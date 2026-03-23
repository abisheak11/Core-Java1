package com.javaproject.module1.questions;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Example {
    public static void main(String[] args) {
        String str = "dhanus";

        StringBuffer c1 = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                c1.append(str.toUpperCase().charAt(i));
            } else {
                c1.append(str.charAt(i));
            }
        }
        log.info(c1);
    }

}

