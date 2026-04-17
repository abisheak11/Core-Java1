package com.javaproject.module3.arraylistes.arrayList21;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Getter
@Setter
@ToString
public class College implements Comparable<College> {
    public String studentName;
    public int studentId;

    public int compareTo(College college){
        return this.getStudentName().compareTo(college.getStudentName());
    }

}
