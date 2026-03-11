package com.javaproject.pratices;

import lombok.extern.log4j.Log4j2;

@Log4j2
//COUNT THE ODD AND EVEN NUMBERS
public class Question14 {
    public static void main(String[] args) {
        int[]arr={2,3,4,5,6};
        int odd =0;
        int even=0;
        for (int i=0;i<=arr.length-1;i++){
            if (arr[i]%2==0){
               even++;
            }else {
                odd++;
            }
        }
        log.info("odd:{}",odd);
        log.info("even:{}",even);
    }
}
