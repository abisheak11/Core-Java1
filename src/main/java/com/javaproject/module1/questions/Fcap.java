package com.javaproject.module1.questions;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Fcap {
    public String name ="abishek";

    public void getName(){
        for (int i= 0; i>=0;i--){
            String name2=name.substring(0,1).toUpperCase()+name.substring(1);
            log.info(name2);
        }
    }

    public static void main(String[] args) {
        Fcap f1 = new Fcap();
        f1.getName();
    }
}
