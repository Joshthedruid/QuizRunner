package org.example;

import java.util.ArrayList;

public class QuizRunner {
    public QuizRunner() {
    }

    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();
        ArrayList<String> presidents = new ArrayList();
        presidents.add("George Washington");
        presidents.add("Abe Lincoln");
        presidents.add("Isaac Newton");
        presidents.add("King Tut");
        Question question1 = new MultipleChoice("Who was the first president of the United States?", presidents, "George Washington");
        myQuiz.addQuestion(question1);
        myQuiz.runQuiz();
    }
}