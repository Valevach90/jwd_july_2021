package com.epam.java_WorkWithText.domain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Sentence extends Text {
    private static final Logger logger = LogManager.getLogger(Sentence.class);
    public static final String toSentenceRegex = "\\b\\w{3}\\.{2,}|(\\.|!\\?;)";
    private List<String> words;

    public Sentence(String value, List<String> words) {
        super(value);
        this.words = words;
    }
    public String []  sentenceParse(String text){
        logger.info("Sentence parse is finish");
      String [] sentenceArray = text.split(toSentenceRegex);
      return sentenceArray;
    }


    public  void add(String [] sentenceArray){
        words.addAll(Arrays.asList(sentenceArray));
    }
    public void remove(String text){
        words.remove(words.stream().filter(element -> element.equals(text)).findFirst().get());
    }
    @Override
    public void print() {
    words.forEach(System.out::println);
    }

    public List<String> getWords() {
        return words;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence = (Sentence) o;
        return Objects.equals(words, sentence.words);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words);
    }
}
