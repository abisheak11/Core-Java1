package com.javaproject.module3.map.map3;

import lombok.extern.log4j.Log4j2;

import java.util.*;

@Log4j2
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentName("Raju");
        student1.setStudentId(1);

        Student student2 = new Student();
        student2.setStudentName("Saju");
        student2.setStudentId(2);

        Student student3 = new Student();
        student3.setStudentName("Abishek");
        student3.setStudentId(3);

        Student student4 = new Student();
        student4.setStudentName("Abishek");
        student4.setStudentId(3);

        Marks marks1 = new Marks();
        marks1.setMaths(50);
        marks1.setPhysics(50);

        Marks marks2 = new Marks();
        marks2.setMaths(50);
        marks2.setPhysics(50);

        Marks marks3 = new Marks();
        marks3.setMaths(50);
        marks3.setPhysics(50);

        Marks marks4 = new Marks();
        marks4.setMaths(50);
        marks4.setPhysics(50);

        Map<Student,Marks>marksMap=new TreeMap<>();
        marksMap.put(student1,marks1);
        marksMap.put(student2,marks2);
        marksMap.put(student3,marks3);
        marksMap.put(student4,marks4);


        marksMap.forEach((key,Value1)->log.info("Key:{} and Value:{}",key,Value1));
    }
}
