package com.epam.java_WorkWithText.workWithText;

import com.epam.java_WorkWithText.domain.Word;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.util.stream.Collectors;

public class WorkWithText {
    private static final Logger logger = LogManager.getLogger(WorkWithText.class);

    public LinkedList sortingSentenceByMaxCapacity(List <String> text){
        logger.info("SortingSentenceByMaxCapacity is finish");
          return (LinkedList) text.stream()
                .sorted((el1,el2)->el2.length()-el1.length())
                  .collect(Collectors.toList());
    }
    public String countWords(List<String> lines) {
        Map<String, Integer> wordMap = new HashMap<>();
        for (String line : lines) {
            String[] words = line.toLowerCase().split("(?U)[\\pP\\s\\d+]");
            for (int i = 0; i < words.length; i++) {
                if (wordMap.get(words[i]) == null) {
                    wordMap.put(words[i], 1);
                } else {
                    wordMap.put(words[i], wordMap.get(words[i]) + 1);
                }
            }
        }
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordMap.entrySet());
        Collections.sort(sortedWords, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (o2.getValue().equals(o1.getValue())) {
                    String s1 = o1.getKey();
                    String s2 = o2.getKey();
                    int i = 0;
                    while (i < s1.length() && i < s2.length()) {

                        if (s1.charAt(i) > s2.charAt(i)) {
                            return 1;

                        } else if (s1.charAt(i) < s2.charAt(i)) {
                            return -1;

                        } else if (i == s1.length() - 1) {

                            return -1;
                        } else if (i == s2.length() - 1) {

                            return 1;

                        } else {
                            i++;
                        }
                    }
                }
                return o2.getValue() - o1.getValue();

            }
        });
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : sortedWords) {
            if (result.length() == 0) {
                result.append(entry.getKey() + " - " + entry.getValue());
            } else {
                result.append("\n" + entry.getKey() + " - " + entry.getValue());
            }
        }
        logger.info("CountWords is finish");

        return result.toString();

    }
    public LinkedList printByValue(List<String>lines){
        logger.info("printByValue is finish");
       return (LinkedList) lines.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    }

}
