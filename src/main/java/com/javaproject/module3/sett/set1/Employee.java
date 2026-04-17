package com.javaproject.module3.sett.set1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@ToString
public class Employee implements Comparable<Employee> {
    public String employeeName;
    public int employeeId;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeName, employee.employeeName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(employeeName);
    }

    @Override
    public int compareTo(Employee emp) {
        return this.getEmployeeName().compareTo(emp.getEmployeeName());
    }
}
