package com.javaproject.module4.reflection3;

import lombok.extern.log4j.Log4j2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Log4j2
public class StudentMain {
    public static void main(String[] args) throws  Exception{
        Students students = new Students();
        Class student = students.getClass();

        Field field =student.getDeclaredField("studentName");
        field.setAccessible(true);
        field.set(students,"abishek");
        log.info(students);

        Method method = student.getDeclaredMethod("getDetail",int.class);
        method.setAccessible(true);
        int str = (int)method.invoke(students,12);
        log.info(str);

        Field[]fields = student.getDeclaredFields();
        for (Field field1 :fields){
            log.info(field1);
        }
    }
}
