package com.java21days;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SimpleTextWriter {
    SimpleTextWriter(ArrayList<String> lines){
        try (
                FileWriter writer = new FileWriter("target_test.txt");
                BufferedWriter buffer = new BufferedWriter(writer);
             ){
            int lineNum = 1;
            for (String line : lines) {
                buffer.write(lineNum + ": " + line + "\n");
                lineNum++;
            }
        } catch (IOException e){
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
