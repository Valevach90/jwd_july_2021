package com.epam.java_WorkWithText;


import com.epam.java_WorkWithText.domain.Word;
import com.epam.java_WorkWithText.io.ReadFromFile;
import com.epam.java_WorkWithText.io.ReadToFile;
import com.epam.java_WorkWithText.workWithText.WorkWithText;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedList;
import java.util.Scanner;


public class Runner {
    private static final Logger logger = LogManager.getLogger(Runner.class);
    public static void main(String[] args) {
        LinkedList<String> wordsFromCurrentText = new LinkedList<>();
        WorkWithText workWithText = new WorkWithText();
        ReadFromFile readFromFile = new ReadFromFile();
        ReadToFile  writeToFile = new ReadToFile();
        Word word = new Word(readFromFile.fromFile("myText.txt"),wordsFromCurrentText);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value");
        int input = scanner.nextInt();
        logger.info("Correct input");
        switch (input){
            case 1:
                word.addAllWord( word.wordParse(readFromFile.fromFile("myText.txt")));
                writeToFile.toFile("test.txt",workWithText.countWords(wordsFromCurrentText));
                break;
            case 2:
                word.addAllWord( word.wordParse(readFromFile.fromFile("myText.txt")));
                writeToFile.toFile("test.txt",workWithText.printByValue(wordsFromCurrentText).toString());
                break;
            case 3:
                word.addAllWord( word.wordParse(readFromFile.fromFile("myText.txt")));
                writeToFile.toFile("test.txt",workWithText.sortingSentenceByMaxCapacity(wordsFromCurrentText).toString());
                break;
            case 4:
                word.print();
            default:
                System.out.println("Wrong input");
        }






    }
}
