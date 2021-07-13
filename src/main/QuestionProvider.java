package main;

import main.question.*;

import java.util.ArrayList;

public class QuestionProvider {

    public static ArrayList<Question> getQuestions(){
        ArrayList<Question> questions = new ArrayList<>();
        questions.add(new Question1());
        questions.add(new Question2());
        questions.add(new Question3());
        questions.add(new Question4());
        questions.add(new Question5());
        questions.add(new Question6());
        questions.add(new Question7());
        questions.add(new Question8());
        questions.add(new Question9());
        questions.add(new Question10());
        return questions;
    }
}
