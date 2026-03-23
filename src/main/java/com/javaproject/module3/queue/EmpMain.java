package com.javaproject.module3.queue;

import lombok.extern.log4j.Log4j2;


import java.util.*;

@Log4j2
public class EmpMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setEmployeeName("Ajith");
        employee1.setEmployeeId(22);

        Employee employee2 = new Employee();
        employee2.setEmployeeName("Suriya");
        employee2.setEmployeeId(12);

        Employee employee3 = new Employee();
        employee3.setEmployeeName("Vijay");
        employee3.setEmployeeId(34);

        Employee employee4 = new Employee();
        employee4.setEmployeeName("Dhanush");
        employee4.setEmployeeId(27);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        Queue<Employee> queue = new PriorityQueue<>();
        for (Employee employee : employeeList) {
            queue.add(employee);
        }
        queue.forEach(queue1 -> log.info(queue1));
    }
}

