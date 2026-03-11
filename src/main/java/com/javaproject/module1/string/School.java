package com.javaproject.module1.string;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class School {
    public static void main(String[] args) {
        //STRING LITERAL
        String studentName = "Abisheak";
        log.info(studentName);
        //CREATING STRING USING NEW KEYWORD
        String studentName1 = new String("Ajay");
        log.info(studentName1);
    }
}
