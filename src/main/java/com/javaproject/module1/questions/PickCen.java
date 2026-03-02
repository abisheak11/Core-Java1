package com.javaproject.module1.questions;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PickCen {
    public String studentName="Abishek";

    public void getCenter(){
        int name2= studentName.length()/2;
       log.info(studentName.charAt(name2));
    }

    public static void main(String[] args) {
        PickCen p1 = new PickCen();
        p1.getCenter();
    }
}
