package com.javaproject.module4rp.arraylist;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
@Log4j2
public class EmpMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setEmpName("Abisheak");
        employee1.setEmpId(111);

        Employee employee2 = new Employee();
        employee2.setEmpName("Ajay");
        employee2.setEmpId(113);

        Employee employee3 = new Employee();
        employee3.setEmpName("Abisheak");
        employee3.setEmpId(111);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        employees.forEach(employee -> log.info(employee));

        for (Employee emp : employees) {
           if (emp.getEmpId()>111){
               List<Employee>employees1 = new ArrayList<>();
               employees1.add(emp);
               employees1.forEach(employee -> log.info(employee));
           }


        }



    }
}
