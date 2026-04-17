package com.javaproject.module2.oops.abstract1.inheritance.singleinheritenes;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Student1 extends School{

    public String studentName;
    public int studentId;


    public Student1(int classNo,String studentName,int studentId) {
        super(classNo);
        this.studentName= studentName;
        this.studentId = studentId;
    }
    public void getStudent(){
        getClass1();
        log.info(studentName);
        log.info(studentId);
    }

}
