package com.javaproject.module3.arrayList21;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@Log4j2
public class CollegeMain {
    public static void main(String[] args) {
        College student1 = new College();
        student1.setStudentName("Abishek");
        student1.setStudentId(345);
        College student2 = new College();
        student2.setStudentName("Ajay");
        student2.setStudentId(345);
        College student3 = new College();
        student3.setStudentName("Sanjay");
        student3.setStudentId(345);

        List<College>studentList= new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        Collections.sort(studentList);

        studentList.forEach(studentList2->log.info(studentList2));

        List<String>studentNamelist = new ArrayList<>();
        for(College college:studentList){
            studentNamelist.add(college.getStudentName());
        }
        studentNamelist.forEach(stud->log.info(stud));

        }

       }


