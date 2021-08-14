package com.epam.java_WorkWithText;


import com.epam.java_WorkWithText.io.WorkWithFile;



public class Runner {
    public static void main(String[] args) {
        WorkWithFile workWithFile = new WorkWithFile();
        System.out.println(workWithFile.fromFile("myText.txt"));
        System.out.println();

    }
}
