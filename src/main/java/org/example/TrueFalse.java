package org.example;

import java.util.ArrayList;

public class TrueFalse extends Question {
    String correctAnswer;

    public TrueFalse(String prompt, ArrayList<String> answers, String correctAnswer) {
        super(prompt, answers);
        this.correctAnswer = correctAnswer;
    }
}