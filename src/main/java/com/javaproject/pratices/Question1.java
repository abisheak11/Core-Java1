package com.javaproject.pratices;


//PRINT THE STRING WITH FIRST LETTER CAPITAL
public class Question1 {

    public static void main(String[] args) {
        String name = "abisheak";

        StringBuffer stringBuffer = new StringBuffer();

        char[] arr = name.toCharArray();
        for (int i = 0; i <= arr.length-1; i++) {
            if (i == 0) {
                stringBuffer.append(Character.toUpperCase(arr[i]));
            } else {
                stringBuffer.append(arr[i]);
            }
        }
                System.out.println(stringBuffer);
    }
}