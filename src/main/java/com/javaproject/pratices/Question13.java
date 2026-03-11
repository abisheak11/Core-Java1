package com.javaproject.pratices;

import lombok.extern.log4j.Log4j2;

@Log4j2
//REVERSE STRING
public class Question13 {
    public static void main(String[] args) {
        String word ="baksheesh";

        for (int i=word.length()-1;i>=0;i--){
            log.info(word.charAt(i));
        }
    }
}
