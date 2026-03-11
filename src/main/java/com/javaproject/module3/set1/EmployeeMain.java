package com.javaproject.module3.set1;

import lombok.extern.log4j.Log4j2;

import java.util.*;

@Log4j2
public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setEmployeeName("zahir");
        employee1.setEmployeeId(234);
        Employee employee2 = new Employee();
        employee2.setEmployeeName("Abc");
        employee2.setEmployeeId(123);
        Employee employee3 = new Employee();
        employee3.setEmployeeName("Jebin");
        employee3.setEmployeeId(786);
        Employee employee4 = new Employee();
        employee4.setEmployeeName("Jebin");
        employee4.setEmployeeId(876);

        Set<Employee>employeeSet= new HashSet<>();
        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        employeeSet.add(employee4);

       employeeSet.forEach(employee -> log.info(employee));


       Set<Employee>employeeSet1 = new TreeSet<>(employeeSet);
       employeeSet1.forEach(sortEmp->log.info(sortEmp));
       for (Employee employee11:employeeSet1){
           log.info(employee11.getEmployeeName());

       }


        }
    }

