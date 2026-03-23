package com.javaproject.pratices;

import lombok.extern.log4j.Log4j2;

import java.util.HashMap;
import java.util.Map;
@Log4j2
public class Question4 {
    public static void main(String[] args) {
        String input="malayalam";
        Map<Character,Integer>characterMap= new HashMap<>();
        for (char ch : input.toCharArray()){
            if(characterMap.containsKey(ch)){
                characterMap.put(ch,characterMap.get(ch)+1);
            }else {
                characterMap.put(ch, +1);
            }
        }
        characterMap.forEach((character, integer) -> log.info("Char:{} and times:{}",character,integer));
    }

}
