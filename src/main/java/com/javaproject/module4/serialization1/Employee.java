package com.javaproject.module4.serialization1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Employee implements Serializable {
    public static final long serialVersionUID = 3452345345L;

    public String employeeName;
    public  transient  int employeeNo;
}
