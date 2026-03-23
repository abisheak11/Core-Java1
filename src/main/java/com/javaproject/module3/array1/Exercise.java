package com.javaproject.module3.array1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Exercise {
    public static void main(String[] args) {
        Exercise exercise = new Exercise();
        exercise.array1();
        exercise.array2();
    }
    public void array1(){
        int[]arr={10,20,30,40,50,60};
        int arr1 = arr.length/2;
        log.info("Center:{}",arr[arr1]);
    }
    public void array2(){
        int[]arr={1,2,3,4,5,6};
        for (int i= arr.length-1;i>=0;i--){
            log.info("Reverse:{}",arr[i]);
        }
    }
}
