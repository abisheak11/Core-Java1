package com.javaproject.module3.arraylistsorting;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student implements Comparable<Student>{
    public String studentName;
    public int studentId;


    @Override
    public int compareTo(Student student) {
       return this.studentName.compareTo(student.studentName);
       // return this.studentId-student.studentId;
    }
}
