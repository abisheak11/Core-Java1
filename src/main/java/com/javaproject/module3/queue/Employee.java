package com.javaproject.module3.queue;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee implements Comparable<Employee>{
    public String employeeName;
    public int employeeId;

    public int compareTo(Employee employee0){
        return this.getEmployeeId()-employee0.getEmployeeId();
    }
}
