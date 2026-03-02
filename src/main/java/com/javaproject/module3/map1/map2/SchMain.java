package com.javaproject.module3.map1.map2;

import lombok.extern.log4j.Log4j2;

import java.util.Map;
import java.util.TreeMap;

@Log4j2
public class SchMain {
    public static void main(String[] args) {
        School78 student1= new School78();
        student1.setStdName("jebin");
        student1.setMark(60);
        School78 student2= new School78();
        student2.setStdName("jixen");
        student2.setMark(75);
        School78 student3= new School78();
        student3.setStdName("ABC");
        student3.setMark(60);

        SchoolId studentId1 = new SchoolId();
        studentId1.setStdId(103);
        SchoolId studentId2 = new SchoolId();
        studentId2.setStdId(102);
        SchoolId studentId3 = new SchoolId();
        studentId3.setStdId(101);

        Map<SchoolId,School78>maplist= new TreeMap<>();
        maplist.put(studentId1,student1);
        maplist.put(studentId2,student2);
        maplist.put(studentId3,student3);

        maplist.forEach((key,value)->log.info("key{}:and value{}:", key,value));


    }
}
