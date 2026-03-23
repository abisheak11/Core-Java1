package com.javaproject.pratices;

import lombok.extern.log4j.Log4j2;

@Log4j2
//FIND THE DUPLICATE ELEMENT IN THE ARRAY
public class Question17 {
    public static void main(String[] args) {
        int[]arr={1,2,2,3,3,4,5};

        for (int i = 0;arr.length-1>=i;i++){
           for (int j=i+1;arr.length-1>=j;j++){
               if (arr[i]==arr[j]){
                   log.info(arr[i]);
               }

            }
        }
    }
}
