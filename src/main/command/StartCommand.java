package main.command;

import main.User;
import main.UserProvider;
import main.data.Constants;
import main.question.Question;

import java.util.ArrayList;
import java.util.Scanner;

public class StartCommand implements Command {

    private final Scanner scanner;

    private final ArrayList<Question> questions;

    private int correctAnswer;

    private int wrongAnswer;
    public StartCommand(Scanner scanner, ArrayList<Question> questions) {
        this.scanner = scanner;
        this.questions = questions;
    }

    @Override
    public String getName() {
        return Constants.COMMAND_START;
    }

    @Override
    public void handle() {
        System.out.println("Hello. Enter name");
        String name = scanner.next();
        User user = new User(name);
        UserProvider.setUser(user);
        System.out.println("User name now is " + user.getName());
        for (int i = 0; i < questions.size(); i++) {
            int questionNumber = i + 1;
            System.out.println("Question number is "+ questionNumber + " / " + questions.size());
            Question q = questions.get(i);
            System.out.println(q.getName());
            String answer = scanner.next();
            if(answer.equals(q.getAnswer())){
                correctAnswer ++;
            } else{
                wrongAnswer ++;
            }
        }
        System.out.println("Test finished ");

    }
}
