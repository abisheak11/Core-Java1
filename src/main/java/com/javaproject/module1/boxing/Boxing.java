package com.javaproject.module1.boxing;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Boxing {
    public static void main(String[] args) {
       Boxing autoBoxing1 = new Boxing();
       autoBoxing1.autoBoxing(5);
       autoBoxing1.unBoxing(5);
    }
    public Integer autoBoxing(int input ){
        Integer auto = input;
        return auto;
    }
    public int unBoxing(Integer input2){
        int unboxing = input2;
        return unboxing;
    }
}
