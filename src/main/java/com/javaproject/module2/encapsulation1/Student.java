package com.javaproject.module2.encapsulation1;

import lombok.ToString;

@ToString
public class Student {
    private String studentName;
    private int studentId;

    public String getStudentName(){
        return studentName;
    }
    public int getStudentId(){
        return studentId;
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public void setStudentId(int studentId){
        
        this.studentId = studentId;
    }
}
