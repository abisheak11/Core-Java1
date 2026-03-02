package com.javaproject.module4.iostream;

import lombok.extern.log4j.Log4j2;

import java.io.FileReader;
import java.io.FileWriter;

@Log4j2
public class CharacterStream {
    public static void main(String[] args) {
        String inputFile="C:\\Users\\abi1p\\java intelj\\corejava\\src\\main\\resources\\input.txt";
        String outputFile="C:\\Users\\abi1p\\java intelj\\corejava\\src\\main\\resources\\output.txt";
        CharacterStream characterStream = new CharacterStream();
        characterStream.getCharacter(inputFile,outputFile);

    }
    public void getCharacter(String input,String output){
        try ( FileReader fileReader = new FileReader(input);
            FileWriter fileWriter = new FileWriter(output)){
            int data;
            while ((data= fileReader.read())!=-1) {
                fileWriter.write(data);
            }
        }catch (Exception ef){
            log.error(ef);
        }
    }
}
