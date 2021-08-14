package com.epam.java_WorkWithText.workWithText;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkWithText {
    public String[] findSentence(String text) {
        return text.split("[.?!;-]");
    }

}
