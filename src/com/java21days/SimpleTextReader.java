package com.java21days;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SimpleTextReader {
    SimpleTextReader(){
        String fileName = getClass().getResource("test.txt").getPath();
        System.out.println(fileName);
        try (FileReader file = new FileReader(fileName)){
            System.out.println((char) file.read());
            System.out.println((char) file.read());
            System.out.println((char) file.read());
            System.out.println((char) file.read());
        } catch (FileNotFoundException e){
            System.out.println("Exception: " + e.getMessage());
        } catch (IOException e){
            System.out.println("Exception: " + e.getMessage());
        }
    }

}
