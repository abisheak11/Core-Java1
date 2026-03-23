package com.javaproject.module1.questions;

import lombok.extern.log4j.Log4j2;

import java.util.HashMap;

@Log4j2
public class Example3 {


    public static void main(String[] args) {
        String str = "abisheak";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, +1);
            }
        }
        map.forEach((k, v) -> log.info("char:{}  coming:{}", k, v + "time"));
    }
}
