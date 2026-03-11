package com.javaproject.module2.inheritance.multilevelinheritenes;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Collage {

    public void class1(){
        log.info("Method OverLoading without Parameter");
    }
    public void class1(int classNo){
        log.info("Method Overloading with Parameter");
    }
}
