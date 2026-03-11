package com.javaproject.pratices;

import lombok.extern.log4j.Log4j2;

@Log4j2
//COUNT THE VOWELS
public class Question3 {
    public static void main(String[] args) {
        String name ="abisheak";
        int count =0;
       char[]arr=name.toCharArray();
       for (int i=0; arr.length-1>=i; i++) {
           if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'o' || arr[i] == 'i' || arr[i] == 'u') {
               count++;
           }
       }
           System.out.println(count);

        }
    }

