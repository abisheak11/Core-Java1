package com.javaproject.module1.questions;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Revers {
    public String name1="Malayam";

    public void getRevers(){
        for (int i=name1.length()-1;i>=0;i--){
            System.out.print(name1.charAt(i));
        }

    }

    public static void main(String[] args) {
        Revers revers = new Revers();
        revers.getRevers();
    }
}
