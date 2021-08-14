package com.epam.java_WorkWithText;


import com.epam.java_WorkWithText.io.WorkWithFile;
import com.epam.java_WorkWithText.workWithText.WorkWithText;
import java.util.Arrays;



public class Runner {
    public static void main(String[] args) {
        WorkWithFile workWithFile = new WorkWithFile();
        WorkWithText workWithText = new WorkWithText();

       // System.out.println(workWithFile.fromFile("myText.txt"));
       // workWithFile.toFile("test.txt",workWithFile.fromFile("myText.txt").toString());
        String [] lines = workWithText.
                findSentence(workWithFile.fromFile("myText.txt").toString());
        Arrays.stream(lines).forEach(System.out::println);
        System.out.println(lines.length);



    }
}
