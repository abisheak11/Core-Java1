package com.javaproject.module2.oops.abstract1.inheritance.multilevelinheritenes;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Student2 extends Student1{

    public void getStudent(){
        log.info("Student2 Method Overriding");
    }
}
