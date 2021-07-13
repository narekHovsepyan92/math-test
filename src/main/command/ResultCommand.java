package main.command;

import main.AnswersCount;
import main.data.Constants;

public class ResultCommand implements Command {
    @Override
    public String getName() {
        return Constants.COMMAND_RESULT;
    }

    @Override
    public void handle() {
        System.out.println("True answers count is " + AnswersCount.trueAnswers);
        System.out.println("Wrong answers count is " + AnswersCount.wrongAnswers);
    }
}
