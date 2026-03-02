package com.javaproject.module4.iostream;

import lombok.extern.log4j.Log4j2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

@Log4j2
public class ByteStream {
    public static void main(String[] args) {
        String inputFile="C:\\Users\\abi1p\\java intelj\\corejava\\src\\main\\resources\\input.txt";
        String outputFile ="C:\\Users\\abi1p\\java intelj\\corejava\\src\\main\\resources\\output.txt";

        ByteStream stream = new ByteStream();
        stream.read(inputFile,outputFile);

    }
    public void read(String inputFile,String outFile){
        try(FileInputStream inputStream = new FileInputStream(inputFile);
            FileOutputStream fileOutputStream = new FileOutputStream(outFile))
        {
        int data;
            while ((data=inputStream.read())!=-1){
                fileOutputStream.write(data);
            }

        }catch (Exception exception){

            log.error("Byte Stream",exception);
        }
    }
}
