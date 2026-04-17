package com.javaproject.module2.inheritance.singleinheritenes;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class School {
    public int classNo;

    public School(int classNo){
        this.classNo= classNo;

    }
    public void getClass1(){
       log.info(classNo);
    }
}
