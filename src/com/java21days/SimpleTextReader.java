package com.java21days;

import java.io.*;
import java.util.ArrayList;

public class SimpleTextReader {
    ArrayList<String> lines = new ArrayList<>();
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
                    lines.add(line);
                }
            } while (line != null);
            buffer.close();
        } catch (FileNotFoundException e){
            System.out.println("Exception: " + e.getMessage());
        } catch (IOException e){
            System.out.println("Exception: " + e.getMessage());
        }
    }


}
