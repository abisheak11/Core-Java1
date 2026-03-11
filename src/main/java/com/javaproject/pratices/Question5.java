package com.javaproject.pratices;

import lombok.extern.log4j.Log4j2;


import java.util.HashSet;
import java.util.Set;

@Log4j2
public class Question5 {
    public static void main(String[] args) {
        int[]arr ={1,2,3,4,4,5,6};

        Set<Integer>set= new HashSet<>();
        for (Integer res :arr){
            set.add(res);
        }
        log.info(set);


        }
    }

