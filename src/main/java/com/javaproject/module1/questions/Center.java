package com.javaproject.module1.questions;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Center {
    public String name ="regu";
    public int name1 = name.length()/2;

    public void getCenter(){
        String name2 = name.substring(name1-1,name1+1);
        log.info(name2);
    }

    public static void main(String[] args) {
        Center center = new Center();
        center.getCenter();
    }
}
