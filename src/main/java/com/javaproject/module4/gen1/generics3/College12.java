package com.javaproject.module4.gen1.generics3;

import lombok.extern.log4j.Log4j2;

import java.util.Arrays;
import java.util.List;

@Log4j2
public class College12 {

    public void getWild(List<?>list){
        for (Object detail : list){
            log.info(detail);
        }
    }
    public void getWild1(List<?extends Number>list1){
        for (Number Id : list1){
            log.info(Id);
        }
    }
    public static void main(String[] args) {
        College12 college12 = new College12();
        List<Number>mark = Arrays.asList(80,70,35);
        List<String>studentName= Arrays.asList("Abishek","Ajay","Vijay");
        college12.getWild(mark);
        college12.getWild(studentName);
        List<Integer>id = Arrays.asList(101,102,103);
        college12.getWild1(id);
    }
}
