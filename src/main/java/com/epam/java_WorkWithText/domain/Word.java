package com.epam.java_WorkWithText.domain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Word extends Text {
    private static final Logger logger = LogManager.getLogger(Word.class);
    public static final String toWordRegex = "(?U)[\\pP\\s\\d+]";

    private List<String> words;

    public Word(String value, List<String> words) {
        super(value);
        this.words = new LinkedList<>();
    }

    public String[] wordParse(String text) {
        String[] wordArray = text.split(toWordRegex);
        logger.error("Word parse is finish");
        return wordArray;
    }


    public void addAllWord(String[] array) {
        words.addAll(Arrays.asList(array));
    }

    public void remove(String text) {
        words.remove(words.stream().filter(element -> element.equals(text)).findFirst().get());

    }

    @Override
    public void print() {
        words.forEach(System.out::println);
        System.out.print(" ");
    }

    public List<String> getWords() {
        return words;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return Objects.equals(words, word.words);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words);
    }
}
