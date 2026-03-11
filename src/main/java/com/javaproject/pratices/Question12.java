package com.javaproject.pratices;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Question12 {
    public static void main(String[] args) {
        int[]arr ={1,2,3,4,7,5};
        int big = arr[0];
        for (int i=1;i<=arr.length-1;i++){
            if (arr[i]>big){
                big=arr[i];
            }
        }
        log.info(big);
    }
}
