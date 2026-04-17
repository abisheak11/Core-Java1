package com.javaproject.module3.sett.hashset;

import lombok.extern.log4j.Log4j2;

import java.util.HashSet;
import java.util.Set;
@Log4j2
public class EmployeeMain {
    public static void main(String[] args) {
       Employee employee1 = new Employee();
       employee1.setEmployeeName("Abishek");
       employee1.setEmployeeId(112);

        Employee employee2 = new Employee();
        employee2.setEmployeeName("Ajay");
        employee2.setEmployeeId(113);

        Employee employee3 = new Employee();
        employee3.setEmployeeName("CD");
        employee3.setEmployeeId(114);

        Employee employee4 = new Employee();
        employee4.setEmployeeName("CD");
        employee4.setEmployeeId(114);

        Set<Employee>employeesset = new HashSet<>();
        employeesset.add(employee1);
        employeesset.add(employee1);
        employeesset.add(employee2);
        employeesset.add(employee3);
        employeesset.add(employee4);

        employeesset.forEach(log::info);
    }
}
