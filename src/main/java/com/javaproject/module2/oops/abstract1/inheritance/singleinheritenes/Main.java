package com.javaproject.module2.inheritance.singleinheritenes;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main {
    public static void main(String[] args) {
        Student1 student1 = new Student1(201, "Abishek", 345);
        student1.getStudent();
    }
}
