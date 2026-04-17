package com.javaproject.module3.arraylistsorting;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Log4j2
public class StudentMain {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setStudentName("Vijay");
        student1.setStudentId(112);

        Student student2 = new Student();
        student2.setStudentName("Ajit");
        student2.setStudentId(113);

        Student student3 = new Student();
        student3.setStudentName("Surya");
        student3.setStudentId(111);

        Student student4 = new Student();
        student4.setStudentName("Ravi");
        student4.setStudentId(110);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        //Collection sort
        Collections.sort(students);

        //Before java 8
       // Collections.sort(students,new StudentIdCompare());
        //From java 8
       // Collections.sort(students, Comparator.comparing(student5 -> student5.getStudentId()));
      //  students.sort(Comparator.comparing(student -> student.getStudentName()));
        students.forEach(log::info);

    }
}
