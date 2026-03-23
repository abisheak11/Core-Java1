package com.javaproject.pratices;

import lombok.extern.log4j.Log4j2;

@Log4j2
//PALINDROME
public class Question6 {
    public static void main(String[] args) {
        String word ="Malayalam";
        String word1=word.toLowerCase();

        StringBuffer sb = new StringBuffer();

        for (int i=word1.length()-1;i>=0;i--){
          sb.append(word1.charAt(i));
        }
       String sd= sb.toString();
        if(word1.equals(sd)){
            log.info("it's a palindrome");
        }else {
            log.info("it's not a palindrome");
        }
    }
}
