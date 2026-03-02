package com.javaproject.module1.looping;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Loops {
    public static void main(String[] args) {
        Loops fl =new Loops();
        fl.forLoop(5);
        fl.whileLoop(5);
        fl.doWhile(5);
    }
    //FOR LOOP
    public void forLoop(int n){
        for (int i=1; i<=n; i++){
            log.info(i);
        }
    }
    //WHILE LOOP
    public void whileLoop(int j){
        int i=1;
        while (i<=j){
            log.info(i);
            i++;
        }
    }
    //DO WHILE LOOP
    public void doWhile(int a){
        int i=1;
        do{
            log.info("print");
            i++;
        }while(i<=a);
    }
}
