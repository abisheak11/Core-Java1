package com.javaproject.module3.map.map3;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@ToString
public class Student implements Comparable<Student>{
    public String studentName;
    public int studentId;

    @Override
    public int compareTo(Student o) {
        return o.getStudentName().compareTo(this.getStudentName());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && Objects.equals(studentName, student.studentName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(studentId);
    }
}
