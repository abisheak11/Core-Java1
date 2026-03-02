package com.javaproject.module4.serialization1;

import lombok.extern.log4j.Log4j2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

@Log4j2
public class EmpMain {
    public static final String FILE="C:\\Users\\abi1p\\java intelj\\corejava\\src\\main\\resources\\Employee.src";

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setEmployeeName("Abishek");
        employee1.setEmployeeNo(2344);
        EmpMain empmain = new EmpMain();
        empmain.serializable(FILE,employee1);
        empmain.deSerializable(FILE);
    }

    public void serializable(String FILE,Employee employee){
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE));
            objectOutputStream.writeObject(employee);

        }catch (Exception ex){
            log.error("serialization",ex);
        }
    }
    public void deSerializable(String FILE){
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE));
            Employee employee=(Employee)objectInputStream.readObject();
            log.info(employee);
        }catch (Exception ex){
            log.error(ex);

        }

    }
}
