package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> myQuestions = new ArrayList();
    private int score = 0;
    private Scanner input;

    public Quiz() {
        this.input = new Scanner(System.in);
    }

    public void addQuestion(Question question) {
        this.myQuestions.add(question);
    }

    public void runQuiz() {
        System.out.println("Hello and welcome to the quiz");
        System.out.println("");

        String var5;
        for(Iterator var1 = this.myQuestions.iterator(); var1.hasNext(); var5 = this.input.nextLine()) {
            Question question = (Question)var1.next();
            System.out.println(question.getPrompt());
            Iterator var3 = question.getAnswers().iterator();

            while(var3.hasNext()) {
                String answer = (String)var3.next();
                System.out.println(answer);
            }
        }

    }

    public void gradeQuiz() {
    }
}
