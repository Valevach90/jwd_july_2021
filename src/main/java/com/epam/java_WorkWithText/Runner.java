package com.epam.java_WorkWithText;

import com.epam.java_WorkWithText.io.ReadTextFromFile;

import java.io.File;

public class Runner {
    public static void main(String[] args) {
        ReadTextFromFile read = new ReadTextFromFile();
        System.out.println( read.readingFromFile("./src/main/java/com/epam/java_WorkWithText/source/test1.txt"));
    }
}
