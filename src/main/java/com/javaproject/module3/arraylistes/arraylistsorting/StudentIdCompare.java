package com.javaproject.module3.arraylistsorting;

import java.util.Comparator;

public class StudentIdCompare implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getStudentId()- o1.getStudentId();
    }
}
