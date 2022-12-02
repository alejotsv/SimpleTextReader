package com.java21days;

public class Main {
    public static void main(String[] args) {
        SimpleTextReader textReader = new SimpleTextReader();
        new SimpleTextWriter(textReader.lines);
    }
}
