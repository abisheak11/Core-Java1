package com.javaproject.module3.arraylistes.arraylist;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Log4j2
public class StudentMain {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setStudentName("Abishek");
        student1.setStudentId(111);
        student1.setPlaces("kanyakumari");

        Student student2 = new Student();
        student2.setStudentName("Ajay");
        student2.setStudentId(111);
        student2.setPlaces("kanyakumari");

        Student student3 = new Student();
        student3.setStudentName("Abc");
        student3.setStudentId(111);
        student3.setPlaces("kanyakumari");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        StudentMain studentMain = new StudentMain();
        studentMain.task(students,"Abishek");
    }

    //find the student detail based on name
    public void task(List<Student> students,String name) {
        if (CollectionUtils.isNotEmpty(students)){
        for (Student student: students) {
              if (student.getStudentName().equals(name)){
                  log.info(student);
                  }
             }
        }
    }
}

