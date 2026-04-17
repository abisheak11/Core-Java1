package com.javaproject.module2.oops.abstract1.encapsulation1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentName("Ajith");
        student1.setStudentId(123);
        log.info(student1.getStudentName());
        log.info(student1.getStudentId());
        Student student2 = new Student();
        student2.setStudentName("Ajay");
        student2.setStudentId(345);
        log.info(student2);
        Student student3 = new Student();
        student3.setStudentName("jerold");
        student3.setStudentId(897);
        log.info(student3);
    }
}
