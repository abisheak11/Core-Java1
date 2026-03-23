package com.javaproject.module3.array1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Array {
    public static void main(String[] args) {
        Array array = new Array();
        array.array();
        array.array2();
        array.array1();
        array.array4();

    }

    public void array() {
        int[] arr1 = new int[3];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        for (int i = arr1.length - 1; i >= 0; i--) {
            log.info(arr1[i]);
        }

    }

    public void array1() {

        int[] arr = {1, 2, 3, 4, 5};

        for (int i = arr.length - 1; i >= 0; i--) {
            log.info(arr[i]);
        }
    }

    public void array2() {
        int[][] arr2 = new int[2][2];
        arr2[0][0] = 100;
        arr2[0][1] = 200;
        arr2[1][0] = 300;
        arr2[1][1] = 400;
        for (int i = 0; i <= arr2.length-1; i++) {
            for (int j = 0; arr2.length - 1 >= j; j++) {
                log.info(arr2[j][i]);
            }
        }
    }

    public void array4() {
        int[][] val = {{40, 50}, {60, 70}};
        for (int i = 0; i <= val.length - 1; i++) {
            for (int j = 0; val.length - 1 >= j; j++) {
                log.info(val[j][i]);
            }
        }
    }
}
