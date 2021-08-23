package com.epam.java_WorkWithText.domain;

import java.util.List;

public abstract class Text {
   private String value;

    public Text(String value) {
        this.value = value;
    }
public abstract void print();
    public String getValue() {
        return value;
    }
}
