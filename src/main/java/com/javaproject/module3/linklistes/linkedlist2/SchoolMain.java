package com.javaproject.module3.linklistes.linkedlist2;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;

@Log4j2
public class SchoolMain {
    public static void main(String[] args) {
        School1 student1 = new School1();
        student1.setStudentName("Abisheak");
        student1.setStudentScore(80);
        student1.setStudentAge(22);
        School1 student2 = new School1();
        student2.setStudentName("Karthi");
        student2.setStudentScore(75);
        student2.setStudentAge(22);
        School1 student3 = new School1();
        student3.setStudentName("Ajith");
        student3.setStudentScore(85);
        student3.setStudentAge(22);
        School1 student4 = new School1();
        student4.setStudentName("Surya");
        student4.setStudentScore(85);
        student4.setStudentAge(22);

        List<School1>studentdetail= new ArrayList<>();
        studentdetail.add(student1);
        studentdetail.add(student2);
        studentdetail.add(student3);
        studentdetail.add(student4);

        List<School1>studentlist3 = new ArrayList<>();
        for (School1 school1: studentdetail)
            if(school1.getStudentScore()>80){
                   studentlist3.add(school1);

                }
        studentlist3.forEach(std->log.info(std));
            }
        }





