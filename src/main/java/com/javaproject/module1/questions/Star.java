package com.javaproject.module1.questions;

public class Star {
    public void getStar(int n){
        for (int i = 1; i<=n;i++){
            for (int j= 1;i>=j;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void getStar1(int n){
        for (int i = 1; i<=n;i++){
            for (int j= 1;i>=j;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public void getReverse(int n){
        for (int i = n; i>=0;i--){
            for (int j= 1;i>=j;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Star star = new Star();
        star.getStar(5);
        star.getStar1(5);
        star.getReverse(5);
    }
}
