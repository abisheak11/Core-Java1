package com.javaproject.module4.iostream;

import lombok.extern.log4j.Log4j2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

@Log4j2
public class BufferStream {
    public static void main(String[] args) {
        String input ="C:\\Users\\abi1p\\java intelj\\corejava\\src\\main\\resources\\input.txt";
        String output ="C:\\Users\\abi1p\\java intelj\\corejava\\src\\main\\resources\\output.txt";

        BufferStream bufferStream = new BufferStream();
        bufferStream.getBuffer(input,output);
    }
    public void getBuffer(String input,String output){
        try (
            BufferedReader bufferedReader = new BufferedReader(new FileReader(input));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output))){
            String data;
            while ((data=bufferedReader.readLine())!=null){
                bufferedWriter.write(data);
            }
        }catch (Exception exception){
            log.error(exception);
        }
    }
}
