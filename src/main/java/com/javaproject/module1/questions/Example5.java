package com.javaproject.module1.questions;

import lombok.extern.log4j.Log4j2;

import java.util.HashSet;
import java.util.Set;

@Log4j2
public class Example5 {
    public static void main(String[] args) {
        char[]arr={1,1,2,2,3,3,34,6,6,8,8};
        Set<Integer>set= new HashSet<>();
        for(int ad :arr){
            set.add(ad);
        }
        set.forEach(a1->log.info(a1));
    }
}
