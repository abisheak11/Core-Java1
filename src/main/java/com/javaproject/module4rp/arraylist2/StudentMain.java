package com.javaproject.module4rp.arraylist2;


import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Log4j2
public class StudentMain {
    public void forLoop(List<Student> student) {
        if (CollectionUtils.isNotEmpty(student)) {
            for (int i = 0; student.size() - 1 >= i; i++) {
                log.info("FOR LOOP{}", student.get(i));
            }
        }
    }

    public void forEachLoop(List<Student> students) {
        if (CollectionUtils.isNotEmpty(students)) {
            for (Student student : students) {
                log.info("FOR EACH{}", student);
            }
        }
    }

    public void iterator(List<Student> students) {
        if (CollectionUtils.isNotEmpty(students)) {
            Iterator<Student> studentIterator = students.iterator();
            while (studentIterator.hasNext()) {
                Student student = studentIterator.next();
                log.info("BY USING ITERATOR {}", student);
            }
        }
    }

    public void listIterator(List<Student> students) {
        if (CollectionUtils.isNotEmpty(students)) {
            ListIterator<Student> studentIterator = students.listIterator();
            while (studentIterator.hasNext()) {
                Student student1 = studentIterator.next();
                log.info("LIST ITERATOR FORWARD DIRECTION{}", student1);
            }
            while (studentIterator.hasPrevious()) {
                Student student = studentIterator.previous();
                log.info("LIST ITERATOR BACKWARD{}", student);
            }
        }
    }

    public void lambda(List<Student> students) {
        students.forEach(student -> log.info("LAMBDA{}", student));
    }

    public void streamIteration(List<Student> students) {
        students.stream().forEach(student -> log.info("STREAM{}", student));
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentName("johnson");
        student1.setStudentId(112);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student1);
        studentList.add(student1);

        StudentMain studentMain = new StudentMain();
        studentMain.forEachLoop(studentList);
        studentMain.forLoop(studentList);
        studentMain.iterator(studentList);
        studentMain.listIterator(studentList);
        studentMain.lambda(studentList);
        studentMain.streamIteration(studentList);
    }

}
