package com.javaproject.module1.questions;

public class Example7 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 5};
        int n = 5;

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        int total = n * (n + 1) / 2;

        int missing = total - sum;

        System.out.println("Missing Number: " + missing);
    }
}

