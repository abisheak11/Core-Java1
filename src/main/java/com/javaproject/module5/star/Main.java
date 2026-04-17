package com.javaproject.module5.star;

public class Main {
    public static void main(String[] args) {
        Hospital hos = new Hospital();

        Runnable runnable =()-> hos.ward();

        for (int i =0; i<=10; i++){
            new Thread(runnable).start();
        }
    }
}
