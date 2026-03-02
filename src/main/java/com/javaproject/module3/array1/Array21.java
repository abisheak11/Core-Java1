package com.javaproject.module3.array1;

import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@Log4j2
@ToString
public class Array21 {
    String[]names={"Abishek","Ajay"};

    public void getArray(int n){
        for (int i=0;i<n;i++){

           log.info(names[i]);
        }
    }
    public static void main(String[] args) {
        Array21 array21 = new Array21();
        array21.getArray(2);
    }
}
