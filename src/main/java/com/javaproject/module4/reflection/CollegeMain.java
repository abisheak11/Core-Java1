package com.javaproject.module4.reflection;

import lombok.extern.log4j.Log4j2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Log4j2
public class CollegeMain {
    public static void main(String[] args)throws Exception {
        College college = new College();

        Class collegeClass =college.getClass();

        //MODIFY THE BEHAVIOUR DURING THE RUNTIME
        Field field = collegeClass.getDeclaredField("studentVariable");
        field.setAccessible(true);
        field.set(college,"Abishek");
        log.info(field.get(college));

        Method method = collegeClass.getDeclaredMethod("studentName1");
        method.setAccessible(true);
        String resp =(String)method.invoke(college);
        log.info(resp);

        Method method1 = collegeClass.getDeclaredMethod("studentName2", String.class);
        method1.setAccessible(true);
        String res=(String) method1.invoke(college,"Ajay");
        log.info(res);

        //EXAMINE THE BEHAVIOUR DURING THE RUNTIME
        Field []field1= collegeClass.getDeclaredFields();
        for(Field field2 : field1){
            log.info(field2.getName());
        }
        Method []method2 = collegeClass.getDeclaredMethods();
        for (Method method3 : method2){
            log.info(method3.getName());
        }

    }
}
