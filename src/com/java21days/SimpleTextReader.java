package com.java21days;

import java.io.*;

public class SimpleTextReader {
    SimpleTextReader(){
        String fileName = getClass().getResource("test.txt").getPath();
        System.out.println(fileName);
        try (
                FileReader file = new FileReader(fileName);
                BufferedReader buffer = new BufferedReader(file);
        ){
            String line;
            do {
                line = buffer.readLine();
                if(line == null){
                    break;
                } else {
                    System.out.println(line);
                }
            } while (line != null);
        } catch (FileNotFoundException e){
            System.out.println("Exception: " + e.getMessage());
        } catch (IOException e){
            System.out.println("Exception: " + e.getMessage());
        }
    }

}
