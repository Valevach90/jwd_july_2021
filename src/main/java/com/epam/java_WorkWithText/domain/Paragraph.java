package com.epam.java_WorkWithText.domain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;



public class Paragraph extends Text {
    private static final Logger logger = LogManager.getLogger(Paragraph.class);
 public static final String toParagraphRegex = "\n";
    private List<String> sentences;

    public Paragraph(String value, List<String> sentences) {
        super(value);
        this.sentences = new LinkedList<>();
    }
    public String []  sentenceParse(String text){
        logger.info("Paragraph parse is finish");
        String [] sentenceArray = text.split(toParagraphRegex);
        return sentenceArray;
    }


    public  void add(String [] sentenceArray){
        sentences.addAll(Arrays.asList(sentenceArray));
    }
    public void remove(String text){
        sentences.remove(sentences.stream().filter(element -> element.equals(text)).findFirst().get());
    }
    @Override
    public void print() {
        sentences.forEach(System.out::println);
    }

    public void setSentences(List<String> sentences) {
        this.sentences = sentences;
    }

    public List<String> getSentences() {
        return sentences;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paragraph paragraph = (Paragraph) o;
        return Objects.equals(sentences, paragraph.sentences);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentences);
    }
}
